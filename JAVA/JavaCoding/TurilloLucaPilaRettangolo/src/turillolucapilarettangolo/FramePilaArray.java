package turillolucapilarettangolo;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Turillo.Luca
 */
public class FramePilaArray extends javax.swing.JFrame {

    private PilaArray pa;

    public FramePilaArray() {
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
        txtCosto = new javax.swing.JTextField();
        btnPop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnPush = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        btnToString = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnPiuCostoso = new javax.swing.JButton();
        btnMenoCostoso = new javax.swing.JButton();
        btnMenoVenduto = new javax.swing.JButton();
        btnPiuVenduto = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtPezziVenduti = new javax.swing.JTextField();
        btnNMedioPezzi = new javax.swing.JButton();
        btnCostoMedio = new javax.swing.JButton();
        btnContaTipo = new javax.swing.JButton();
        cmbTipo1 = new javax.swing.JComboBox<>();
        btnSopraMedia = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PilaArray");
        setMaximumSize(new java.awt.Dimension(800, 706));
        setMinimumSize(new java.awt.Dimension(800, 706));
        setPreferredSize(new java.awt.Dimension(800, 706));
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
        btnCrea.setText("CREA PILA");
        btnCrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaActionPerformed(evt);
            }
        });
        pnlCreazione.add(btnCrea);
        btnCrea.setBounds(220, 35, 131, 32);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Lunghezza pila:");
        pnlCreazione.add(jLabel1);
        jLabel1.setBounds(6, 8, 108, 17);

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
        jScrollPane1.setBounds(380, 50, 390, 320);

        txtCosto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtCosto);
        txtCosto.setBounds(180, 20, 74, 23);

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
        jLabel2.setText("Costo:");
        pnlMenu.add(jLabel2);
        jLabel2.setBounds(130, 20, 45, 17);

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

        txtMarca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtMarca);
        txtMarca.setBounds(180, 50, 74, 23);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Tipo:");
        pnlMenu.add(jLabel19);
        jLabel19.setBounds(120, 110, 34, 17);

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
        jLabel20.setText("Pezzi ven:");
        pnlMenu.add(jLabel20);
        jLabel20.setBounds(110, 80, 71, 17);

        cmbTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " netbook", "notebook", "fisso" }));
        pnlMenu.add(cmbTipo);
        cmbTipo.setBounds(170, 110, 95, 23);

        btnPiuCostoso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPiuCostoso.setText("Piu Costoso");
        btnPiuCostoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiuCostosoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPiuCostoso);
        btnPiuCostoso.setBounds(230, 170, 140, 25);

        btnMenoCostoso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenoCostoso.setText("Meno Costoso");
        btnMenoCostoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoCostosoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenoCostoso);
        btnMenoCostoso.setBounds(230, 200, 140, 25);

        btnMenoVenduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenoVenduto.setText("Meno Venduto");
        btnMenoVenduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoVendutoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenoVenduto);
        btnMenoVenduto.setBounds(230, 260, 140, 25);

        btnPiuVenduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPiuVenduto.setText("Piu Venduto");
        btnPiuVenduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiuVendutoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPiuVenduto);
        btnPiuVenduto.setBounds(230, 230, 140, 25);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Marca:");
        pnlMenu.add(jLabel21);
        jLabel21.setBounds(130, 50, 55, 17);

        txtPezziVenduti.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtPezziVenduti);
        txtPezziVenduti.setBounds(180, 80, 74, 23);

        btnNMedioPezzi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNMedioPezzi.setText("N Medio Pezzi");
        btnNMedioPezzi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNMedioPezziActionPerformed(evt);
            }
        });
        pnlMenu.add(btnNMedioPezzi);
        btnNMedioPezzi.setBounds(230, 290, 140, 25);

        btnCostoMedio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCostoMedio.setText("Costo Medio");
        btnCostoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoMedioActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCostoMedio);
        btnCostoMedio.setBounds(230, 320, 140, 25);

        btnContaTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnContaTipo.setText("Conta Tipo");
        btnContaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaTipoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnContaTipo);
        btnContaTipo.setBounds(230, 380, 140, 25);

        cmbTipo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " netbook", "notebook", "fisso" }));
        pnlMenu.add(cmbTipo1);
        cmbTipo1.setBounds(130, 380, 95, 23);

        btnSopraMedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSopraMedia.setText("Sopra Media");
        btnSopraMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSopraMediaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSopraMedia);
        btnSopraMedia.setBounds(230, 350, 140, 25);

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(10, 90, 780, 470);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(680, 170, 0, 2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaActionPerformed
        Boolean poss = false;
        try {
            if (Integer.parseInt(this.txtLunghezza.getText()) > 0) {
                pa = new PilaArray(Integer.valueOf(txtLunghezza.getText()));
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
            if (pa.push(new Computer(Integer.valueOf(txtCosto.getText()), String.valueOf(txtMarca.getText()), String.valueOf(cmbTipo.getSelectedItem()), Integer.valueOf(txtPezziVenduti.getText())))) {
                poss = true;
                txtCosto.setBackground(Color.white);
                txtMarca.setBackground(Color.white);
                txtPezziVenduti.setBackground(Color.white);
            } else {
                atxLog.append("Pila Piena!" + "\n" + "\n");
            }
        } catch (NumberFormatException e) {
        }
        if (!poss) {
            atxLog.append("Valore dell'input ERRATO!" + "\n" + "\n");
            txtCosto.setBackground(Color.red);
            txtMarca.setBackground(Color.red);
            txtPezziVenduti.setBackground(Color.red);
        } else {
            atxLog.append("Rettanoglo aggiunto alla pila" + "\n" + "\n");
        }
        txtCosto.setText("");
        txtMarca.setText("");
        txtPezziVenduti.setText("");
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        if (pa.top() == null) {
            atxLog.append("Pop --> NULL" + "\n");
        } else {
            atxLog.append("Pop --> " + pa.pop() + "\n\n");
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        if (pa.top() == null) {
            atxLog.append("Top --> NULL" + "\n");
        } else {
            atxLog.append("Top --> " + pa.top() + "\n\n");
        }
    }//GEN-LAST:event_btnTopActionPerformed

    private void btnToStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToStringActionPerformed
        atxLog.append(pa.toString());
    }//GEN-LAST:event_btnToStringActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        atxLog.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFrame frmScelta = new FrameScelta();
        frmScelta.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnPiuCostosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiuCostosoActionPerformed
        Integer max = 0, tmp = 0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            if (pa.getElementi()[i].getCosto() > max) {
                max = pa.getElementi()[i].getCosto();
                tmp = i;
            }
        }
        atxLog.append("\n" + "Il piu' costoso e': " + "\n" + pa.getElementi()[tmp] + "\n");
    }//GEN-LAST:event_btnPiuCostosoActionPerformed

    private void btnMenoCostosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoCostosoActionPerformed
        Integer min = 999, tmp = 0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            if (pa.getElementi()[i].getCosto() < min) {
                min = pa.getElementi()[i].getCosto();
                tmp = i;
            }
        }
        atxLog.append("\n" + "Il meno costoso e': " + "\n" + pa.getElementi()[tmp] + "\n");
    }//GEN-LAST:event_btnMenoCostosoActionPerformed

    private void btnMenoVendutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoVendutoActionPerformed
        Integer min = 999, tmp = 0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            if (pa.getElementi()[i].getPezziVenduti() < min) {
                min = pa.getElementi()[i].getPezziVenduti();
                tmp = i;
            }
        }
        atxLog.append("\n" + "Il meno venduto e': " + "\n" + pa.getElementi()[tmp] + "\n");
    }//GEN-LAST:event_btnMenoVendutoActionPerformed

    private void btnPiuVendutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiuVendutoActionPerformed
        Integer max = 0, tmp = 0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            if (pa.getElementi()[i].getPezziVenduti() > max) {
                max = pa.getElementi()[i].getPezziVenduti();
                tmp = i;
            }
        }
        atxLog.append("\n" + "Il piu' venduto e': " + "\n" + pa.getElementi()[tmp] + "\n");
    }//GEN-LAST:event_btnPiuVendutoActionPerformed

    private void btnNMedioPezziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNMedioPezziActionPerformed
        Double somma = 0.0, media = 0.0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            somma += pa.getElementi()[i].getPezziVenduti();
        }
        media = somma / (pa.getHead() + 1);
        atxLog.append("\n" + "Il Numero Medio Di Pezzi Venduti e': " + "\n" + media + "\n");
    }//GEN-LAST:event_btnNMedioPezziActionPerformed

    private void btnCostoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoMedioActionPerformed
        Double somma = 0.0, media = 0.0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            somma += pa.getElementi()[i].getCosto();
        }
        media = somma / (pa.getHead() + 1);
        atxLog.append("\n" + "Il costo Medio e': " + "\n" + media + "\n");
    }//GEN-LAST:event_btnCostoMedioActionPerformed

    private void btnContaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaTipoActionPerformed
        Integer counter = 0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            if (pa.getElementi()[i].getTipo() == cmbTipo1.getSelectedItem()) {
                counter++;
            }
        }
        atxLog.append("\n" + "Il numero di tipo selezionato e': " + "\n" + counter + "\n");
    }//GEN-LAST:event_btnContaTipoActionPerformed

    private void btnSopraMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSopraMediaActionPerformed
        Double somma = 0.0, media = 0.0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            somma += pa.getElementi()[i].getCosto();
        }
        media = somma / (pa.getHead() + 1);
        atxLog.append("\n" + "Il costo Medio e': " + "\n" + media + "\n");
        Integer counter = 0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            if (pa.getElementi()[i].getCosto() > media) {
                counter++;
            }
        }
        atxLog.append("\n" + "Il Numero Di Computer Che Hanno Un Costo Sopra La Media sono: " + "\n" + counter + "\n");
    }//GEN-LAST:event_btnSopraMediaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnContaTipo;
    private javax.swing.JButton btnCostoMedio;
    private javax.swing.JButton btnCrea;
    private javax.swing.JButton btnMenoCostoso;
    private javax.swing.JButton btnMenoVenduto;
    private javax.swing.JButton btnNMedioPezzi;
    private javax.swing.JButton btnPiuCostoso;
    private javax.swing.JButton btnPiuVenduto;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnSopraMedia;
    private javax.swing.JButton btnToString;
    private javax.swing.JButton btnTop;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbTipo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlCreazione;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtLunghezza;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPezziVenduti;
    // End of variables declaration//GEN-END:variables
}
