package turillolucastatistichetxt;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    private ArrayList<String> righeLette;

    FileWriter fw;
    PrintWriter pw;

    FileReader fr;
    BufferedReader br;

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        btnScrivi = new javax.swing.JButton();
        btnLeggi = new javax.swing.JButton();
        btnStatistiche = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        atxLog.setColumns(20);
        atxLog.setRows(5);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 6, 770, 270);

        btnScrivi.setText("Scrivi");
        btnScrivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScriviActionPerformed(evt);
            }
        });
        getContentPane().add(btnScrivi);
        btnScrivi.setBounds(160, 310, 150, 100);

        btnLeggi.setText("Leggi");
        btnLeggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeggiActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeggi);
        btnLeggi.setBounds(460, 310, 150, 100);

        btnStatistiche.setText("Statische");
        btnStatistiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticheActionPerformed(evt);
            }
        });
        getContentPane().add(btnStatistiche);
        btnStatistiche.setBounds(310, 440, 150, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnScriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScriviActionPerformed
        try {
            fw = new FileWriter("Testo.txt", false);
            pw = new PrintWriter(fw);

            String str = atxLog.getText();
            pw.println(str);

            pw.flush();
            pw.close();
            fw.close();
            atxLog.setText("");
        } catch (IOException e) {
            atxLog.setText("tu a sbagliato");
        }
    }//GEN-LAST:event_btnScriviActionPerformed

    private void btnStatisticheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticheActionPerformed
        //conta righe
        atxLog.append("\nRighe File: " + righeLette.size());
        //conta parole
        String str;
        StringTokenizer st;
        Integer parole = 0;
        for (int i = 0; i < righeLette.size(); i++) {
            str = righeLette.get(i);
            st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                parole++;
                st.nextToken();
            }
        }
        atxLog.append("\nParole File: " + parole);
        /*conta parole che iniziano con la Maiuscola
        str = righeLette.get(0);
        char c;
        int ct = 0;
        for (int i = 0; i < str.length(); i++) {
        str = righeLette.get(i);
        c = str.charAt(i);
        if (c >= 65 && c <= 90) {
        ct++;
        }

        }
        System.out.println(ct);*/
        //conta spazi
        String stringa;
        Integer spazi = 0;
        char c;
        for (int i = 0; i < righeLette.size(); i++) {
            stringa = righeLette.get(i);
            for (int j = 0; j < stringa.length(); j++) {
                c = stringa.charAt(j);
                if (c == ' ') {
                    spazi++;
                }
            }
        }
        atxLog.append("\nSpazi File: " + spazi);
    }//GEN-LAST:event_btnStatisticheActionPerformed

    private void btnLeggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeggiActionPerformed
        righeLette = new ArrayList();

        try {
            fr = new FileReader("Testo.txt");
            br = new BufferedReader(fr);

            String stringaLettaDaFile = br.readLine();
            righeLette.add(stringaLettaDaFile);

            while (stringaLettaDaFile != null) {
                stringaLettaDaFile = br.readLine();
                if (stringaLettaDaFile != null) {
                    righeLette.add(stringaLettaDaFile);
                }
            }
            fr.close();
            br.close();
            atxLog.setText("");
            righeLette.forEach((righeLette1) -> {
                atxLog.append(righeLette1 + "\n");
            });

        } catch (IOException ioe) {
            atxLog.setText("Problemi nella lettura del file di testo");
        }
    }//GEN-LAST:event_btnLeggiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnLeggi;
    private javax.swing.JButton btnScrivi;
    private javax.swing.JButton btnStatistiche;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
