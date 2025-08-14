package testserializzazione;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    private ObjectOutputStream oos = null;
    private FileOutputStream fos = null;
    private ObjectInputStream ois = null;
    private FileInputStream fis = null;
    private final ArrayList<Prodotto> pr;

    public Frame() {
        initComponents();
        pr = aggiornaLista();
        aggiornaCmb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        lblCodice = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtCodice = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnInserisci = new javax.swing.JButton();
        cmbCod = new javax.swing.JComboBox();
        btnStampa = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Magazzino Turillo Luca");
        setMaximumSize(new java.awt.Dimension(910, 551));
        setMinimumSize(new java.awt.Dimension(910, 551));
        setPreferredSize(new java.awt.Dimension(910, 551));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        atxLog.setColumns(20);
        atxLog.setRows(5);
        atxLog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 10, 550, 480);

        lblCodice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodice.setText("Codice:");
        getContentPane().add(lblCodice);
        lblCodice.setBounds(20, 30, 70, 15);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 60, 80, 15);
        getContentPane().add(txtCodice);
        txtCodice.setBounds(140, 30, 140, 20);
        getContentPane().add(txtNome);
        txtNome.setBounds(140, 60, 140, 20);

        btnInserisci.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInserisci.setText("INSERISCI");
        btnInserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserisciActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserisci);
        btnInserisci.setBounds(80, 130, 140, 50);

        getContentPane().add(cmbCod);
        cmbCod.setBounds(30, 230, 250, 20);

        btnStampa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnStampa.setText("Stampa prodotto");
        btnStampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampaActionPerformed(evt);
            }
        });
        getContentPane().add(btnStampa);
        btnStampa.setBounds(30, 280, 250, 50);

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
        btnElimina.setBounds(30, 440, 250, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<Prodotto> aggiornaLista() {
        ArrayList<Prodotto> tmpCodici = new ArrayList<>();
        try {
            fis = new FileInputStream("info.dat");
            ois = new ObjectInputStream(fis);
            Prodotto pLetta;
            while (true) {
                try {
                    pLetta = (Prodotto) ois.readObject();
                    tmpCodici.add(pLetta);
                } catch (EOFException eofe) {
                    break;
                }
            }
            fis.close();
            ois.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Il file che si sta tentando di scrivere non esiste");
        } catch (IOException ioe) {
            System.out.println("Problema lettura");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Problemi con la classe degli oggetti");
        }
        return tmpCodici;
    }

    private void aggiornaCmb() {
        this.cmbCod.removeAllItems();
        String tmp;
        for (int i = 0; i < pr.size(); i++) {
            tmp = pr.get(i).getCod();
            cmbCod.addItem(tmp);
        }
    }

    private void scriviFile() throws FileNotFoundException, IOException {
        File f = new File("info.dat");
        fos = new FileOutputStream(f);
        oos = new ObjectOutputStream(fos);
        for (int i = 0; i < pr.size(); i++) {
            oos.writeObject(pr.get(i));
        }
        fos.flush();
        oos.flush();
        fos.close();
        oos.close();
    }
    private void btnInserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserisciActionPerformed
        Prodotto p1 = new Prodotto(txtCodice.getText(), txtNome.getText());
        Boolean presente = false;
        ArrayList<Prodotto> tmp = new ArrayList<>();
        tmp.add(p1);
        if (!txtCodice.getText().equals("") && !txtNome.getText().equals("")) {
            for (int i = 0; i < pr.size(); i++) {
                if (pr.get(i).getCod().equals(tmp.get(0).getCod())) {
                    presente = true;
                }
            }
            if (!presente) {
                pr.add(p1);
                aggiornaCmb();
            } else {
                atxLog.setText("Prodotto gia' esistente");
            }
        } else {
            atxLog.setText("Caselle di testo vuote");
        }
    }//GEN-LAST:event_btnInserisciActionPerformed

    private void btnStampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStampaActionPerformed
        if (!pr.isEmpty()) {
            atxLog.setText("\n" + pr.get(cmbCod.getSelectedIndex()));
        } else {
            atxLog.setText("File vuoto");
        }
    }//GEN-LAST:event_btnStampaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        if (!(txtCodice.getText().equals("") && txtNome.getText().equals("")) && !pr.isEmpty()) {
            pr.set(cmbCod.getSelectedIndex(), new Prodotto(txtCodice.getText(), txtNome.getText()));
            aggiornaCmb();
            atxLog.setText("");
        } else {
            atxLog.setText("Caselle di testo vuote o nessun prodotto selezionato");
        }
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        if (!pr.isEmpty()) {
            pr.remove(cmbCod.getSelectedIndex());
            aggiornaCmb();
            atxLog.setText("");
        } else {
            atxLog.setText("File vuoto");
        }

    }//GEN-LAST:event_btnEliminaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            scriviFile();
        } catch (IOException ioe) {
            System.out.println("Aggiornamento file non riuscito");
        }
        System.out.println("File aggiornato con successo");
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnInserisci;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnStampa;
    private javax.swing.JComboBox cmbCod;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodice;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtCodice;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
