package zelda_mini_clone;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Rectangle{

    public int spd = 4;
    public boolean right, up, down, left;

    public int curAnimation = 0;

    public int curFrames = 0, targetFrames = 15;

    String direction = "down"; 

    public Player(int x, int y) {
        super(x, y, 32, 32);
    }

    public void tick() {
        boolean moving = false;
        if(right && World.isFree(x + spd, y)) {
            x += spd;
            moving = true;
            direction = "right";
        } else if(left && World.isFree(x - spd, y)) {
            x -= spd;
            moving = true;
            direction = "left";
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
    }
}
