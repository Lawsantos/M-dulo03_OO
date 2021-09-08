

public class MarioAula06 {	
	
	public MarioAula06(String nome, int idade, double altura, int estamina, int coinsColected, int life) {
		super();
		this.nome = "Mario";
		this.idade = 41;
		this.altura = 1.71;
		this.estamina = 100;
		this.coinsColected = 0;
		this.life = 1;
	}

	private String  nome;	
	private int idade;
	private double altura;
	private int estamina = 100;
	private int coinsColected = 0;
	private int life = 1;
	
	//caracteristicas
	private String olhos ="Azuis brilhantes";
	private String nariz = "Grande";	
	
	//superpoderes
	private boolean invencivel;
	private boolean voando;	
	
	//Métodos
	
	public void revigorar() {
		
		this.estamina = 100;
	}
	
	public void morrer() {
		
		this.estamina = 0;
		this.life -= 1;
		System.out.println("Morreu!");
		
		if(this.life < 0) {
			
			this.life = 0;
			this.estamina = 0;
			System.out.println("GAME OVER!!!");
			
		}else {
			
			revigorar();
		}
	}
	
	public void coletaCoins() {
		
		this.coinsColected++;
		
		if(this.coinsColected % 10 == 0) {
			
			this.life++;			
		}
		
	}
	
	public void status() {
		
		System.out.println("Nome: " + this.nome + " \nIdade: " + this.idade + " \nAltura: " + this.altura + "\nEstamina: " + this.estamina + "\n");
	}
	
	public void statusLive() {
		
		System.out.println("Total de vidas: " + this.life + "\nTotal de moedas coletadas: " + this.coinsColected + "\n");
	}	
	
	public void perdeEstamina() {
		
		this.estamina -= 10;
		
		if(this.estamina <= 0) {
			
			this.estamina = 0;			
			
		}
	}
	
	public void ganhaEstamina() {
		
		this.estamina += 5;
		
		if(this.estamina >= 100) {
			
			this.estamina = 100;			
			
		}
	}
	
	public void crescer() {
		
		this.altura *= 2;		
		
	}
	
	public void poderesUsar() {
		
		System.out.println("Mario esta " + (this.invencivel ? "invencível!" : "normal!"));
		System.out.println("Mario esta " + (this.voando ? "voando, uhuuuuu!" : "caminhando!"));
	}
}
 