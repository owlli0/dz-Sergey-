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

    @Override
    public void getDamage(int dmg) {
        hp -= dmg;
    }

    @Override
    public void attack(Unit unit) {
        double rate = Math.random() * 100 + 1;
        critRate = (int) rate;
        if (critRate >= 50) {
            unit.getDamage(15 * count);
            count = 1;
        } else {
            count += 3;
        }
    }
}