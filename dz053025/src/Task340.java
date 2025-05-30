import java.util.Scanner;

public class Task340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int digit = 1;

        for (; digit <= x; digit++) {
            if (x % digit == 0) {
                System.out.print(digit + " ");
            }
        }
    }
}
//решено
