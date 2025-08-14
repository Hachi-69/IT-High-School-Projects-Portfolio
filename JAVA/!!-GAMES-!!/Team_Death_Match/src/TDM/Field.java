package TDM;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Turillo.Luca
 */
public class Field extends javax.swing.JFrame {

    public Field() {
        initComponents();
        this.setLocation(650, 250);
        lblGUI.setText("<html><font color='red'>Red: " + 5 + "</font> - <font color='blue'>Blue: " + 5 + "</font></html>");// label con due colori diversi
        this.getContentPane().setBackground(Color.white);// sfondo frame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplSuperfice = new javax.swing.JPanel();
        btnAvvia = new javax.swing.JButton();
        lblGUI = new javax.swing.JLabel();
        lblWin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Team Death Match");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(810, 526));
        setMinimumSize(new java.awt.Dimension(810, 526));
        setPreferredSize(new java.awt.Dimension(810, 526));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jplSuperfice.setBackground(new java.awt.Color(255, 255, 255));
        jplSuperfice.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jplSuperfice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jplSuperfice.setMaximumSize(new java.awt.Dimension(555, 458));
        jplSuperfice.setMinimumSize(new java.awt.Dimension(555, 458));
        jplSuperfice.setPreferredSize(new java.awt.Dimension(555, 458));

        javax.swing.GroupLayout jplSuperficeLayout = new javax.swing.GroupLayout(jplSuperfice);
        jplSuperfice.setLayout(jplSuperficeLayout);
        jplSuperficeLayout.setHorizontalGroup(
            jplSuperficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        jplSuperficeLayout.setVerticalGroup(
            jplSuperficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        getContentPane().add(jplSuperfice);
        jplSuperfice.setBounds(10, 0, 556, 459);

        btnAvvia.setBackground(new java.awt.Color(51, 51, 51));
        btnAvvia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAvvia.setForeground(new java.awt.Color(255, 255, 0));
        btnAvvia.setText("AVVIA");
        btnAvvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvviaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvvia);
        btnAvvia.setBounds(20, 460, 540, 26);

        lblGUI.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblGUI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGUI.setText("Red: 5 - Blue: 5");
        getContentPane().add(lblGUI);
        lblGUI.setBounds(600, 230, 169, 28);

        lblWin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWin.setLabelFor(this);
        lblWin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblWin);
        lblWin.setBounds(510, 260, 342, 230);
        lblWin.getAccessibleContext().setAccessibleParent(this);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/TDM.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 10, 200, 191);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvviaActionPerformed
        Integer x = 40, y = 458 - 40, wallX = 100, wallY;
        Color c = Color.blue;
        Boolean team = true;
        Player[] array = new Player[10];
        Random rnd = new Random();
        // spawn di player e muri \\
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 5; i++) {
                wallY = 210;
                wallY += rnd.nextInt(80);
                wallY -= rnd.nextInt(80);// offset muri
                // array contenente i player \\
                array[((j * 5) + (i + 1)) - 1] = new Player(jplSuperfice, x, y, c, array, team, lblGUI, lblWin, new Wall(wallX, wallY, array, jplSuperfice));
                x += 111;
                wallX += 280;
            }
            // cambio team \\
            x = 40;
            y = 20;
            c = Color.red;
            team = false;
        }

        for (Player array1 : array) {
            array1.start();// start dei thread nell'array
        }
        this.btnAvvia.setVisible(false);
    }//GEN-LAST:event_btnAvviaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("TDM.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvvia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jplSuperfice;
    private javax.swing.JLabel lblGUI;
    private javax.swing.JLabel lblWin;
    // End of variables declaration//GEN-END:variables
}
