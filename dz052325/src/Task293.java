import java.util.Scanner;

public class Task293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digitFirst = scanner.nextInt();
        int digitSecond = scanner.nextInt();

        if (digitFirst > digitSecond) {
            System.out.println(1);
        }
        if (digitFirst < digitSecond) {
            System.out.println(2);
        }
        if (digitFirst == digitSecond) {
            System.out.println(0);
        }
    }
}
//решено
