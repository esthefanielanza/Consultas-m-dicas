import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class GUILogin extends JFrame {

	private JPanel contentPane;
	private JTextField cpfTextField;

	/**
	 * Create the frame.
	 */
	public GUILogin(ListaClientes listaClientes, ListaMedicos listaMedicos) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAgendamentoDeConsultas = new JLabel("Agendamento de consultas");
		lblAgendamentoDeConsultas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAgendamentoDeConsultas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgendamentoDeConsultas.setBounds(0, 11, 434, 45);
		contentPane.add(lblAgendamentoDeConsultas);
		
		JLabel lblParaAgendarUma = new JLabel("Use o seu CPF para realizar o agendamento de uma consulta ou exame");
		lblParaAgendarUma.setHorizontalAlignment(SwingConstants.CENTER);
		lblParaAgendarUma.setBounds(10, 57, 414, 14);
		contentPane.add(lblParaAgendarUma);
		
		cpfTextField = new JTextField();
		cpfTextField.setBounds(85, 123, 276, 29);
		contentPane.add(cpfTextField);
		cpfTextField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(85, 98, 518, 14);
		contentPane.add(lblCpf);
		
		JButton btnRealizarAgendamento = new JButton("Realizar agendamento");
		btnRealizarAgendamento.setBounds(117, 177, 209, 23);
		btnRealizarAgendamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String cpf = cpfTextField.getText();
					if(listaClientes.encontraCliente(cpf)) {
						GUIAtendimento frame = new GUIAtendimento();
						frame.setVisible(true);
					} else {
						GUICadastro frame = new GUICadastro(listaClientes);
						frame.setVisible(true);
					}
				} catch (Exception error) {
					JOptionPane.showMessageDialog(null, "Verifique se os dados foram preenchidos corretamente!");
					System.out.println(error);
				}
			}
		});
		contentPane.add(btnRealizarAgendamento);
	}
}
