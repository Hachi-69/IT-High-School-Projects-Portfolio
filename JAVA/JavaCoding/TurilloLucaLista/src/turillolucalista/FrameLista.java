package turillolucalista;

/**
 *
 * @author Turillo.Luca
 */
public class FrameLista extends javax.swing.JFrame {

    private ListaNodo ln;

    public FrameLista() {
        initComponents();
        ln = new ListaNodo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPushPos = new javax.swing.JButton();
        txtPush = new javax.swing.JTextField();
        txtPosPush = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        btnToString = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPosPop = new javax.swing.JTextField();
        btnPopPos = new javax.swing.JButton();
        btnPushTesta = new javax.swing.JButton();
        btnPushCoda = new javax.swing.JButton();
        txtPushTesta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPushCoda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPopTesta = new javax.swing.JButton();
        btnPopCoda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        btnPushPos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPushPos.setText("Push Pos");
        btnPushPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushPosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPushPos);
        btnPushPos.setBounds(120, 80, 100, 30);

        txtPush.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtPush);
        txtPush.setBounds(30, 110, 80, 30);

        txtPosPush.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtPosPush);
        txtPosPush.setBounds(30, 50, 80, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Pos:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 30, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Intero:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 50, 17);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        atxLog.setRows(5);
        atxLog.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        atxLog.setEnabled(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 30, 460, 520);

        btnToString.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnToString.setText("toString");
        btnToString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToStringActionPerformed(evt);
            }
        });
        getContentPane().add(btnToString);
        btnToString.setBounds(221, 30, 90, 25);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Pos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 340, 30, 17);

        txtPosPop.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtPosPop);
        txtPosPop.setBounds(30, 360, 80, 30);

        btnPopPos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPopPos.setText("Pop Pos");
        btnPopPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopPosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPopPos);
        btnPopPos.setBounds(130, 360, 100, 30);

        btnPushTesta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPushTesta.setText(" Push Testa");
        btnPushTesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushTestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPushTesta);
        btnPushTesta.setBounds(120, 200, 120, 30);

        btnPushCoda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPushCoda.setText("Push Coda");
        btnPushCoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushCodaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPushCoda);
        btnPushCoda.setBounds(120, 270, 120, 30);

        txtPushTesta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtPushTesta);
        txtPushTesta.setBounds(30, 200, 80, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Intero:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 180, 50, 17);

        txtPushCoda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtPushCoda);
        txtPushCoda.setBounds(30, 270, 80, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Intero:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 250, 50, 17);

        btnPopTesta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPopTesta.setText("Pop Testa");
        btnPopTesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopTestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPopTesta);
        btnPopTesta.setBounds(130, 400, 100, 30);

        btnPopCoda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPopCoda.setText("Pop Coda");
        btnPopCoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopCodaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPopCoda);
        btnPopCoda.setBounds(130, 440, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushPosActionPerformed
        try {
            Nodo n = new Nodo(Integer.valueOf(txtPush.getText()));
            Integer c = ln.length();
            if (Integer.valueOf(txtPosPush.getText()) >= c) {
                ln.pushCoda(n);
            } else if (Integer.parseInt(txtPosPush.getText()) <= 0) {
                ln.pushTesta(n);
            } else {
                ln.pushPos(n, Integer.valueOf(txtPosPush.getText()));
            }
            atxLog.append("Elemento aggiunto" + "\n");
        } catch (NumberFormatException e) {
            atxLog.append("valore non valido" + "\n");
        }

    }//GEN-LAST:event_btnPushPosActionPerformed

    private void btnToStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToStringActionPerformed
        atxLog.append(ln.toString());
    }//GEN-LAST:event_btnToStringActionPerformed

    private void btnPopPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopPosActionPerformed
        try {
            Integer c = ln.length();
            if (Integer.parseInt(txtPosPop.getText()) <= 0) {
                ln.popTesta();
            } else if (Integer.valueOf(txtPosPop.getText()) >= c) {
                ln.popCoda();
            } else {
                ln.popPos(Integer.valueOf(txtPosPop.getText()));
            }
            atxLog.append("Elemento eliminato" + "\n");
        } catch (NumberFormatException e) {
            atxLog.append("valore non valido" + "\n");
        }

    }//GEN-LAST:event_btnPopPosActionPerformed

    private void btnPushTestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushTestaActionPerformed
        try {
            Nodo n = new Nodo(Integer.valueOf(txtPushTesta.getText()));
            ln.pushTesta(n);
            atxLog.append("Elemento aggiunto" + "\n");
        } catch (NumberFormatException e) {
            atxLog.append("valore non valido" + "\n");
        }
    }//GEN-LAST:event_btnPushTestaActionPerformed

    private void btnPushCodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushCodaActionPerformed
        try {
            Nodo n = new Nodo(Integer.valueOf(txtPushCoda.getText()));
            ln.pushCoda(n);
            atxLog.append("Elemento aggiunto" + "\n");
        } catch (NumberFormatException e) {
            atxLog.append("valore non valido" + "\n");
        }
    }//GEN-LAST:event_btnPushCodaActionPerformed

    private void btnPopTestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopTestaActionPerformed
        if (ln.popTesta() != null) {
            atxLog.append("Elemento eliminato " + "\n");
        } else {
            atxLog.append("valore non valido" + "\n");
        }
    }//GEN-LAST:event_btnPopTestaActionPerformed

    private void btnPopCodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopCodaActionPerformed
        if (ln.popCoda() != null) {
            atxLog.append("Elemento eliminato " + "\n");
        } else {
            atxLog.append("valore non valido" + "\n");
        }
    }//GEN-LAST:event_btnPopCodaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnPopCoda;
    private javax.swing.JButton btnPopPos;
    private javax.swing.JButton btnPopTesta;
    private javax.swing.JButton btnPushCoda;
    private javax.swing.JButton btnPushPos;
    private javax.swing.JButton btnPushTesta;
    private javax.swing.JButton btnToString;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPosPop;
    private javax.swing.JTextField txtPosPush;
    private javax.swing.JTextField txtPush;
    private javax.swing.JTextField txtPushCoda;
    private javax.swing.JTextField txtPushTesta;
    // End of variables declaration//GEN-END:variables
}
