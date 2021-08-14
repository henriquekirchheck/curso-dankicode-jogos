package zelda_mini_clone;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Enemy extends Rectangle{

    public int spd = 1;
    public int right = 1, up = 0, down = 0, left = 0;

    public int curAnimation = 0;

    public int curFrames = 0, targetFrames = 15;

    public static List<Bullet> bullets = new ArrayList<Bullet>();

    public boolean shoot = false;

    String direction = "down";
    public int ldir = 1;


    public Enemy(int x, int y) {
        super(x, y, 32, 32);
    }

    public void tick() {
        boolean moving = false;
        if(right == 1 && World.isFree(x + spd, y)) {
            x += spd;
            moving = true;
            direction = "right";
            ldir = 1;
        } else if(left == 1 && World.isFree(x - spd, y)) {
            x -= spd;
            moving = true;
            direction = "left";
            ldir = -1;
        }
        
        if(up == 1 && World.isFree(x, y - spd)) {
            y -= spd;
            moving = true;
            direction = "up";
        } else if(down == 1 && World.isFree(x, y + spd)) {
            y += spd;
            moving = true;
            direction = "down";
        }
        
        if(moving) {
            curFrames++;
            if(curFrames == targetFrames) {
                curFrames = 0;
                curAnimation++;
                if(curAnimation == Spritesheet.enemy_front.length) {
                    curAnimation = 0;
                }
            }
        } else {
            curAnimation = 0;
        }

        if(shoot) {
            shoot = false;
            bullets.add(new Bullet(x, y, ldir));
        }

        for(int i = 0; i < bullets.size(); i++) {
            bullets.get(i).tick();
        }
    }
    
    public void render(Graphics g) {
        if (direction.equals("right")) {
            g.drawImage(Spritesheet.enemy_side[curAnimation], x, y, 32, 32, null);
        } else if (direction.equals("left")) {
            g.drawImage(Spritesheet.enemy_side[curAnimation], x + 32, y, -32, 32, null);
        } else if (direction.equals("up")) {
            g.drawImage(Spritesheet.enemy_front[curAnimation], x, y + 32, 32, -32, null);
        } else if (direction.equals("down")) {
            g.drawImage(Spritesheet.enemy_front[curAnimation], x, y, 32, 32, null);
        }

        for(int i = 0; i < bullets.size(); i++) {
            bullets.get(i).render(g);
        }
    }
}
