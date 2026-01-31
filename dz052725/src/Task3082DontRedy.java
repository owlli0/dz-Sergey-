import java.util.Scanner;

public class Task3082DontRedy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int aNow = 0;
        int bNow = 0;


        if ((n > a && n > b) || (a % 2 == 0 && b % 2 == 0 && n % 2 != 0) || (a == b) && a != n) {
            System.out.println("Impossible");
        } else {
            while (a != n || b != n) {
                if (a > b) {
                    System.out.println(">A");
                    aNow = aNow + a;

                } else {

                }
            }
        }

    }
}
//не смотрите пожалуйста я потом как-нибудь додумаюсь