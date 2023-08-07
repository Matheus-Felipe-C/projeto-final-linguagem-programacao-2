
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPrincipal extends JFrame {

	private final JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public JPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 474);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jogo da Velha");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(205, 73, 195, 121);
		contentPane.add(lblNewLabel);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
				
				String nomes[] = new String[2];
				
				for(int i = 0; i < nomes.length; i++) {
					nomes[i] = JOptionPane.showInputDialog("Informe o nome do Jogador " + (i+1));
				}
				
				Peca x = new Peca("X");
				Peca o = new Peca("O");
				
				Jogador j1 = new Jogador(nomes[0], x);
				Jogador j2 = new Jogador(nomes[1], o);
				
				Partida partida = new Partida(j1, j2);
				
				JGame game = new JGame(partida);
				game.setVisible(true);
			}
		});
		
		btnJogar.setBounds(231, 177, 143, 46);
		contentPane.add(btnJogar);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Projeto da cadeira Progração II");
			}
		});
		btnSobre.setBounds(231, 233, 143, 46);
		contentPane.add(btnSobre);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(231, 289, 143, 46);
		contentPane.add(btnSair);
	}
}
