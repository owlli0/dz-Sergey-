import java.util.Scanner;

public class Task308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(xor(x, y));
    }

    public static int xor(int x, int y) {
        int res;
        if ((x == 1 && y != 1) || (x != 1 && y == 1)) {
            res = 1;
        } else {
            res = 0;
        }
        return res;
    }
}
//решено 100