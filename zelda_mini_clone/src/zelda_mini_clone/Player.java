package zelda_mini_clone;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Player extends Rectangle{

    public int spd = 4;
    public boolean right, up, down, left;

    public int curAnimation = 0;

    public int curFrames = 0, targetFrames = 15;

    public static List<Bullet> bullets = new ArrayList<Bullet>();

    public boolean shoot = false;

    String direction = "down";
    public int dir = 1;


    public Player(int x, int y) {
        super(x, y, 32, 32);
    }

    public void tick() {
        boolean moving = false;
        if(right && World.isFree(x + spd, y)) {
            x += spd;
            moving = true;
            direction = "right";
            dir = 1;
        } else if(left && World.isFree(x - spd, y)) {
            x -= spd;
            moving = true;
            direction = "left";
            dir = -1;
        }
        
        if(up && World.isFree(x, y - spd)) {
            y -= spd;
            moving = true;
            direction = "up";
        } else if(down && World.isFree(x, y + spd)) {
            y += spd;
            moving = true;
            direction = "down";
        }
        
        if(moving) {
            curFrames++;
            if(curFrames == targetFrames) {
                curFrames = 0;
                curAnimation++;
                if(curAnimation == Spritesheet.player_front.length) {
                    curAnimation = 0;
                }
            }
        } else {
            curAnimation = 0;
        }

        if(shoot) {
            shoot = false;
            bullets.add(new Bullet(x, y, dir));
        }

        for(int i = 0; i < bullets.size(); i++) {
            bullets.get(i).tick();
        }
        
    }
    
    public void render(Graphics g) {
        if (direction.equals("right")) {
            g.drawImage(Spritesheet.player_side[curAnimation], x, y, 32, 32, null);
        } else if (direction.equals("left")) {
            g.drawImage(Spritesheet.player_side[curAnimation], x + 32, y, -32, 32, null);
        } else if (direction.equals("up")) {
            g.drawImage(Spritesheet.player_back[curAnimation], x, y, 32, 32, null);
        } else if (direction.equals("down")) {
            g.drawImage(Spritesheet.player_front[curAnimation], x, y, 32, 32, null);
        }

        for(int i = 0; i < bullets.size(); i++) {
            bullets.get(i).render(g);
        }
    }
}
