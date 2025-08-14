package turillolucaos;

import java.util.Random;

/**
 *
 * @author Turillo.Luca
 */
public class FramePila extends javax.swing.JFrame {

    private PilaProcesso pp;
    private Processo p;
    private Integer PID = 0;

    public FramePila() {
        initComponents();
        btnPush.setEnabled(false);
        btnSvolgi.setEnabled(false);
        btnStampa.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDim = new javax.swing.JLabel();
        txtDim = new javax.swing.JTextField();
        btnPush = new javax.swing.JButton();
        btnSvolgi = new javax.swing.JButton();
        btnStampa = new javax.swing.JButton();
        btnDim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(969, 648));
        setMinimumSize(new java.awt.Dimension(969, 648));
        setPreferredSize(new java.awt.Dimension(969, 648));
        getContentPane().setLayout(null);

        lblDim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDim.setText("Dimensione:");
        getContentPane().add(lblDim);
        lblDim.setBounds(10, 30, 110, 22);

        txtDim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtDim);
        txtDim.setBounds(130, 30, 80, 28);

        btnPush.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush);
        btnPush.setBounds(220, 100, 120, 31);

        btnSvolgi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSvolgi.setText("Svolgi");
        btnSvolgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSvolgiActionPerformed(evt);
            }
        });
        getContentPane().add(btnSvolgi);
        btnSvolgi.setBounds(220, 160, 120, 31);

        btnStampa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnStampa.setText("Stampa");
        btnStampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampaActionPerformed(evt);
            }
        });
        getContentPane().add(btnStampa);
        btnStampa.setBounds(220, 220, 120, 31);

        btnDim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDim.setText("Crea Pila");
        btnDim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDimActionPerformed(evt);
            }
        });
        getContentPane().add(btnDim);
        btnDim.setBounds(220, 30, 120, 31);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 0, 480, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDimActionPerformed
        pp = new PilaProcesso(Integer.parseInt(txtDim.getText()));
        btnDim.setEnabled(false);
        txtDim.setEnabled(false);
        btnPush.setEnabled(true);
        btnSvolgi.setEnabled(true);
        btnStampa.setEnabled(true);
    }//GEN-LAST:event_btnDimActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        Random rnd = new Random();
        p = new Processo(PID, rnd.nextInt(5) + 1);
        if (pp.push(p)) {
            atxLog.append("Processo entrato \n");
            PID++;
        } else {
            atxLog.append("Processo NON etrato \n");
        }
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnSvolgiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSvolgiActionPerformed
        if (pp.getElements()[pp.getHead()].executeExtraction()) {
            Processo pop;
            pop = pp.pop();
            if (pop != null) {
                atxLog.append("Elemento estratto: " + pop + "\n");
            } else {
                atxLog.append("Elemento non estratto \n");
            }
        }
        if (pp.isEmpty()) {
            btnSvolgi.setEnabled(false);
        }
    }//GEN-LAST:event_btnSvolgiActionPerformed

    private void btnStampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStampaActionPerformed
        atxLog.append(pp.toString());

    }//GEN-LAST:event_btnStampaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnDim;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnStampa;
    private javax.swing.JButton btnSvolgi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDim;
    private javax.swing.JTextField txtDim;
    // End of variables declaration//GEN-END:variables
}
