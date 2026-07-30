package eA1_1;

public class TestNamen {
    public static void main(String[] args) {        

      BinaryTree<> stringBaum = new BinaryTree<>();
      stringBaum.insert ("Zyra");
      stringBaum.insert ("Simon");
      stringBaum.insert ("Jannick");
      stringBaum.insert ("Julia");
      stringBaum.insert ("Leon");
      stringBaum.insert ("Erik");
      stringBaum.insert ("Mareike");
      stringBaum.insert ("Bernd");
      stringBaum.insert ("Claus");
      stringBaum.insert ("Doris");
      stringBaum.insert ("Olaf");
      stringBaum.insert ("Anna");

      System.out.println("Die Namen im Baum alphabetisch sortiert: ");
      stringBaum.inorder();
      System.out.println();
      System.out.println("Enthält der Baum Olaf? " + stringBaum.contains("Olaf"));

    }
}
