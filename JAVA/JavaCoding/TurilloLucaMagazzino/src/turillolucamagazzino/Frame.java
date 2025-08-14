package turillolucamagazzino;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {

    private final int VAL = 64;
    private final ArrayList<String> codici;

    public Frame() {
        initComponents();
        codici = aggiornaLista();
        aggiornaCmb();
    }

    private void aggiornaCmb() {
        this.cmbChiavi.removeAllItems();
        String tmp;
        for (int i = 0; i < codici.size(); i++) {
            tmp = codici.get(i);
            tmp = tmp.substring(0, 5);
            cmbChiavi.addItem(tmp);
        }
    }

    private String controllaStringa(String n, int lungMax) {
        String stringaModificata = n;
        int lunghezza = stringaModificata.length();
        if (lunghezza < lungMax) {
            for (int i = lunghezza; i < lungMax; i++) {
                stringaModificata += "*";
            }
        } else if (lunghezza > lungMax) {
            stringaModificata = stringaModificata.substring(0, lungMax - 1);
        }
        return stringaModificata;
    }

    private void pulisciTxt() {
        this.txtCodice.setText("");
        this.txtNome.setText("");
        this.txtQuantita.setText("");
        this.txtQuantitaMinima.setText("");
        this.txtPrezzo.setText("");
    }

    private ArrayList<String> aggiornaLista() {
        ArrayList<String> tmpCodici = new ArrayList<>();

        FileReader fr;
        BufferedReader br;
        try {
            fr = new FileReader("chiavi.txt");
            br = new BufferedReader(fr);

            String stringaLettaDaFile;

            stringaLettaDaFile = br.readLine();

            while (stringaLettaDaFile != null) {
                tmpCodici.add(stringaLettaDaFile);
                stringaLettaDaFile = br.readLine();

            }
            br.close();
            fr.close();
        } catch (IOException ioe) {
            System.out.println("Problemi nella lettura del file di testo");
        }
        return tmpCodici;
    }

    private void aggiornaFileChiavi() {
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter("chiavi.txt", false);
            pw = new PrintWriter(fw);
            for (int i = 0; i < codici.size(); i++) {
                pw.println(codici.get(i));
            }
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ioe) {
            atxOutput.setText("Problemi nella scrittura del file di testo");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxOutput = new javax.swing.JTextArea();
        lblCodice = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblQuantita = new javax.swing.JLabel();
        lblQuantitaMinima = new javax.swing.JLabel();
        lblPrezzo = new javax.swing.JLabel();
        txtCodice = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtQuantita = new javax.swing.JTextField();
        txtQuantitaMinima = new javax.swing.JTextField();
        txtPrezzo = new javax.swing.JTextField();
        btnInserisci = new javax.swing.JButton();
        cmbChiavi = new javax.swing.JComboBox();
        btnStampa = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 481));
        getContentPane().setLayout(null);

        atxOutput.setColumns(20);
        atxOutput.setRows(5);
        atxOutput.setFocusable(false);
        jScrollPane1.setViewportView(atxOutput);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 10, 550, 360);

        lblCodice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodice.setText("Codice");
        getContentPane().add(lblCodice);
        lblCodice.setBounds(20, 30, 70, 15);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 60, 80, 15);

        lblQuantita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuantita.setText("Quantità");
        getContentPane().add(lblQuantita);
        lblQuantita.setBounds(20, 90, 80, 15);

        lblQuantitaMinima.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuantitaMinima.setText("Quantità minima");
        getContentPane().add(lblQuantitaMinima);
        lblQuantitaMinima.setBounds(20, 120, 110, 15);

        lblPrezzo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrezzo.setText("Prezzo");
        getContentPane().add(lblPrezzo);
        lblPrezzo.setBounds(20, 150, 90, 15);
        getContentPane().add(txtCodice);
        txtCodice.setBounds(140, 30, 140, 22);
        getContentPane().add(txtNome);
        txtNome.setBounds(140, 60, 140, 22);
        getContentPane().add(txtQuantita);
        txtQuantita.setBounds(140, 90, 140, 22);
        getContentPane().add(txtQuantitaMinima);
        txtQuantitaMinima.setBounds(140, 120, 140, 22);
        getContentPane().add(txtPrezzo);
        txtPrezzo.setBounds(140, 150, 140, 22);

        btnInserisci.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInserisci.setText("INSERISCI");
        btnInserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserisciActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserisci);
        btnInserisci.setBounds(80, 200, 140, 50);

        getContentPane().add(cmbChiavi);
        cmbChiavi.setBounds(30, 270, 250, 22);

        btnStampa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnStampa.setText("Stampa prodotto");
        btnStampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampaActionPerformed(evt);
            }
        });
        getContentPane().add(btnStampa);
        btnStampa.setBounds(30, 300, 250, 50);

        btnModifica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModifica.setText("Modifica prodotto");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifica);
        btnModifica.setBounds(30, 360, 250, 50);

        btnElimina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnElimina.setText("Elimina prodotto");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });
        getContentPane().add(btnElimina);
        btnElimina.setBounds(320, 380, 250, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserisciActionPerformed
        try {

            String cod = controllaStringa(txtCodice.getText(), 5);
            for (int j = 0; j < codici.size(); j++) {
                while (codici.get(j).substring(0, 5).compareTo(cod) == 0) {
                    JOptionPane.showMessageDialog(null, "Il codice inserito è è già presente");
                    cod = controllaStringa(JOptionPane.showInputDialog(null, "Inserisci un codice diverso"), 5);
                }
            }
            String nome = controllaStringa(txtNome.getText(), 20);
            int qta = Integer.parseInt(txtQuantita.getText());
            while (qta < 0) {
                JOptionPane.showMessageDialog(null, "Non puoi inserire un numero negativo");
                qta = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserisci la nuova quantità minima"));
            }
            int qtaMin = Integer.parseInt(txtQuantitaMinima.getText());
            while (qtaMin < 0) {
                JOptionPane.showMessageDialog(null, "Non puoi inserire un numero negativo");
                qtaMin = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserisci la nuova quantità minima"));
            }
            double prezzo = Double.parseDouble(txtPrezzo.getText());
            while (prezzo < 0) {
                JOptionPane.showMessageDialog(null, "Non puoi inserire un numero negativo");
                prezzo = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserisci il nuovo prezzo"));
            }
            try {
                RandomAccessFile file = new RandomAccessFile("magazzino.dat", "rw");
                int nRecord = (int) (file.length() / VAL);
                System.out.println(nRecord);
                file.seek(nRecord * VAL);
                file.writeChars(cod);
                file.writeChars(nome);
                file.writeInt(qta);
                file.writeInt(qtaMin);
                file.writeDouble(prezzo);
                file.close();
                this.codici.add(cod + ":" + nRecord);
                aggiornaCmb();
            } catch (FileNotFoundException ex) {
                System.out.println("Errore durante l'apertura del file");
            } catch (IOException ex) {
                System.out.println("Errore durante l'input/output");
            }
            pulisciTxt();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Riempire tutti i campi");
        }
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter("chiavi.txt", false);
            pw = new PrintWriter(fw);
            for (int i = 0; i < codici.size(); i++) {
                pw.println(codici.get(i));
            }
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ioe) {
            atxOutput.setText("Problemi nella scrittura del file di testo");
        }
    }//GEN-LAST:event_btnInserisciActionPerformed

    private void btnStampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStampaActionPerformed
        String key = this.cmbChiavi.getSelectedItem().toString();
        int tmpPos;
        String tmpCod = "";
        String tmpNome = "";
        for (int i = 0; i < codici.size(); i++) {
            if (codici.get(i).startsWith(key)) {
                tmpPos = Integer.parseInt(codici.get(i).substring(6));
                try {
                    RandomAccessFile file = new RandomAccessFile("magazzino.dat", "rw");
                    file.seek(tmpPos * VAL);
                    for (int j = 0; j < 5; j++) {
                        tmpCod += file.readChar();
                    }
                    for (int j = 0; j < 20; j++) {
                        tmpNome += file.readChar();
                    }
                    atxOutput.setText(tmpCod + " " + tmpNome + " " + file.readInt() + " " + file.readInt() + " " + file.readDouble());
                    file.close();
                } catch (FileNotFoundException ex) {
                    atxOutput.setText("Errore durante l'apertura del file");
                } catch (IOException ex) {
                    atxOutput.setText("Errore 2");
                }
            }
        }
    }//GEN-LAST:event_btnStampaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        String key = this.cmbChiavi.getSelectedItem().toString();
        int tmpPos;
        for (int i = 0; i < codici.size(); i++) {
            if (codici.get(i).startsWith(key)) {
                tmpPos = Integer.parseInt(codici.get(i).substring(6));
                try {
                    RandomAccessFile file = new RandomAccessFile("magazzino.dat", "rw");
                    file.seek(tmpPos * VAL);
                    String cod = controllaStringa(JOptionPane.showInputDialog(null, "Inserisci il nuovo codice"), 5);
                    for (int j = 0; j < codici.size(); j++) {
                        while (codici.get(i).substring(0, 5).compareTo(cod) == 0) {
                            JOptionPane.showMessageDialog(null, "Il codice inserito è già uguale a quello vecchio/è già presente");
                            cod = controllaStringa(JOptionPane.showInputDialog(null, "Inserisci un codice diverso"), 5);
                        }
                    }
                    String nome = controllaStringa(JOptionPane.showInputDialog(null, "Inserisci il nuovo nome"), 20);
                    int qta = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserisci la nuova quantità"));
                    while (qta < 0) {
                        JOptionPane.showMessageDialog(null, "Non puoi inserire un numero negativo");
                        qta = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserisci la nuova quantità minima"));
                    }
                    int qtaMin = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserisci la nuova quantità minima"));
                    while (qtaMin < 0) {
                        JOptionPane.showMessageDialog(null, "Non puoi inserire un numero negativo");
                        qtaMin = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserisci la nuova quantità minima"));
                    }
                    double prezzo = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserisci il nuovo prezzo"));
                    while (prezzo < 0) {
                        JOptionPane.showMessageDialog(null, "Non puoi inserire un numero negativo");
                        prezzo = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserisci il nuovo prezzo"));
                    }
                    file.writeChars(cod);
                    file.writeChars(nome);
                    file.writeInt(qta);
                    file.writeInt(qtaMin);
                    file.writeDouble(prezzo);
                    file.close();
                    this.codici.set(i, cod + ":" + tmpPos);
                    aggiornaFileChiavi();
                    aggiornaCmb();
                } catch (FileNotFoundException ex) {
                    atxOutput.setText("Errore durante l'apertura del file");
                } catch (IOException ex) {
                    atxOutput.setText("Errore 2");
                }
            }
        }
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        String key = this.cmbChiavi.getSelectedItem().toString();
        for (int i = 0; i < codici.size(); i++) {
            if (codici.get(i).startsWith(key)) {
                Integer.valueOf(codici.get(i).substring(6));
                try {
                    RandomAccessFile file = new RandomAccessFile("magazzino.dat", "rw");
                    this.codici.remove(i);
                    aggiornaFileChiavi();
                    aggiornaCmb();
                } catch (FileNotFoundException ex) {
                    atxOutput.setText("Errore durante l'apertura del file");
                }
            }
        }
    }//GEN-LAST:event_btnEliminaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxOutput;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnInserisci;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnStampa;
    private javax.swing.JComboBox cmbChiavi;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodice;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrezzo;
    private javax.swing.JLabel lblQuantita;
    private javax.swing.JLabel lblQuantitaMinima;
    private javax.swing.JTextField txtCodice;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrezzo;
    private javax.swing.JTextField txtQuantita;
    private javax.swing.JTextField txtQuantitaMinima;
    // End of variables declaration//GEN-END:variables
}
