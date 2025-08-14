package turillolucarettangolo;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    private PilaArray pa;
    private ClassRettangolo r, r1;
    private PilaPuntatore pp;

    public Frame() {
        initComponents();
        pp = new PilaPuntatore();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBase = new javax.swing.JTextField();
        txtAltezza = new javax.swing.JTextField();
        btnDim = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnStampa = new javax.swing.JButton();
        btnPush2 = new javax.swing.JButton();
        txtDim = new javax.swing.JTextField();
        lblDim = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        lblDim1 = new javax.swing.JLabel();
        lblDim2 = new javax.swing.JLabel();
        btnTop = new javax.swing.JButton();
        txtBase1 = new javax.swing.JTextField();
        txtAltezza1 = new javax.swing.JTextField();
        btnPop1 = new javax.swing.JButton();
        btnStampa1 = new javax.swing.JButton();
        btnPush3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        atxLog1 = new javax.swing.JTextArea();
        lblDim3 = new javax.swing.JLabel();
        lblDim4 = new javax.swing.JLabel();
        btnTop1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(964, 651));
        setMinimumSize(new java.awt.Dimension(964, 651));
        setPreferredSize(new java.awt.Dimension(964, 651));
        getContentPane().setLayout(null);

        txtBase.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtBase);
        txtBase.setBounds(90, 80, 120, 30);

        txtAltezza.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtAltezza);
        txtAltezza.setBounds(90, 120, 120, 30);

        btnDim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDim.setText("Crea Pila");
        btnDim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDimActionPerformed(evt);
            }
        });
        getContentPane().add(btnDim);
        btnDim.setBounds(220, 30, 120, 31);

        btnPop.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop);
        btnPop.setBounds(90, 220, 120, 31);

        btnStampa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnStampa.setText("Stampa");
        btnStampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampaActionPerformed(evt);
            }
        });
        getContentPane().add(btnStampa);
        btnStampa.setBounds(90, 270, 120, 31);

        btnPush2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPush2.setText("Push");
        btnPush2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPush2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush2);
        btnPush2.setBounds(90, 170, 120, 31);

        txtDim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtDim);
        txtDim.setBounds(130, 30, 80, 28);

        lblDim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDim.setText("Dimensione:");
        getContentPane().add(lblDim);
        lblDim.setBounds(10, 30, 110, 22);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 360, 450, 250);

        lblDim1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDim1.setText("Altezza:");
        getContentPane().add(lblDim1);
        lblDim1.setBounds(20, 130, 61, 22);

        lblDim2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDim2.setText("Base:");
        getContentPane().add(lblDim2);
        lblDim2.setBounds(20, 80, 46, 22);

        btnTop.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTop.setText("Top");
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop);
        btnTop.setBounds(90, 320, 120, 31);

        txtBase1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtBase1);
        txtBase1.setBounds(590, 80, 120, 30);

        txtAltezza1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtAltezza1);
        txtAltezza1.setBounds(590, 120, 120, 30);

        btnPop1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPop1.setText("Pop");
        btnPop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPop1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop1);
        btnPop1.setBounds(590, 220, 120, 31);

        btnStampa1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnStampa1.setText("Stampa");
        btnStampa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnStampa1);
        btnStampa1.setBounds(590, 270, 120, 31);

        btnPush3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPush3.setText("Push");
        btnPush3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPush3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush3);
        btnPush3.setBounds(590, 170, 120, 31);

        atxLog1.setColumns(20);
        atxLog1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        atxLog1.setRows(5);
        atxLog1.setFocusable(false);
        jScrollPane2.setViewportView(atxLog1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(510, 360, 430, 250);

        lblDim3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDim3.setText("Altezza:");
        getContentPane().add(lblDim3);
        lblDim3.setBounds(520, 130, 61, 22);

        lblDim4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDim4.setText("Base:");
        getContentPane().add(lblDim4);
        lblDim4.setBounds(520, 80, 46, 22);

        btnTop1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTop1.setText("Top");
        btnTop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTop1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop1);
        btnTop1.setBounds(590, 320, 120, 31);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(480, 0, 2, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDimActionPerformed
        pa = new PilaArray(Integer.valueOf(txtDim.getText()));
    }//GEN-LAST:event_btnDimActionPerformed

    private void btnStampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStampaActionPerformed
        atxLog.append(pa.toString());
    }//GEN-LAST:event_btnStampaActionPerformed

    private void btnPush2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPush2ActionPerformed
        r = new ClassRettangolo(Integer.valueOf(txtBase.getText()), Integer.valueOf(txtAltezza.getText()));
        if (pa.push(r)) {
            atxLog.append("ENTRATO " + "Altezza: " + r.getAltezza() + " Base: " + r.getBase() + " Perimetro: " + r.getPerimetro() + " Area: " + r.getArea() + "\n");
        } else {
            atxLog.append("Processo NON etrato \n");
        }
    }//GEN-LAST:event_btnPush2ActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        ClassRettangolo pop = pa.pop();
        if (pop != null) {
            atxLog.append("ESTRATTO " + "Altezza: " + pop.getAltezza() + " Base: " + pop.getBase() + " Perimetro: " + pop.getPerimetro() + " Area: " + pop.getArea() + "\n");
        } else {
            atxLog.append("Elemento non estratto \n");
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        Nodo top = pp.top();
        if (top != null) {
            atxLog.append("Top -->" + top.getInf() + "\n");
        } else {
            atxLog.append("Top --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnTopActionPerformed

    private void btnPop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPop1ActionPerformed
        Nodo pop = pp.pop();
        if (pop != null) {
            atxLog1.append("Pop --> " + pop.getInf() + "\n");
        } else {
            atxLog1.append("Pop --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnPop1ActionPerformed

    private void btnStampa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStampa1ActionPerformed
        atxLog.append(pp.toString());
    }//GEN-LAST:event_btnStampa1ActionPerformed

    private void btnPush3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPush3ActionPerformed
        r1 = new ClassRettangolo(Integer.valueOf(txtBase1.getText()), Integer.valueOf(txtAltezza1.getText()));
        if (!"".equals(txtBase1.getText()) && !"".equals(txtAltezza1.getText())) {
            Nodo n = new Nodo(r1);
            pp.push(n);
            atxLog1.append("Push --> " + pp.toString() + "\n");
        }
    }//GEN-LAST:event_btnPush3ActionPerformed

    private void btnTop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTop1ActionPerformed
        Nodo top = pp.top();
        if (top != null) {
            atxLog1.append("Top -->" + top.getInf() + "\n");
        } else {
            atxLog1.append("Top --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnTop1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JTextArea atxLog1;
    private javax.swing.JButton btnDim;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPop1;
    private javax.swing.JButton btnPush2;
    private javax.swing.JButton btnPush3;
    private javax.swing.JButton btnStampa;
    private javax.swing.JButton btnStampa1;
    private javax.swing.JButton btnTop;
    private javax.swing.JButton btnTop1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDim;
    private javax.swing.JLabel lblDim1;
    private javax.swing.JLabel lblDim2;
    private javax.swing.JLabel lblDim3;
    private javax.swing.JLabel lblDim4;
    private javax.swing.JTextField txtAltezza;
    private javax.swing.JTextField txtAltezza1;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtBase1;
    private javax.swing.JTextField txtDim;
    // End of variables declaration//GEN-END:variables
}
