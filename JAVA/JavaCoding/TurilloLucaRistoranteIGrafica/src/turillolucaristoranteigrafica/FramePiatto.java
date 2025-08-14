package turillolucaristoranteigrafica;

import java.util.Objects;

/**
 *
 * @author Turillo.Luca
 */
public class FramePiatto extends javax.swing.JFrame {

    private Piatto[] p;
    private Integer dimensione = 0;
    private Integer cont = 0;

    /**
     * Creates new form FramePiatto
     */
    public FramePiatto() {
        initComponents();
        pnlPiatto.setVisible(false);
        btnSegna.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDimensione = new javax.swing.JLabel();
        txtDimensione = new javax.swing.JTextField();
        btnCreaArray = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxStampa = new javax.swing.JTextArea();
        pnlPiatto = new javax.swing.JPanel();
        btnSegna = new javax.swing.JButton();
        cmbMenu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        pnlSI = new javax.swing.JPanel();
        btnCaricaPiatto = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        txtPrezzo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblPrezzo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(551, 790));
        setPreferredSize(new java.awt.Dimension(551, 790));
        getContentPane().setLayout(null);

        lblDimensione.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDimensione.setText("Inserisci dimensione:");
        getContentPane().add(lblDimensione);
        lblDimensione.setBounds(65, 38, 130, 18);

        txtDimensione.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        getContentPane().add(txtDimensione);
        txtDimensione.setBounds(200, 40, 111, 20);

        btnCreaArray.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCreaArray.setText("Crea Array");
        btnCreaArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaArrayActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreaArray);
        btnCreaArray.setBounds(352, 38, 100, 25);

        atxStampa.setColumns(20);
        atxStampa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        atxStampa.setRows(5);
        jScrollPane1.setViewportView(atxStampa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 430, 420, 260);

        pnlPiatto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSegna.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSegna.setText("Ordina");
        btnSegna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegnaActionPerformed(evt);
            }
        });

        cmbMenu.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Menu:");

        pnlSI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCaricaPiatto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCaricaPiatto.setText("Carica Piatto");
        btnCaricaPiatto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaricaPiattoActionPerformed(evt);
            }
        });

        cmbTipo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antipasto", "Primo", "Secondo", "Dolce" }));

        txtPrezzo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblPrezzo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPrezzo.setText("Prezzo:");

        lblTipo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");

        javax.swing.GroupLayout pnlSILayout = new javax.swing.GroupLayout(pnlSI);
        pnlSI.setLayout(pnlSILayout);
        pnlSILayout.setHorizontalGroup(
            pnlSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(pnlSILayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnCaricaPiatto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSILayout.setVerticalGroup(
            pnlSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSILayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSILayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(24, 24, 24)
                        .addComponent(lblPrezzo)
                        .addGap(24, 24, 24)
                        .addComponent(lblTipo))
                    .addGroup(pnlSILayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnCaricaPiatto)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPiattoLayout = new javax.swing.GroupLayout(pnlPiatto);
        pnlPiatto.setLayout(pnlPiattoLayout);
        pnlPiattoLayout.setHorizontalGroup(
            pnlPiattoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPiattoLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(pnlSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPiattoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPiattoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSegna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        pnlPiattoLayout.setVerticalGroup(
            pnlPiattoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPiattoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlPiattoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSegna, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlPiatto);
        pnlPiatto.setBounds(55, 97, 420, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreaArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaArrayActionPerformed
        dimensione = Integer.parseInt(txtDimensione.getText());
        p = new Piatto[dimensione];
        txtDimensione.setEnabled(false);
        btnCreaArray.setEnabled(false);
        lblDimensione.setEnabled(false);
        pnlPiatto.setVisible(true);
    }//GEN-LAST:event_btnCreaArrayActionPerformed

    private void btnCaricaPiattoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaricaPiattoActionPerformed

        String nome = txtNome.getText();
        Integer prezzo = Integer.parseInt(txtPrezzo.getText());
        String tipo = cmbTipo.getSelectedItem().toString();
        cmbMenu.addItem(nome + " " + prezzo + " " + cmbTipo.getSelectedItem().toString());
        p[cont] = new Piatto(nome, tipo, prezzo);
        txtNome.setText("");
        txtPrezzo.setText("");
        cmbTipo.setSelectedIndex(0);
        cont++;
        if (Objects.equals(cont, dimensione)) {
            txtDimensione.setText("Menu' al completo");
            pnlSI.setVisible(false);
            btnSegna.setEnabled(true);
        }
    }//GEN-LAST:event_btnCaricaPiattoActionPerformed

    private void btnSegnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegnaActionPerformed
        Integer pos = cmbMenu.getSelectedIndex();
        p[pos].ordina();
        atxStampa.append(p[pos].toString() + "\n");
    }//GEN-LAST:event_btnSegnaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxStampa;
    private javax.swing.JButton btnCaricaPiatto;
    private javax.swing.JButton btnCreaArray;
    private javax.swing.JButton btnSegna;
    private javax.swing.JComboBox<String> cmbMenu;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDimensione;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrezzo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlPiatto;
    private javax.swing.JPanel pnlSI;
    private javax.swing.JTextField txtDimensione;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrezzo;
    // End of variables declaration//GEN-END:variables
}
