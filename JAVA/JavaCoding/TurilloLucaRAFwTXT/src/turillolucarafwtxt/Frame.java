package turillolucarafwtxt;

import java.io.*;
import java.util.*;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    private final int DIM_REC = 64;
    private ArrayList<String> codici;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private PrintWriter pw;

    public Frame() {
        initComponents();
        codici = aggiornaLista();
        try {
            aggiornaCmb();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQuantita = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtPrezzo = new javax.swing.JTextField();
        txtQminima = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        btnScrivi = new javax.swing.JButton();
        btnAggiornaChiavi = new javax.swing.JButton();
        cmbChiavi = new javax.swing.JComboBox<>();
        btnLeggi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setText("NOME:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 90, 80, 14);

        jLabel2.setText("QUANTITA:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 80, 14);

        jLabel3.setText("COD:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 50, 80, 14);
        getContentPane().add(txtQuantita);
        txtQuantita.setBounds(130, 120, 110, 30);
        getContentPane().add(txtCod);
        txtCod.setBounds(130, 40, 110, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(130, 80, 110, 30);
        getContentPane().add(txtPrezzo);
        txtPrezzo.setBounds(130, 200, 110, 30);
        getContentPane().add(txtQminima);
        txtQminima.setBounds(130, 160, 110, 30);

        jLabel4.setText("Q MINIMA:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 170, 80, 14);

        jLabel5.setText("PREZZO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 210, 80, 14);

        atxLog.setColumns(20);
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(374, 10, 390, 550);

        btnScrivi.setText("Scrivi");
        btnScrivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScriviActionPerformed(evt);
            }
        });
        getContentPane().add(btnScrivi);
        btnScrivi.setBounds(20, 270, 80, 30);

        btnAggiornaChiavi.setText("Aggiorna chiavi");
        btnAggiornaChiavi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaChiaviActionPerformed(evt);
            }
        });
        getContentPane().add(btnAggiornaChiavi);
        btnAggiornaChiavi.setBounds(150, 270, 130, 30);

        getContentPane().add(cmbChiavi);
        cmbChiavi.setBounds(20, 310, 80, 30);

        btnLeggi.setText("Leggi");
        btnLeggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeggiActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeggi);
        btnLeggi.setBounds(150, 310, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void aggiornaCmb() {
        cmbChiavi.removeAllItems();
        String tmp;
        for (int i = 0; i < codici.size(); i++) {
            tmp = codici.get(i);
            tmp = tmp.substring(0, 5);
            cmbChiavi.addItem(tmp);
        }
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

    private void btnScriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScriviActionPerformed
        String cod = txtCod.getText();
        String nom = controlloNome(txtNome.getText());
        System.out.println(nom);
        int quan = Integer.parseInt(txtQuantita.getText());
        int quanMin = Integer.parseInt(txtQminima.getText());
        double prezzo = Double.parseDouble(txtPrezzo.getText());
        try {
            RandomAccessFile raf = new RandomAccessFile("magazzino.dat", "rw");
            int nRecord = (int) (raf.length() / DIM_REC);
            System.out.println(nRecord);
            raf.seek(nRecord * DIM_REC);
            raf.writeChars(cod);
            raf.writeChars(nom);
            raf.writeInt(quan);
            raf.writeInt(quanMin);
            raf.writeDouble(prezzo);
            raf.close();
            codici.add(cod + ":" + nRecord);
            aggiornaCmb();
            atxLog.setText("");
            for (int i = 0; i < codici.size(); i++) {
                atxLog.append(codici.get(i) + "\n");
            }
        } catch (IOException ioe) {
        }
    }//GEN-LAST:event_btnScriviActionPerformed

    private void btnAggiornaChiaviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaChiaviActionPerformed
        try {
            fw = new FileWriter("chiavi.txt", false);
            pw = new PrintWriter(fw);
            for (int i = 0; i < codici.size(); i++) {
                pw.println(codici.get(i));
            }
            pw.flush();
            pw.close();
            fw.close();
            aggiornaLista();
        } catch (IOException ioe) {
        }
    }//GEN-LAST:event_btnAggiornaChiaviActionPerformed

    private void btnLeggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeggiActionPerformed
        cmbChiavi.getSelectedIndex();
    }//GEN-LAST:event_btnLeggiActionPerformed

    private ArrayList<String> aggiornaLista() {
        atxLog.setText("");
        ArrayList<String> tmpCodici = new ArrayList<>();
        try {
            fr = new FileReader("chiavi.txt");
            br = new BufferedReader(fr);

            String stringaLettaDaFile;

            stringaLettaDaFile = br.readLine();
            tmpCodici.add(stringaLettaDaFile);

            while (stringaLettaDaFile != null) {
                stringaLettaDaFile = br.readLine();
                if (stringaLettaDaFile != null) {
                    tmpCodici.add(stringaLettaDaFile);
                }
            }
            fr.close();
            br.close();

            tmpCodici.forEach((righeLette1) -> {
                atxLog.append(righeLette1 + "\n");
            });

        } catch (IOException ioe) {
            atxLog.setText("Problemi nella lettura del file di testo");
        }
        return tmpCodici;
    }

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
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnAggiornaChiavi;
    private javax.swing.JButton btnLeggi;
    private javax.swing.JButton btnScrivi;
    private javax.swing.JComboBox<String> cmbChiavi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrezzo;
    private javax.swing.JTextField txtQminima;
    private javax.swing.JTextField txtQuantita;
    // End of variables declaration//GEN-END:variables
}
