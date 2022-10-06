package Extensions;

import java.io.FileNotFoundException;

public class BasicMath extends MathLvl1 {
    public static void main(String[] args) throws FileNotFoundException {
        double i = Division(2 , 1.5);
        System.out.println(i);
    }
    public static double Add(double a, double b){
        double c = a + b;
        return c;
    }
    public static double Subtract(double a, double b){
        double c = a - b;
        return c;
    }
}
