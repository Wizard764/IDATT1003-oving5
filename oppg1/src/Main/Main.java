package Main;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Fraction a = new Fraction(1, 4);
        Fraction b = new Fraction(1, 3);
        a.Multiply(2);
        a.Add(b.GetFraction());
        a.Divide(new int[]{2, 3});
        System.out.println(Arrays.toString(a.GetFraction()));
    }
}