
public class Mario extends Personagem{

	public Mario(String nome, int idade, double altura) {
		super(nome, idade, altura);
		
	}

	int yoshi = 0;
	
	public void montarNoYoshi(int yoshi) {
		
		this.yoshi = 1;
	}
	
	public void montado() {
		
		if(this.yoshi > 0) {
			
			System.out.println("Mario está montado no Yoshi!");
		}else {
			
			System.out.println("Mario não está montado no Yoshi!");
		}
	}
}
