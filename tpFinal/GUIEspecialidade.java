
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

        jLabel1 = new javax.swing.JLabel();
        boxMedico = new javax.swing.JComboBox<>();
        botaoPesquisarMedicos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boxEspecialidade = new javax.swing.JComboBox<>();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(boxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoPesquisarMedicos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(boxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPesquisarMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(boxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
 
}
