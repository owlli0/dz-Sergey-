import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double n = scanner.nextDouble();
        System.out.println(n >= 10 && n <= 100 ? "YES" : "NO");
    }
}
//решено