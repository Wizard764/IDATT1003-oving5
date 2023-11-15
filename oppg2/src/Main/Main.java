package Main;

public class Main
{
    public static void main(String[] args)
    {
        MyRandom ranGen = new MyRandom();
        for(int i = 0; i < 20; i++)
        {
            System.out.println(ranGen.NextDecimal(3, 9));
        }
    }
}