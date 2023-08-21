class tri {
    public void triangle(int x, int y) {
        double a = 0.5 * x * y;
        System.out.println("Area Of triangle= " + a);
    }
}

class rec extends tri {
    public void rectangle(int x, int y) {
        int b = x * y;
        System.out.println("Area Of rectangle= " + b);
    }
}

class add extends rec {
    public void addiction(int x, int y) {
        int c = x * y;
        System.out.println("Addition Of Two Number= " + c);
    }

    public void display() {
        triangle(10, 2);
        rectangle(20, 2);
        addiction(5, 10);
    }
}

public class MultiLevel_inheritance {
    public static void main(String[] args) {
        add s = new add();
        s.display();
    }
}
