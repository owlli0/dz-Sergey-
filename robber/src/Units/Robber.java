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
        if (hp > 0 ) {
            hp -= dmg;
        } else {
            isAlive = false;
        }
    }

    @Override
    public void attack(Unit unit) {
        if (!isAlive()) return; // Мёртвые не атакуют
        if (Math.random() * 100 >= 50) {
            unit.getDamage(15 * count);
            count = 1;
        } else {
            count += 3;
        }
    }
}