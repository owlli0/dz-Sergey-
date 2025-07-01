import java.util.Scanner;

public class TaskHard {
    public static void main(String[] args) {

    }

    public static int[][] firstMethod(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 150) + 1;
            }
        }
        return array;
    }

    public static void secondMethod(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] thirdMethod(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int[] sumArray = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            sum[i]
        }
    }
}
