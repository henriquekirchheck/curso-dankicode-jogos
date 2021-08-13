package teste_curso_games;

import java.util.ArrayList;

public class Game {
	public static void main(String[] args) {
		/*
		String nome = "Henrique";
		int idade = 14;
		double peso = 88.2;
		boolean tipo = true;
		System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " e seu peso é " + peso);
		
		if (idade == 28) {
			System.out.println("A idade é 28");
		} else {
			System.out.println("Idade correta é " + idade);
		}
		
		if (nome.equals("Henrique")) {
			System.out.println("O nome é Henrique");
		}
		*/
		/*
		int contador = 1;
		
		
		while (contador <= 10) {
			System.out.println("O numero atual é " + contador);
			
			contador++;
		}
		
		
		for (int i = 0; i <= 10; i+=2) {
			System.out.println("O numero atual é " + i);
		}
		*/
		/*
		Player player = new Player();
		elfInimigo elf = new elfInimigo(10);
		
		player.ganharVida();
		player.perderVida();
		player.perderVida();
		
		System.out.println(player.vida);

		elf.tomarDano();
		System.out.println(elf.getVida());
		*/

		Player player = new Player();
		ArrayList<Inimigo> inimigos = new ArrayList<Inimigo>();

		System.out.print(player.vida);
		
		inimigos.add(new elfInimigo(100));
		inimigos.add(new elfInimigo(100));
		inimigos.add(new elfInimigo(100));
		inimigos.add(new elfInimigo(100));
		inimigos.add(new elfInimigo(100));

		// inimigos.get(0).tomarDano(10);

		// System.out.println(inimigos.get(0).getVida());

		for (int i = 0; i < inimigos.size(); i++) {
			Inimigo inimigoLocal = inimigos.get(i);
			if (i == 2) {
				inimigoLocal.tomarDano(10);
				System.out.println(inimigoLocal.getVida());
			} else {
				System.out.println(inimigoLocal.getVida());
			}
		}
	}
}
