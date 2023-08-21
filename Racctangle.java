interface Rectangle {
    public void getArea(int l, int b);
}

class RArea implements Rectangle {
    public void getArea(int l, int b) {
        int A = l * b;
        System.out.println("The area of the rectangle is " + A);
    }
}

class Main {
    public static void main(String[] args) {
        RArea x = new RArea();
        x.getArea(5, 6);
    }
}