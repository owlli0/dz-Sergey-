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

    @Override
    public void getDamage(int dmg) {
        if (armor > 0) {
            hp -= dmg / 2;
            armor--;
        } else {
            hp -= dmg;
        }
    }

    @Override
    public void attack(Unit unit) {
        unit.getDamage((10));
    }

}