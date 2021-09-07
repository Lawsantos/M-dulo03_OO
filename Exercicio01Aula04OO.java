public class Exercicio01Aula04OO {

	public static void main(String[] args) {
		
		MarioAula04 m01 = new MarioAula04("Mario", 38 , 1.36);			
		
		m01.status();
		
		MarioAula04 m02 = new MarioAula04();
		
		m02.setInvencivel(true);
		
		m02.status();
		m02.poderesUsar();
		m02.perdeEstamina();
		m02.perdeEstamina();
		m02.perdeEstamina();
		m02.perdeEstamina();
		m02.perdeEstamina();
		m02.perdeEstamina();
		m02.perdeEstamina();
		m02.perdeEstamina();
		m02.perdeEstamina();
		m02.perdeEstamina();
		m02.perdeEstamina();		
		
		m02.crescer();
		m02.status();
		m02.ganhaEstamina();
	}	
	
	
}
