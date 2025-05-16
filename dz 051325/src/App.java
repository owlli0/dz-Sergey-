import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int next = a + 1;
        int previous = a - 1;

        System.out.println("The next number for the number " + a + " is " + next  + "." );
        System.out.println("The previous number for the number " + a + " is " + previous  + "." );
    }
}
