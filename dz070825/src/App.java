public class App {
    public static void main(String[] args) {
        System.out.println("===================================================");
        Rectangle rect1 = new Rectangle(12,31);
        rect1.printSquare();
        rect1.printPerimeter();

        System.out.println("===================================================");

        Rectangle rect2 = new Rectangle(21.2, 42.53);
        rect2.printSquare();
        rect2.printPerimeter();

        System.out.println("===================================================");

        Rectangle rect3 = new Rectangle(8, 4);
        rect2.printSquare();
        rect2.printPerimeter();
        System.out.println("===================================================");
    }
}