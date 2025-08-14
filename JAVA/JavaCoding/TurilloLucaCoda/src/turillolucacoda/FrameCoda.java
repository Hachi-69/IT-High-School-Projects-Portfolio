package turillolucacoda;

/**
 *
 * @author turillo.luca
 */
public class FrameCoda extends javax.swing.JFrame {

    private Coda c;

    public FrameCoda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDimensione = new javax.swing.JLabel();
        txtDimensione = new javax.swing.JTextField();
        btnDimensione = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        btnIsEmpty = new javax.swing.JButton();
        txtPush = new javax.swing.JTextField();
        btnIsFull = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(719, 553));
        setPreferredSize(new java.awt.Dimension(719, 553));
        getContentPane().setLayout(null);

        lblDimensione.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblDimensione.setText("Dimensione:");
        getContentPane().add(lblDimensione);
        lblDimensione.setBounds(10, 10, 100, 20);

        txtDimensione.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtDimensione.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDimensioneKeyReleased(evt);
            }
        });
        getContentPane().add(txtDimensione);
        txtDimensione.setBounds(10, 40, 90, 29);

        btnDimensione.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnDimensione.setText("Dimensione");
        btnDimensione.setEnabled(false);
        btnDimensione.setFocusable(false);
        btnDimensione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDimensioneActionPerformed(evt);
            }
        });
        getContentPane().add(btnDimensione);
        btnDimensione.setBounds(210, 30, 120, 40);

        btnPush.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnPush.setText("Push");
        btnPush.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPush.setEnabled(false);
        btnPush.setFocusable(false);
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush);
        btnPush.setBounds(220, 140, 100, 31);

        btnPop.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnPop.setText("Pop");
        btnPop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPop.setEnabled(false);
        btnPop.setFocusable(false);
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop);
        btnPop.setBounds(220, 180, 100, 31);

        btnTop.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnTop.setText("Top");
        btnTop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTop.setEnabled(false);
        btnTop.setFocusable(false);
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop);
        btnTop.setBounds(220, 220, 100, 31);

        btnIsEmpty.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnIsEmpty.setText("Is empty");
        btnIsEmpty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIsEmpty.setEnabled(false);
        btnIsEmpty.setFocusable(false);
        btnIsEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsEmptyActionPerformed(evt);
            }
        });
        getContentPane().add(btnIsEmpty);
        btnIsEmpty.setBounds(220, 260, 100, 31);

        txtPush.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtPush.setFocusable(false);
        txtPush.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPushKeyReleased(evt);
            }
        });
        getContentPane().add(txtPush);
        txtPush.setBounds(99, 140, 80, 29);

        btnIsFull.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnIsFull.setText("Is full");
        btnIsFull.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIsFull.setEnabled(false);
        btnIsFull.setFocusable(false);
        btnIsFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsFullActionPerformed(evt);
            }
        });
        getContentPane().add(btnIsFull);
        btnIsFull.setBounds(220, 300, 100, 31);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 10, 300, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDimensioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDimensioneActionPerformed
        txtDimensione.setVisible(false);
        lblDimensione.setVisible(false);
        btnDimensione.setVisible(false);
        txtPush.setFocusable(true);
        btnPop.setEnabled(true);
        btnTop.setEnabled(true);
        btnIsEmpty.setEnabled(true);
        btnIsFull.setEnabled(true);
        Integer dimensione = Integer.parseInt(txtDimensione.getText());
        c = new Coda(dimensione);
        atxLog.append("Lunghezza array: " + dimensione + "\n");
    }//GEN-LAST:event_btnDimensioneActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        Boolean push;
        push = c.push(Integer.valueOf(txtPush.getText()));
        if (push) {
            atxLog.append("Elemento inserito \n");
        } else {
            atxLog.append("Elemento non iserito \n");
        }
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        Integer pop;
        pop = c.pop();
        if (pop != null) {
            atxLog.append("Elemento estratto: " + pop + "\n");
        } else {
            atxLog.append("Elemento non estratto \n");
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        Integer top;
        top = c.top();
        if (top != null) {
            atxLog.append("Head: " + top + "\n");
        } else {
            atxLog.append("Aray vuoto \n");
        }
    }//GEN-LAST:event_btnTopActionPerformed

    private void btnIsEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsEmptyActionPerformed
        Boolean isEmpty;
        isEmpty = c.isEmpty();
        if (isEmpty) {
            atxLog.append("Array vuoto \n");
        } else {
            atxLog.append("Array NON vuoto \n");
        }
    }//GEN-LAST:event_btnIsEmptyActionPerformed

    private void btnIsFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsFullActionPerformed
        Boolean isFull;
        isFull = c.isFull();
        if (isFull) {
            atxLog.append("Array pieno \n");
        } else {
            atxLog.append("Array NON pieno \n");
        }
    }//GEN-LAST:event_btnIsFullActionPerformed

    private void txtDimensioneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDimensioneKeyReleased
        if (!"".equals(txtDimensione.getText()) && tryParse(txtDimensione.getText(), 0)) {
            if (Integer.parseInt(txtDimensione.getText()) > 0) {
                btnDimensione.setEnabled(true);
            }
        } else {
            btnDimensione.setEnabled(false);
        }
    }//GEN-LAST:event_txtDimensioneKeyReleased

    private void txtPushKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPushKeyReleased
        if (!"".equals(txtPush.getText()) && tryParse(txtPush.getText(), 0)) {
            if (Integer.parseInt(txtPush.getText()) > 0) {
                btnPush.setEnabled(true);
            }
        } else {
            btnPush.setEnabled(false);
        }
    }//GEN-LAST:event_txtPushKeyReleased

    public Boolean tryParse(String x, Integer y) {
        Boolean z = false;
        try {

            y = Integer.valueOf(x);
            z = true;

        } catch (NumberFormatException e) {
        }
        return z;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnDimensione;
    private javax.swing.JButton btnIsEmpty;
    private javax.swing.JButton btnIsFull;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDimensione;
    private javax.swing.JTextField txtDimensione;
    private javax.swing.JTextField txtPush;
    // End of variables declaration//GEN-END:variables
}
