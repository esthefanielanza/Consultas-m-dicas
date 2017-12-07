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
	
	public GUIAtendimento(ListaEspecialidades listaEspecialidades) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 0, 0, 0));
		
		JButton buttonConsulta = new JButton("Agendar consulta");
                buttonConsulta.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        GUIEspecialidade dialog = new GUIEspecialidade(new javax.swing.JFrame(), true, listaEspecialidades);
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
		
		JButton buttonExame = new JButton("Agendar Exame");
		contentPane.add(buttonExame);
		
		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();
			}
		});
		contentPane.add(cancelarButton);
	}

    GUIAtendimento(ListaEspecialidades listaEspecialidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
