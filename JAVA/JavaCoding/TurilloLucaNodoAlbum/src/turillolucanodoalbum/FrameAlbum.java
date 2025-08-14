package turillolucanodoalbum;

/**
 *
 * @author Turillo.Luca
 */
public class FrameAlbum extends javax.swing.JFrame {

    private PilaArray pa;
    private Album a, a1;
    private PilaPuntatore pp;

    public FrameAlbum() {
        initComponents();
        pp = new PilaPuntatore();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMediaDurata = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtDurata = new javax.swing.JTextField();
        btnDim = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnStampa = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        txtDim = new javax.swing.JTextField();
        lblDim = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        lblDurata = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnTop = new javax.swing.JButton();
        btnPop1 = new javax.swing.JButton();
        btnStampa1 = new javax.swing.JButton();
        btnPush1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        atxLog1 = new javax.swing.JTextArea();
        btnTop1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtTracce = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        lblNTracce = new javax.swing.JLabel();
        txtTracce1 = new javax.swing.JTextField();
        txtCosto1 = new javax.swing.JTextField();
        txtNome1 = new javax.swing.JTextField();
        txtDurata1 = new javax.swing.JTextField();
        lblDurata1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblCosto1 = new javax.swing.JLabel();
        lblNTracce1 = new javax.swing.JLabel();
        btnMediaTracce = new javax.swing.JButton();
        btnMediaDurata2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALBUM");
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        btnMediaDurata.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMediaDurata.setText("Media Durata");
        btnMediaDurata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaDurataActionPerformed(evt);
            }
        });
        getContentPane().add(btnMediaDurata);
        btnMediaDurata.setBounds(270, 120, 150, 31);

        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(120, 70, 120, 30);

        txtDurata.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtDurata);
        txtDurata.setBounds(120, 120, 120, 30);

        btnDim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDim.setText("Crea Pila");
        btnDim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDimActionPerformed(evt);
            }
        });
        getContentPane().add(btnDim);
        btnDim.setBounds(240, 30, 120, 31);

        btnPop.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop);
        btnPop.setBounds(20, 320, 120, 31);

        btnStampa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnStampa.setText("Stampa");
        btnStampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampaActionPerformed(evt);
            }
        });
        getContentPane().add(btnStampa);
        btnStampa.setBounds(180, 270, 120, 31);

        btnPush.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush);
        btnPush.setBounds(20, 270, 120, 31);

        txtDim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtDim);
        txtDim.setBounds(140, 30, 80, 28);

        lblDim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDim.setText("Dimensione:");
        getContentPane().add(lblDim);
        lblDim.setBounds(20, 30, 110, 22);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 390, 470, 250);

        lblDurata.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDurata.setText("Durata:");
        getContentPane().add(lblDurata);
        lblDurata.setBounds(20, 120, 59, 22);

        lblNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 70, 52, 22);

        btnTop.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTop.setText("Top");
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop);
        btnTop.setBounds(180, 320, 120, 31);

        btnPop1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPop1.setText("Pop");
        btnPop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPop1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop1);
        btnPop1.setBounds(520, 320, 120, 31);

        btnStampa1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnStampa1.setText("Stampa");
        btnStampa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnStampa1);
        btnStampa1.setBounds(680, 270, 120, 31);

        btnPush1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPush1.setText("Push");
        btnPush1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPush1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush1);
        btnPush1.setBounds(520, 270, 120, 31);

        atxLog1.setColumns(20);
        atxLog1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        atxLog1.setRows(5);
        atxLog1.setFocusable(false);
        jScrollPane2.setViewportView(atxLog1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(490, 390, 490, 250);

        btnTop1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTop1.setText("Top");
        btnTop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTop1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop1);
        btnTop1.setBounds(680, 320, 120, 31);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(480, 0, 2, 640);

        txtTracce.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtTracce);
        txtTracce.setBounds(120, 170, 120, 28);

        txtCosto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtCosto);
        txtCosto.setBounds(120, 220, 120, 28);

        lblCosto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCosto.setText("Costo:");
        getContentPane().add(lblCosto);
        lblCosto.setBounds(20, 220, 52, 22);

        lblNTracce.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNTracce.setText("N Tracce:");
        getContentPane().add(lblNTracce);
        lblNTracce.setBounds(20, 170, 79, 22);

        txtTracce1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtTracce1);
        txtTracce1.setBounds(620, 170, 120, 28);

        txtCosto1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtCosto1);
        txtCosto1.setBounds(620, 220, 120, 28);

        txtNome1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtNome1);
        txtNome1.setBounds(620, 70, 120, 30);

        txtDurata1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtDurata1);
        txtDurata1.setBounds(620, 120, 120, 30);

        lblDurata1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDurata1.setText("Durata:");
        getContentPane().add(lblDurata1);
        lblDurata1.setBounds(520, 130, 59, 22);

        lblNome1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNome1.setText("Nome:");
        getContentPane().add(lblNome1);
        lblNome1.setBounds(520, 80, 52, 22);

        lblCosto1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCosto1.setText("Costo:");
        getContentPane().add(lblCosto1);
        lblCosto1.setBounds(520, 230, 52, 22);

        lblNTracce1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNTracce1.setText("N Tracce:");
        getContentPane().add(lblNTracce1);
        lblNTracce1.setBounds(520, 180, 79, 22);

        btnMediaTracce.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMediaTracce.setText("Media Tracce");
        btnMediaTracce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaTracceActionPerformed(evt);
            }
        });
        getContentPane().add(btnMediaTracce);
        btnMediaTracce.setBounds(270, 170, 150, 31);

        btnMediaDurata2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMediaDurata2.setText("Media Tracce");
        btnMediaDurata2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaDurata2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMediaDurata2);
        btnMediaDurata2.setBounds(270, 220, 150, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDimActionPerformed
        pa = new PilaArray(Integer.valueOf(txtDim.getText()));
    }//GEN-LAST:event_btnDimActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        Album pop = pa.pop();
        if (pop != null) {
            atxLog.append("ESTRATTO " + "Nome: " + pop.getNome() + " Durata: " + pop.getDurata() + " Numero tracce: " + pop.getnTracce() + " Costo: " + pop.getCosto() + "\n");
        } else {
            atxLog.append("Elemento non estratto \n");
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnStampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStampaActionPerformed
        atxLog.append(pa.toString());
    }//GEN-LAST:event_btnStampaActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        a = new Album(txtNome.getText(), Integer.valueOf(txtDurata.getText()), Integer.valueOf(txtTracce.getText()), Double.valueOf(txtCosto.getText()));
        Boolean b;
        b = pa.push(a);
        if (b) {
            atxLog.append("ENTRATO " + "Nome: " + a.getNome() + " Durata: " + a.getDurata() + " Numero tracce: " + a.getnTracce() + " Costo: " + a.getCosto() + "\n");
        } else {
            atxLog.append("Processo NON etrato \n");
        }
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        String top = pa.top();
        if (pa.top() != null) {
            atxLog.append("Top -->" + pa.top() + "\n");
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
        atxLog1.append(pp.toString());
    }//GEN-LAST:event_btnStampa1ActionPerformed

    private void btnPush1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPush1ActionPerformed
        a1 = new Album(txtNome1.getText(), Integer.valueOf(txtDurata1.getText()), Integer.valueOf(txtTracce1.getText()), Double.valueOf(txtCosto1.getText()));
        if (!"".equals(txtNome1.getText()) && !"".equals(txtDurata1.getText()) && !"".equals(txtTracce1.getText()) && !"".equals(txtCosto1.getText())) {
            Nodo n = new Nodo(a1);
            pp.push(n);
            atxLog1.append("ENTRATO " + "Nome: " + a1.getNome() + " Durata: " + a1.getDurata() + " Numero tracce: " + a1.getnTracce() + " Costo: " + a1.getCosto() + "\n");
        }
    }//GEN-LAST:event_btnPush1ActionPerformed

    private void btnTop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTop1ActionPerformed
        Nodo top = pp.top();
        if (top != null) {
            atxLog1.append("Top -->" + top.getInf() + "\n");
        } else {
            atxLog1.append("Top --> NULL" + "\n");
        }
    }//GEN-LAST:event_btnTop1ActionPerformed

    private void btnMediaDurataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaDurataActionPerformed
        Double mediaD = 0.0;
        Double sommaD = 0.0;
        for (int i = 0; i < pa.getHead() + 1; i++) {
            sommaD += pa.getElements()[i].getDurata();
        }
        mediaD = sommaD / pa.getHead() + 1;
        atxLog.append("Media Durate: " + mediaD + "\n");
    }//GEN-LAST:event_btnMediaDurataActionPerformed

    private void btnMediaTracceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaTracceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMediaTracceActionPerformed

    private void btnMediaDurata2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaDurata2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMediaDurata2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JTextArea atxLog1;
    private javax.swing.JButton btnDim;
    private javax.swing.JButton btnMediaDurata;
    private javax.swing.JButton btnMediaDurata2;
    private javax.swing.JButton btnMediaTracce;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPop1;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnPush1;
    private javax.swing.JButton btnStampa;
    private javax.swing.JButton btnStampa1;
    private javax.swing.JButton btnTop;
    private javax.swing.JButton btnTop1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblCosto1;
    private javax.swing.JLabel lblDim;
    private javax.swing.JLabel lblDurata;
    private javax.swing.JLabel lblDurata1;
    private javax.swing.JLabel lblNTracce;
    private javax.swing.JLabel lblNTracce1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtCosto1;
    private javax.swing.JTextField txtDim;
    private javax.swing.JTextField txtDurata;
    private javax.swing.JTextField txtDurata1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtTracce;
    private javax.swing.JTextField txtTracce1;
    // End of variables declaration//GEN-END:variables
}
