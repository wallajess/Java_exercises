package ea1_2;

public class Animals {
    public static void main (String[] args) {
               
        String eingabe = args[0];
        
        if (eingabe.equals("Spinne")) {
            System.out.println("8 Beine");
            System.out.println("flugfähig: nein");
            System.out.println("hat Federn: nein");
            System.out.println("gefährlich für Menschen: eventuell");                
        } else if (eingabe.equals("Hund")) {
            System.out.println("4 Beine");
            System.out.println("flugfähig: nein");
            System.out.println("hat Federn: nein");
            System.out.println("gefährlich für Menschen: eventuell");   
        } else if (eingabe.equals("Löwe")) {
            System.out.println("4 Beine");
            System.out.println("flugfähig: nein");
            System.out.println("hat Federn: nein");
            System.out.println("gefährlich für Menschen: ja");
        } else if (eingabe.equals("Fliege")) {
            System.out.println("6 Beine");
            System.out.println("flugfähig: ja");
            System.out.println("hat Federn: nein");
            System.out.println("gefährlich für Menschen: nein");   
        } else if (eingabe.equals("Pinguin")) {
            System.out.println("2 Beine");
            System.out.println("flugfähig: nein");
            System.out.println("hat Federn: ja");
            System.out.println("gefährlich für Menschen: nein");   
        } else if (eingabe.equals("Gans")) {
            System.out.println("2 Beine");
            System.out.println("flugfähig: ja");
            System.out.println("hat Federn: ja");
            System.out.println("gefährlich für Menschen: kanadische schon, sonst naja");   
        } else if (eingabe.equals("Katze")) {
            System.out.println("4 Beine");
            System.out.println("flugfähig: nein");
            System.out.println("hat Federn: nein");
            System.out.println("gefährlich für Menschen: höchstens für Allergiker:innen");   
        } else if (eingabe.equals("Frosch")) {
            System.out.println("4 Beine");
            System.out.println("flugfähig: nein");
            System.out.println("hat Federn: nein");
            System.out.println("gefährlich für Menschen: nein");   
        } else if (eingabe.equals("Erdmännchen")) {
            System.out.println("4 Beine");
            System.out.println("flugfähig: nein");
            System.out.println("hat Federn: nein");
            System.out.println("gefährlich für Menschen: nein");   
        } else if (eingabe.equals("Drache")) {
            System.out.println("4 Beine");
            System.out.println("flugfähig: ja");
            System.out.println("hat Federn: nein");
            System.out.println("gefährlich für Menschen: sehr");   
        }   
    }
}
