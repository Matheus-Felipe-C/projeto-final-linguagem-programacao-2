
public class Tabuleiro {
	private Peca matriz[][];

	public Tabuleiro() {
		this.matriz = new Peca[3][3];
	}
	
	boolean jogadaRealizada(int xIn, int yIn, Peca peca) {
		
		boolean result = true;
		peca.setPosicaoX(xIn);
		peca.setPosicaoY(yIn);
		matriz[yIn][xIn] = peca;
		
		
		if((xIn == yIn) ) {
			for(int x = 0; x < matriz.length; x++) {
				int y = x;
				result = result && (matriz[y][x] != null && matriz[y][x].getPeca().equals(peca.getPeca()));
		
			}
			
			if(result)
				return result;
			else
				result = true;
		}
		
		System.out.println("--");
		
		if((xIn == yIn) || (yIn == 0 && xIn == 2) || (yIn == 2 && xIn == 0)) {
			for(int x = 0; x < matriz.length; x++) {
				int y = 2 - x;
				
				result = result && (matriz[y][x] != null && matriz[y][x].getPeca().equals(peca.getPeca()));
			}
			
			if(result)
				return result;
			else
				result = true;
		}
		
		System.out.println("--");
		
		for(int x = 0; x < matriz.length; x++) {
			
			result = result && (matriz[yIn][x] != null && matriz[yIn][x].getPeca().equals(peca.getPeca()));
		}
		
		if(result)
			return result;
		else
			result = true;
		
		System.out.println("--");
		
		for(int y = 0; y < matriz.length; y++) {
			
			result = result && (matriz[y][xIn] != null && matriz[y][xIn].getPeca().equals(peca.getPeca()));
		}
		
		if(result)
			return result;
	
		return false;
	}
	
	@Override
	public String toString() {
		
		String result = "";
		
		for(int i = 0; i < this.matriz.length; i++) {
			for(int j = 0; j < this.matriz.length; j++) {
				
				Peca elemento = matriz[i][j];
				
				if(elemento != null) {
					result += " " + elemento.getPeca() + " ";
				} else {
					result += "   ";
				}
				
				if((j != 2))
					result += "|";
			}
			
			if(i < 2)
				result += "\n---.---.---\n";
		}
		
		return result;
	}
	
	public Peca[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Peca[][] matriz) {
		this.matriz = matriz;
	}
}
