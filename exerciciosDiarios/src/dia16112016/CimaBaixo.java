package dia16112016;

import java.util.Vector;

public class CimaBaixo extends Jogo {

	public CimaBaixo(){
		
	}
	
	public CimaBaixo(Vector<Carta> baralho, Vector<Jogador> jogadores) {
		this.baralho = baralho;
		this.jogadores = jogadores;
		Carta asEspadas = new Carta(3,"As", 1);
		Carta manilhaOuros = new Carta(2,"7", 7);
		for (int i=0;i<4;i++) {
			this.jogadores.addElement(new Jogador("jogador"+i,50*i));
		}
		this.baralho.add(asEspadas);
		this.baralho.add(manilhaOuros);
		
	}

}
