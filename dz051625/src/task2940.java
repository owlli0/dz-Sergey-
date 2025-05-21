import java.util.Scanner;

public class task2940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        int time = sc.nextInt();

        int road = 109;
        int distanceTraveled = speed * time;

        int result = (distanceTraveled % road + road) % road;

        System.out.println(result);
    }
}
// Решено
