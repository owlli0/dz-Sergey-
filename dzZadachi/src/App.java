import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Tasks task1 = new Tasks(
                "Кто хочет стать милионером",
                "Поиграть в казино",
                "21.07.2025"
        );

        Tasks task2 = new Tasks(
                "Ёжик в тумане",
                "Достать ежа из тумана ",
                "11.11.2025"
        );

        Tasks task3 = new Tasks(
                "Собака и пакеты",
                "Сказать собаке закопать пакеты",
                "29.09.2025"
        );

        //старое
        Scanner scanner = new Scanner(System.in);
        String findWord = scanner.next();
        Tasks[] tasks = new Tasks[]{task1, task2, task3};
        boolean haveWord = false;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].equalseWord(findWord)) {
                tasks[i].printInfo();
            }
        }

        //новое
        Tasks tasksCopy = new Tasks(task1);
        tasksCopy.printInfo();
        Tasks task4 = new Tasks(
                "Сходить в магазин",
                "29.09.2025"
        );
        task4.printInfo();
        System.out.println("Задач было создано: " + Tasks.count);
    }
}