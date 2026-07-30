package aha2;

public class Fraction {
    private int numerator;
    private int denominator;
    
    Fraction(int numerator, int denominator) throws IllegalArgumentException {
        if (denominator == 0) 
            throw new IllegalArgumentException("Denominator is 0.");
        this.numerator = numerator;
        this.denominator = denominator;
   }
    
    Fraction getProductOfThisAnd(Fraction other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        
        return new Fraction(newNumerator, newDenominator);
    }
    
    @Override
    public String toString( ) {
        return numerator + "/" + denominator;
    }
}


