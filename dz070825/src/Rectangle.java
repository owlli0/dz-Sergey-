public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void printSquare() {
        System.out.println("Площадь прямоугяльника со сторонами " + a + " и " + b + " равна " + (a * b));
    }

    public void printPerimeter() {
        System.out.println("Периметр прямоугольника со сторонами " + a + " и " + b + " равен " + (a + b));
    }
}