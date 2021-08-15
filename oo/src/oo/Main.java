package oo;

public class Main extends Player{
    private String nome = "Henrique";
    public static final int VIDA_MAXIMA = 100;

    // Metodo Construtor
    public Main(int vidaInicial, int tempo){
        super(vidaInicial, tempo);
        System.out.println("Classe criada por " + nome);
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Main m = new Main(100, 200);
        System.out.println(m.getNome());
    }
} 
