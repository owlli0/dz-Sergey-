package Units;

public class Warrior extends Unit {
    private int armor;

    public Warrior(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Armor : " + armor);
    }

    public void getDmg(int dmg) {
        if (armor > 0) {
            hp -= dmg / 2;
            armor--;
        } else {
            hp -= dmg;
        }
    }

    public void attack(Mage mage) {
        mage.getDmg(10);
    }

    public void attack(Warrior warrior) {
        warrior.getDmg(10);
    }

    public void attack(Robber robber) {
        robber.getDmg(10);
    }
}