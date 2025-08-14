package turillolucapilarettangolo;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Turillo.Luca
 */
public class FramePilaPuntatori extends javax.swing.JFrame {

    private PilaNodo pn;

    public FramePilaPuntatori() {
        initComponents();
        setLocation(650, 200);
        pnlMenu.setVisible(true);
        pn = new PilaNodo();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel21 = new javax.swing.JLabel();
        txtPezziVenduti = new javax.swing.JTextField();
        cmbTipo1 = new javax.swing.JComboBox<>();
        btnContaTipo = new javax.swing.JButton();
        btnSopraMedia = new javax.swing.JButton();
        btnCostoMedio = new javax.swing.JButton();
        btnNMedioPezzi = new javax.swing.JButton();
        btnMenoVenduto = new javax.swing.JButton();
        btnPiuVenduto = new javax.swing.JButton();
        btnMenoCostoso = new javax.swing.JButton();
        btnPiuCostoso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pila Puntatori");
        setMaximumSize(new java.awt.Dimension(800, 706));
        setMinimumSize(new java.awt.Dimension(800, 706));
        setPreferredSize(new java.awt.Dimension(800, 706));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlMenu.setLayout(null);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        atxLog.setRows(5);
        atxLog.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        atxLog.setEnabled(false);
        jScrollPane1.setViewportView(atxLog);

        pnlMenu.add(jScrollPane1);
        jScrollPane1.setBounds(380, 90, 370, 410);

        txtCosto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtCosto);
        txtCosto.setBounds(200, 100, 74, 23);

        btnPop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPop);
        btnPop.setBounds(10, 150, 87, 34);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Costo:");
        pnlMenu.add(jLabel2);
        jLabel2.setBounds(150, 100, 45, 17);

        btnPush.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPush);
        btnPush.setBounds(10, 110, 87, 34);

        btnTop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTop.setText("Top");
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        pnlMenu.add(btnTop);
        btnTop.setBounds(10, 190, 87, 34);

        btnToString.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnToString.setText("toString");
        btnToString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToStringActionPerformed(evt);
            }
        });
        pnlMenu.add(btnToString);
        btnToString.setBounds(10, 230, 100, 34);

        txtMarca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtMarca);
        txtMarca.setBounds(200, 130, 74, 23);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Tipo:");
        pnlMenu.add(jLabel19);
        jLabel19.setBounds(130, 190, 34, 17);

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlMenu.add(btnClear);
        btnClear.setBounds(10, 270, 90, 34);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Marca:");
        pnlMenu.add(jLabel20);
        jLabel20.setBounds(150, 130, 47, 17);

        cmbTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " netbook", "notebook", "fisso" }));
        pnlMenu.add(cmbTipo);
        cmbTipo.setBounds(180, 190, 95, 23);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Pezzi ven:");
        pnlMenu.add(jLabel21);
        jLabel21.setBounds(130, 160, 71, 17);

        txtPezziVenduti.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlMenu.add(txtPezziVenduti);
        txtPezziVenduti.setBounds(200, 160, 74, 23);

        cmbTipo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " netbook", "notebook", "fisso" }));
        pnlMenu.add(cmbTipo1);
        cmbTipo1.setBounds(120, 470, 95, 23);

        btnContaTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnContaTipo.setText("Conta Tipo");
        btnContaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaTipoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnContaTipo);
        btnContaTipo.setBounds(220, 470, 140, 25);

        btnSopraMedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSopraMedia.setText("Sopra Media");
        btnSopraMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSopraMediaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSopraMedia);
        btnSopraMedia.setBounds(220, 440, 140, 25);

        btnCostoMedio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCostoMedio.setText("Costo Medio");
        btnCostoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoMedioActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCostoMedio);
        btnCostoMedio.setBounds(220, 410, 140, 25);

        btnNMedioPezzi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNMedioPezzi.setText("N Medio Pezzi");
        btnNMedioPezzi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNMedioPezziActionPerformed(evt);
            }
        });
        pnlMenu.add(btnNMedioPezzi);
        btnNMedioPezzi.setBounds(220, 380, 140, 25);

        btnMenoVenduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenoVenduto.setText("Meno Venduto");
        btnMenoVenduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoVendutoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenoVenduto);
        btnMenoVenduto.setBounds(220, 350, 140, 25);

        btnPiuVenduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPiuVenduto.setText("Piu Venduto");
        btnPiuVenduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiuVendutoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPiuVenduto);
        btnPiuVenduto.setBounds(220, 320, 140, 25);

        btnMenoCostoso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenoCostoso.setText("Meno Costoso");
        btnMenoCostoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoCostosoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenoCostoso);
        btnMenoCostoso.setBounds(220, 290, 140, 25);

        btnPiuCostoso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPiuCostoso.setText("Piu Costoso");
        btnPiuCostoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiuCostosoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPiuCostoso);
        btnPiuCostoso.setBounds(220, 260, 140, 25);

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(10, 20, 780, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        Boolean poss = false;
        try {
            Computer c = new Computer(Integer.valueOf(txtCosto.getText()), String.valueOf(txtMarca.getText()), String.valueOf(cmbTipo.getSelectedItem()), Integer.valueOf(txtPezziVenduti.getText()));
            if (!"".equals(txtMarca.getText()) && !"".equals(txtCosto.getText())) {
                Nodo n = new Nodo(c);
                pn.push(n);
            }
            poss = true;
            txtCosto.setBackground(Color.white);
            txtMarca.setBackground(Color.white);
        } catch (NumberFormatException e) {
        }
        if (!poss) {
            atxLog.append("Valore dell'input ERRATO!" + "\n" + "\n");
            txtCosto.setBackground(Color.red);
            txtMarca.setBackground(Color.red);
        } else {
            atxLog.append("Rettanoglo aggiunto alla pila" + "\n" + "\n");
        }
        txtCosto.setText("");
        txtMarca.setText("");
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        Nodo pop = pn.pop();
        if (pop != null) {
            atxLog.append("Pop --> " + pop.getInf() + "\n");
        } else {
            atxLog.append("Pop --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        Nodo top = pn.top();
        if (top != null) {
            atxLog.append("Top --> " + top.getInf() + "\n");
        } else {
            atxLog.append("Top --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnTopActionPerformed

    private void btnToStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToStringActionPerformed
        atxLog.append(pn.toString());
    }//GEN-LAST:event_btnToStringActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        atxLog.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFrame frmScelta = new FrameScelta();
        frmScelta.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnContaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaTipoActionPerformed
        Integer counter = 0;
        for (int i = 0; i < pn.getHead() + 1; i++) {
            if (pn.getElementi()[i].getTipo() == cmbTipo1.getSelectedItem()) {
                counter++;
            }
        }
        atxLog.append("\n" + "Il numero di tipo selezionato e': " + "\n" + counter + "\n");
    }//GEN-LAST:event_btnContaTipoActionPerformed

    private void btnSopraMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSopraMediaActionPerformed
        Double somma = 0.0, media = 0.0;
        for (int i = 0; i < pn.getHead() + 1; i++) {
            somma += pn.getElementi()[i].getCosto();
        }
        media = somma / (pn.getHead() + 1);
        atxLog.append("\n" + "Il costo Medio e': " + "\n" + media + "\n");
        Integer counter = 0;
        for (int i = 0; i < pn.getHead() + 1; i++) {
            if (pn.getElementi()[i].getCosto() > media) {
                counter++;
            }
        }
        atxLog.append("\n" + "Il Numero Di Computer Che Hanno Un Costo Sopra La Media sono: " + "\n" + counter + "\n");
    }//GEN-LAST:event_btnSopraMediaActionPerformed

    private void btnCostoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoMedioActionPerformed
        Double somma = 0.0, media = 0.0;
        for (int i = 0; i < pn.getHead() + 1; i++) {
            somma += pn.getElementi()[i].getCosto();
        }
        media = somma / (pn.getHead() + 1);
        atxLog.append("\n" + "Il costo Medio e': " + "\n" + media + "\n");
    }//GEN-LAST:event_btnCostoMedioActionPerformed

    private void btnNMedioPezziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNMedioPezziActionPerformed
        Double somma = 0.0, media = 0.0;
        for (int i = 0; i < pn.getHead() + 1; i++) {
            somma += pn.getElementi()[i].getPezziVenduti();
        }
        media = somma / (pn.getHead() + 1);
        atxLog.append("\n" + "Il Numero Medio Di Pezzi Venduti e': " + "\n" + media + "\n");
    }//GEN-LAST:event_btnNMedioPezziActionPerformed

    private void btnMenoVendutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoVendutoActionPerformed
        Nodo tmp = pn.getHead(), tmp1 = pn.getHead();
        Integer min = 999;
        while (tmp != null) {
            if (tmp.getInf().getPezziVenduti() < min) {
                min = tmp.getInf().getPezziVenduti();
                tmp1 = tmp;
            }
            tmp = tmp.getNext();
        }
        atxLog.append("\n" + "Il meno' venduto e': " + "\n" + tmp1.getInf() + "\n");
    }//GEN-LAST:event_btnMenoVendutoActionPerformed

    private void btnPiuVendutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiuVendutoActionPerformed
        Nodo tmp = pn.getHead(), tmp1 = pn.getHead();
        Integer max = 0;
        while (tmp != null) {
            if (tmp.getInf().getPezziVenduti() > max) {
                max = tmp.getInf().getPezziVenduti();
                tmp1 = tmp;
            }
            tmp = tmp.getNext();
        }
        atxLog.append("\n" + "Il piu' venduto e': " + "\n" + tmp1.getInf() + "\n");
    }//GEN-LAST:event_btnPiuVendutoActionPerformed

    private void btnMenoCostosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoCostosoActionPerformed
        Nodo tmp = pn.getHead(), tmp1 = pn.getHead();
        Integer min = 999;
        while (tmp != null) {
            if (tmp.getInf().getCosto() < min) {
                min = tmp.getInf().getCosto();
                tmp1 = tmp;
            }
            tmp = tmp.getNext();
        }
        atxLog.append("\n" + "Il meno' coatoso e': " + "\n" + tmp1.getInf() + "\n");
    }//GEN-LAST:event_btnMenoCostosoActionPerformed

    private void btnPiuCostosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiuCostosoActionPerformed
        Nodo tmp = pn.getHead(), tmp1 = pn.getHead();
        Integer max = 0;
        while (tmp != null) {
            if (tmp.getInf().getCosto() > max) {
                max = tmp.getInf().getCosto();
                tmp1 = tmp;
            }
            tmp = tmp.getNext();
        }
        atxLog.append("\n" + "Il piu' costoso e': " + "\n" + tmp1.getInf() + "\n");
    }//GEN-LAST:event_btnPiuCostosoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnContaTipo;
    private javax.swing.JButton btnCostoMedio;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPezziVenduti;
    // End of variables declaration//GEN-END:variables
}
