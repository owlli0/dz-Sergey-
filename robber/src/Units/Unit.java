package Units;

public abstract class Unit {
    public String name;
    protected int hp;
    protected boolean isAlive;

    public Unit(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
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