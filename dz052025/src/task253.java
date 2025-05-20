import java.util.Scanner;

public class task253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        String  res = ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0 ? "YES" : "NO";

        System.out.println(res);
    }
}
//решено