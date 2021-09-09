
public class Mario extends Personagem{

	public Mario(String nome, int idade, double altura) {
		super(nome, idade, altura);
		
	}

	private Yoshi = yoshi;
	
	public void (Yoshi yoshi) {
		
		this.yoshi = yoshi;
	}
	
	public void montado() {
		
		if(this.yoshi != null) {
			
			System.out.println("Mario está montado no Yoshi!");
		}else {
			
			System.out.println("Mario não está montado no Yoshi!");
		}
	}	
	
	@Override
	public void crescer() {
		this.altura *= 1.5;
	}
}
