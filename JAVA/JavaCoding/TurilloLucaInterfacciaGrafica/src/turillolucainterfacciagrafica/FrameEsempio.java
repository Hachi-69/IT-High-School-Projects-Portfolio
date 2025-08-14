package turillolucainterfacciagrafica;

import javax.swing.JOptionPane;

/**
 *
 * @author Turillo.Luca
 */
public class FrameEsempio extends javax.swing.JFrame {
    
    private Calciatore[] calciatore;
    private Integer cont = 0;
    private Integer dimensione;

    /**
     * Creates new form FrameEsempio
     */
    public FrameEsempio() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDimensione = new javax.swing.JLabel();
        txtDimensione = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCognome = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        lblNMaglia = new javax.swing.JLabel();
        txtEta = new javax.swing.JTextField();
        lblEta = new javax.swing.JLabel();
        cmbNMaglia = new javax.swing.JComboBox<>();
        btnCreaArray = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbRuolo = new javax.swing.JComboBox<>();
        btnCaricaCalciatore = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbElencoCalciatori = new javax.swing.JComboBox<>();
        btnGioca = new javax.swing.JButton();
        btnSegna = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxStampa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        lblDimensione.setText("Inserisci dimensione:");
        getContentPane().add(lblDimensione);
        lblDimensione.setBounds(20, 40, 130, 16);
        getContentPane().add(txtDimensione);
        txtDimensione.setBounds(160, 40, 120, 22);

        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 90, 110, 16);
        getContentPane().add(txtNome);
        txtNome.setBounds(160, 90, 120, 22);

        lblCognome.setText("Cognome:");
        getContentPane().add(lblCognome);
        lblCognome.setBounds(30, 140, 110, 16);
        getContentPane().add(txtCognome);
        txtCognome.setBounds(160, 140, 120, 22);

        lblNMaglia.setText("Numero maglia:");
        getContentPane().add(lblNMaglia);
        lblNMaglia.setBounds(30, 260, 110, 16);
        getContentPane().add(txtEta);
        txtEta.setBounds(160, 190, 120, 22);

        lblEta.setText("Età:");
        getContentPane().add(lblEta);
        lblEta.setBounds(30, 190, 110, 16);

        cmbNMaglia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        getContentPane().add(cmbNMaglia);
        cmbNMaglia.setBounds(160, 260, 120, 22);
        for(Integer i=1; i<100;i++){
            cmbNMaglia.addItem(i.toString());
        }

        btnCreaArray.setText("Crea Array");
        btnCreaArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaArrayActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreaArray);
        btnCreaArray.setBounds(320, 40, 100, 23);

        jLabel1.setText("Ruolo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 310, 60, 16);

        cmbRuolo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portiere", "Centrocampista", "Difensore", "Attaccante", " " }));
        getContentPane().add(cmbRuolo);
        cmbRuolo.setBounds(160, 310, 120, 22);

        btnCaricaCalciatore.setText("Carica calciatore");
        btnCaricaCalciatore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaricaCalciatoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnCaricaCalciatore);
        btnCaricaCalciatore.setBounds(160, 400, 120, 23);

        jLabel2.setText("Elenco calciatori");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 460, 110, 16);

        getContentPane().add(cmbElencoCalciatori);
        cmbElencoCalciatori.setBounds(160, 460, 260, 22);

        btnGioca.setText("Gioca");
        btnGioca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiocaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGioca);
        btnGioca.setBounds(30, 560, 100, 30);

        btnSegna.setText("Segna");
        btnSegna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegnaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSegna);
        btnSegna.setBounds(180, 560, 100, 30);

        atxStampa.setColumns(20);
        atxStampa.setRows(5);
        jScrollPane1.setViewportView(atxStampa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 110, 370, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaricaCalciatoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaricaCalciatoreActionPerformed
        String nome = txtNome.getText();
        String cognome = txtCognome.getText();
        Integer eta = Integer.parseInt(txtEta.getText());
        Integer numeroMaglia = Integer.parseInt(cmbNMaglia.getSelectedItem().toString());
        String ruolo = cmbRuolo.getSelectedItem().toString();
        cmbElencoCalciatori.addItem(nome + " " + cognome + " " + eta + " " + numeroMaglia + " " + cmbRuolo.getSelectedItem().toString());
        cmbNMaglia.removeItemAt(cmbNMaglia.getSelectedIndex());
        txtNome.setText("");
        txtCognome.setText("");
        txtEta.setText("");
        cmbNMaglia.setSelectedIndex(0);
        cont++;
        if (cont == dimensione) {
            txtDimensione.setText("Squadra al completo");
        }
    }//GEN-LAST:event_btnCaricaCalciatoreActionPerformed

    private void btnCreaArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaArrayActionPerformed
        dimensione = Integer.parseInt(txtDimensione.getText());
        calciatore = new Calciatore[dimensione];
    }//GEN-LAST:event_btnCreaArrayActionPerformed

    private void btnGiocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiocaActionPerformed
        calciatore[cmbElencoCalciatori.getSelectedIndex()].gioca();
        atxStampa.setText(calciatore[cmbElencoCalciatori.getSelectedIndex()].toString());
    }//GEN-LAST:event_btnGiocaActionPerformed

    private void btnSegnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegnaActionPerformed
        Integer goal = Integer.parseInt(JOptionPane.showInputDialog(this, "Inserisci numero gol"));
        calciatore[cmbElencoCalciatori.getSelectedIndex()].cambiaGoal(goal);
        atxStampa.setText(calciatore[cmbElencoCalciatori.getSelectedIndex()].toString());
    }//GEN-LAST:event_btnSegnaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxStampa;
    private javax.swing.JButton btnCaricaCalciatore;
    private javax.swing.JButton btnCreaArray;
    private javax.swing.JButton btnGioca;
    private javax.swing.JButton btnSegna;
    private javax.swing.JComboBox<String> cmbElencoCalciatori;
    private javax.swing.JComboBox<String> cmbNMaglia;
    private javax.swing.JComboBox<String> cmbRuolo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCognome;
    private javax.swing.JLabel lblDimensione;
    private javax.swing.JLabel lblEta;
    private javax.swing.JLabel lblNMaglia;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtDimensione;
    private javax.swing.JTextField txtEta;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
