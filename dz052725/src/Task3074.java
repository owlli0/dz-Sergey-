import java.util.Scanner;

public class Task3074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int firs = 0;
        int second = 1;
        int next = 0;

        while (count < n) {
            next = firs + second;
            firs = second;
            second = next;
            count += 1;
        }
        System.out.println(firs);
    }
}
//изначально в ответе планировалось next, но планы пошли не по плану