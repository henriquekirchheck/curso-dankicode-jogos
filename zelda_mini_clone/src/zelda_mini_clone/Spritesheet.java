package zelda_mini_clone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
    public static BufferedImage spritesheet;
    public static BufferedImage[] player_front;
    public static BufferedImage[] player_back;
    public static BufferedImage[] player_side;
    public static BufferedImage[] enemy_front;
    public static BufferedImage[] enemy_side;
    public static BufferedImage tileWall;
    public static BufferedImage bullet;

    public Spritesheet() {
        try {
            spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        player_front = new BufferedImage[2];
        player_front[0] = Spritesheet.getSprite(0, 11, 16, 16);
        player_front[1] = Spritesheet.getSprite(16, 11, 16, 16);

        player_side = new BufferedImage[2];
        player_side[0] = Spritesheet.getSprite(34, 11, 16, 16);
        player_side[1] = Spritesheet.getSprite(50, 11, 16, 16);

        player_back = new BufferedImage[2];
        player_back[0] = Spritesheet.getSprite(69, 11, 16, 16);
        player_back[1] = Spritesheet.getSprite(86, 11, 16, 16);

        enemy_front = new BufferedImage[2];
        enemy_front[0] = Spritesheet.getSprite(0, 325, 16, 16);
        enemy_front[1] = Spritesheet.getSprite(0, 354, 16, 16);

        enemy_side = new BufferedImage[2];
        enemy_side[0] = Spritesheet.getSprite(90, 324, 16, 16);
        enemy_side[1] = Spritesheet.getSprite(90, 354, 16, 16);

        tileWall = Spritesheet.getSprite(120, 603, 16, 16);
        bullet = Spritesheet.getSprite(191, 185, 16, 16);
    }

    public static BufferedImage getSprite(int x, int y, int width, int height) {
        return spritesheet.getSubimage(x, y, width, height);
    }
}
