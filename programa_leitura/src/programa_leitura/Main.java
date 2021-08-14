package programa_leitura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome,cidade,estado,pais,peso,idade;

        System.out.println("Digite seu nome: ");
        nome = in.nextLine();
        System.out.println("Digite sua idade: ");
        idade = in.nextLine();
        System.out.println("Digite seu peso: ");
        peso = in.nextLine();
        System.out.println("Digite sua cidade: ");
        cidade = in.nextLine();
        System.out.println("Digite seu estado: ");
        estado = in.nextLine();
        System.out.println("Digite seu pais: ");
        pais = in.nextLine();

        System.out.println("-------------");
        
        // Gerar resultado do teste

        System.out.println("O seu nome é: " + nome);
        System.out.println("A sua idade é: " + idade);
        System.out.println("O seu peso é: " + peso);
        System.out.println("A sua cidade é: " + cidade);
        System.out.println("O seu estado é: " + estado);
        System.out.println("O seu pais é: " + pais);
    }
}
