import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество грамм");
        double gram = scanner.nextDouble();
        double kg = gram / 1000;
        System.out.println(gram + " грамм это " + kg + " килограмм");
    }
}
//решено