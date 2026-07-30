package aha4;

class ToyFactory {
    
    public static Toy getToy(String toyName) throws NoSuchToyException{
        switch (toyName) {
        case "Toy":
            return new Toy();
        case "PlasticCar":
            return new PlasticCar();
        case "RubberDuck":
            return new RubberDuck();
        case "TeddyBear":
            return new TeddyBear();
        default:
            String message = "This factory cannot create " + toyName + "s. ";
            throw new NoSuchToyException(message);
        }
    }
}
