package aula;

public class Main {
    public static void main(String[] args) {
        // ---------------------------------------------------------------------------------------- \\ 

        // Variaveis

        // int idade = 14;
        // System.out.println("Minha idade é " + idade);
        // idade = 52;
        // System.out.println("Minha idade é " + idade);

        // ---------------------------------------------------------------------------------------- \\ 
        
        // Tipo de variaveis

        // int numero = 24; // Numeros
        // String frase = "Hello World"; // Palavras, frases e letras
        // boolean var = true; // Verdadeiro ou falso
        // char var2 = 'a'; // Uma unica letra
        // double var3 = 15.9; // Numeros flutuantes
        // long var4 = 294765456; // Numeros Longos
        
        // System.out.println(numero);
        // System.out.println(frase);
        // System.out.println(var);
        // System.out.println(var2);
        // System.out.println(var3);
        // System.out.println(var4);

        // ---------------------------------------------------------------------------------------- \\ 
        
        // Constantes
        
        // final int maxLife = 100;
        
        // // ERRO
        // // maxLife = 10;
        
        // System.out.println(maxLife);

        // ---------------------------------------------------------------------------------------- \\ 
        
        // Arrays
        
        // // Array Normal
        
        // String[] nome = new String[3];
        // nome[0] = "Henrique";
        // nome[1] = "João";
        // nome[2] = "Guilherme";
        
        // // Array Multidimencional (Pode ter quantas dimensões desejadas)
        
        // String[][] nome2 = new String[2][2];
        
        // nome2[0][0] = "Henrique";
        // nome2[0][1] = "João";
        // nome2[1][0] = "Guilherme";
        // nome2[1][1] = "Ana";
        
        // ---------------------------------------------------------------------------------------- \\ 
        
        // Condições

        int vida = -9;

        if (vida == 100) {
            System.out.println("Sua vida está cheia");
        } else if (vida > 100) {
            System.out.println("Sua vida está acima do limite");
        } else if (vida < 0){
            System.out.println("Você esta morto");
        } else {
            System.out.println("Sua vida é: " + vida);
        }

        String nome = "João";
        if(nome == "Henrique") {
            System.out.println("Nome igual a Henrique");
        } else if (nome != "Henrique") {
            System.out.println("Seu nome não é Henrique");
        }

        // ---------------------------------------------------------------------------------------- \\ 
    }
}
