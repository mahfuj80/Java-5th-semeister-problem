import java.util.Scanner;

public class Finding_Root_of_Quadratic_Equation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c, d, x, x1, x2;
        System.out.print("Enter The Value of a: ");
        a = s.nextDouble();
        System.out.print("Enter The Value of b : ");
        b = s.nextDouble();
        System.out.print("Enter The Value of c : ");
        c = s.nextDouble();
        d = (b * b) - (4 * a * c);
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (+b + Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are real, 1st Root is: " + x1 + "and 2nd Root is : " + x2);
        } else if (d == 0) {
            x = (-b) / (2 * a);
            System.out.println("The root is: " + x + "and unique");
        } else {
            System.out.println("The Roots are not real and unimaginable");
        }
        s.close();
    }
}
