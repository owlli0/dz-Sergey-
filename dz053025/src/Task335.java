import java.util.Scanner;

public class Task335 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (; a <= b; a++) {
            if (Math.sqrt(a) % 1 == 0 && a <= b) {
                System.out.println(a);
            }
        }
    }
}
//решено