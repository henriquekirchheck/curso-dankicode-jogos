package oo;

public class Main {
    private String nome = "Henrique";
    public static final int VIDA_MAXIMA = 100;

    // Metodo Construtor
    public Main(){
        System.out.println("Classe criada por " + nome);
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.getNome());
    }
} 
