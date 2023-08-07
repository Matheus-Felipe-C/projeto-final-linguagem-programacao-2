import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		JPrincipal principal = new JPrincipal();
		principal.setVisible(true);
		
		/*Scanner entrada = new Scanner(System.in);
		
		Peca x = new Peca("X");
		Peca o = new Peca("O");
		Jogador j1 = new Jogador("Erica", x);
		Jogador j2 = new Jogador("Gabriel", o);
		
		Partida partida = new Partida(j1, j2);
		
		
		while(partida.isEstado()) {
			
			System.out.println(partida.toString());
			
			System.out.printf("Jogador %s - Faça sua jogada!\n", partida.getJogadorAtual().getNome());
			
			System.out.print("Informe o valor de X: ");
			int pX = entrada.nextInt();
			System.out.print("Informe o valor de Y: ");
			int pY = entrada.nextInt();	
			
			partida.fazerJogada(pX, pY);
			
		}
		
		System.out.println("Fim de Jogo!");
		if(partida.getQtdJogadas() == 9)
			System.out.println("Empate! Ninguém ganhou!");
		else
			System.out.println("Jogador de nome " + partida.getJogadorAtual().getNome() + " ganhou!");
		
		entrada.close();*/
	}

}
