package aula02OO;

public class Mario {

	String  pele;
	String olhos;
	String nariz;
	String camisa;
	boolean comBone;
	boolean invencivel;
	boolean voando;	
	
	void apresentar() {
		
		System.out.println("Sua pele �:" + this.pele);
		System.out.println("Seus olhos s�o:" + this.olhos );
		System.out.println("Seu nariz �:" + this.nariz );
		System.out.println("Sua camisa �:" + this.camisa );
	
	}
	
	void colocar() {
		
		comBone = true;
		
	}
	
	void poderesUsar() {
		
		System.out.println("Mario esta " + (this.invencivel ? "invenc�vel!" : "normal!"));
		System.out.println("Mario esta " + (this.voando ? "voando, uhuuuuu!" : "caminhando!"));
	}

}
 