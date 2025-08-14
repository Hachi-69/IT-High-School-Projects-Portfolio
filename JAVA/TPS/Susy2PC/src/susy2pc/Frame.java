package susy2pc;

import java.io.*;
import java.net.*;

/**
 *
 * @author Luca
 */
public class Frame extends javax.swing.JFrame {

    String serverAddress = "127.0.0.1";
    Integer serverPort = 7777;
    DataOutputStream dataOutputStream;

    public Frame() {
        initComponents();
        startServer();
        this.atxChat.append("\n");
    }

    /**
     * Metodo per far partire il server di Susy
     */
    public void startServer() {
        Thread SusyServer = new Thread(new SusyServer(333, this.atxChat));
        SusyServer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        atxChat = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtMessaggioSusy = new javax.swing.JTextField();
        txtIPSusy = new javax.swing.JTextField();
        txtPortaSusy = new javax.swing.JTextField();
        btnSendMessage = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(697, 800));
        setMinimumSize(new java.awt.Dimension(697, 800));
        setPreferredSize(new java.awt.Dimension(697, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        atxChat.setColumns(20);
        atxChat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        atxChat.setRows(5);
        atxChat.setText("Paolo  - Online\n__________________________________________________________________");
        atxChat.setFocusable(false);
        jScrollPane1.setViewportView(atxChat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 430, 550, 320);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Susy");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 50, 120, 60);

        txtMessaggioSusy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMessaggioSusy.setMaximumSize(new java.awt.Dimension(64, 23));
        getContentPane().add(txtMessaggioSusy);
        txtMessaggioSusy.setBounds(250, 240, 130, 80);

        txtIPSusy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIPSusy.setText("127.0.0.1");
        getContentPane().add(txtIPSusy);
        txtIPSusy.setBounds(250, 140, 90, 23);

        txtPortaSusy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPortaSusy.setText("7777");
        getContentPane().add(txtPortaSusy);
        txtPortaSusy.setBounds(250, 190, 60, 23);

        btnSendMessage.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSendMessage.setText("Send");
        btnSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessageActionPerformed(evt);
            }
        });
        getContentPane().add(btnSendMessage);
        btnSendMessage.setBounds(400, 300, 75, 24);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Porta Server: 333");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 70, 130, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Messaggio:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 240, 90, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("IP:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 140, 40, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Porta:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(170, 190, 50, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Invio del messaggio scritto nella Textbox a Paolo
     *
     * @param evt
     */
    private void btnSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMessageActionPerformed
        serverAddress = this.txtIPSusy.getText();
        serverPort = Integer.valueOf(this.txtPortaSusy.getText());

        try {
            Socket socket = new Socket(serverAddress, serverPort);
            OutputStream outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            String message = this.txtMessaggioSusy.getText();
            dataOutputStream.writeUTF("Susy: " + message + "\n");
            this.atxChat.append("Tu: " + message + "\n");
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnSendMessageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxChat;
    private javax.swing.JButton btnSendMessage;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIPSusy;
    private javax.swing.JTextField txtMessaggioSusy;
    private javax.swing.JTextField txtPortaSusy;
    // End of variables declaration//GEN-END:variables

}
