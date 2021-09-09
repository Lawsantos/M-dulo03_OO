
public class Yoshi extends Personagem{

	public Yoshi(String nome, int idade, double altura) {
		
		super(nome, idade, altura);
		
	}	
	
	int quantFrutasComidas = 0;
	int velocidade = 10;

	public int getVelocidade() {
		
		return velocidade;
	}
	
	public void comerFruta() {
		
		this.quantFrutasComidas++;
		if (this.quantFrutasComidas % 2 == 0) {
			
			this.velocidade *= 2;
		}
		
	}

}
