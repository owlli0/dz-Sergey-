public class App {
    public static void main(String[] args) {
        System.out.println("===================================================");

        Rectangle rect1 = new Rectangle(12,31);
        System.out.println(rect1.printSquare());
        System.out.println(rect1.printPerimeter());

        System.out.println("===================================================");

        Rectangle rect2 = new Rectangle(21.2, 42.53);
        System.out.println(rect2.printSquare());
        System.out.println(rect2.printPerimeter());

        System.out.println("===================================================");

        Rectangle rect3 = new Rectangle(8, 4);
        System.out.println(rect3.printSquare());
        System.out.println(rect3.printPerimeter());
        System.out.println("===================================================");
    }
}