

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
	}


	private String  nome;
	private String olhos;
	private String nariz;
	private int idade;
	private double altura;
	private boolean invencivel;
	private boolean voando;
	private int estamina;
	
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
		
		System.out.println("Nome: " + this.nome + " , " + this.idade + " , " + this.invencivel + " , " + this.altura + " , " + this.estamina + " , " + this.nariz + " , " + this.olhos);
	}
}
 