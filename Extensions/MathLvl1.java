package Extensions;

public class MathLvl1 extends MathLvl2 {
    public static double Multiply(double a, double b){
        double c = a * b;
        return c;
    }
    public static double Division(double a, double b){
        if (b > 0) {
            double c = a / b;
            return c;
        } else if (b == 0) {
            System.out.println("ERROR:" + "MathLvl1.Division(); 'cannot be divided by zero'");
        } else if (b < 0) {
            double c = a / b;
            return c;
        }
        return a;
    }
}
