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
		
		System.out.println("Sua pele �:" + this.pele);
		System.out.println("Seus olhos s�o:" + this.olhos );
		System.out.println("Seu nariz �:" + this.nariz );
		System.out.println("Sua camisa �:" + this.camisa );
	
	}
	
	void colocar() {
		
		comBone = true;
		
	}
	
	public void name() {
		
	} void poderesUsar() {
		
		System.out.println("Mario esta " + (this.invencivel ? "invenc�vel!" : "normal!"));
		System.out.println("Mario esta " + (this.voando ? "voando, uhuuuuu!" : "caminhando!"));
	}

}
 