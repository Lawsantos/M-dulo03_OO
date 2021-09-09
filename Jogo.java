import java.util.Random;

public class Jogo {

	
	private Personagem jogador1;
	private Personagem jogador2;	
	
	public Jogo(Personagem player1, Personagem player2) {
		
		this.jogador1 = player1;
		this.jogador2 = player2;
	}
	
	public void apresentarPlayers() {
		System.out.println("จจจจจจจจจจจจจAPRESENTANDO OS JOGADORESจจจจจจจจจจจจจจจจจ\n");
		this.jogador1.status();
		this.jogador1.statusLive();
		
		System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ\n");
		System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ\n");
		
		this.jogador2.status();
		this.jogador2.statusLive();
	}

	public void jogar() {		
		
		Random moedas = new Random();
		int coleta = moedas.nextInt(30);
		
		for (int i = 0; i <= coleta; i++) {
			
			this.jogador1.coletaCoins();
		}
		
		System.out.println(this.jogador1.nome + " coletou " + coleta + " vezes as moedas.");
		
		coleta = moedas.nextInt(30);
		
		for (int i = 0; i <= coleta; i++) {
			
			this.jogador2.coletaCoins();
		}
		System.out.println(this.jogador2.nome + " coletou " + coleta + " vezes as moedas.\n");

	}

}
