package turillolucaverificawaitnotify;

/**
 *
 * @author turillo.luca
 */
public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Turillo Luca Verifica Wait & Notify");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(850, 800));
        setMinimumSize(new java.awt.Dimension(850, 800));
        setPreferredSize(new java.awt.Dimension(850, 800));
        getContentPane().setLayout(null);

        btnStart.setBackground(new java.awt.Color(255, 96, 96));
        btnStart.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("START");
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnStart.setInheritsPopupMenu(true);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart);
        btnStart.setBounds(60, 300, 140, 140);

        atxLog.setBackground(new java.awt.Color(177, 255, 236));
        atxLog.setColumns(20);
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(266, 10, 560, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        btnStart.setEnabled(false);
        Palco p = new Palco(atxLog);
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Atleta(p));
            t.start();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnStart;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
