import javax.swing.JComboBox;

public class Peca extends JComboBox {
	
	private String peca; //X ou O
	private int posicaoX;
	private int posicaoY;
	
	public Peca() {
		
	}
	
	public Peca(String peca) {
		this.peca = peca;
	}
	
	public String getPeca() {
		return peca;
	}
	public void setPeca(String peca) {
		this.peca = peca;
	}
	public int getPosicaoX() {
		return posicaoX;
	}
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	public int getPosicaoY() {
		return posicaoY;
	}
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
}
