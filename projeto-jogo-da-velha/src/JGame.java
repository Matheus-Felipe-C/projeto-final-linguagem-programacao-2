
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
                    ponteiro.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if(ponteiro.getPeca() == null) {
                                
                                String pecaEscolhida = ponteiro.getSelectedItem().toString();
                                
                                if(pecaEscolhida.equals(partida.pecaDoJogadorAtual())) {
                                    boolean jogada = partida.fazerJogada(ponteiro.getPosicaoX(), ponteiro.getPosicaoY());
                                    
                                    System.out.println("Jogada Feita: " + jogada + "\n Estado da partida: " + partida.isEstado());
                                    if(!(partida.isEstado()) && jogada) {
                                        JOptionPane.showMessageDialog(null, partida.getJogadorAtual().getNome() + " ganhou!");
                                        System.exit(0);
                                    } else if(partida.getQtdJogadas() == 9) {
                                        JOptionPane.showMessageDialog(null, "Deu velha!");
                                        System.exit(0);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Jogada Invalida!");
                                }
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Posicao já foi escolhida!");
                                if(ponteiro.getPeca().equals("X")) {
                                    ponteiro.setSelectedItem(ponteiro.getItemAt(1));
                                } else {
                                    ponteiro.setSelectedItem(ponteiro.getItemAt(2));
                                }
                            }
                            
                            partida.getLbljogadorAtual().setText("Jogador: " + partida.getJogadorAtual().getNome());
                        }
                    });
                }
            }
	}
}
