package gameOfLife;

public class GameOfLife {
    boolean[][] feld = {
        { false, false, false, false, false },
        { false, false, true, false, false },
        { false, false, true, false, false },
        { false, false, true, false, false },
        { false, false, false, false, false } };

    void print() {
      for (int i = 0; i < feld.length; i++) {
        for (int j = 0; j < feld[i].length; j++) {
          if (feld[i][j]) {
            System.out.print("o ");
          } else {
            System.out.print(". ");
          }
        }
        System.out.println();
      }
    }

    private void nextGeneration() {
        boolean[][] nextGen = new boolean[feld.length][feld[0].length];
    
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
          
                if (i == 0 || i == (feld.length -1) || j == 0 || j == (feld[i].length -1) ) {
                    nextGen[i][j] = false;
                } else {
                    int aliveNeighbours = 0;

                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            if (x == 0 && y == 0) {
                                continue;
                            }
                            if (feld[i + x][j + y]) {
                                aliveNeighbours++;
                            }
                        }
                    }
                    
                    if (feld[i][j] ) {
                        switch (aliveNeighbours) {
                        case 2:
                            nextGen[i][j] = true;
                            break;
                        case 3:
                            nextGen[i][j] = true;
                            break;
                        default:
                            nextGen[i][j] = false;
                        }
                    } else {
                        if (aliveNeighbours == 3) {
                            nextGen[i][j] = true;
                        }
                    }
                }
            }
        }
        feld = nextGen;
    }

    public static void main(String[] args) {
      GameOfLife myGame = new GameOfLife();
      for (int i = 0; i < 10; i++) {
        myGame.nextGeneration();
        myGame.print();
        System.out.println();
      }
    }
  }