package oo;

public class Main extends Teste_abstract{
    public static void main(String[] args) {
        // Player player = new Player();
        // Player player2 = new Player();
        // Enemy enemy = new Enemy();
        // player.initPlayer();
        // enemy.initEnemy();

        // new Main().instanceMain2();
    }

    public void initGame() {

    }

    public void chamarAbstract() {
        this.instanceMain2();
    }

    public void instanceMain2(){
        new Main2().printHelloWorld();
    }

    private class Main2{
        public void printHelloWorld() {
            System.out.println("Hello World!");
        }
    }
}
