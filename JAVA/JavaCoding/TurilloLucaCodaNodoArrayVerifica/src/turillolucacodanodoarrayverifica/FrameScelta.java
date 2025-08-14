package turillolucacodanodoarrayverifica;

import javax.swing.JFrame;

/**
 *
 * @author Turillo.Luca
 */
public class FrameScelta extends javax.swing.JFrame {

    public FrameScelta() {
        initComponents();
        this.setLocation(750, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnArray = new javax.swing.JButton();
        btnPunt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scelta Coda");
        setResizable(false);

        btnArray.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnArray.setText("CODA ARRAY");
        btnArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArrayActionPerformed(evt);
            }
        });

        btnPunt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPunt.setText("CODA PUNTATORI");
        btnPunt.setActionCommand("PILA\nPUNTATORI");
        btnPunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnPunt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnArray, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnArray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPunt, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntActionPerformed
        JFrame frmPilaPuntatori = new FrameCodaPuntatori();
        frmPilaPuntatori.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPuntActionPerformed

    private void btnArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArrayActionPerformed
        JFrame frmPila = new FrameCodaArray();
        frmPila.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnArrayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArray;
    private javax.swing.JButton btnPunt;
    // End of variables declaration//GEN-END:variables
}
