package turillolucaraf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    final int DIM_RECORD = 84;

    private String controlloCognome(String cognome) {
        String cognomeControllato = cognome;
        if (cognomeControllato.length() < 20) {
            for (int i = cognomeControllato.length(); i < 20; i++) {
                cognomeControllato += "*";
            }
        } else if (cognomeControllato.length() > 20) {
            cognomeControllato = cognomeControllato.substring(0, 19);
        }
        return cognomeControllato;
    }

    private String controlloNome(String nome) {
        String nomeControllato = nome;
        if (nomeControllato.length() < 20) {
            for (int i = nomeControllato.length(); i < 20; i++) {
                nomeControllato += "*";
            }
        } else if (nomeControllato.length() > 20) {
            nomeControllato = nomeControllato.substring(0, 19);
        }
        return nomeControllato;
    }

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEta = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCognome = new javax.swing.JTextField();
        btnLeggi = new javax.swing.JButton();
        btnScrivi1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 60, 16);

        jLabel2.setText("Cognome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 60, 16);

        jLabel3.setText("Eta");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 130, 60, 16);
        getContentPane().add(txtEta);
        txtEta.setBounds(110, 120, 70, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 40, 70, 30);
        getContentPane().add(txtCognome);
        txtCognome.setBounds(110, 80, 70, 30);

        btnLeggi.setText("Leggi");
        btnLeggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeggiActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeggi);
        btnLeggi.setBounds(250, 130, 73, 23);

        btnScrivi1.setText("Scrivi");
        btnScrivi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScrivi1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnScrivi1);
        btnScrivi1.setBounds(250, 50, 73, 23);

        atxLog.setColumns(20);
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(436, 30, 330, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnScrivi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrivi1ActionPerformed
        try {
            RandomAccessFile rafw = new RandomAccessFile("prova.dat", "rw");
            String cognome = controlloCognome(txtCognome.getText());
            String nome = controlloNome(txtNome.getText());
            int eta = Integer.parseInt(txtEta.getText());
            rafw.seek(0);
            rafw.writeUTF(nome);
            rafw.writeUTF(cognome);
            rafw.writeInt(eta);
            rafw.close();
        } catch (FileNotFoundException fnfe) {
            atxLog.append("Errore apertura file");
        } catch (IOException | NumberFormatException e) {
            atxLog.append("Errore nel posizionamento all'interno del file");
        }
    }//GEN-LAST:event_btnScrivi1ActionPerformed

    private void btnLeggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeggiActionPerformed
        try {
            RandomAccessFile rafr = new RandomAccessFile("prova.dat", "r");
            rafr.seek(0);
            String nome = rafr.readUTF();
            String cognome = rafr.readUTF();
            int eta = rafr.readInt();
            atxLog.append(nome + "\n" + cognome + "\n" + eta);
        } catch (IOException ioe) {
            atxLog.append("errors");
        }
    }//GEN-LAST:event_btnLeggiActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnLeggi;
    private javax.swing.JButton btnScrivi1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtEta;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
