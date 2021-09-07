

public class MarioAula04 {	
	
	public MarioAula04() {
		
		this.nome = "Mario Bros";
		this.idade = 40;
		this.altura = 1.50;
		this.estamina = 100;
	}
	
	
	public MarioAula04(String nome, int idade, double altura) {
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = 100;
	}

	private String  nome;	
	private int idade;
	private double altura;
	private int estamina = 100;
	
	//caracteristicas
	private String olhos ="Azuis brilhantes";
	private String nariz = "Grande";	
	
	//superpoderes
	private boolean invencivel;
	private boolean voando;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getOlhos() {
		return olhos;
	}
	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}
	
	public String getNariz() {
		return nariz;
	}
	public void setNariz(String nariz) {
		this.nariz = nariz;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public boolean isInvencivel() {
		return invencivel;
	}
	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}
	
	public boolean isVoando() {
		return voando;
	}
	public void setVoando(boolean voando) {
		this.voando = voando;
	}
	
	public int getEstamina() {
		return estamina;
	}
	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}
	
	public void poderesUsar() {
		
		System.out.println("Mario esta " + (this.invencivel ? "invencível!" : "normal!"));
		System.out.println("Mario esta " + (this.voando ? "voando, uhuuuuu!" : "caminhando!"));
	}

	
	public void status() {
		
		System.out.println("Nome: " + this.nome + " , idade: " + this.idade + " , invencibilidade ativa: " + this.invencivel + " , altura: " + this.altura + " , estamina: " + this.estamina + " , nariz: " + this.nariz + " , olhos: " + this.olhos);
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
	
}
 