import java.util.Scanner;

public class Task2959 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        if (digit > 0) {
            System.out.println(1);
        }
        if (digit < 0) {
            System.out.println(-1);
        }
        if (digit == 0) {
            System.out.println(0);
        }
    }
}
//решено