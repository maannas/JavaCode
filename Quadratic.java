public class Quadratic{
    public static void main(String[] args) {
            double a = 9;
            double b = 6;
            double c = 5;

            double result = b * b - 4.0 * a * c; //the formula (b^2 - 4*a*c)

            if (result > 0.0) { //if result more then 0 there are two roots hence find both
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a); //plus one
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a); //minus one
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) { //if zero then only one root
                double r1 = -b / (2.0 * a); //the formula for single root
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots."); //if less than zero no roots
            }

    }
}
   