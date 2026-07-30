package ea_1_3;

// (a)
public class WunderTest {
    public static int wunder(int n) {
        int schritte = 0;
        
        while (n != 1) {
            if (n%2==0) {
                n /= 2;
            } else {
                n = (n*3) +1;
            }
            schritte += 1;  
        }
   
        return schritte;
    }
   
    // (c)
    public static int wunderRek(int n) {
      
        if (n==1) {
            return 0;
        } else if (n%2 == 0) {
                return 1 +wunderRek(n/2);
            } else {
                return 1 + wunderRek(n*3 +1);
            }
        
    }
    
    // (b)
    public static void main(String [] args) {
        int numSteps = 0;
        int mostSteps = 0;
        int nWithMost = 1;
        
        for (int i =1; i <= 100; i++) {
            numSteps = wunder(i);
            if (numSteps > mostSteps) {
                mostSteps = numSteps;
                nWithMost = i;
            }
            
        }
        System.out.println("Most steps: " + nWithMost);
        
        // Ergebnis zu (c)
        System.out.println("wunderRek(97) = " + wunderRek(97));
        
        
        //Bonus
        int numStepsRek = 0;
        int mostStepsRek = 0;
        int nWithMostRek = 1;
        for (int i =1; i <= 100; i++) {
            numStepsRek = wunderRek(i);
            if (numStepsRek > mostStepsRek) {
                mostStepsRek = numStepsRek;
                nWithMostRek = i;
            }
            
        }
        System.out.println("Most steps Rek = " + nWithMostRek);
     }
    
}
