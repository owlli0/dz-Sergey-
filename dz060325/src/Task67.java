import java.util.Scanner;

public class Task67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            int past = i - 1;
            if (array[i] > 0 && array[past] > 0) {
                flag = true;
            } else if (array[i] < 0 && array[past] < 0) {
                flag = true;
            }
        }
        System.out.println(flag == true ? "YES" : "NO");
    }
}
//решено