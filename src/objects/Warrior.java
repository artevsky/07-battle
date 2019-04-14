package objects;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.println("Enemy attacked by "+super.getName());
        Enemy hit = new Enemy(100);
        hit.takeDamage(100, (int) (20+Math.random()*200));
    }
}
