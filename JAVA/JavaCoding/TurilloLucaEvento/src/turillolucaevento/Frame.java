package turillolucaevento;

import mydata.Data;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        txtNome = new javax.swing.JTextField();
        txtLuogo = new javax.swing.JTextField();
        txtAnno = new javax.swing.JTextField();
        txtGenere = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGiorno = new javax.swing.JTextField();
        txtMese = new javax.swing.JTextField();
        txtNPartecipanti = new javax.swing.JTextField();
        txtAnno1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtGiorno1 = new javax.swing.JTextField();
        txtMese1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 657));
        setMinimumSize(new java.awt.Dimension(800, 657));
        setPreferredSize(new java.awt.Dimension(800, 657));
        getContentPane().setLayout(null);

        jButton1.setText("Crea Evento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 460, 330, 60);

        jButton2.setText("Crea Evento Personalizzato");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 530, 330, 60);

        atxLog.setColumns(20);
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(386, 20, 390, 570);
        getContentPane().add(txtNome);
        txtNome.setBounds(210, 90, 90, 20);
        getContentPane().add(txtLuogo);
        txtLuogo.setBounds(210, 120, 90, 20);
        getContentPane().add(txtAnno);
        txtAnno.setBounds(260, 150, 40, 20);
        getContentPane().add(txtGenere);
        txtGenere.setBounds(210, 180, 90, 20);

        jLabel1.setText("Genere:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 180, 50, 16);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 90, 40, 16);

        jLabel3.setText("Luogo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 120, 40, 16);

        jLabel4.setText("Data Pubblicazione:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 150, 120, 16);
        getContentPane().add(txtGiorno);
        txtGiorno.setBounds(210, 150, 20, 20);
        getContentPane().add(txtMese);
        txtMese.setBounds(235, 150, 20, 20);
        getContentPane().add(txtNPartecipanti);
        txtNPartecipanti.setBounds(210, 280, 90, 20);
        getContentPane().add(txtAnno1);
        txtAnno1.setBounds(260, 250, 40, 22);

        jLabel6.setText("Numero Partecipanti:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 280, 120, 16);

        jLabel7.setText("Data Svolgimento:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 250, 120, 16);
        getContentPane().add(txtGiorno1);
        txtGiorno1.setBounds(210, 250, 20, 22);
        getContentPane().add(txtMese1);
        txtMese1.setBounds(235, 250, 20, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Data dataPubblicazione = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
            Evento e = new Evento(txtNome.getText(), txtLuogo.getText(), dataPubblicazione, txtGenere.getText());
            atxLog.setText(e.toString());
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Data dataSvolgimento = new Data(Integer.valueOf(txtGiorno1.getText()), Integer.valueOf(txtMese1.getText()), Integer.valueOf(txtAnno1.getText()));
            Data dataPubblicazione = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
            EventoSvolto ev = new EventoSvolto(dataSvolgimento, Integer.valueOf(txtNPartecipanti.getText()), txtNome.getText(), txtLuogo.getText(), dataPubblicazione, txtGenere.getText());
            atxLog.setText(ev.toString());
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAnno;
    private javax.swing.JTextField txtAnno1;
    private javax.swing.JTextField txtGenere;
    private javax.swing.JTextField txtGiorno;
    private javax.swing.JTextField txtGiorno1;
    private javax.swing.JTextField txtLuogo;
    private javax.swing.JTextField txtMese;
    private javax.swing.JTextField txtMese1;
    private javax.swing.JTextField txtNPartecipanti;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
