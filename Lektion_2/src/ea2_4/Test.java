package ea2_4;

public class Test {
    public static void main(String[] args) {
        HagenGames hg = new HagenGames();
        Playable game = hg.buyGame();

        game.playGame();     
         hg.updateGame((ObjectWars) game); 
        game.playGame();
        //game.update();  //Compiler error
    }
}