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
		
		System.out.println("Sua pele é:" + this.pele);
		System.out.println("Seus olhos são:" + this.olhos );
		System.out.println("Seu nariz é:" + this.nariz );
		System.out.println("Sua camisa é:" + this.camisa );
	
	}
	
	void colocar() {
		
		comBone = true;
		
	}
	
	void poderesUsar() {
		
		System.out.println("Mario esta " + (this.invencivel ? "invencível!" : "normal!"));
		System.out.println("Mario esta " + (this.voando ? "voando, uhuuuuu!" : "caminhando!"));
	}

}
 