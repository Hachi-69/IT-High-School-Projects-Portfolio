package turillolucapilainteripuntatore;

/**
 *
 * @author turillo.luca
 */
public class FrameNodoPila extends javax.swing.JFrame {

    private Pila p;

    public FrameNodoPila() {
        initComponents();
        p = new Pila();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        btnTop = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        txtPush = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(484, 430));
        setMinimumSize(new java.awt.Dimension(484, 430));
        setPreferredSize(new java.awt.Dimension(484, 430));
        getContentPane().setLayout(null);

        atxLog.setColumns(20);
        atxLog.setRows(5);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 20, 248, 360);

        btnTop.setText("TOP");
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop);
        btnTop.setBounds(20, 100, 70, 23);

        btnPush.setText("PUSH");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush);
        btnPush.setBounds(20, 40, 70, 23);

        btnPop.setText("POP");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop);
        btnPop.setBounds(20, 70, 70, 23);
        getContentPane().add(txtPush);
        txtPush.setBounds(100, 40, 70, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        Nodo pop = p.pop();
        if (pop != null) {
            atxLog.append("Pop --> " + pop.getInf() + "\n");
        } else {
            atxLog.append("Pop --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        if (!"".equals(txtPush.getText())) {
            Nodo n = new Nodo(Integer.valueOf(txtPush.getText()));
            p.push(n);
            atxLog.append("Push --> " + p.toString() + "\n");
        }
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        Nodo top = p.top();
        if (top != null) {
            atxLog.append("Top -->" + top.getInf() + "\n");
        } else {
            atxLog.append("Top --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnTopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPush;
    // End of variables declaration//GEN-END:variables
}
