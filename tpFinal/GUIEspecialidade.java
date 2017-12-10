
import java.util.LinkedList;

import javax.swing.JOptionPane;


public class GUIEspecialidade extends javax.swing.JDialog {
    
    ListaEspecialidades listaEspecialidades;
    ListaMedicos listaMedicos;
    
    public GUIEspecialidade(java.awt.Frame parent, boolean modal, ListaMedicos listaMedicos, ListaEspecialidades listaEspecialidades) {
        super(parent, modal);
        this.listaEspecialidades = listaEspecialidades;
        this.listaMedicos = listaMedicos;
        initComponents();
        preencheComboboxEspecialidade(listaEspecialidades);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boxMedico = new javax.swing.JComboBox<>();
        botaoPesquisarMedicos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boxEspecialidade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoCancelar = new javax.swing.JButton();
        botaoPesquisarHorarios = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SELEÇÃO DE HORÁRIO");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Selecione a especialidade");

        boxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMedicoActionPerformed(evt);
            }
        });

        botaoPesquisarMedicos.setText("Pesquisar Medicos");
        botaoPesquisarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarMedicosActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione o medico");

        boxEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEspecialidadeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SELECAO DE ESPECIALIDADE E MEDICO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoPesquisarMedicos)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(boxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(botaoPesquisarMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26))
        );

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCancelar);

        botaoPesquisarHorarios.setText("Pesquisar Horarios");
        botaoPesquisarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
	            		if(boxMedico.getSelectedItem().toString() == "" || boxEspecialidade.getSelectedItem().toString() == "") {
	            			throw new Exception();
	            		} else  {
	            			botaoPesquisarHorariosActionPerformed(evt);
	            		}
            		} catch(Exception e) {
            			JOptionPane.showMessageDialog(null, "Verifique se todas as caixas foram preenchidas.");
            		}          	             
            }
        });
        jPanel1.add(botaoPesquisarHorarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMedicoActionPerformed

    }//GEN-LAST:event_boxMedicoActionPerformed

    private void botaoPesquisarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarMedicosActionPerformed

        preencheComboboxMedico(boxEspecialidade.getSelectedItem().toString());
    }//GEN-LAST:event_botaoPesquisarMedicosActionPerformed

    private void boxEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEspecialidadeActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
	setVisible(false);
	dispose(); 
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoPesquisarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarHorariosActionPerformed
    	GUIHorarios2 dialog = new GUIHorarios2(listaMedicos.encontraMedico(boxMedico.getSelectedItem().toString()));
    	setVisible(false);
		dispose();
    	dialog.addWindowListener(new java.awt.event.WindowAdapter() {
    		public void windowClosing(java.awt.event.WindowEvent e) {
    			System.exit(0);
    		}
    	});
    	dialog.setVisible(true);
    }//GEN-LAST:event_botaoPesquisarHorariosActionPerformed

    public void preencheComboboxMedico(String especialidade){
        boxMedico.removeAllItems();    
        for(int i = 0; i < listaMedicos.getSize(); i++) {
            if(listaMedicos.getMedicoPorIndice(i).getEspecialidade() == especialidade){
                boxMedico.addItem(listaMedicos.getMedicoPorIndice(i).getNome());
            }   
        }
    }
      
    public void preencheComboboxEspecialidade(ListaEspecialidades listaEspecialidades){
        boxEspecialidade.removeAllItems();
        for (int i = 0 ; i< listaEspecialidades.getSize(); i++){
            boxEspecialidade.addItem(listaEspecialidades.getEspecialidadePorIndice(i).getNome());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoPesquisarHorarios;
    private javax.swing.JButton botaoPesquisarMedicos;
    private javax.swing.JComboBox<String> boxEspecialidade;
    private javax.swing.JComboBox<String> boxMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
 
}
