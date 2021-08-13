package teste_curso_games;

public class Player {
	public int vida = 100;
	public String nome = "Guilherme";
	
	
	public void perderVida() {
		vida--;
	}
	
	public void ganharVida() {
		vida++;
	}
}
