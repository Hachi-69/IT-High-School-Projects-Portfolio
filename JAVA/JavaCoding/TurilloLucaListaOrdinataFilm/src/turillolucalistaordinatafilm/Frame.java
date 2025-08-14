package turillolucalistaordinatafilm;

/**
 *
 * @author Turillo.Luca
 */
public class Frame extends javax.swing.JFrame {

    private final ListaOrdinata l;
    private Film f;

    public Frame() {
        initComponents();
        l = new ListaOrdinata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDurata = new javax.swing.JTextField();
        btnStampa = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        txtTitolo = new javax.swing.JTextField();
        txtAnno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(530, 585));
        setMinimumSize(new java.awt.Dimension(530, 585));
        setPreferredSize(new java.awt.Dimension(530, 585));
        getContentPane().setLayout(null);

        txtDurata.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDurata.setText("Durata");
        getContentPane().add(txtDurata);
        txtDurata.setBounds(30, 80, 100, 20);

        btnStampa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnStampa.setText("Stampa");
        getContentPane().add(btnStampa);
        btnStampa.setBounds(30, 220, 100, 23);

        btnPush.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush);
        btnPush.setBounds(30, 130, 100, 23);

        btnPop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop);
        btnPop.setBounds(30, 160, 100, 23);

        btnTop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTop.setText("Top");
        getContentPane().add(btnTop);
        btnTop.setBounds(30, 190, 100, 23);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 20, 330, 520);

        txtTitolo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTitolo.setText("Titolo");
        getContentPane().add(txtTitolo);
        txtTitolo.setBounds(30, 20, 100, 20);

        txtAnno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAnno.setText("Anno");
        getContentPane().add(txtAnno);
        txtAnno.setBounds(30, 50, 100, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        f = new Film(txtTitolo.getText(), Integer.valueOf(txtAnno.getText()), Integer.valueOf(txtDurata.getText()));
        Nodo n = new Nodo(f);
        l.pushOrdinato(n);
        atxLog.setText(l.toString());
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        f = new Film(txtTitolo.getText(), Integer.valueOf(txtAnno.getText()), Integer.valueOf(txtDurata.getText()));
        Nodo n = l.pop(f);
        if (n != null) {
            atxLog.setText(l.toString());
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
    private javax.swing.JTextField txtAnno;
    private javax.swing.JTextField txtDurata;
    private javax.swing.JTextField txtTitolo;
    // End of variables declaration//GEN-END:variables
}
