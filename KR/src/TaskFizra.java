import java.util.Scanner;

public class TaskFizra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int[] students = new int[n];
        int minHeight = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = scanner.nextInt();
        }
        minHeight = students[0];
        for (int i = 1; i < students.length; i++) {

            if (minHeight > students[i]) {
                minHeight = students[i];
            }
        }
        System.out.println("Рост Валеры " + minHeight);
    }
}
//решено