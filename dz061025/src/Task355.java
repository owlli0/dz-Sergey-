import java.util.Scanner;

public class Task355 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        boolean simular = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != array[j][i]) {
                    simular = false;
                    break;
                }
            }
        }
        System.out.println(simular == true ? "yes" : "no");
    }
}
//решено