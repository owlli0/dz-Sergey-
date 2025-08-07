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
        if (hp > 0 ) {
            if (armor > 0) {
                hp -= dmg / 2;
                armor--;
            } else {
                hp -= dmg;
            }
        } else {
            isAlive = false;
        }
    }

    @Override
    public void attack(Unit unit) {
        if (isAlive() == false){
            return;
        }
        unit.getDamage(10);
    }

}