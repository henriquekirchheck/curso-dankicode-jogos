package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    

        // Scanner in = new Scanner(System.in);
        // String nome,cidade,estado,pais,peso,idade;

        // System.out.println("Digite seu nome: ");
        // nome = in.nextLine();
        // System.out.println("Digite sua idade: ");
        // idade = in.nextLine();
        // System.out.println("Digite seu peso: ");
        // peso = in.nextLine();
        // System.out.println("Digite sua cidade: ");
        // cidade = in.nextLine();
        // System.out.println("Digite seu estado: ");
        // estado = in.nextLine();
        // System.out.println("Digite seu pais: ");
        // pais = in.nextLine();

        // System.out.println("-------------");
        
        // // Gerar resultado do teste

        // System.out.println("O seu nome é: " + nome);
        // System.out.println("A sua idade é: " + idade);
        // System.out.println("O seu peso é: " + peso);
        // System.out.println("A sua cidade é: " + cidade);
        // System.out.println("O seu estado é: " + estado);
        // System.out.println("O seu pais é: " + pais);

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String nome, comando;

        System.out.println("Seja bem vindo ao jogo");
        System.out.println("Insira seu nome: ");
        nome = in.nextLine();
        System.out.println("Sejá muito bem vindo(a) " + nome);
        System.out.println("Você deseja avançar em qual direção? (w, a, s, d)");

        comando = in.nextLine();

        if (comando.equals("w")) {
            System.out.println("Você foi para frente!");
            System.out.println("Um inimigo surgiu, o que deseja fazer? (a= atacar, f= fugir)");
            comando = in.nextLine();

            if (comando.equals("a")) {
                if ((rand.nextInt(100) + 1) <= 75) {
                    System.out.println("Você ganhou a batalha! Parabens!");
                } else {
                    System.out.println("Você perdeu a batalha");
                }
            } else if (comando.equals("f")) {
                System.out.println("Você fugiu com sucesso! O jogo acabou");
            }
        } else if (comando.equals("s")) {
            System.out.println("Você está entrando em outro mapa");
        }
    }
}
