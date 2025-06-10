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
//решено (остальные задачи(не все) имеют по 1 примерру Т.Т я не доконца пониаю что нужно сделать, а если примеров несколько то там
// 11010000 10111111 11010000 10111011 11010000 10111110 11010001 10000101 11010000 10111110 11010000 10110101 11010000 10100001 11010000 10111011 11010000 10111110 11010000 10110010 11010000 10111110)