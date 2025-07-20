package Units;

public class Robber extends Unit {
    private int critRate;
    private int count = 1;

    public Robber(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    public void getDmg(int dmg) {
        hp -= dmg;
    }

    public void attack(Warrior warrior) {
        double rate = Math.random() * 100 + 1;
        critRate = (int) rate;
        if (critRate >= 50) {
            warrior.getDmg(15 * count);
            count = 1;
        } else {
            count += 3;
        }
    }

    public void attack(Mage mage) {
        double rate = Math.random() * 100 + 1;
        critRate = (int) rate;
        if (critRate >= 50) {
            mage.getDmg(15 * count);
            count = 1;
        } else {
            count += 3;
        }
    }

    public void attack(Robber robber) {
        double rate = Math.random() * 100 + 1;
        critRate = (int) rate;
        if (critRate >= 50) {
            robber.getDmg(15 * count);
            count = 1;
        } else {
            count += 5;
        }
    }
}