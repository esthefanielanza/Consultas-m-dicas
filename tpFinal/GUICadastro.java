import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUICadastro extends JFrame {

	private JPanel contentPane;
	private JTextField nomeTextField;
	private JTextField identidadeTextField;
	private JTextField cpfTextField;
	private JTextField enderecoTextField;
	private JTextField telefoneTextField;
	private JTextField nascimentoTextField;

	public GUICadastro(ListaClientes listaClientes) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroCliente = new JLabel("Cadastro Cliente");
		lblCadastroCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroCliente.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCadastroCliente.setBounds(0, 0, 434, 45);
		contentPane.add(lblCadastroCliente);
		
		nomeTextField = new JTextField();
		nomeTextField.setBounds(10, 66, 414, 20);
		contentPane.add(nomeTextField);
		nomeTextField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 49, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblIdentidade = new JLabel("Identidade");
		lblIdentidade.setBounds(10, 97, 89, 14);
		contentPane.add(lblIdentidade);
		
		identidadeTextField = new JTextField();
		identidadeTextField.setColumns(10);
		identidadeTextField.setBounds(10, 114, 414, 20);
		contentPane.add(identidadeTextField);
		
		cpfTextField = new JTextField();
		cpfTextField.setColumns(10);
		cpfTextField.setBounds(10, 162, 414, 20);
		contentPane.add(cpfTextField);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 145, 89, 14);
		contentPane.add(lblCpf);
		
		enderecoTextField = new JTextField();
		enderecoTextField.setColumns(10);
		enderecoTextField.setBounds(10, 210, 414, 20);
		contentPane.add(enderecoTextField);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 193, 89, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 241, 89, 14);
		contentPane.add(lblTelefone);
		
		telefoneTextField = new JTextField();
		telefoneTextField.setColumns(10);
		telefoneTextField.setBounds(10, 258, 414, 20);
		contentPane.add(telefoneTextField);
		
		nascimentoTextField = new JTextField();
		nascimentoTextField.setColumns(10);
		nascimentoTextField.setBounds(10, 306, 414, 20);
		contentPane.add(nascimentoTextField);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento ( dd-mm-aaaa)");
		lblDataDeNascimento.setBounds(10, 289, 198, 14);
		contentPane.add(lblDataDeNascimento);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(111, 347, 103, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setVisible(false);
					dispose();
				} catch (Exception error) {
					JOptionPane.showMessageDialog(null, "Verifique se os dados foram preenchidos corretamente!");
				}
			}
		});
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nome = nomeTextField.getText();
					String identidade = identidadeTextField.getText();
					String cpf = cpfTextField.getText();
					String endereco = enderecoTextField.getText();
					String telefone = telefoneTextField.getText();
					String nascimento = nascimentoTextField.getText();
					
					if(nome.isEmpty() || identidade.isEmpty() || cpf.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || nascimento.isEmpty()) {
						throw new IOException("required");
					} else if(listaClientes.encontraCliente(cpf)) {
						throw new Exception("unique");
					} else {
						Cliente tmpCliente = new Cliente(cpf, nome, identidade, endereco, telefone, nascimento);
						listaClientes.insereCliente(tmpCliente);
						setVisible(false);
						dispose();
					}
				} catch (IOException error) {
					JOptionPane.showMessageDialog(null, "Verifique se os dados foram preenchidos corretamente!");
				} catch (Exception error) {
					JOptionPane.showMessageDialog(null, "Esse CPF ja esta cadastrado!");
				}
			}
		});
		btnCadastrar.setBounds(224, 347, 103, 23);
		contentPane.add(btnCadastrar);
	}

}
