package turillolucacodanodoarrayverifica;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Turillo.Luca
 */
public class FrameCodaPuntatori extends javax.swing.JFrame {

    private CodaNodo cn;

    public FrameCodaPuntatori() {
        initComponents();
        setLocation(650, 200);
        pnlMenu.setVisible(true);
        cn = new CodaNodo();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtCostoCommissione = new javax.swing.JTextField();
        btnPiuImporto = new javax.swing.JButton();
        btnMenoImporto = new javax.swing.JButton();
        btnSopraMedia = new javax.swing.JButton();
        btnMenoCostoso = new javax.swing.JButton();
        btnPiuCostoso = new javax.swing.JButton();
        btnImportoMedio = new javax.swing.JButton();
        btnCostoMedio = new javax.swing.JButton();
        btnContaTipo = new javax.swing.JButton();
        cmbContaTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coda Puntatori");
        setMinimumSize(new java.awt.Dimension(800, 706));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlMenu.setLayout(null);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        atxLog.setRows(5);
        atxLog.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        atxLog.setEnabled(false);
        jScrollPane1.setViewportView(atxLog);

        pnlMenu.add(jScrollPane1);
        jScrollPane1.setBounds(310, 90, 460, 520);

        txtCodiceCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtCodiceCliente);
        txtCodiceCliente.setBounds(190, 30, 74, 23);

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
        jLabel2.setText("Codice Cliente: ");
        pnlMenu.add(jLabel2);
        jLabel2.setBounds(190, 10, 111, 17);

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
        txtImporto.setBounds(190, 80, 74, 23);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Tipo:");
        pnlMenu.add(jLabel19);
        jLabel19.setBounds(190, 160, 34, 17);

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
        jLabel20.setText("Importo:");
        pnlMenu.add(jLabel20);
        jLabel20.setBounds(190, 60, 58, 17);

        cmbTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bonifico", "versamento", "prelievo" }));
        pnlMenu.add(cmbTipo);
        cmbTipo.setBounds(190, 180, 112, 23);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Costo Com:");
        pnlMenu.add(jLabel21);
        jLabel21.setBounds(190, 110, 80, 17);

        txtCostoCommissione.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtCostoCommissione);
        txtCostoCommissione.setBounds(190, 130, 74, 23);

        btnPiuImporto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPiuImporto.setText("Piu' Importo");
        btnPiuImporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiuImportoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPiuImporto);
        btnPiuImporto.setBounds(130, 340, 140, 25);

        btnMenoImporto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenoImporto.setText("Meno Importo");
        btnMenoImporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoImportoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenoImporto);
        btnMenoImporto.setBounds(130, 370, 140, 25);

        btnSopraMedia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSopraMedia.setText("Sopra Media");
        btnSopraMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSopraMediaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSopraMedia);
        btnSopraMedia.setBounds(130, 540, 140, 25);

        btnMenoCostoso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenoCostoso.setText("Meno Costo");
        btnMenoCostoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoCostosoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenoCostoso);
        btnMenoCostoso.setBounds(130, 440, 140, 25);

        btnPiuCostoso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPiuCostoso.setText("Piu' Costo");
        btnPiuCostoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiuCostosoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPiuCostoso);
        btnPiuCostoso.setBounds(130, 410, 140, 25);

        btnImportoMedio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnImportoMedio.setText("Importo Medio");
        btnImportoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportoMedioActionPerformed(evt);
            }
        });
        pnlMenu.add(btnImportoMedio);
        btnImportoMedio.setBounds(130, 480, 140, 25);

        btnCostoMedio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCostoMedio.setText("Costo Medio");
        btnCostoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoMedioActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCostoMedio);
        btnCostoMedio.setBounds(130, 510, 140, 25);

        btnContaTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnContaTipo.setText("Conta Tipo");
        btnContaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaTipoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnContaTipo);
        btnContaTipo.setBounds(130, 580, 140, 25);

        cmbContaTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbContaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bonifico", "versamento", "prelievo" }));
        pnlMenu.add(cmbContaTipo);
        cmbContaTipo.setBounds(10, 580, 112, 23);

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(10, 20, 780, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        Boolean poss = false;
        try {
            OperazioneBancaria c = new OperazioneBancaria(String.valueOf(txtCodiceCliente.getText()), Integer.valueOf(txtImporto.getText()), String.valueOf(cmbTipo.getSelectedItem()), Integer.valueOf(txtCostoCommissione.getText()));
            if (!"".equals(txtImporto.getText()) && !"".equals(txtCodiceCliente.getText())) {
                Nodo n = new Nodo(c);
                cn.push(n);
            }
            poss = true;
            txtCodiceCliente.setBackground(Color.white);
            txtImporto.setBackground(Color.white);
            txtCostoCommissione.setBackground(Color.white);
        } catch (NumberFormatException e) {
        }
        if (!poss) {
            atxLog.append("Valore dell'input ERRATO!" + "\n");
            txtCodiceCliente.setBackground(Color.red);
            txtImporto.setBackground(Color.red);
            txtCostoCommissione.setBackground(Color.red);
        } else {
            atxLog.append("Rettanoglo aggiunto alla coda" + "\n");
        }
        txtCodiceCliente.setText("");
        txtImporto.setText("");
        txtCostoCommissione.setText("");
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        Nodo pop = cn.pop();
        if (pop != null) {
            atxLog.append("Pop --> " + pop.getInf() + "\n");
        } else {
            atxLog.append("Pop --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        Nodo top = cn.top();
        if (top != null) {
            atxLog.append("Top --> " + top.getInf() + "\n");
        } else {
            atxLog.append("Top --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnTopActionPerformed

    private void btnToStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToStringActionPerformed
        atxLog.append(cn.toString());
    }//GEN-LAST:event_btnToStringActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        atxLog.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFrame frmScelta = new FrameScelta();
        frmScelta.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnPiuImportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiuImportoActionPerformed
        if (!cn.isEmpty()) {
            Nodo tmp = cn.top(), tmp1 = cn.top();
            Integer max = 0;
            while (tmp != null) {
                if (tmp.getInf().getImporto() > max) {
                    max = tmp.getInf().getImporto();
                    tmp1 = tmp;
                }
                tmp = tmp.getNext();
            }
            atxLog.append("\n" + "Il piu' importo e': " + "\n" + tmp1.getInf() + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnPiuImportoActionPerformed

    private void btnMenoImportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoImportoActionPerformed
        if (!cn.isEmpty()) {
            Nodo tmp = cn.top(), tmp1 = cn.top();
            Integer min = 9999;
            while (tmp != null) {
                if (tmp.getInf().getImporto() < min) {
                    min = tmp.getInf().getImporto();
                    tmp1 = tmp;
                }
                tmp = tmp.getNext();
            }
            atxLog.append("\n" + "Il meno' importo e': " + "\n" + tmp1.getInf() + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnMenoImportoActionPerformed

    private void btnSopraMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSopraMediaActionPerformed
        if (!cn.isEmpty()) {
            Nodo tmp = cn.top(), tmp1 = cn.top();
            Integer c = 0, sMedia = 0;
            Double somma = 0.0, media = 0.0;
            while (tmp != null) {
                somma += tmp.getInf().getImporto();
                tmp = tmp.getNext();
                c++;
            }
            media = somma / c;

            while (tmp1 != null) {
                if (tmp1.getInf().getImporto() > media) {
                    sMedia++;
                }
                tmp1 = tmp1.getNext();
            }
            atxLog.append("\n" + "Quelli sopra la media sono: " + "\n" + sMedia + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnSopraMediaActionPerformed

    private void btnMenoCostosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoCostosoActionPerformed
        if (!cn.isEmpty()) {
            Nodo tmp = cn.top(), tmp1 = cn.top();
            Integer min = 9999;
            while (tmp != null) {
                if (tmp.getInf().getCostoCommissione() < min) {
                    min = tmp.getInf().getCostoCommissione();
                    tmp1 = tmp;
                }
                tmp = tmp.getNext();
            }
            atxLog.append("\n" + "Il meno' costoso e': " + "\n" + tmp1.getInf() + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnMenoCostosoActionPerformed

    private void btnPiuCostosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiuCostosoActionPerformed
        if (!cn.isEmpty()) {
            Nodo tmp = cn.top(), tmp1 = cn.top();
            Integer max = 0;
            while (tmp != null) {
                if (tmp.getInf().getCostoCommissione() > max) {
                    max = tmp.getInf().getCostoCommissione();
                    tmp1 = tmp;
                }
                tmp = tmp.getNext();
            }
            atxLog.append("\n" + "Il piu' costoso e': " + "\n" + tmp1.getInf() + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnPiuCostosoActionPerformed

    private void btnImportoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportoMedioActionPerformed
        if (!cn.isEmpty()) {
            Nodo tmp = cn.top();
            Integer c = 0;
            Double somma = 0.0, media = 0.0;
            while (tmp != null) {
                somma += tmp.getInf().getImporto();
                tmp = tmp.getNext();
                c++;
            }
            media = somma / c;
            atxLog.append("\n" + "La media degli importi e': " + "\n" + media + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnImportoMedioActionPerformed

    private void btnCostoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoMedioActionPerformed
        if (!cn.isEmpty()) {
            Nodo tmp = cn.top();
            Integer c = 0;
            Double somma = 0.0, media = 0.0;
            while (tmp != null) {
                somma += tmp.getInf().getCostoCommissione();
                tmp = tmp.getNext();
                c++;
            }
            media = somma / c;
            atxLog.append("\n" + "La media dei prezzi e': " + "\n" + media + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnCostoMedioActionPerformed

    private void btnContaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaTipoActionPerformed
        if (!cn.isEmpty()) {
            Nodo tmp = cn.top();
            Integer counter = 0;
            while (tmp != null) {
                if (cmbContaTipo.getSelectedItem().equals(tmp.getInf().getTipo())) {
                    counter++;
                }
                tmp = tmp.getNext();
            }
            atxLog.append("\n" + "Ci sono: " + "\n" + counter + " Elementi di questo tipo" + "\n");
        } else {
            atxLog.append("\n" + "CODA VUOTA" + "\n");
        }
    }//GEN-LAST:event_btnContaTipoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnContaTipo;
    private javax.swing.JButton btnCostoMedio;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTextField txtCodiceCliente;
    private javax.swing.JTextField txtCostoCommissione;
    private javax.swing.JTextField txtImporto;
    // End of variables declaration//GEN-END:variables
}
