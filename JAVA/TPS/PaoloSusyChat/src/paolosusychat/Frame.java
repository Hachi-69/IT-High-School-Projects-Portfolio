package paolosusychat;

import java.util.Random;

/**
 *
 * @author Luca
 */
public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
        chat();
    }

    public void chat() {
        Random random = new Random();
        int cPort = random.nextInt(9998) + 1;
        int sPort = random.nextInt(9998) + 1;
        Thread Paolo = new Thread(new Paolo(cPort, sPort));
        Thread Susy = new Thread(new Susy(cPort, sPort));
        Susy.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        Paolo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        atxChat = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMessaggioSusy = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMessaggioPaolo = new javax.swing.JTextField();
        txtIPpaolo = new javax.swing.JTextField();
        txtPortaPaolo = new javax.swing.JTextField();
        txtIPsusy = new javax.swing.JTextField();
        txtPortaSusy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1273, 833));
        setMinimumSize(new java.awt.Dimension(1273, 833));
        setPreferredSize(new java.awt.Dimension(1273, 833));
        getContentPane().setLayout(null);

        atxChat.setColumns(20);
        atxChat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        atxChat.setRows(5);
        jScrollPane1.setViewportView(atxChat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 410, 550, 320);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Susy");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(860, 20, 100, 60);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Paolo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 30, 120, 60);

        txtMessaggioSusy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtMessaggioSusy);
        txtMessaggioSusy.setBounds(930, 220, 130, 80);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Messaggio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(830, 220, 80, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Messaggio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 220, 80, 20);

        txtMessaggioPaolo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtMessaggioPaolo);
        txtMessaggioPaolo.setBounds(300, 220, 130, 80);

        txtIPpaolo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtIPpaolo);
        txtIPpaolo.setBounds(300, 120, 90, 23);

        txtPortaPaolo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtPortaPaolo);
        txtPortaPaolo.setBounds(300, 170, 60, 23);

        txtIPsusy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtIPsusy);
        txtIPsusy.setBounds(930, 120, 90, 23);

        txtPortaSusy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtPortaSusy);
        txtPortaSusy.setBounds(930, 170, 60, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("IP:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 130, 34, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Porta:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 170, 40, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("IP:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(860, 130, 34, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Porta:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(860, 170, 40, 17);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 220, 75, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        chat();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxChat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIPpaolo;
    private javax.swing.JTextField txtIPsusy;
    private javax.swing.JTextField txtMessaggioPaolo;
    private javax.swing.JTextField txtMessaggioSusy;
    private javax.swing.JTextField txtPortaPaolo;
    private javax.swing.JTextField txtPortaSusy;
    // End of variables declaration//GEN-END:variables

}
