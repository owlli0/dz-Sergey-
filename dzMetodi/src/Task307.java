import java.util.Scanner;

public class Task307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double n = scanner.nextDouble();
        System.out.println(power(a, n));
    }

    public static double power(double a, double n) {
        double power = 0;
        power = Math.pow(a, n);
        return power;
    }
}
//решено 100