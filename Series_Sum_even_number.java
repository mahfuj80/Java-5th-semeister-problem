import java.util.Scanner;

public class Series_Sum_even_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        s.close();
        int i, sum = 0;
        for (i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of the even number is :" + sum);
    }
}
