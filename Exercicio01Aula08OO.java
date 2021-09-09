public class Exercicio01Aula08OO {

	public static void main(String[] args) {
		
		Personagem mario = new Personagem("Mario", 41, 1.30);
		Personagem luigi = new Personagem("Luigi", 30, 1.70);
		
		mario.status();
		luigi.status();
		//teste aumenta vida
		
		mario.statusLive();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		
				
		mario.statusLive();
		
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.coletaCoins();
		mario.statusLive();
		
		//teste do método morrer
		
		mario.morrer();
		mario.statusLive();
		
		mario.morrer();
		mario.statusLive();
		
		mario.morrer();
		mario.statusLive();
		
		mario.status();
		
		mario.morrer();
		mario.statusLive();
		
		mario.status();
		mario.saltar();
		
		//Relação entre a classe Personagem e a classe Jogo
		
		Jogo game = new Jogo(mario, luigi);
		
		game.apresentarPlayers();
		
		game.jogar();
		
		mario.statusLive();
		luigi.statusLive();
	}	
	
	
}
