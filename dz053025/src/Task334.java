import java.util.Scanner;

public class Task334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (; a <= b; a++) {
            if (a % d == c) {
                System.out.print(a + " ");
            }
        }
    }
}
//решено
