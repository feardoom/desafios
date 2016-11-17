package dia16112016;

public class Carta {
	public int naipe;
	public String nome;
	public int pontuacao;
	
	public Carta(){}
	
	public Carta(int naipe, String nome, int pontuacao) {
		this.naipe = naipe;
		this.nome = nome;
		this.pontuacao = pontuacao;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getNaipe() {
		return this.naipe;
	}
	
	public int getPontuacao() {
		return this.naipe;
	}
	
	public void setPontuacao(int novaPontuacao) {
		this.pontuacao = novaPontuacao;
	}
	
}
