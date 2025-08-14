package turillolucaos;

/**
 *
 * @author Turillo.Luca
 */
public class FrameScegli extends javax.swing.JFrame {

    public FrameScegli() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPila = new javax.swing.JButton();
        btnCoda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(539, 246));
        setMinimumSize(new java.awt.Dimension(539, 246));
        setPreferredSize(new java.awt.Dimension(539, 246));
        getContentPane().setLayout(null);

        btnPila.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnPila.setText("PILA");
        btnPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPila);
        btnPila.setBounds(290, 0, 200, 200);

        btnCoda.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnCoda.setText("CODA");
        btnCoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCoda);
        btnCoda.setBounds(0, 0, 200, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodaActionPerformed
        FrameCoda frmC = new FrameCoda();
        frmC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCodaActionPerformed

    private void btnPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilaActionPerformed
        FramePila frmP = new FramePila();
        frmP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPilaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoda;
    private javax.swing.JButton btnPila;
    // End of variables declaration//GEN-END:variables
}
