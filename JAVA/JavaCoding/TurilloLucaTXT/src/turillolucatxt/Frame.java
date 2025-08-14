package turillolucatxt;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    private ArrayList<String> righeLette;

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtCognome = new javax.swing.JTextField();
        txtEta = new javax.swing.JTextField();
        btnScrivi = new javax.swing.JButton();
        btnLeggi = new javax.swing.JButton();
        btnCreaPersone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        txtNome.setText("Nome");
        getContentPane().add(txtNome);
        txtNome.setBounds(20, 30, 80, 22);

        txtCognome.setText("Cognome");
        getContentPane().add(txtCognome);
        txtCognome.setBounds(20, 60, 80, 22);

        txtEta.setText("Eta");
        getContentPane().add(txtEta);
        txtEta.setBounds(20, 90, 80, 22);

        btnScrivi.setText("Scrivi");
        btnScrivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScriviActionPerformed(evt);
            }
        });
        getContentPane().add(btnScrivi);
        btnScrivi.setBounds(260, 30, 100, 23);

        btnLeggi.setText("Leggi");
        btnLeggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeggiActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeggi);
        btnLeggi.setBounds(260, 60, 100, 23);

        btnCreaPersone.setText("Crea Persone");
        btnCreaPersone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaPersoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreaPersone);
        btnCreaPersone.setBounds(260, 90, 100, 23);

        atxLog.setColumns(20);
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 10, 310, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnScriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScriviActionPerformed
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("prova.txt", true);
            pw = new PrintWriter(fw);

            String nome = txtNome.getText();
            String cognome = txtCognome.getText();
            String eta = txtEta.getText();

            pw.println(nome + ":" + cognome + ":" + eta);

            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            atxLog.setText("tu a sbagliato");
        }
    }//GEN-LAST:event_btnScriviActionPerformed

    private void btnLeggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeggiActionPerformed
        righeLette = new ArrayList();

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("prova.txt");
            br = new BufferedReader(fr);

            String stringaLettaDaFile = null;

            stringaLettaDaFile = br.readLine();
            righeLette.add(stringaLettaDaFile);

            while (stringaLettaDaFile != null) {
                stringaLettaDaFile = br.readLine();
                if (stringaLettaDaFile != null) {
                    righeLette.add(stringaLettaDaFile);
                }
            }
            fr.close();
            br.close();

            righeLette.forEach((righeLette1) -> {
                atxLog.append(righeLette1 + "\n");
            });

        } catch (IOException ioe) {
            atxLog.setText("Problemi nella lettura del file di testo");
        }
    }//GEN-LAST:event_btnLeggiActionPerformed

    private void btnCreaPersoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaPersoneActionPerformed
        String str = null;
        StringTokenizer st = null;

        String nome = null, cognome = null;
        Integer eta = null;
        for (int i = 0; i < righeLette.size(); i++) {
            str += righeLette.get(i);
            st = new StringTokenizer(str, ":");
            System.out.println(st.countTokens());

            Integer c = 0;
            while (st.hasMoreTokens()) {
                c++;
                st.nextToken();
                switch (c) {
                    case 1:
                        nome = st.nextToken();
                        break;
                    case 2:
                        cognome = st.nextToken();
                        break;
                    default:
                        eta = Integer.valueOf(st.nextToken());
                        break;
                }
            }
        }
        Persona p = new Persona(nome, cognome, eta);
    }//GEN-LAST:event_btnCreaPersoneActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnCreaPersone;
    private javax.swing.JButton btnLeggi;
    private javax.swing.JButton btnScrivi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtEta;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
