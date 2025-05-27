import java.util.Scanner;

public class Task3060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digit = 1;

        while (digit < n) {
            digit *= 2;
        }
        if (digit == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
//решено