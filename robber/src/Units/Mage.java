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

    public void getDmg(int dmg) {
        hp -= dmg;
    }

    public void attack(Mage mage) {
        if (mp > 0) {
            mage.getDmg(20);
            mp -= 5;
        } else {
            mage.getDmg(5);
        }
    }

    public void attack(Warrior warrior) {
        if (mp > 0) {
            warrior.getDmg(20);
            mp -= 5;
        } else {
            warrior.getDmg(5);
        }
    }

    public void attack(Robber robber) {
        if (mp > 0) {
            robber.getDmg(20);
            mp -= 5;
        } else {
            robber.getDmg(5);
        }
    }

}