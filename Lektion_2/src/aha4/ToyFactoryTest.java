package aha4;

class ToyFactoryTest {
    public static void main(String[] args) throws NoSuchToyException{
        Toy t1 = ToyFactory.getToy("PlasticCar");
        Toy t2 = ToyFactory.getToy("TeddyBear");
        t1.print();
        t2.print();
        Toy t3 = ToyFactory.getToy("Doll");
        t2.print();
    
    }
}
