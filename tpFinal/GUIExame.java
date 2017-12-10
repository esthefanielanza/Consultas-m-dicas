import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIExame extends JFrame {

	private JPanel contentPane;

	public GUIExame(String nomeCliente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAgendamentoExame = new JLabel("Agendamento Exame");
		lblAgendamentoExame.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAgendamentoExame.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgendamentoExame.setBounds(10, 11, 414, 23);
		contentPane.add(lblAgendamentoExame);
		
		JLabel lblNomeDoExame = new JLabel("Nome do Exame: ");
		lblNomeDoExame.setBounds(20, 45, 138, 14);
		contentPane.add(lblNomeDoExame);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(162, 45, 242, 20);
		comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Sangue", "Urina", "Fezes", "Mamografia", "Endoscopia"}));
		contentPane.add(comboBox);
		
		JButton btnConfirmarAgendamento = new JButton("Confirmar Agendamento");
		btnConfirmarAgendamento.setBounds(215, 86, 219, 34);
		btnConfirmarAgendamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!comboBox.getSelectedItem().toString().equals("")) {
					GUIHorarios dialog = new GUIHorarios(null, "Exame", nomeCliente, comboBox.getSelectedItem().toString(), null, comboBox.getSelectedItem().toString());
			    	setVisible(false);
					dispose();
			    	dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			    		public void windowClosing(java.awt.event.WindowEvent e) {
			    			System.exit(0);
			    		}
			    	});
	                dialog.setVisible(true);
				} else {
            		JOptionPane.showMessageDialog(null, "Verifique se todas as caixas foram preenchidas");
				}
				
			}
		});
		contentPane.add(btnConfirmarAgendamento);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnCancelar.setBounds(0, 86, 219, 34);
		contentPane.add(btnCancelar);
	}
}
