package teste_curso_games;

public class Inimigo {
	public int vida = 100;
	public int ataque = 10;

	public Inimigo(int vida) {
		this.vida = vida;
	}

	public void tomarDano(int dano) {
		vida -= dano;
	}
			
	public int getVida() {
        return vida;
    }
	
}
