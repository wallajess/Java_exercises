package ea2_4;

public class HagenGames {
    public Playable buyGame() {
        return new ObjectWars();
    }
    
    void updateGame(ObjectWars objectWarsGame) {
        objectWarsGame.update();
    }
}

class ObjectWars implements Playable {
    private double version = 1.0;

    @Override
    public void playGame() {
        System.out.println("Running ObjectWars, Version " + version);
    }

    void update() {
        version = version + 0.1;
    }
}
    
interface Playable {
    void playGame();
}
    