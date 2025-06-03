import java.util.Scanner;

public class Task66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            int past = i-1;
            if (array[i] > array[past]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
//решено