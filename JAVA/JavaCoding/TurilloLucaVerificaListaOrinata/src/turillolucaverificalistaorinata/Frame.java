package turillolucaverificalistaorinata;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    private ListaOrdinata l;
    private ProprietarioImmobile p;

    public Frame() {
        initComponents();
        l = new ListaOrdinata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCognome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        txtNome = new javax.swing.JTextField();
        txtAnno = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        btnInserisciProprietario = new javax.swing.JButton();
        btnCancellaProprietario = new javax.swing.JButton();
        btnVisualizzaProprietarioPerTipo = new javax.swing.JButton();
        cmbVisualizzaTipo = new javax.swing.JComboBox<>();
        btnVisualizzaProprietarioPerNomeCognome = new javax.swing.JButton();
        txtCognome1 = new javax.swing.JTextField();
        txtNome1 = new javax.swing.JTextField();
        btnVisualizzaProprietarioDoppione = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        txtCognome.setText("Cognome");
        getContentPane().add(txtCognome);
        txtCognome.setBounds(70, 70, 90, 20);

        atxLog.setColumns(20);
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 20, 430, 520);

        txtNome.setText("Nome");
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 100, 90, 20);

        txtAnno.setText("Anno Immobile");
        getContentPane().add(txtAnno);
        txtAnno.setBounds(70, 130, 90, 20);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "terreno", "abitazione", "capannone" }));
        getContentPane().add(cmbTipo);
        cmbTipo.setBounds(70, 160, 90, 20);

        btnInserisciProprietario.setText("inserisciProprietario");
        btnInserisciProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserisciProprietarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserisciProprietario);
        btnInserisciProprietario.setBounds(0, 200, 250, 50);

        btnCancellaProprietario.setText("cancellaProprietario");
        btnCancellaProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancellaProprietarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancellaProprietario);
        btnCancellaProprietario.setBounds(0, 250, 250, 50);

        btnVisualizzaProprietarioPerTipo.setText("visualizzaProprietarioPerTipo");
        btnVisualizzaProprietarioPerTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizzaProprietarioPerTipoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisualizzaProprietarioPerTipo);
        btnVisualizzaProprietarioPerTipo.setBounds(0, 300, 250, 50);

        cmbVisualizzaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "terreno", "abitazione", "capannone" }));
        getContentPane().add(cmbVisualizzaTipo);
        cmbVisualizzaTipo.setBounds(260, 310, 90, 20);

        btnVisualizzaProprietarioPerNomeCognome.setText("visualizzaProprietarioPerNomeCognome");
        btnVisualizzaProprietarioPerNomeCognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizzaProprietarioPerNomeCognomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisualizzaProprietarioPerNomeCognome);
        btnVisualizzaProprietarioPerNomeCognome.setBounds(0, 350, 250, 50);

        txtCognome1.setText("Cognome");
        getContentPane().add(txtCognome1);
        txtCognome1.setBounds(260, 350, 90, 20);

        txtNome1.setText("Nome");
        getContentPane().add(txtNome1);
        txtNome1.setBounds(260, 380, 90, 20);

        btnVisualizzaProprietarioDoppione.setText("visualizzaProprietarioDoppione");
        btnVisualizzaProprietarioDoppione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizzaProprietarioDoppioneActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisualizzaProprietarioDoppione);
        btnVisualizzaProprietarioDoppione.setBounds(0, 400, 250, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserisciProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserisciProprietarioActionPerformed
        p = new ProprietarioImmobile(txtCognome.getText(), txtNome.getText(), String.valueOf(cmbTipo.getSelectedItem()), Integer.valueOf(txtAnno.getText()));
        Nodo n = new Nodo(p);
        l.pushOrdinato(n);
        atxLog.setText(l.toString());
    }//GEN-LAST:event_btnInserisciProprietarioActionPerformed

    private void btnCancellaProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellaProprietarioActionPerformed
        p = new ProprietarioImmobile(txtCognome.getText(), txtNome.getText(), String.valueOf(cmbTipo.getSelectedItem()), Integer.valueOf(txtAnno.getText()));
        Nodo n = l.pop(p);
        if (n != null) {
            atxLog.setText(l.toString());
        } else {
            atxLog.append("Nodo non presente" + "\n");
        }
    }//GEN-LAST:event_btnCancellaProprietarioActionPerformed

    private void btnVisualizzaProprietarioPerTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizzaProprietarioPerTipoActionPerformed
        Nodo tmp = l.top();
        String s = "";
        while (tmp != null) {
            if (tmp.getInf().getTipoImmobile().compareTo(String.valueOf(cmbVisualizzaTipo.getSelectedItem())) == 0) {
                s += tmp.getInf().toString() + "\n";
            }
            tmp = tmp.getNext();
        }
        atxLog.setText(s);
    }//GEN-LAST:event_btnVisualizzaProprietarioPerTipoActionPerformed

    private void btnVisualizzaProprietarioPerNomeCognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizzaProprietarioPerNomeCognomeActionPerformed
        Nodo tmp = l.top();
        String s = "";
        while (tmp != null) {
            if (tmp.getInf().getCognome().compareTo(txtCognome1.getText()) == 0 && tmp.getInf().getNome().compareTo(txtNome1.getText()) == 0) {
                s += tmp.getInf().toString() + "\n";
            }
            tmp = tmp.getNext();
        }
        atxLog.setText(s);
    }//GEN-LAST:event_btnVisualizzaProprietarioPerNomeCognomeActionPerformed

    private void btnVisualizzaProprietarioDoppioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizzaProprietarioDoppioneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisualizzaProprietarioDoppioneActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnCancellaProprietario;
    private javax.swing.JButton btnInserisciProprietario;
    private javax.swing.JButton btnVisualizzaProprietarioDoppione;
    private javax.swing.JButton btnVisualizzaProprietarioPerNomeCognome;
    private javax.swing.JButton btnVisualizzaProprietarioPerTipo;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbVisualizzaTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAnno;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtCognome1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    // End of variables declaration//GEN-END:variables
}
