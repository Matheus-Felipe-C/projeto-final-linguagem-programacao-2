
public class Jogador {
	private String nome;
	private Peca peca;
	
	public Jogador(String nome, Peca peca) {
		this.nome = nome;
		this.peca = peca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Peca getPeca() {
		return peca;
	}
	public void setPeca(Peca peca) {
		this.peca = peca;
	}
}