package ea4_2;

import java.util.*;

public class Aufloesung {
     public static void main(String[] args) {
         Super s1 = new Sub();
         Sub s2 = new Sub();
         List<Kuh> kuhList = new ArrayList<Kuh>();
         List<Tier> tierList = null;
         Tier[] tierArray = new Kuh[2];
         Kuh[] kuhArray = new Kuh[5];

         s1.m(tierArray, tierList); // Aufruf A1
         s1.m(kuhArray, kuhList);   // Aufruf A2
         //s1.m(tierArray, kuhList);  // Aufruf A3
         //s1.m(kuhArray, tierList);  // Aufruf A4

         s2.m(tierArray, tierList); // Aufruf A5
         s2.m(kuhArray, kuhList);   // Aufruf A6
         s2.m(tierArray, kuhList);  // Aufruf A7
         //s2.m(kuhArray, tierList);  // Aufruf A8
     }
}

class Super {
     void m(Tier[] p1, List<Tier> p2) {
         System.out.println("M1");
     }
     
     void m(Kuh[] p1, List<? extends Tier> p2) {
         System.out.println("M2");
     }
}

class Sub extends Super {
     void m(Lebewesen[] p1, List<?> p2) {
         System.out.println("M3");
     }

     void m(Tier[] p1, ArrayList<Kuh> p2) {
         System.out.println("M4");
     }

     @Override 
     void m(Kuh[] p1, List<? extends Tier> p2) {
         System.out.println("M5");
     }
}

class Lebewesen { }

class Tier extends Lebewesen { }

class Kuh extends Tier { }