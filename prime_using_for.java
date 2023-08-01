import java.util.Scanner;

public class prime_using_for {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value of n :");
        int n = s.nextInt();
        System.out.print("Prime Number = ");
        int i, j;
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(i + " ");
            }
        }

    }

}
