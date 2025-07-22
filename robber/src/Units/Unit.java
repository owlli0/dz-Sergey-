package Units;

public class Unit {
    protected String name;
    protected int hp;

    public Unit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void printInfo() {
        System.out.println("===============");
        System.out.println("Name : " + name);
        System.out.println("Hp : " + hp);
    }

    public int getHp() {
        return hp;
    }
}