package teste_curso_games;

public class Inimigo {
	public int vida = 100;
	public String inimigoTipo = "tipo1";
	public int ataque = 10;

	public Inimigo(int vida) {
		this.vida = vida;
	}

	public void tomarDano() {
		vida--;
	}
			
	public int getVida() {
        return vida;
    }
	
}
