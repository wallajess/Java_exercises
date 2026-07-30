package ea_6_2;

public class Chopstick {
    private boolean used;
    
    public synchronized void pickUp(String philosoph, String side) throws InterruptedException{
        while (used) {
            wait();
        }
        used = true;
        System.out.println(philosoph + "has picked up the " +side + " chopstick.") ;
    }
    
    public synchronized void putDown(String philosoph, String side) throws InterruptedException {
        used = false;
        System.out.println(philosoph + "has put down the " + side + " chopstick.");
        notifyAll();
    }
    
}
