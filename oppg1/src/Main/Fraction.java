package Main;

public class Fraction
{
    private int num;//Numerator
    private int denum;//Denominator
    Fraction(int num, int denum)//Constructor with numerator and denominator
    {
        if(denum == 0)
        {
            throw new IllegalArgumentException();
        }
        this.num = num;
        this.denum = denum;
    }
    Fraction(int num)//Constructor with only numerator, denominator = 1
    {
        this.num = num;
        this.denum = 1;
    }
    int[] GetFraction()//Getter
    {
        return new int[]{num, denum};
    }
    /************************Simplification***********************/
    void Simplify()//Simplify fraction by common factors
    {
        boolean flag = true;
        while(flag)
        {
            int i = Integer.min(num, denum);
            flag = false;
            while (i >= 2)
            {
                flag = true;
                if(num % i == 0 && denum % i == 0)
                {
                    num /= i;
                    denum /= i;
                    break;
                }
                if(i == 2) {flag = false;}
                i--;
            }
        }
    }
    /********************Fractional operations********************/
    void Expand(int lhs)
    {
        num *= lhs;
        denum *= lhs;
    }
    void Add(int[] lhs)
    {
        lhs[0] *= denum;
        this.Expand(lhs[1]);
        num += lhs[0];
        Simplify();
    }
    void Subtract(int[] lhs)
    {
        num *= -1;
        denum *= -1;
        Add(lhs);
    }
    void Multiply(int[] lhs)
    {
        num *= lhs[0];
        denum *= lhs[1];
        Simplify();
    }
    void Divide(int[] lhs)
    {
        int temp = num;
        num = denum;
        denum = temp;
        Multiply(lhs);
    }

    

    /*******************Whole number operations*******************/
    void Add(int lhs) {Add(new int[]{lhs, 1});}
    void Subtract(int lhs) {Subtract(new int[]{lhs, 1});}
    void Multiply(int lhs) {Multiply(new int[]{lhs, 1});}
    void Divide(int lhs) {Divide(new int[]{lhs, 1});}
}