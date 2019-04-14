package objects;

public class Enemy implements Mortal {

    public int hp;

    public Enemy(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp;
        }
    }

    public void takeDamage(int hp, int damage) {
        hp -= damage;
        System.out.println("Enemys HP before hit: " + (hp + damage));
        System.out.println("Power of Hit: " + damage);
        System.out.println("Enemys HP after hit: " + hp);
        System.out.println("the enemy is still alive?");

        if (hp > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    @Override
    public boolean isAlive() {
        if (hp >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
