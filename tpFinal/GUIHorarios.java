

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
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUIHorarios extends JFrame {

	private JPanel contentPane;
	private Boolean aprovado;
	/**
	 * Create the frame.
	 */
	public GUIHorarios(Medico medico, String tipoAtendimento) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECAO DE HORARIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSelecioneODia = new JLabel("Selecione o dia:");
		lblSelecioneODia.setBounds(10, 39, 136, 14);
		contentPane.add(lblSelecioneODia);
		

		JLabel lblSelecioneOHoraroi = new JLabel("Selecione o horario:");
		lblSelecioneOHoraroi.setBounds(10, 70, 136, 14);
		contentPane.add(lblSelecioneOHoraroi);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(142, 67, 282, 20);
		contentPane.add(comboBox_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		
		if(tipoAtendimento.equals("Exame"))
			comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
		else
			comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o dia", "2", "3", "4", "5", "6", "9", "10", "11", "12", "13", "16", "17", "18", "19", "20", "23", "24", "25", "26", "27", "30" }));

		comboBox.setBounds(142, 36, 282, 20);
		contentPane.add(comboBox);
		comboBox.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ArrayList<Horario> listaHorarios = new ArrayList<Horario>();
            	comboBox_1.removeAllItems();
            	try {
            		listaHorarios = medico.getAgenda().getDataPorDia(Integer.parseInt(comboBox.getSelectedItem().toString())).getListaHorarios();
            	} catch(NumberFormatException e) {
        			JOptionPane.showMessageDialog(null, "Por favor selecione um dia válido");
            	} catch(NullPointerException e) {
            		if(tipoAtendimento.equals("Exame")) {
            			comboBox_1.addItem("8:00");
            			comboBox_1.addItem("8:30");
            			comboBox_1.addItem("9:00");
            			comboBox_1.addItem("9:30");
            			comboBox_1.addItem("10:00");
            			comboBox_1.addItem("10:30");
            			comboBox_1.addItem("11:00");
            			comboBox_1.addItem("11:30");
            			comboBox_1.addItem("12:00");
            			comboBox_1.addItem("12:30");
            			comboBox_1.addItem("13:00");
            			comboBox_1.addItem("13:30");
            			comboBox_1.addItem("14:00");
            			comboBox_1.addItem("14:30");
            			comboBox_1.addItem("15:00");
            			comboBox_1.addItem("15:30");
            			comboBox_1.addItem("16:00");
            			comboBox_1.addItem("16:30");
            			comboBox_1.addItem("17:00");
            		} else {
            			comboBox_1.addItem("Nenhum horario disponivel");
            		}
            	}
            	if(listaHorarios != null) {
            		for(int i = 0; i < listaHorarios.size(); i++) {
            			if(listaHorarios.get(i).isDisponivel())
            				comboBox_1.addItem(listaHorarios.get(i).getHora());
            	    }   
            	}
            }
		});
		
		JLabel lblMetodoDePagamento = new JLabel("Metodo de Pagamento:");
		lblMetodoDePagamento.setBounds(10, 101, 136, 14);
		contentPane.add(lblMetodoDePagamento);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Cortesia", "Dinheiro", "Cartão", "Cheque" , "Convenio"}));
		comboBox_2.setBounds(142, 98, 282, 20);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(0, 145, 212, 46);
		contentPane.add(btnNewButton);
		
		JButton btnConfirmarConsulta = new JButton("Confirmar Consulta");
		btnConfirmarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!comboBox.getSelectedItem().equals("Selecione o dia") && !comboBox_1.getSelectedItem().equals("") && !comboBox_2.getSelectedItem().equals("")) {
					TiposAutorizacao autorizacao = new TiposAutorizacao();
					
	            	if(comboBox_2.getSelectedItem().toString().equals("Cortesia")) {
	            		aprovado = autorizacao.autorizaCortesia();
	            	} else if(comboBox_2.getSelectedItem().equals("Cartão")) {
	            		aprovado = autorizacao.autorizaCartao();
	            	} else if(comboBox_2.getSelectedItem().equals("Dinheiro")) {
	            		aprovado = autorizacao.autorizaDinheiro();
	            	} else if(comboBox_2.getSelectedItem().equals("Convenio")) {
	            		aprovado = autorizacao.autorizaConvenio();
	            	} else {
	            		aprovado = autorizacao.autorizaConvenio();
	            	}
	            	
	            	if(aprovado) { 
	            		JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!");
						setVisible(false);
						dispose();
	            	} else {
	        			JOptionPane.showMessageDialog(null, "Agendamento não autorizado");
						setVisible(false);
						dispose();
	        		}
				} else {
					JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
				}
				
			}
		});
		
		
		btnConfirmarConsulta.setBounds(209, 145, 225, 46);
		contentPane.add(btnConfirmarConsulta);
	}
}
