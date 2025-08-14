package turillolucasquadraig;

/**
 *
 * @author Turillo.Luca
 */
public class FrameArrayCalciatori extends javax.swing.JFrame {

    private Calciatore[] v;

    /**
     * Creates new form FrameArrayCalciatori
     */
    public FrameArrayCalciatori() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtDimensione = new javax.swing.JTextField();
        btnDimensione = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtCognome = new javax.swing.JTextField();
        lblDimensione1 = new javax.swing.JLabel();
        lblCognome = new javax.swing.JLabel();
        lblNMaglia = new javax.swing.JLabel();
        cbxNMaglia = new javax.swing.JComboBox<>();
        lblRuolo = new javax.swing.JLabel();
        cbxRuolo = new javax.swing.JComboBox<>();
        lblEta = new javax.swing.JLabel();
        txtEta = new javax.swing.JTextField();
        btnCarica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblNome.setText("Nome:");

        txtDimensione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDimensioneActionPerformed(evt);
            }
        });

        btnDimensione.setText("Crea array");
        btnDimensione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDimensioneActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCognomeActionPerformed(evt);
            }
        });

        lblDimensione1.setText("Dimensione:");

        lblCognome.setText("Cognome:");

        lblNMaglia.setText("Numero maglia:");

        lblRuolo.setText("Ruolo:");

        cbxRuolo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portiere", "Difensore", "Centrocampista", "Attaccante" }));
        cbxRuolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRuoloActionPerformed(evt);
            }
        });

        lblEta.setText("Eta:");

        txtEta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEtaActionPerformed(evt);
            }
        });

        btnCarica.setText("Carica calciatore");
        btnCarica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaricaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRuolo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(cbxRuolo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNMaglia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDimensione1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEta, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(txtDimensione)
                                    .addComponent(txtNome)
                                    .addComponent(txtCognome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxNMaglia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDimensione)
                    .addComponent(btnCarica))
                .addContainerGap(411, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDimensione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDimensione1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDimensione, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNMaglia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNMaglia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuolo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRuolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarica))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        for(Integer i=1;i<100;i++){
            cbxNMaglia.addItem(i.toString());
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDimensioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDimensioneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDimensioneActionPerformed

    private void btnDimensioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDimensioneActionPerformed
        Integer dim = Integer.parseInt(txtDimensione.getText());
        v = new Calciatore[dim];
    }//GEN-LAST:event_btnDimensioneActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCognomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCognomeActionPerformed

    private void cbxRuoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRuoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRuoloActionPerformed

    private void txtEtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEtaActionPerformed

    private void btnCaricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaricaActionPerformed
        String nome = txtNome.getText();
        String cognome = txtCognome.getText();
        Integer eta = Integer.parseInt(txtEta.getText());
    }//GEN-LAST:event_btnCaricaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarica;
    private javax.swing.JButton btnDimensione;
    private javax.swing.JComboBox<String> cbxNMaglia;
    private javax.swing.JComboBox<String> cbxRuolo;
    private javax.swing.JLabel lblCognome;
    private javax.swing.JLabel lblDimensione1;
    private javax.swing.JLabel lblEta;
    private javax.swing.JLabel lblNMaglia;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRuolo;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtDimensione;
    private javax.swing.JTextField txtEta;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
