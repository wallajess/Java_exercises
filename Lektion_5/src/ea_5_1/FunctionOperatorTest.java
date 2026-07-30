package ea_5_1;

public class FunctionOperatorTest {
    public static void main(String[] args) {
        
        //a
        FunctionOperator MinusOne = new FunctionOperator();
        
        IntIntFunction f1 = new IntIntFunction() {
            
                @Override
                public int perform(int input) {
                    return input -1;
                }
        };
        
        int resultMinusOne = MinusOne.operate(f1, 10, -10);
        System.out.println("Result minus one: " + resultMinusOne);
        
        //b
        FunctionOperator WundersameZahl = new FunctionOperator();
        
        IntIntFunction f2 = new IntIntFunction() {
            
            @Override
            public int perform(int input) {
                switch (input%2) {
                case 0:
                    return input/2;

                default:
                    return 3 * input +1;
                    
                }
            }
            
        };
        
        int resultWundersam = WundersameZahl.operate(f2,  27, 1);
        System.out.println("Result wunderame Zahl: " + resultWundersam);
        
        //c   
        
        
        FunctionOperator MinusOneLambda = new FunctionOperator();
       
       
        int resultMinusOneLambda = MinusOneLambda.operate(x -> x-1, 10, -10);
        System.out.println("Result minus one lambda: " + resultMinusOneLambda);
        
      
        //d 
        FunctionOperator WundersameZahlLambda = new FunctionOperator();
        
        int resultWundersamLambda = WundersameZahlLambda.operate((
               x -> (x%2==0) ? x/2 : 3 * x  +1), 27, 1);
        System.out.println("Result wundersame Zahl Lambda: " + resultWundersamLambda);        
       
    }
}
