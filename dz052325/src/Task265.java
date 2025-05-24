import java.util.Scanner;

public class Task265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int food = sc.nextInt();
        int minute = sc.nextInt();
        int numbers = sc.nextInt();
        int result;

        if (numbers <= food) {
            result = minute * 2;
        } else {
            result = ((numbers * 2 + food - 1) / food) * minute;
        }
        System.out.println(result);
    }
}
//это задание убило мою любовь к котлетам, а также заставило сомневаться в своей логике после 5 попытки