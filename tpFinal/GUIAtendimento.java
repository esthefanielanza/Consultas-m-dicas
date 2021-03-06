import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class GUIAtendimento extends JFrame {

	private JPanel contentPane;
	
	public GUIAtendimento(ListaMedicos listaMedicos, ListaEspecialidades listaEspecialidades, String nomeCliente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 0, 0, 0));
		
		JButton buttonConsulta = new JButton("Agendar consulta");
                buttonConsulta.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       
                        GUIEspecialidade dialog = new GUIEspecialidade(new javax.swing.JFrame(), true, listaMedicos, listaEspecialidades, nomeCliente);
                        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                });
                dialog.setVisible(true);
                    }
		});
		contentPane.add(buttonConsulta);
		
		JButton buttonCancelarConsulta = new JButton("Cancelar Consulta");
                buttonCancelarConsulta.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    GUICancelarConsulta dialog = new GUICancelarConsulta(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                    }
                });
		contentPane.add(buttonCancelarConsulta);
		
		JButton buttonExame = new JButton("Agendar Exame");
		buttonExame.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		GUIExame dialog = new GUIExame(nomeCliente);
        		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
        			@Override
        			public void windowClosing(java.awt.event.WindowEvent e) {
        					System.exit(0);
        			}
                });
                dialog.setVisible(true);
        	}
        });
		contentPane.add(buttonExame);

		JButton buttonCancelarExame = new JButton("Cancelar Exame");
        buttonCancelarExame.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		GUICancelarExame dialog = new GUICancelarExame(new javax.swing.JFrame(), true);
        		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
        			@Override
        			public void windowClosing(java.awt.event.WindowEvent e) {
        					System.exit(0);
        			}
                });
                dialog.setVisible(true);
        	}
        });
		contentPane.add(buttonCancelarExame);
		
		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();
			}
		});
		contentPane.add(cancelarButton);
	}

    GUIAtendimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
