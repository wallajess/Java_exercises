public class Foo {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < args.length; i = i + 2) {
                int x = Integer.parseInt(args[i]);
                int y = Integer.parseInt(args[i + 1]);
                x = x < 0 ? x * -1 : x;
                y = y < 0 ? y * -1 : y;
                int ergebnis = x + y;
                while (ergebnis >= 3) {
                    ergebnis = ergebnis - 3;
                }
                int paarNr = i / 2 + 1;
                switch (ergebnis) {
                case 0:
                    System.out.println(paarNr + ". Paar: 0");
                    break;
                case 1:
                    System.out.println(paarNr + ". Paar: 1");
                    break;
                case 2:
                    System.out.println(paarNr + ". Paar: 2");
                    break;
                default:
                    System.out.println("Das kann nicht sein!");
                    break;
                }
            }
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Falsche Anzahl an Argumenten. Es muss eine gerade Anzahl sein.");
    } catch (NumberFormatException e) {
        System.out.println("Das ist keine ganze Zahl!");
    }
    }
    }    

