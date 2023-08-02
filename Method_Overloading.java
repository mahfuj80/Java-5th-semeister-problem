public class Method_Overloading {
    public void GetAdd(int x, int y) {
        int a = x + y;
        System.out.println("Sum Of 2 Number = " + a);
    }

    public void GetAdd(double x, double y) {
        double b = x + y;
        System.out.println("Sum of Decimal Number = " + b);
    }

    public void GetAdd(int x, int y, int z) {
        int c = x + y + z;
        System.out.println("Sum of 3 number = " + c);
    }

    class Overloading {
        public static void main(String[] args) {
            Method_Overloading S = new Method_Overloading();
            S.GetAdd(2, 4);
            S.GetAdd(2, 4, 6);
            S.GetAdd(2, 3, 5);
        }
    }
}