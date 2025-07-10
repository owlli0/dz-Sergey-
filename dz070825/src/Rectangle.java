public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double printSquare() {
        double res = a * b;
        return res;
    }

    public double printPerimeter() {
        double res = (a + b) * 2;
        return res;
    }
}