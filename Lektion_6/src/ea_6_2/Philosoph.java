package ea_6_2;

public class Philosoph extends Thread {
    private String name;
    private Chopstick chopstickLeft = new Chopstick();
    private Chopstick chopstickRight = new Chopstick();
    private Monitor monitor;
    
    public Philosoph(String name, Chopstick left, Chopstick right, Monitor monitor) {
        this.name = name;
        this.chopstickLeft = left;
        this.chopstickRight = right;
        this.monitor = monitor;
    }
    
    public void philosifying() {
        try {
            System.out.println(name + " is philosophying.");
            sleep((int) (Math.random() * 5));            
    } catch (InterruptedException e) {
        System.out.println(name + " was interrupted while philosophying.");
        }
    }
    
    public synchronized void hungry()  {
        try {
            monitor.sitDown(name);
            System.out.println(name + " is hungry and waiting for chopsticks.");
            chopstickLeft.pickUp(name, "left");
            chopstickRight.pickUp(name,  "right");
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted while hungry.");
        }
    }
    
    public synchronized void eat()  {
        try {       
            System.out.println(name + " is now eating.");
            sleep((int) (Math.random() * 5));
        
            chopstickLeft.putDown(name, "left");
            chopstickRight.putDown(name,  "right");
            monitor.standUp(name);
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted while eating.");
        }
    }
    
    @Override
    public void run() {
            while (true) {
                philosifying();
                hungry();
                eat();
            }
    }
    
}
