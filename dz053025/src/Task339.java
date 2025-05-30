import java.util.Scanner;

public class Task339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int digit = 2;

        for (; digit <= x; digit++) {
            if (x % digit == 0) {
                System.out.println(digit);
                break;
            }
        }
    }
}
//решено