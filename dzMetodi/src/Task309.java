import java.util.Scanner;

public class Task309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(Election(x, y, z));
    }

    public static int Election(int x, int y, int z) {
        int res;
        res = x + y + z > 1 ? 1 : 0;
        return res;
    }
}
//решено 100
