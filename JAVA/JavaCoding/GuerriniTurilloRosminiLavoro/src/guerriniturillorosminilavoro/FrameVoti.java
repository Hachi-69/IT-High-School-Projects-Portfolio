package guerriniturillorosminilavoro;

import java.awt.Color;

public class FrameVoti extends javax.swing.JFrame {

    private Integer inf;
    private Integer ing;
    private Integer sto;
    private Integer ita;
    private Integer tps;
    private Integer tlc;
    private Integer comp;
    private Integer sist;
    private Integer edF;
    private Integer edC;
    private Integer mat;
    private Integer rel;
    private Integer riga;
    private String nome;
    Boolean fine = false;
    Integer[][] matriceVoti = new Integer[14][12];

    public FrameVoti() {
        initComponents();
        this.setLocation(650, 150);
        btnRiempi.setVisible(false);
        txtInf.setText("");
        txtIng.setText("");
        txtTlc.setText("");
        txtTps.setText("");
        txtStoria.setText("");
        txtSistemi.setText("");
        txtIta.setText("");
        txtCivica.setText("");
        txtMat.setText("");
        txtRel.setText("");
        txtGinnastica.setText("");
        txtComp.setText("");
    }

    public FrameVoti(Integer riga, String nome, Integer[][] matriceVoti) {
        initComponents();
        this.setLocation(650, 150);
        this.riga = riga;
        this.nome = nome;
        btnRiempi.setVisible(false);
        txtInf.setText("");
        txtIng.setText("");
        txtTlc.setText("");
        txtTps.setText("");
        txtStoria.setText("");
        txtSistemi.setText("");
        txtIta.setText("");
        txtCivica.setText("");
        txtMat.setText("");
        txtRel.setText("");
        txtGinnastica.setText("");
        txtComp.setText("");
        lblNome.setText(this.nome);
        this.matriceVoti = matriceVoti;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStoria = new javax.swing.JTextField();
        txtInf = new javax.swing.JTextField();
        txtIta = new javax.swing.JTextField();
        txtIng = new javax.swing.JTextField();
        txtGinnastica = new javax.swing.JTextField();
        txtSistemi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtComp = new javax.swing.JTextField();
        txtTps = new javax.swing.JTextField();
        txtTlc = new javax.swing.JTextField();
        txtMat = new javax.swing.JTextField();
        txtCivica = new javax.swing.JTextField();
        txtRel = new javax.swing.JTextField();
        btnRiempi = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(290, 520));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("ITALIANO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 88, 170, 20);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("INFORMATICA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 58, 170, 20);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("EDUCAZIONE FISICA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 148, 170, 20);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("INGLESE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 118, 170, 20);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("STORIA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 208, 170, 20);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("SISTEMI E RETI");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 178, 170, 20);

        txtStoria.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtStoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtStoria);
        txtStoria.setBounds(210, 210, 30, 20);

        txtInf.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtInf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtInf);
        txtInf.setBounds(210, 60, 30, 20);

        txtIta.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtIta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtIta);
        txtIta.setBounds(210, 90, 30, 20);

        txtIng.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtIng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtIng);
        txtIng.setBounds(210, 120, 30, 20);

        txtGinnastica.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtGinnastica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtGinnastica);
        txtGinnastica.setBounds(210, 150, 30, 20);

        txtSistemi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtSistemi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtSistemi);
        txtSistemi.setBounds(210, 180, 30, 20);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("TELECOMUNICAZIONI");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 268, 170, 20);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("TPS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 238, 170, 20);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setText("EDUCAZIONE CIVICA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 328, 170, 20);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel10.setText("MATEMATICA");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 298, 170, 20);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel11.setText("COMPORTAMENTO");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 388, 170, 20);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel12.setText("RELIGIONE");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 358, 140, 20);

        txtComp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtComp);
        txtComp.setBounds(210, 390, 30, 20);

        txtTps.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtTps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtTps);
        txtTps.setBounds(210, 240, 30, 20);

        txtTlc.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtTlc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtTlc);
        txtTlc.setBounds(210, 270, 30, 20);

        txtMat.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtMat);
        txtMat.setBounds(210, 300, 30, 20);

        txtCivica.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtCivica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtCivica);
        txtCivica.setBounds(210, 330, 30, 20);

        txtRel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtRel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controllo(evt);
            }
        });
        getContentPane().add(txtRel);
        txtRel.setBounds(210, 360, 30, 20);

        btnRiempi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRiempi.setText("RIEMPI");
        btnRiempi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRiempi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiempiActionPerformed(evt);
            }
        });
        getContentPane().add(btnRiempi);
        btnRiempi.setBounds(20, 430, 220, 25);

        lblNome.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblNome.setText(" ");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 20, 170, 21);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRiempiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiempiActionPerformed
        inf = Integer.parseInt(txtInf.getText());
        ing = Integer.parseInt(txtIng.getText());
        sto = Integer.parseInt(txtStoria.getText());
        ita = Integer.parseInt(txtIta.getText());
        tps = Integer.parseInt(txtTps.getText());
        tlc = Integer.parseInt(txtTlc.getText());
        comp = Integer.parseInt(txtComp.getText());
        sist = Integer.parseInt(txtSistemi.getText());
        edF = Integer.parseInt(txtGinnastica.getText());
        edC = Integer.parseInt(txtCivica.getText());
        mat = Integer.parseInt(txtMat.getText());
        rel = Integer.parseInt(txtRel.getText());
        FrameClasse fC = new FrameClasse(inf, ing, sto, ita, tps, tlc, comp, sist, edF, edC, mat, rel, riga, matriceVoti);
        fC.setVisible(true);
        fC.setSize(800, 600);
        matriceVoti[riga][0] = inf;
        matriceVoti[riga][1] = ing;
        matriceVoti[riga][2] = sto;
        matriceVoti[riga][3] = ita;
        matriceVoti[riga][4] = tps;
        matriceVoti[riga][5] = tlc;
        matriceVoti[riga][6] = comp;
        matriceVoti[riga][7] = sist;
        matriceVoti[riga][8] = edF;
        matriceVoti[riga][9] = edC;
        matriceVoti[riga][10] = mat;
        matriceVoti[riga][11] = rel;
        this.dispose();
    }//GEN-LAST:event_btnRiempiActionPerformed

    private void controllo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_controllo
        fine = false;
        btnRiempi.setVisible(false);
        if (!"".equals(txtIng.getText()) && !"".equals(txtInf.getText()) && !"".equals(txtStoria.getText()) && !"".equals(txtIta.getText()) && !"".equals(txtTps.getText()) && !"".equals(txtTlc.getText()) && !"".equals(txtComp.getText()) && !"".equals(txtSistemi.getText()) && !"".equals(txtMat.getText()) && !"".equals(txtCivica.getText()) && !"".equals(txtGinnastica.getText()) && !"".equals(txtRel.getText())) {
            if (tryParse(txtIng.getText(), 0) && tryParse(txtInf.getText(), 0) && tryParse(txtStoria.getText(), 0) && tryParse(txtIta.getText(), 0) && tryParse(txtTps.getText(), 0) && tryParse(txtTlc.getText(), 0) && tryParse(txtComp.getText(), 0) && tryParse(txtSistemi.getText(), 0) && tryParse(txtMat.getText(), 0) && tryParse(txtCivica.getText(), 0) && tryParse(txtGinnastica.getText(), 0) && tryParse(txtRel.getText(), 0)) {
                inf = Integer.parseInt(txtInf.getText());
                ing = Integer.parseInt(txtIng.getText());
                sto = Integer.parseInt(txtStoria.getText());
                ita = Integer.parseInt(txtIta.getText());
                tps = Integer.parseInt(txtTps.getText());
                tlc = Integer.parseInt(txtTlc.getText());
                comp = Integer.parseInt(txtComp.getText());
                sist = Integer.parseInt(txtSistemi.getText());
                edF = Integer.parseInt(txtGinnastica.getText());
                edC = Integer.parseInt(txtCivica.getText());
                mat = Integer.parseInt(txtMat.getText());
                rel = Integer.parseInt(txtRel.getText());
                System.out.println("entrato");
                if (inf >= 1 && inf <= 10) {
                    if (ing >= 1 && ing <= 10) {
                        if (sto >= 1 && sto <= 10) {
                            if (ita >= 1 && ita <= 10) {
                                if (tps >= 1 && tps <= 10) {
                                    if (tlc >= 1 && tlc <= 10) {
                                        if (comp >= 1 && comp <= 10) {
                                            if (sist >= 1 && sist <= 10) {
                                                if (edC >= 1 && edC <= 10) {
                                                    if (edF >= 1 && edF <= 10) {
                                                        if (mat >= 1 && mat <= 10) {
                                                            if (rel >= 1 && rel <= 10) {
                                                                fine = true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (inf < 1 || inf > 10) {
                    txtInf.setBackground(Color.red);
                } else {
                    txtInf.setBackground(Color.white);
                }
                if (ing < 1 || ing > 10) {
                    txtIng.setBackground(Color.red);
                } else {
                    txtIng.setBackground(Color.white);
                }
                if (sto < 1 || sto > 10) {
                    txtStoria.setBackground(Color.red);
                } else {
                    txtStoria.setBackground(Color.white);
                }
                if (ita < 1 || ita > 10) {
                    txtIta.setBackground(Color.red);
                } else {
                    txtIta.setBackground(Color.white);
                }
                if (tps < 1 || tps > 10) {
                    txtTps.setBackground(Color.red);
                } else {
                    txtTps.setBackground(Color.white);
                }
                if (tlc < 1 || tlc > 10) {
                    txtTlc.setBackground(Color.red);
                } else {
                    txtTlc.setBackground(Color.white);
                }
                if (comp < 1 || comp > 10) {
                    txtComp.setBackground(Color.red);
                } else {
                    txtComp.setBackground(Color.white);
                }
                if (sist < 1 || sist > 10) {
                    txtSistemi.setBackground(Color.red);
                } else {
                    txtSistemi.setBackground(Color.white);
                }
                if (edF < 1 || edF > 10) {
                    txtGinnastica.setBackground(Color.red);
                } else {
                    txtGinnastica.setBackground(Color.white);
                }
                if (edC < 1 || edC > 10) {
                    txtCivica.setBackground(Color.red);
                } else {
                    txtCivica.setBackground(Color.white);
                }
                if (mat < 1 || mat > 10) {
                    txtMat.setBackground(Color.red);
                } else {
                    txtMat.setBackground(Color.white);
                }
                if (rel < 1 || rel > 10 || !tryParse(String.valueOf(rel), 0)) {
                    txtRel.setBackground(Color.red);
                } else {
                    txtRel.setBackground(Color.white);
                }

                if (fine) {
                    btnRiempi.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_controllo

    @SuppressWarnings("empty-statement")
    public Boolean tryParse(String a, Integer b) {
        Boolean c = false;
        try {

            b = Integer.valueOf(a);
            c = true;

        } catch (NumberFormatException e) {
        }
;
        return c;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRiempi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtCivica;
    private javax.swing.JTextField txtComp;
    private javax.swing.JTextField txtGinnastica;
    private javax.swing.JTextField txtInf;
    private javax.swing.JTextField txtIng;
    private javax.swing.JTextField txtIta;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtRel;
    private javax.swing.JTextField txtSistemi;
    private javax.swing.JTextField txtStoria;
    private javax.swing.JTextField txtTlc;
    private javax.swing.JTextField txtTps;
    // End of variables declaration//GEN-END:variables
}
