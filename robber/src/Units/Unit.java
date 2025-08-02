package Units;

public abstract class Unit {
    protected String name;
    protected int hp;

    public Unit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Hp : " + hp);
    }

    public int getHp() {
        return hp;
    }

    public abstract void getDamage(int dmg);

    public abstract void attack(Unit unit);
}