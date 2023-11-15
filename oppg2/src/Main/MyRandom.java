package Main;
import java.util.Random;
public class MyRandom
{
    Random rand;
    MyRandom()
    {
        rand = new Random();
    }
    public int NextInt(int lowerBound, int upperBound)
    {
        return rand.nextInt(upperBound-lowerBound + 1) + lowerBound;
    }
    public double NextDecimal(double lowerBound, double upperBound)
    {
        return rand.nextDouble() * (upperBound-lowerBound) + lowerBound;
    }
}