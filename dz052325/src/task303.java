import java.util.Scanner;

public class task303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cow = scanner.nextInt();
        int remains = cow % 10;

        if (cow >= 11 && cow <= 14){
            System.out.println(cow + " korov");
        } else if (remains == 1) {
            System.out.println(cow + " korova");
        } else if (remains >= 2 && remains <= 4) {
            System.out.println(cow + " korovy");
        } else {
            System.out.println(cow + " korov");
        }

    }
}
//что курят создатели этих задач, я тоже хочу Т.Т