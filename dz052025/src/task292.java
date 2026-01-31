import java.util.Scanner;

public class task292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second;
        first = sc.nextInt();
        second = sc.nextInt();

        int res = first > second ? first : second;

        System.out.println(res);
    }
}
//решено