package objects;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Enemy attacked by "+super.getName());
        Enemy hit = new Enemy(100);
        hit.takeDamage(100, (int) (5+Math.random()*95));
    }
}