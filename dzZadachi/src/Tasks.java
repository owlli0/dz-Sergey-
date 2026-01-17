public class Tasks {
    private String name;
    private String about;
    private String date;
    public static int count = 0;

    //конструктор
    public Tasks(String name, String about, String date) {
        this.name = name;
        this.about = about;
        this.date = date;
        count++;
    }

    public Tasks(String name, String date) {
        this.name = name;
        this.date = date;
        count++;
    }

    //конструктор копирования
    public Tasks(Tasks tasks) {
        this(tasks.getName(), tasks.about, tasks.date);
    }

    //вывод на экран задачу
    public void printInfo() {
        System.out.println("--------------");
        System.out.println("|" + name + "|");
        System.out.println("--------------");
        System.out.println(about);
        System.out.println("***" + date + "***");
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getDate() {
        return date;
    }

    //проверка слова в названии
    public boolean equalseWord(String name) {
        return this.name.contains(name);
    }
}