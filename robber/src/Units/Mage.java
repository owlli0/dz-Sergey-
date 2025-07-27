package Units;

public class Mage extends Unit {
    private int mp;

    public Mage(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mp : " + mp);
    }

    @Override
    public void getDamage(int dmg) {
        hp -= dmg;
    }

    @Override
    public void attack(Unit unit) {
        if (mp > 0) {
            unit.getDamage(20);
            mp -= 5;
        } else {
            unit.getDamage(5);
        }
    }
}