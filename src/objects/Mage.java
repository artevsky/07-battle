package objects;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.println("Enemy attacked by "+super.getName());
        Enemy hit = new Enemy(100);
        hit.takeDamage(100, (int) (50+Math.random()*50));
    }
}
