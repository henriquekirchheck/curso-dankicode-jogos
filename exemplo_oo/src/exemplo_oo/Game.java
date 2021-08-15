package exemplo_oo;

public class Game {

    private Player player;
    private Enemy enemy;

    public Game() {
        player = new Type1();

        if(player == null) {
            System.out.println("O player não foi inicializado");
            player = new Player();
        }

        if(player instanceof Type1) {
            
        } else if(player instanceof Player) {
            System.out.println("O player foi inicializado com sucesso");
        }

        enemy = new Enemy();
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public static void main(String[] args) {
        Game game = new Game();
        Player player = game.getPlayer();
        player.atackEnemy(game.getEnemy());
        System.out.println(game.getEnemy().life);
    }
}
