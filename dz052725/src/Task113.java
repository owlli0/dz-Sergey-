import java.util.Scanner;

public class Task113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int square = 1;

        while (square * square <= n) {
            System.out.println(square * square);
            square += 1;
        }
    }
}
//решено