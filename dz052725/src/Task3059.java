import java.util.Scanner;

public class Task3059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digit = 1;

        while (digit <= n) {
            System.out.print(digit + " ");
            digit *= 2;
        }

    }
}
//решено (спросил у ИИ как сделать вывод в одну строку, я либо не помню, либо что-то упустил)