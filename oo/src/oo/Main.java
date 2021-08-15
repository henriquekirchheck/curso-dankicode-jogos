package oo;

public class Main {

    private static int exemplo(int[] a) {
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            r += a[i];
        }
        return r;
    }

    public void print(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Player2 player2 = new Player2();
        // player2.nascer();
        // Main main = new Main();
        // main.exemplo();
        // Main.exemplo();

        int[] n1 = new int[5];

        n1[0] = 10;
        n1[1] = 10;
        n1[2] = 10;
        n1[3] = 10;
        n1[4] = 10;

        System.out.println(exemplo(n1));
        new Main().print("Hello world!");
    }

} 
