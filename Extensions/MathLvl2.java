package Extensions;

import java.util.Random;

public class MathLvl2 {
    public static double Modulo(double a, double b){
        double c = a % b;
        return c;
    }
    public static double Random(){
        Random c = new Random();
        double b = c.nextDouble();
        return b;
    }
}