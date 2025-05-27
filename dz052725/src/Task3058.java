import java.util.Scanner;

public class Task3058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int divider = 2;

        while (n % divider != 0) {
            divider += 1;
        }
        System.out.println(divider);
    }
}
//решено