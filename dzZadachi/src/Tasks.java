public class Tasks {
    private String name;
    private String about;
    private String date;

    //конструктор
    public Tasks(String name, String about, String date) {
        this.name = name;
        this.about = about;
        this.date = date;
    }

    //вывод на экран задачу
    public void printInfo() {
        System.out.println("--------------");
        System.out.println("|" + name + "|");
        System.out.println("--------------");
        System.out.println(about);
        System.out.println("***" + date + "***");
    }

    //проверка слова в названии
    public boolean equalseWord(String name) {
        return this.name.contains(name);
    }
}