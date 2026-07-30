package ea_6_2;

public class Monitor{
    int seatsOccupied;
    
     
    public synchronized void sitDown(String philosopher)  throws InterruptedException {
        while (seatsOccupied == 4 ) {
            wait();
        }
            seatsOccupied ++;
            System.out.println(philosopher +  " is now sitting at the table. There are now " + seatsOccupied + " occupied.");
    }
    
    public synchronized void standUp(String philosopher)  throws InterruptedException {
        seatsOccupied --;
        System.out.println(philosopher + " is now standing. There are now " + seatsOccupied + " seats occupied.");
        notifyAll();
    }
}
