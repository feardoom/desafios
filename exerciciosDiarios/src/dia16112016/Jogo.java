package dia16112016;

import java.util.Vector;

public class Jogo {
	public Vector<Carta> baralho;
	protected Vector<Jogador> jogadores;
	
	public Jogo(){}
	
	public Jogo(Vector<Carta> baralho, Vector<Jogador> jogadores) {
		this.baralho = baralho;
		this.jogadores = jogadores;
	}
	
	public void distribuirPontuacao() {
		
	}
}
