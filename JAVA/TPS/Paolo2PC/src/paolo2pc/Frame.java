package paolo2pc;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Luca
 */
public class Frame extends javax.swing.JFrame {

    String serverAddress = "127.0.0.1";
    Integer serverPort = 333;
    DataOutputStream dataOutputStream;

    public Frame() {
        initComponents();
        startServer();
        this.atxChat.append("\n");
    }

    /**
     * Metodo per far partire il server di Paolo
     */
    public void startServer() {
        Thread SusyServer = new Thread(new PaoloServer(7777, this.atxChat));
        SusyServer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        atxChat = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMessaggioPaolo = new javax.swing.JTextField();
        txtIPpaolo = new javax.swing.JTextField();
        txtPortaPaolo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSendMessage = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(697, 800));
        setMinimumSize(new java.awt.Dimension(697, 800));
        setPreferredSize(new java.awt.Dimension(697, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        atxChat.setColumns(20);
        atxChat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        atxChat.setRows(5);
        atxChat.setText("Susy - Online\n__________________________________________________________________");
        atxChat.setFocusable(false);
        jScrollPane1.setViewportView(atxChat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 430, 550, 320);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Paolo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 50, 120, 60);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Messaggio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 240, 90, 20);

        txtMessaggioPaolo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtMessaggioPaolo);
        txtMessaggioPaolo.setBounds(270, 240, 130, 80);

        txtIPpaolo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIPpaolo.setText("127.0.0.1");
        getContentPane().add(txtIPpaolo);
        txtIPpaolo.setBounds(270, 140, 90, 23);

        txtPortaPaolo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPortaPaolo.setText("333");
        getContentPane().add(txtPortaPaolo);
        txtPortaPaolo.setBounds(270, 190, 60, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("IP:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 140, 20, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Porta:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 190, 50, 17);

        btnSendMessage.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSendMessage.setText("Send");
        btnSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessageActionPerformed(evt);
            }
        });
        getContentPane().add(btnSendMessage);
        btnSendMessage.setBounds(420, 300, 75, 24);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Porta Server: 7777");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 70, 130, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Invio del messaggio scritto nella Textbox a Susy
     *
     * @param evt
     */
    private void btnSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMessageActionPerformed
        serverAddress = this.txtIPpaolo.getText();
        serverPort = Integer.valueOf(this.txtPortaPaolo.getText());

        try {
            Socket socket = new Socket(serverAddress, serverPort);
            OutputStream outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            String message = this.txtMessaggioPaolo.getText();
            dataOutputStream.writeUTF("Paolo: " + message + "\n");
            this.atxChat.append("Tu: " + message + "\n");
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnSendMessageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxChat;
    private javax.swing.JButton btnSendMessage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIPpaolo;
    private javax.swing.JTextField txtMessaggioPaolo;
    private javax.swing.JTextField txtPortaPaolo;
    // End of variables declaration//GEN-END:variables

}
