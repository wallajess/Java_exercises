package ea_6_2;

public class SpeisenderPhilosoph {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        
        Chopstick chopstick1 = new Chopstick();
        Chopstick chopstick2 = new Chopstick();
        Chopstick chopstick3 = new Chopstick();
        Chopstick chopstick4 = new Chopstick();
        Chopstick chopstick5 = new Chopstick();
        
       Philosoph philosoph1 =  new Philosoph("Hannah Arendt", chopstick1, chopstick2, monitor);
       Philosoph philosoph2 =  new Philosoph("Simone de Beauvoir", chopstick2, chopstick3, monitor);
       Philosoph philosoph3 =  new Philosoph("Judith Butler", chopstick3, chopstick4, monitor);
       Philosoph philosoph4 =  new Philosoph("Hypatia", chopstick4, chopstick5, monitor);
       Philosoph philosoph5 =  new Philosoph("Joyce Cook", chopstick5, chopstick1, monitor);

       philosoph1.start();
       philosoph2.start();
       philosoph3.start();
       philosoph4.start();
       philosoph5.start();
       
      
    }
}
