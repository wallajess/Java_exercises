package aha2;

public class FractionTest {
    public static void main(String[] args) {
        Fraction half = new Fraction(1, 2);
        Fraction invalid = new Fraction(2, 1);
        System.out.println(half.getProductOfThisAnd(new Fraction(1, 2)));
        System.out.println(invalid.toString());
                
 }
}
