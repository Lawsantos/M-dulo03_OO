
public class Principal {

	public static void main(String[] args) {

		Mario jogador1 = new Mario("Mario", 41, 1.30);
		Luigi jogador2 = new Luigi("Luigi", 38, 1.70);
		Yoshi jogador3 = new Yoshi("Yoshi", 10, 1);
		
		jogador3.comerFruta();
		jogador3.comerFruta();
		jogador3.comerFruta();
		jogador3.comerFruta();
		System.out.println(jogador3.getVelocidade());
		System.out.println(jogador3.quantFrutasComidas);
		jogador1.montado();
		jogador1.montarNoYoshi(jogador3);
		jogador1.montado();
		jogador2.voar();
		jogador3.status();
		jogador3.saltar();
		jogador2.crescer();
		System.out.println(jogador2.getAltura());
		jogador3.saltar(1.5);
	}

}
