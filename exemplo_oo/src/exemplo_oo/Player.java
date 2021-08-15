package exemplo_oo;
public class Player {
    public int life = 100;

    public void atackEnemy(Enemy enemy) {
        enemy.life -= 5;
    }
}
