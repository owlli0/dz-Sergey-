import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону а");
        double a = scanner.nextDouble();
        System.out.println("Введите сторону b");
        double b = scanner.nextDouble();

        double res = a*b;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + res);
    }
}
//решено