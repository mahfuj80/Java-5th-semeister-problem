import java.util.Scanner;

public class TRIANGLE {
    public static void main(String[] args) {
        int a, b, c;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = x.nextInt();
        System.out.println("Enter the second number:");
        b = x.nextInt();
        System.out.println("Enter the third number:");
        c = x.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            double Area = (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
            System.out.print("Area Of Scalene Triangle= " + Area);
        } else {
            System.out.print("Area Of Scalene Triangle Is Not Possible");
        }
        x.close();
    }
}