import Units.Mage;
import Units.Robber;
import Units.Warrior;

public class App {
    public static void main(String[] args) {
        Mage mage = new Mage("Гэндальф", 50, 20);
        Warrior warrior = new Warrior("Боб", 80, 10);
        Robber robber = new Robber("Робин", 65);

        System.out.println("Битва разбойника Робина и мага Гэндальфа окончена:");
        while (mage.getHp() > 0 && robber.getHp() > 0) {
            mage.attack(robber);
            robber.attack(mage);
        }
        System.out.println(mage.getHp() > 0 ? "Победил Гэндальф" : "Победил Робин");
        mage.printInfo();
        robber.printInfo();

        System.out.println("====================");
        System.out.println("====================");

        System.out.println("Битва разбойника Робина и воина Боба окончена:");
        while (robber.getHp() > 0 && warrior.getHp() > 0) {
            robber.attack(warrior);
            warrior.attack(robber);
        }
        System.out.println(warrior.getHp() > 0 ? "Победил Боб" : "Победил Робин");
        warrior.printInfo();
        robber.printInfo();


    }
}