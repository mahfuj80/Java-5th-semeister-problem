public class Constructor {
    int a, b;
    Double x, y;

    public Constructor() {
        a = 530264;
        b = 530263;
        x = 3.94;
        y = 3.68;
        System.out.println("Student ID = " + a);
        System.out.println("Student Result = " + x);
        System.out.println("Student ID = " + b);
        System.out.println("Student Result = " + y);
    }

    public static void main(String[] args) {
        Constructor x = new Constructor();
    }
}