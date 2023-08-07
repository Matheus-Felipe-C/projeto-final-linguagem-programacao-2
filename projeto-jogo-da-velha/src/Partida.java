import javax.swing.JLabel;

public class Partida {
	
	private boolean estado;
	private int qtdJogadas;
	private Jogador jogador1;
	private Jogador jogador2;
	private Jogador jogadorAtual;
	private Tabuleiro tabuleiro;
	private JLabel lbljogadorAtual;
	
	public Partida(Jogador jogador1, Jogador jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.jogadorAtual = jogador1;
		this.tabuleiro = new Tabuleiro();
		this.estado = true;
		this.qtdJogadas = 0;
		this.lbljogadorAtual = new JLabel();
	}
		
	boolean fazerJogada(int x, int y) {
		
		boolean result = this.tabuleiro.jogadaRealizada(x, y, this.jogadorAtual.getPeca());
		System.out.println("Result da classe Partida" + result + " Partida!");
		this.qtdJogadas++;
		System.out.println(this.qtdJogadas);
		if(this.qtdJogadas > 9 || result)
			this.estado = false;
		else
			this.estado = true;
		
		if(!this.estado) {
			return result;
		} else {
			if(jogadorAtual == jogador1) {
				jogadorAtual = jogador2;
			} else {
				jogadorAtual = jogador1;
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return this.tabuleiro.toString();
		
	}
	
	public String pecaDoJogadorAtual() {
		return this.jogadorAtual.getPeca().getPeca();
	}
	
	public int getQtdJogadas() {
		return qtdJogadas;
	}

	public void setQtdJogadas(int qtdJogadas) {
		this.qtdJogadas = qtdJogadas;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Jogador getJogadorAtual() {
		return jogadorAtual;
	}

	public void setJogadorAtual(Jogador jogadorAtual) {
		this.jogadorAtual = jogadorAtual;
	}
	
	public Jogador getJogador1() {
		return jogador1;
	}
	
	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}
	
	public Jogador getJogador2() {
		return jogador2;
	}
	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public JLabel getLbljogadorAtual() {
		return lbljogadorAtual;
	}

	public void setLbljogadorAtual(JLabel lbljogadorAtual) {
		this.lbljogadorAtual = lbljogadorAtual;
	}
}
