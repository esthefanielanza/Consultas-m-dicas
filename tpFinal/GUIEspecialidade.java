
import java.util.LinkedList;


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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boxMedico = new javax.swing.JComboBox<>();
        botaoPesquisarMedicos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boxEspecialidade = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Selecione a especialidade");

        boxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMedicoActionPerformed(evt);
            }
        });

        botaoPesquisarMedicos.setText("Pesquisar Médicos");
        botaoPesquisarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarMedicosActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione o médico");

        boxEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEspecialidadeActionPerformed(evt);
            }
        });

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
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(botaoPesquisarMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38))
        );

        jPanel1.setLayout(new java.awt.GridLayout());

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setText("Pesquisar Horários");
        jPanel1.add(jButton3);

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	setVisible(false);
	dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton botaoPesquisarMedicos;
    private javax.swing.JComboBox<String> boxEspecialidade;
    private javax.swing.JComboBox<String> boxMedico;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
 
}
