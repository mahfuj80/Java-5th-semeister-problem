import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first Number");
        a = s.nextInt();
        System.out.println("Enter the second Number");
        b = s.nextInt();
        System.out.println("Enter the third Number");
        c = s.nextInt();
        System.out.println("Result:");
        if (a > b && a > c) {
            System.out.println(a + ", First Number is the Biggest Number");
        } else if (b > a && b > c) {
            System.out.println(b + ", Second Number is the Biggest Number");
        } else if (c > a && c > b) {
            System.out.println(c + ", Third Number is the Biggest Number");
        } else {
            System.out.println("Please See An Exception Occurs");
        }
        s.close();
    }
}
