package turillolucacodanodoarrayverifica;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Turillo.Luca
 */
public class FrameCodaArray extends javax.swing.JFrame {

    private CodaArray ca;

    public FrameCodaArray() {
        initComponents();
        this.setLocation(650, 200);
        pnlMenu.setVisible(false);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCreazione = new javax.swing.JPanel();
        txtLunghezza = new javax.swing.JTextField();
        btnCrea = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        txtCodiceCliente = new javax.swing.JTextField();
        btnPop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnPush = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        btnToString = new javax.swing.JButton();
        txtImporto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtCostoComm = new javax.swing.JTextField();
        btnCostoMedio = new javax.swing.JButton();
        btnMenoImporto = new javax.swing.JButton();
        btnPiuImporto = new javax.swing.JButton();
        cmbContaTipo = new javax.swing.JComboBox<>();
        btnContaTipo = new javax.swing.JButton();
        btnSopraMedia = new javax.swing.JButton();
        btnMenoCostoso = new javax.swing.JButton();
        btnPiuCostoso = new javax.swing.JButton();
        btnImportoMedio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coda Array");
        setMinimumSize(new java.awt.Dimension(800, 706));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlCreazione.setLayout(null);

        txtLunghezza.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlCreazione.add(txtLunghezza);
        txtLunghezza.setBounds(6, 35, 104, 32);

        btnCrea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCrea.setText("CREA CODA");
        btnCrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaActionPerformed(evt);
            }
        });
        pnlCreazione.add(btnCrea);
        btnCrea.setBounds(220, 35, 131, 32);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Lunghezza coda:");
        pnlCreazione.add(jLabel1);
        jLabel1.setBounds(6, 8, 117, 17);

        getContentPane().add(pnlCreazione);
        pnlCreazione.setBounds(100, 10, 410, 92);

        pnlMenu.setLayout(null);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        atxLog.setRows(5);
        atxLog.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        atxLog.setEnabled(false);
        jScrollPane1.setViewportView(atxLog);

        pnlMenu.add(jScrollPane1);
        jScrollPane1.setBounds(300, 50, 470, 510);

        txtCodiceCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtCodiceCliente);
        txtCodiceCliente.setBounds(180, 30, 74, 23);

        btnPop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPop);
        btnPop.setBounds(10, 50, 87, 34);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Codice Cliente:");
        pnlMenu.add(jLabel2);
        jLabel2.setBounds(180, 10, 107, 17);

        btnPush.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPush);
        btnPush.setBounds(10, 10, 87, 34);

        btnTop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTop.setText("Top");
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        pnlMenu.add(btnTop);
        btnTop.setBounds(10, 90, 87, 34);

        btnToString.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnToString.setText("toString");
        btnToString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToStringActionPerformed(evt);
            }
        });
        pnlMenu.add(btnToString);
        btnToString.setBounds(10, 130, 100, 34);

        txtImporto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtImporto);
        txtImporto.setBounds(180, 80, 74, 23);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Tipo:");
        pnlMenu.add(jLabel19);
        jLabel19.setBounds(180, 160, 34, 17);

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlMenu.add(btnClear);
        btnClear.setBounds(10, 170, 90, 34);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Costo Comm:");
        pnlMenu.add(jLabel20);
        jLabel20.setBounds(180, 110, 92, 17);

        cmbTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bonifico", "versamento", "prelievo" }));
        pnlMenu.add(cmbTipo);
        cmbTipo.setBounds(180, 180, 112, 23);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Importo:");
        pnlMenu.add(jLabel21);
        jLabel21.setBounds(180, 60, 58, 17);

        txtCostoComm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtCostoComm);
        txtCostoComm.setBounds(180, 130, 74, 23);

        btnCostoMedio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCostoMedio.setText("Costo Medio");
        btnCostoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoMedioActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCostoMedio);
        btnCostoMedio.setBounds(130, 460, 140, 25);

        btnMenoImporto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenoImporto.setText("Meno Importo");
        btnMenoImporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoImportoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenoImporto);
        btnMenoImporto.setBounds(130, 320, 140, 25);

        btnPiuImporto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPiuImporto.setText("Piu' Importo");
        btnPiuImporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiuImportoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPiuImporto);
        btnPiuImporto.setBounds(130, 290, 140, 25);

        cmbContaTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbContaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bonifico", "versamento", "prelievo" }));
        pnlMenu.add(cmbContaTipo);
        cmbContaTipo.setBounds(10, 530, 112, 23);

        btnContaTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnContaTipo.setText("Conta Tipo");
        btnContaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaTipoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnContaTipo);
        btnContaTipo.setBounds(130, 530, 140, 25);

        btnSopraMedia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSopraMedia.setText("Sopra Media");
        btnSopraMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSopraMediaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSopraMedia);
        btnSopraMedia.setBounds(130, 490, 140, 25);

        btnMenoCostoso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenoCostoso.setText("Meno Costo");
        btnMenoCostoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoCostosoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenoCostoso);
        btnMenoCostoso.setBounds(130, 390, 140, 25);

        btnPiuCostoso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPiuCostoso.setText("Piu' Costo");
        btnPiuCostoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiuCostosoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPiuCostoso);
        btnPiuCostoso.setBounds(130, 360, 140, 25);

        btnImportoMedio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnImportoMedio.setText("Importo Medio");
        btnImportoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportoMedioActionPerformed(evt);
            }
        });
        pnlMenu.add(btnImportoMedio);
        btnImportoMedio.setBounds(130, 430, 140, 25);

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(10, 90, 780, 610);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(680, 170, 0, 2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaActionPerformed
        Boolean poss = false;
        try {
            if (Integer.parseInt(this.txtLunghezza.getText()) > 0) {
                ca = new CodaArray(Integer.valueOf(txtLunghezza.getText()));
                poss = true;
                pnlCreazione.setVisible(false);
                pnlMenu.setVisible(true);
            }
        } catch (NumberFormatException e) {
        }
        if (!poss) {
            txtLunghezza.setBackground(Color.red);
        }
    }//GEN-LAST:event_btnCreaActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        Boolean poss = false;
        try {
            if (ca.push(new OperazioneBancaria(String.valueOf(txtCodiceCliente.getText()), Integer.valueOf(txtImporto.getText()), String.valueOf(cmbTipo.getSelectedItem()), Integer.valueOf(txtCostoComm.getText())))) {
                poss = true;
                txtCodiceCliente.setBackground(Color.white);
                txtImporto.setBackground(Color.white);
                txtCostoComm.setBackground(Color.white);
            } else {
                atxLog.append("Coda Piena!" + "\n");
            }
        } catch (NumberFormatException e) {
        }
        if (!poss) {
            atxLog.append("Valore dell'input ERRATO!" + "\n");
            txtCodiceCliente.setBackground(Color.red);
            txtImporto.setBackground(Color.red);
            txtCostoComm.setBackground(Color.red);
        } else {
            atxLog.append("Rettanoglo aggiunto alla coda" + "\n");
        }
        txtCodiceCliente.setText("");
        txtImporto.setText("");
        txtCostoComm.setText("");
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        if (ca.top() == null) {
            atxLog.append("Pop --> NULL" + "\n");
        } else {
            atxLog.append("Pop --> " + ca.pop() + "\n");
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        if (ca.top() == null) {
            atxLog.append("Top --> NULL" + "\n");
        } else {
            atxLog.append("Top --> " + ca.top() + "\n");
        }
    }//GEN-LAST:event_btnTopActionPerformed

    private void btnToStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToStringActionPerformed
        atxLog.append(ca.toString());
    }//GEN-LAST:event_btnToStringActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        atxLog.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFrame frmScelta = new FrameScelta();
        frmScelta.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnCostoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoMedioActionPerformed
        if (!ca.isEmpty()) {
            Double somma = 0.0, media = 0.0;
            for (int i = 0; i < ca.getTail() + 1; i++) {
                somma += ca.getElementi()[i].getCostoCommissione();
            }
            media = somma / (ca.getTail() + 1);
            atxLog.append("\n" + "Il costo Medio e': " + "\n" + media + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnCostoMedioActionPerformed

    private void btnMenoImportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoImportoActionPerformed
        if (!ca.isEmpty()) {
            Integer min = 999, tmp = 0;
            for (int i = 0; i < ca.getTail() + 1; i++) {
                if (ca.getElementi()[i].getImporto() < min) {
                    min = ca.getElementi()[i].getImporto();
                    tmp = i;
                }
            }
            atxLog.append("\n" + "Il meno importo e': " + "\n" + ca.getElementi()[tmp] + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnMenoImportoActionPerformed

    private void btnPiuImportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiuImportoActionPerformed
        if (!ca.isEmpty()) {
            Integer max = 0, tmp = 0;
            for (int i = 0; i < ca.getTail() + 1; i++) {
                if (ca.getElementi()[i].getImporto() > max) {
                    max = ca.getElementi()[i].getImporto();
                    tmp = i;
                }
            }
            atxLog.append("\n" + "Il piu' importo e': " + "\n" + ca.getElementi()[tmp] + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnPiuImportoActionPerformed

    private void btnContaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaTipoActionPerformed
        if (!ca.isEmpty()) {
            Integer counter = 0;
            for (int i = 0; i < ca.getTail() + 1; i++) {
                if (cmbContaTipo.getSelectedItem().equals(ca.getElementi()[i].getTipo())) {
                    counter++;
                }
            }
            atxLog.append("\n" + "Ci sono: " + "\n" + counter + " Elementi di questo tipo" + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnContaTipoActionPerformed

    private void btnSopraMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSopraMediaActionPerformed
        if (!ca.isEmpty()) {
            Double somma = 0.0, media = 0.0;
            Integer counter = 0;
            for (int i = 0; i < ca.getTail() + 1; i++) {
                somma += ca.getElementi()[i].getImporto();
            }
            media = somma / (ca.getTail() + 1);

            for (int i = 0; i < ca.getTail() + 1; i++) {
                if (ca.getElementi()[i].getImporto() > media) {
                    counter++;
                }
            }
            atxLog.append("\n" + "Quelli sopra la media sono : " + "\n" + counter + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnSopraMediaActionPerformed

    private void btnMenoCostosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoCostosoActionPerformed
        if (!ca.isEmpty()) {
            Integer min = 999, tmp = 0;
            for (int i = 0; i < ca.getTail() + 1; i++) {
                if (ca.getElementi()[i].getCostoCommissione() < min) {
                    min = ca.getElementi()[i].getCostoCommissione();
                    tmp = i;
                }
            }
            atxLog.append("\n" + "Il meno costoso e': " + "\n" + ca.getElementi()[tmp] + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnMenoCostosoActionPerformed

    private void btnPiuCostosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiuCostosoActionPerformed
        if (!ca.isEmpty()) {
            Integer max = 0, tmp = 0;
            for (int i = 0; i < ca.getTail() + 1; i++) {
                if (ca.getElementi()[i].getCostoCommissione() > max) {
                    max = ca.getElementi()[i].getCostoCommissione();
                    tmp = i;
                }
            }
            atxLog.append("\n" + "Il piu' costoso e': " + "\n" + ca.getElementi()[tmp] + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnPiuCostosoActionPerformed

    private void btnImportoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportoMedioActionPerformed
        if (!ca.isEmpty()) {
            Double somma = 0.0, media = 0.0;
            for (int i = 0; i < ca.getTail() + 1; i++) {
                somma += ca.getElementi()[i].getImporto();
            }
            media = somma / (ca.getTail() + 1);
            atxLog.append("\n" + "L'importo Medio e': " + "\n" + media + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnImportoMedioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnContaTipo;
    private javax.swing.JButton btnCostoMedio;
    private javax.swing.JButton btnCrea;
    private javax.swing.JButton btnImportoMedio;
    private javax.swing.JButton btnMenoCostoso;
    private javax.swing.JButton btnMenoImporto;
    private javax.swing.JButton btnPiuCostoso;
    private javax.swing.JButton btnPiuImporto;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnSopraMedia;
    private javax.swing.JButton btnToString;
    private javax.swing.JButton btnTop;
    private javax.swing.JComboBox<String> cmbContaTipo;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlCreazione;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTextField txtCodiceCliente;
    private javax.swing.JTextField txtCostoComm;
    private javax.swing.JTextField txtImporto;
    private javax.swing.JTextField txtLunghezza;
    // End of variables declaration//GEN-END:variables
}
