package zelda_mini_clone;

import java.awt.Rectangle;
import java.awt.Graphics;

public class Block extends Rectangle{
    
    public Block(int x, int y) {
        super(x, y, 32, 32);
    }

    public void render(Graphics g) {
        g.drawImage(Spritesheet.tileWall, x, y, 32, 32, null);
    }

}
