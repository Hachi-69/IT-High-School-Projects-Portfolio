package turillolucalistaordinata;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    private ListaOrdinata l;

    public Frame() {
        initComponents();
        l = new ListaOrdinata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPos = new javax.swing.JTextField();
        btnStampa = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        txtPop = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);
        getContentPane().add(txtPos);
        txtPos.setBounds(270, 160, 90, 20);

        btnStampa.setText("Stampa");
        getContentPane().add(btnStampa);
        btnStampa.setBounds(140, 250, 100, 23);

        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush);
        btnPush.setBounds(140, 160, 100, 23);

        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop);
        btnPop.setBounds(140, 190, 100, 23);

        btnTop.setText("Top");
        getContentPane().add(btnTop);
        btnTop.setBounds(140, 220, 100, 23);

        atxLog.setColumns(20);
        atxLog.setRows(5);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 40, 330, 520);
        getContentPane().add(txtPop);
        txtPop.setBounds(270, 190, 90, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        Nodo n = new Nodo(Integer.parseInt(txtPos.getText()));
        l.pushOrdinato(n);
        atxLog.setText(l.toString());
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        Nodo n = l.pop(Integer.valueOf(txtPop.getText()));
        if (n != null) {
            atxLog.append("Estratto: " + n.toString() + "\n");
        } else {
            atxLog.append("Nodo non presente" + "\n");
        }
    }//GEN-LAST:event_btnPopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnStampa;
    private javax.swing.JButton btnTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPop;
    private javax.swing.JTextField txtPos;
    // End of variables declaration//GEN-END:variables
}
