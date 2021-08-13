package teste_curso_games;

public class Game {
	public static void main(String[] args) {
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
	}
}
