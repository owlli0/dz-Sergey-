import java.util.Scanner;

public class Task3061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        int count = 0;

        while (k < n) {
            k *= 2;
            count += 1;
        }
        System.out.println(count);
    }
}
//решено но с болью