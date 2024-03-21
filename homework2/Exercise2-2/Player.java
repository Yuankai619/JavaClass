package ntou.cs.java2024;

import java.util.Random;

public class Player {
    private long hp;
    private int attackPoints;

    public Player() {
        Random random = new Random();
        this.hp = 9000000000L + (long) (random.nextFloat() * (10000000000L - 9000000000L));
        this.attackPoints = 100000000 + (int) (random.nextFloat() * (200000000 - 100000000));
    }

    public long getHp() {
        return hp;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setHp(long newHp) {
        this.hp = newHp < 0 ? 0 : newHp;
    }

    public void attack(Player enemy) {
        long newHp = enemy.getHp() - this.attackPoints;
        enemy.setHp(newHp);
    }
}
