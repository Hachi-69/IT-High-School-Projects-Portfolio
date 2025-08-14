package turillolucarubrica;

import java.awt.Color;
import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    private ArrayList<Contatto> alContatto;

    private FileWriter fw;
    private PrintWriter pw;
    private Boolean corretto;

    public Frame() {
        initComponents();
        this.setLocation(550, 200);
        alContatto = new ArrayList();
        corretto = false;
        try {
            fw = new FileWriter("rubrica.txt", false);
            pw = new PrintWriter(fw);
            pw.print("");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtCognome = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnAddAL = new javax.swing.JButton();
        btnOrdina = new javax.swing.JButton();
        btnCerca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rubrica Telefonica");
        setMaximumSize(new java.awt.Dimension(836, 657));
        setMinimumSize(new java.awt.Dimension(836, 657));
        setPreferredSize(new java.awt.Dimension(836, 657));
        setResizable(false);
        getContentPane().setLayout(null);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 230, 780, 380);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Mail:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 180, 70, 16);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Cognome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 90, 70, 16);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 120, 70, 16);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Tel:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 150, 70, 16);

        txtMail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtMail);
        txtMail.setBounds(240, 170, 160, 30);

        txtCognome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtCognome);
        txtCognome.setBounds(240, 80, 160, 30);

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(240, 110, 160, 30);

        txtTel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtTel);
        txtTel.setBounds(240, 140, 160, 30);

        btnAddAL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAddAL.setText("Add");
        btnAddAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddALActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddAL);
        btnAddAL.setBounds(450, 110, 80, 60);

        btnOrdina.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnOrdina.setText("Ordina");
        btnOrdina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdinaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdina);
        btnOrdina.setBounds(550, 110, 80, 60);

        btnCerca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCerca.setText("Cerca");
        btnCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerca);
        btnCerca.setBounds(650, 110, 80, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddALActionPerformed
        atxLog.setForeground(Color.black);
        txtTel.setBackground(Color.white);
        txtMail.setBackground(Color.white);
        txtNome.setBackground(Color.white);
        txtCognome.setBackground(Color.white);
        atxLog.setText("");

        Pattern p = Pattern.compile("^3\\d{9}$");
        Matcher mTel = p.matcher(txtTel.getText());
        p = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
        Matcher mEmail = p.matcher(txtMail.getText());
        p = Pattern.compile("^[a-zA-Z\\s]+");
        Matcher mNome = p.matcher(txtNome.getText());
        Matcher mCognome = p.matcher(txtCognome.getText());
        corretto = true;
        if (!mNome.matches()) {
            txtNome.setBackground(Color.red);
            atxLog.setForeground(Color.red);
            corretto = false;
            atxLog.append("Nome non valido\n");
        }
        if (!mCognome.matches()) {
            txtCognome.setBackground(Color.red);
            atxLog.setForeground(Color.red);
            corretto = false;
            atxLog.append("Cognome non valido\n");
        }
        if (!mTel.matches()) {
            txtTel.setBackground(Color.red);
            atxLog.setForeground(Color.red);
            corretto = false;
            atxLog.append("Numero di telefono non valido\n");
        }
        if (!mEmail.matches()) {
            txtMail.setBackground(Color.red);
            atxLog.setForeground(Color.red);
            corretto = false;
            atxLog.append("Mail non valida\n");
        }

        Contatto c = new Contatto(txtCognome.getText(), txtNome.getText(), txtTel.getText(), txtMail.getText());
        if (alContatto.indexOf(c) != -1) {
            txtMail.setBackground(Color.red);
            txtTel.setBackground(Color.red);
            txtCognome.setBackground(Color.red);
            txtNome.setBackground(Color.red);
            atxLog.setForeground(Color.red);
            atxLog.append("Contatto gia' registrato\n");
            corretto = false;
        } else {
            for (Contatto alContatto1 : alContatto) {
                if (alContatto1.getTel().equals(txtTel.getText())) {
                    txtTel.setBackground(Color.red);
                    atxLog.setForeground(Color.red);
                    atxLog.append("Numero di telefono gia' presente\n");
                    corretto = false;
                }
            }
        }

        if (corretto) {
            alContatto.add(c);
            atxLog.setText(alContatto.toString());
            try {
                fw = new FileWriter("rubrica.txt", true);
                pw = new PrintWriter(fw);
                pw.println(txtCognome.getText() + ":" + txtNome.getText() + ":" + txtTel.getText() + ":" + txtMail.getText());
                pw.flush();
                pw.close();
                fw.close();
            } catch (IOException e) {
                atxLog.setText("Errore nella scrittura del file");
            }
        }
    }//GEN-LAST:event_btnAddALActionPerformed

    private void btnOrdinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdinaActionPerformed
        Collections.sort(alContatto);
        atxLog.setText(alContatto.toString() + "\n");
        if (alContatto.isEmpty()) {
            atxLog.setText("La lista e' vuota\n");
        } else {
            try {
                fw = new FileWriter("rubrica.txt", false);
                pw = new PrintWriter(fw);
                pw.print("");
                fw = new FileWriter("rubrica.txt", true);
                pw = new PrintWriter(fw);
                for (Contatto alContatto1 : alContatto) {
                    pw.println(alContatto1.getNome() + ":" + alContatto1.getCognome() + ":" + alContatto1.getTel() + ":" + alContatto1.getMail());
                }
                pw.println(txtCognome.getText() + ":" + txtNome.getText() + ":" + txtTel.getText() + ":" + txtMail.getText());
                pw.flush();
                pw.close();
                fw.close();
            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_btnOrdinaActionPerformed

    private void btnCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaActionPerformed
        Contatto c = new Contatto(txtCognome.getText(), txtNome.getText(), txtTel.getText(), txtMail.getText());
        atxLog.append((alContatto.indexOf(c) != -1 ? alContatto.get(alContatto.indexOf(c)).toString() : "\nContatto non trovato\n"));
    }//GEN-LAST:event_btnCercaActionPerformed

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
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnAddAL;
    private javax.swing.JButton btnCerca;
    private javax.swing.JButton btnOrdina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
