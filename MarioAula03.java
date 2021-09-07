package aula03OO;

public class MarioAula03 {

	public String  pele;
	public String olhos;
	private String nariz;
	private String camisa;
	protected boolean comBone;
	protected boolean invencivel;
	boolean voando;	
	
	public void apresentar() {
		
		System.out.println("Sua pele é:" + this.pele);
		System.out.println("Seus olhos são:" + this.olhos );
		System.out.println("Seu nariz é:" + this.nariz );
		System.out.println("Sua camisa é:" + this.camisa );
	
	}
	
	void colocar() {
		
		comBone = true;
		
	}
	
	public void name() {
		
	} void poderesUsar() {
		
		System.out.println("Mario esta " + (this.invencivel ? "invencível!" : "normal!"));
		System.out.println("Mario esta " + (this.voando ? "voando, uhuuuuu!" : "caminhando!"));
	}

}
 