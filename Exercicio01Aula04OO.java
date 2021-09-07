public class Exercicio01Aula04OO {

	public static void main(String[] args) {
		
		MarioAula04 m01 = new MarioAula04("Mario", 38 , 1.36);
		
		m01.getAltura();
		m01.getEstamina();		
		m01.getIdade();
		m01.getNariz();
		m01.getNome();		
		m01.getOlhos();
		m01.status();
		
		MarioAula04 m02 = new MarioAula04();
		
		m02.setInvencivel(true);
		
		m02.status();
		m02.poderesUsar();

	}
	
	
	
}
