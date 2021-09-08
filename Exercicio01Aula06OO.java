public class Exercicio01Aula06OO {

	public static void main(String[] args) {
		
		MarioAula06 m01 = new MarioAula06("Mario", 41, 1.70, 100, 0, 0);	
		
		m01.status();
		
		//teste aumenta vida
		m01.statusLive();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		
				
		m01.statusLive();
		
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.coletaCoins();
		m01.statusLive();
		
		//teste do método morrer
		
		m01.morrer();
		m01.statusLive();
		
		m01.morrer();
		m01.statusLive();
		
		m01.morrer();
		m01.statusLive();
		
		m01.status();
		
		m01.morrer();
		m01.statusLive();
		
		m01.status();
		
		
	
	}	
	
	
}
