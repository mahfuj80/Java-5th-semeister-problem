import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci Series till first 10 terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int f = a + b;
            a = b;
            b = f;

        }
        s.close();
    }
}
