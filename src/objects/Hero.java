package objects;

public abstract class Hero {
    public String name;

    public String getName() {
        return name;
    }

    public Hero(String name) {
        this.name = name;
    }

    public abstract void attackEnemy();
}
