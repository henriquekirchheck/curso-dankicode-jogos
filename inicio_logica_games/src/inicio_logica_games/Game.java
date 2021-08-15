package inicio_logica_games;

import java.util.ArrayList;

public class Game implements Runnable {
    private boolean isRunning;
    private Thread thread;

    private ArrayList<Entity> entities = new ArrayList<Entity>();
    
    public Game() {
        entities.add(new Entity(100, 25, 32));
        entities.add(new Entity(100, 25, 33));

        for(int i = 0; i < entities.size(); i++) {
            Entity entity = entities.get(i);

            
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();

    }

    public synchronized void start() {
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    public void tick() {
        // Atualizar o jogo
        // System.out.println("Tick");
    }
    
    public void render() {
        // Renderiazar
        // System.out.println("Render");
    }

    @Override
    public void run() {
        System.out.println("Jogo começou");
        while (isRunning) {
            tick();
            render();
            try {
                thread.sleep(1000/60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}