package programa_leitura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = in.nextLine();
        System.out.println(nome);
    }
}
