import java.util.Scanner;

public class TaskText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j % 2 != 0){
                    array[i][j] = 5;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//решено