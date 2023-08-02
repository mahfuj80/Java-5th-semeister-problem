public class CopyConstructor {
    int base, height;

    public CopyConstructor(int b, int h) {
        base = b;
        height = h;
    }

    public CopyConstructor(CopyConstructor NEW) {
        base = NEW.base;
        height = NEW.height;
    }

    public double GetArea() {
        double Area;
        Area = 0.5 * base * height;
        return Area;
    }

    public static void main(String[] args) {
        CopyConstructor x = new CopyConstructor(3, 4);
        CopyConstructor y = new CopyConstructor(x);
        System.out.println("Parameterized Normal Constructor Result");
        System.out.println("Area Of Triangle = " + x.GetArea());
        System.out.println("After Using Copy Constructor Result");
        System.out.println("Area Of Triangle= " + y.GetArea());
    }
}