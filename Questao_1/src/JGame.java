
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JGame extends JFrame {

	private final JPanel contentPane;
	private final Partida partida;


	public JGame(Partida partida) {
		this.partida = partida;
		setBounds(100, 100, 480, 437);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		partida.getLbljogadorAtual().setText("Jogador: " + partida.getJogadorAtual().getNome());
		partida.getLbljogadorAtual().setBounds(163, 24, 139, 13);
		contentPane.add(partida.getLbljogadorAtual());
		
		int x = 90;
		int y = 60;

		Peca comboBoxs[][] = new Peca[3][3];
	
		for(int i = 0; i < comboBoxs.length; i++) {
			for(int j = 0; j < comboBoxs.length; j++) {
				comboBoxs[i][j] = new Peca();
				comboBoxs[i][j].setPosicaoY(i);
				comboBoxs[i][j].setPosicaoX(j);
				comboBoxs[i][j].setModel(new DefaultComboBoxModel(new String[] {" ", "X", "O"}));
				comboBoxs[i][j].setFont(new Font("Tahoma", Font.BOLD, 15));
				comboBoxs[i][j].setBounds(x, y, 60, 60);
				x += 80;
				
				contentPane.add(comboBoxs[i][j]);
			}
			x = 90;
			y += 80;
		}

            for (Peca[] comboBox : comboBoxs) {
                for (int j = 0; j < comboBoxs.length; j++) {
                    Peca ponteiro = comboBox[j];
                    String ultimaJogada = ponteiro.getPeca();
                    
                    ponteiro.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if(ponteiro.getPeca() == null) {
                                
                                String pecaEscolhida = ponteiro.getSelectedItem().toString();
                               ponteiro.setEnabled(false);
                                
                                if(pecaEscolhida.equals(partida.pecaDoJogadorAtual())) {
                                    
                                    //Verifica se há vencedor/velha
                                    boolean jogada = partida.fazerJogada(ponteiro.getPosicaoX(), ponteiro.getPosicaoY());
                                    
                                    System.out.println("Jogada Feita: " + jogada + "\n Estado da partida: " + partida.isEstado());
                                    
                                    //isEstado sempre é verdadeiro até que alguém ganhe
                                    if(!(partida.isEstado()) && jogada) {
                                        JOptionPane.showMessageDialog(null, partida.getJogadorAtual().getNome() + " ganhou!");
                                        System.exit(0);
                                    } else if(partida.getQtdJogadas() == 9) {
                                        JOptionPane.showMessageDialog(null, "Deu velha!");
                                        System.exit(0);
                                    }
                                } else if (partida.getQtdJogadas() == 0) {
                                    JOptionPane.showMessageDialog(null, "Comece com X!");
                                    ponteiro.setEnabled(true);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Posicao já foi escolhida!");
                                    
                                    if(ponteiro.getSelectedItem().equals("X")) {
                                        ponteiro.setSelectedItem(ponteiro.getItemAt(1));
                                        ponteiro.setEnabled(true);
                                    } else {
                                        ponteiro.setSelectedItem(ponteiro.getItemAt(2));
                                        ponteiro.setEnabled(true);
                                    }
                                }
                                
                            }
                            
                            partida.getLbljogadorAtual().setText("Jogador: " + partida.getJogadorAtual().getNome());
                        }
                    });
                }
            }
	}
}
