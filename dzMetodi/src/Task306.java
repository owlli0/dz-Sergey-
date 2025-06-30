import java.util.Scanner;

public class Task306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(min(a, b, c, d));
    }

    public static int min(int a, int b, int c, int d) {
        int[] array = {a, b, c, d};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }

}
//решено 100