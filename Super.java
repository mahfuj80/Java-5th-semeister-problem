class Super {
    public void triangle(int x, int y) {
        double a = 0.5 * x * y;
        System.out.println("Area Of triangle= " + a);
    }
}

class Sub extends Super {
    public void rectangle(int x, int y) {
        int b = x * y;
        System.out.println("Area Of rectangle= " + b);
    }

    public void display() {
        triangle(10, 2);
        rectangle(20, 2);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.display();
    }
}
