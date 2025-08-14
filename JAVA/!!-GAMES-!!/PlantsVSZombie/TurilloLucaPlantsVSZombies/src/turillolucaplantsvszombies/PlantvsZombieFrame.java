package turillolucaplantsvszombies;

import java.awt.Cursor;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

/**
 *
 * @author Turillo.Luca
 */
public class PlantvsZombieFrame extends javax.swing.JFrame {

    private Boolean canRemove, canStart;
    private Integer sun, plantSpawn;
    private JLabel[] imgZombie, position;
    private JLabel[][] place;
    private Plant[] plant;

    public PlantvsZombieFrame() {
        initComponents();
        this.setLocation(400, 100);
        LOGO.setVisible(false);
        pnl.setVisible(false);
        lblSun.setText("500");
        sun = 500;
        plantSpawn = 1;
        canRemove = false;
        canStart = true;
        imgZombie = new JLabel[5];
        place = new JLabel[5][6];
        plant = new Plant[5];
        lblPeaShooterNotEnoughSun.setVisible(false);
        lblPeaShooter.setVisible(false);
        lblSunFlower.setVisible(false);
        lblCherryBomb.setVisible(false);
        lblWallNut.setVisible(false);
        lblPotatoMine.setVisible(false);
        lblSnowPea.setVisible(false);
        lblOpenMenu.setVisible(false);
        lblRP.setVisible(false);
        imgMenuPlantBright1.setVisible(false);
        imgMenuPlantBright2.setVisible(false);
        imgMenuPlantBright3.setVisible(false);
        imgMenuPlantBright4.setVisible(false);
        imgMenuPlantBright5.setVisible(false);
        plant[0] = new Plant(imgPlant1, imgProjectile1);
        plant[1] = new Plant(imgPlant2, imgProjectile2);
        plant[2] = new Plant(imgPlant3, imgProjectile3);
        plant[3] = new Plant(imgPlant4, imgProjectile4);
        plant[4] = new Plant(imgPlant5, imgProjectile5);
        plant[0].setImgPlant(imgPlant1);
        plant[1].setImgPlant(imgPlant2);
        plant[2].setImgPlant(imgPlant3);
        plant[3].setImgPlant(imgPlant4);
        plant[4].setImgPlant(imgPlant5);
        plant[0].setImgProjectile(imgProjectile1);
        plant[1].setImgProjectile(imgProjectile2);
        plant[2].setImgProjectile(imgProjectile3);
        plant[3].setImgProjectile(imgProjectile4);
        plant[4].setImgProjectile(imgProjectile5);
        position = new JLabel[5];
        position[0] = position1;
        position[1] = position2;
        position[2] = position3;
        position[3] = position4;
        position[4] = position5;
        for (int i = 0; i < 5; i++) {
            plant[i].getImgPlant().setVisible(false);
            plant[i].getImgProjectile().setVisible(false);
            position[i].setVisible(false);
        }
        imgZombie[0] = imgZombie1;
        imgZombie[1] = imgZombie2;
        imgZombie[2] = imgZombie3;
        imgZombie[3] = imgZombie4;
        imgZombie[4] = imgZombie5;
        imgPopupMenu.setVisible(false);
        place[0][0] = Place00;
        place[0][1] = Place01;
        place[0][2] = Place02;
        place[0][3] = Place03;
        place[0][4] = Place04;
        place[0][5] = Place05;
        place[1][0] = Place10;
        place[1][1] = Place11;
        place[1][2] = Place12;
        place[1][3] = Place13;
        place[1][4] = Place14;
        place[1][5] = Place15;
        place[2][0] = Place20;
        place[2][1] = Place21;
        place[2][2] = Place22;
        place[2][3] = Place23;
        place[2][4] = Place24;
        place[2][5] = Place25;
        place[3][0] = Place30;
        place[3][1] = Place31;
        place[3][2] = Place32;
        place[3][3] = Place33;
        place[3][4] = Place34;
        place[3][5] = Place35;
        place[4][0] = Place40;
        place[4][1] = Place41;
        place[4][2] = Place42;
        place[4][3] = Place43;
        place[4][4] = Place44;
        place[4][5] = Place45;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                place[i][j].setVisible(false);
            }
        }
        imgStartHover.setVisible(false);
        lblZombiesNames.setVisible(false);
        /* musica */
        try {
            AudioInputStream musiCaudio = AudioSystem.getAudioInputStream(new File("music.wav"));
            Clip musicClip = AudioSystem.getClip();
            musicClip.open(musiCaudio);
            musicClip.loop(5);
            musicClip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        P = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        SS = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        T1 = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        T2 = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        imgPopupMenu = new javax.swing.JLabel();
        imgStartHover = new javax.swing.JLabel();
        imgStart = new javax.swing.JLabel();
        lblZombiesNames = new javax.swing.JLabel();
        position1 = new javax.swing.JLabel();
        position2 = new javax.swing.JLabel();
        position3 = new javax.swing.JLabel();
        position4 = new javax.swing.JLabel();
        position5 = new javax.swing.JLabel();
        Place00 = new javax.swing.JLabel();
        Place01 = new javax.swing.JLabel();
        Place02 = new javax.swing.JLabel();
        Place10 = new javax.swing.JLabel();
        Place11 = new javax.swing.JLabel();
        Place12 = new javax.swing.JLabel();
        Place20 = new javax.swing.JLabel();
        Place21 = new javax.swing.JLabel();
        Place22 = new javax.swing.JLabel();
        Place30 = new javax.swing.JLabel();
        Place31 = new javax.swing.JLabel();
        Place32 = new javax.swing.JLabel();
        Place40 = new javax.swing.JLabel();
        Place41 = new javax.swing.JLabel();
        Place42 = new javax.swing.JLabel();
        Place03 = new javax.swing.JLabel();
        Place04 = new javax.swing.JLabel();
        Place05 = new javax.swing.JLabel();
        Place13 = new javax.swing.JLabel();
        Place14 = new javax.swing.JLabel();
        Place15 = new javax.swing.JLabel();
        Place23 = new javax.swing.JLabel();
        Place24 = new javax.swing.JLabel();
        Place25 = new javax.swing.JLabel();
        Place33 = new javax.swing.JLabel();
        Place34 = new javax.swing.JLabel();
        Place35 = new javax.swing.JLabel();
        Place43 = new javax.swing.JLabel();
        Place44 = new javax.swing.JLabel();
        Place45 = new javax.swing.JLabel();
        imgBtnMenu = new javax.swing.JLabel();
        lblOpenMenu = new javax.swing.JLabel();
        lblRP = new javax.swing.JLabel();
        lblSnowPea = new javax.swing.JLabel();
        lblPotatoMine = new javax.swing.JLabel();
        lblWallNut = new javax.swing.JLabel();
        lblCherryBomb = new javax.swing.JLabel();
        lblSunFlower = new javax.swing.JLabel();
        lblPeaShooter = new javax.swing.JLabel();
        lblPeaShooterNotEnoughSun = new javax.swing.JLabel();
        imgZombie5 = new javax.swing.JLabel();
        imgZombie4 = new javax.swing.JLabel();
        imgZombie3 = new javax.swing.JLabel();
        imgZombie2 = new javax.swing.JLabel();
        imgZombie1 = new javax.swing.JLabel();
        imgPlant1 = new javax.swing.JLabel();
        imgPlant2 = new javax.swing.JLabel();
        imgPlant3 = new javax.swing.JLabel();
        imgPlant4 = new javax.swing.JLabel();
        imgPlant5 = new javax.swing.JLabel();
        imgProjectile1 = new javax.swing.JLabel();
        imgProjectile2 = new javax.swing.JLabel();
        imgProjectile3 = new javax.swing.JLabel();
        imgProjectile4 = new javax.swing.JLabel();
        imgProjectile5 = new javax.swing.JLabel();
        lblSun = new javax.swing.JLabel();
        imgMenuPlantBright = new javax.swing.JLabel();
        imgMenuPlantBright1 = new javax.swing.JLabel();
        imgMenuPlantBright2 = new javax.swing.JLabel();
        imgMenuPlantBright3 = new javax.swing.JLabel();
        imgMenuPlantBright4 = new javax.swing.JLabel();
        imgMenuPlantBright5 = new javax.swing.JLabel();
        imgMenuShovel = new javax.swing.JLabel();
        imgMenuPlant6 = new javax.swing.JLabel();
        imgMenuPlant5 = new javax.swing.JLabel();
        imgMenuPlant4 = new javax.swing.JLabel();
        imgMenuPlant3 = new javax.swing.JLabel();
        imgMenuPlant2 = new javax.swing.JLabel();
        imgMenuPlant1 = new javax.swing.JLabel();
        imgMenu = new javax.swing.JLabel();
        imgRedLine = new javax.swing.JLabel();
        imgField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plants VS Zombies");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 255, 51));
        setMinimumSize(new java.awt.Dimension(1092, 845));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        pnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl.setOpaque(false);
        pnl.setLayout(null);

        P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/P.png"))); // NOI18N
        pnl.add(P);
        P.setBounds(10, 10, 29, 51);

        R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/R.png"))); // NOI18N
        pnl.add(R);
        R.setBounds(40, 10, 29, 51);

        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/E.png"))); // NOI18N
        pnl.add(E);
        E.setBounds(70, 10, 29, 55);

        SS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/SS.png"))); // NOI18N
        pnl.add(SS);
        SS.setBounds(100, 10, 54, 52);

        F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/F.png"))); // NOI18N
        pnl.add(F);
        F.setBounds(190, 10, 28, 56);

        F6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/6.png"))); // NOI18N
        pnl.add(F6);
        F6.setBounds(220, 10, 29, 56);

        T.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/T.png"))); // NOI18N
        pnl.add(T);
        T.setBounds(290, 10, 28, 52);

        O.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/O.png"))); // NOI18N
        pnl.add(O);
        O.setBounds(320, 10, 29, 52);

        S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/SS.png"))); // NOI18N
        pnl.add(S);
        S.setBounds(380, 10, 28, 52);

        T1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/T.png"))); // NOI18N
        pnl.add(T1);
        T1.setBounds(410, 10, 28, 52);

        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/A.png"))); // NOI18N
        pnl.add(A);
        A.setBounds(440, 10, 30, 55);

        R1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/R.png"))); // NOI18N
        pnl.add(R1);
        R1.setBounds(470, 10, 29, 51);

        T2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/T.png"))); // NOI18N
        pnl.add(T2);
        T2.setBounds(500, 10, 28, 52);

        getContentPane().add(pnl);
        pnl.setBounds(230, 700, 540, 70);

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/LOGO.png"))); // NOI18N
        getContentPane().add(LOGO);
        LOGO.setBounds(-180, -100, 1290, 920);

        imgPopupMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPopupMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/popupMenu.png"))); // NOI18N
        imgPopupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPopupMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPopupMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgPopupMenuMouseExited(evt);
            }
        });
        getContentPane().add(imgPopupMenu);
        imgPopupMenu.setBounds(0, 0, 1090, 820);

        imgStartHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/startHover.png"))); // NOI18N
        imgStartHover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgStartHoverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgStartHoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgStartHoverMouseExited(evt);
            }
        });
        getContentPane().add(imgStartHover);
        imgStartHover.setBounds(660, 700, 423, 113);
        imgStartHover.getAccessibleContext().setAccessibleName("");

        imgStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/start.png"))); // NOI18N
        imgStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgStartMouseEntered(evt);
            }
        });
        getContentPane().add(imgStart);
        imgStart.setBounds(660, 700, 423, 113);

        lblZombiesNames.setBackground(new java.awt.Color(248, 247, 203));
        lblZombiesNames.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblZombiesNames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblZombiesNames.setText("Zombie Name:");
        lblZombiesNames.setOpaque(true);
        getContentPane().add(lblZombiesNames);
        lblZombiesNames.setBounds(730, 10, 40, 17);

        position1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/1.png"))); // NOI18N
        getContentPane().add(position1);
        position1.setBounds(280, 120, 65, 112);

        position2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/2.png"))); // NOI18N
        getContentPane().add(position2);
        position2.setBounds(280, 250, 70, 113);

        position3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/3.png"))); // NOI18N
        getContentPane().add(position3);
        position3.setBounds(280, 380, 75, 113);

        position4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/4.png"))); // NOI18N
        getContentPane().add(position4);
        position4.setBounds(280, 510, 77, 112);

        position5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/5.png"))); // NOI18N
        getContentPane().add(position5);
        position5.setBounds(270, 650, 74, 113);

        Place00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place00MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place00MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place00MouseExited(evt);
            }
        });
        getContentPane().add(Place00);
        Place00.setBounds(50, 130, 110, 110);

        Place01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place01MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place01MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place01MouseExited(evt);
            }
        });
        getContentPane().add(Place01);
        Place01.setBounds(160, 130, 90, 110);

        Place02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place02MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place02MouseExited(evt);
            }
        });
        getContentPane().add(Place02);
        Place02.setBounds(250, 130, 120, 110);

        Place10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place10MouseExited(evt);
            }
        });
        getContentPane().add(Place10);
        Place10.setBounds(50, 240, 110, 130);

        Place11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place11MouseExited(evt);
            }
        });
        getContentPane().add(Place11);
        Place11.setBounds(160, 240, 90, 130);

        Place12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place12MouseExited(evt);
            }
        });
        getContentPane().add(Place12);
        Place12.setBounds(250, 240, 120, 130);

        Place20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place20MouseExited(evt);
            }
        });
        getContentPane().add(Place20);
        Place20.setBounds(50, 370, 110, 130);

        Place21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place21MouseExited(evt);
            }
        });
        getContentPane().add(Place21);
        Place21.setBounds(160, 370, 90, 140);

        Place22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place22MouseExited(evt);
            }
        });
        getContentPane().add(Place22);
        Place22.setBounds(250, 370, 120, 140);

        Place30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place30MouseExited(evt);
            }
        });
        getContentPane().add(Place30);
        Place30.setBounds(50, 500, 110, 140);

        Place31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place31MouseExited(evt);
            }
        });
        getContentPane().add(Place31);
        Place31.setBounds(160, 510, 90, 130);

        Place32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place32MouseExited(evt);
            }
        });
        getContentPane().add(Place32);
        Place32.setBounds(250, 510, 120, 130);

        Place40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place40MouseExited(evt);
            }
        });
        getContentPane().add(Place40);
        Place40.setBounds(30, 640, 130, 130);

        Place41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place41MouseExited(evt);
            }
        });
        getContentPane().add(Place41);
        Place41.setBounds(160, 640, 100, 130);

        Place42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place42MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place42MouseExited(evt);
            }
        });
        getContentPane().add(Place42);
        Place42.setBounds(260, 640, 120, 130);

        Place03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place03MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place03MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place03MouseExited(evt);
            }
        });
        getContentPane().add(Place03);
        Place03.setBounds(370, 130, 110, 110);

        Place04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place04MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place04MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place04MouseExited(evt);
            }
        });
        getContentPane().add(Place04);
        Place04.setBounds(480, 130, 110, 110);

        Place05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place05MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place05MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place05MouseExited(evt);
            }
        });
        getContentPane().add(Place05);
        Place05.setBounds(590, 130, 110, 110);

        Place13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place13MouseExited(evt);
            }
        });
        getContentPane().add(Place13);
        Place13.setBounds(370, 240, 110, 130);

        Place14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place14MouseExited(evt);
            }
        });
        getContentPane().add(Place14);
        Place14.setBounds(480, 240, 100, 130);

        Place15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place15MouseExited(evt);
            }
        });
        getContentPane().add(Place15);
        Place15.setBounds(580, 240, 120, 130);

        Place23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place23MouseExited(evt);
            }
        });
        getContentPane().add(Place23);
        Place23.setBounds(370, 370, 110, 150);

        Place24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place24MouseExited(evt);
            }
        });
        getContentPane().add(Place24);
        Place24.setBounds(480, 370, 100, 150);

        Place25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place25MouseExited(evt);
            }
        });
        getContentPane().add(Place25);
        Place25.setBounds(580, 370, 120, 150);

        Place33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place33MouseExited(evt);
            }
        });
        getContentPane().add(Place33);
        Place33.setBounds(370, 520, 110, 120);

        Place34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place34MouseExited(evt);
            }
        });
        getContentPane().add(Place34);
        Place34.setBounds(480, 520, 110, 110);

        Place35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place35MouseExited(evt);
            }
        });
        getContentPane().add(Place35);
        Place35.setBounds(590, 520, 110, 120);

        Place43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place43MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place43MouseExited(evt);
            }
        });
        getContentPane().add(Place43);
        Place43.setBounds(380, 640, 100, 130);

        Place44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place44MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place44MouseExited(evt);
            }
        });
        getContentPane().add(Place44);
        Place44.setBounds(480, 630, 110, 140);

        Place45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/PlantPosition.png"))); // NOI18N
        Place45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place45MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place45MouseExited(evt);
            }
        });
        getContentPane().add(Place45);
        Place45.setBounds(590, 640, 110, 130);

        imgBtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/btnMenu.png"))); // NOI18N
        imgBtnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBtnMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgBtnMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgBtnMenuMouseExited(evt);
            }
        });
        getContentPane().add(imgBtnMenu);
        imgBtnMenu.setBounds(920, 0, 152, 40);

        lblOpenMenu.setBackground(new java.awt.Color(248, 247, 203));
        lblOpenMenu.setText("Open menu");
        lblOpenMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblOpenMenu.setOpaque(true);
        getContentPane().add(lblOpenMenu);
        lblOpenMenu.setBounds(960, 40, 70, 18);

        lblRP.setBackground(new java.awt.Color(248, 247, 203));
        lblRP.setText("Remove a Plant");
        lblRP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRP.setOpaque(true);
        getContentPane().add(lblRP);
        lblRP.setBounds(620, 100, 100, 18);

        lblSnowPea.setBackground(new java.awt.Color(248, 247, 203));
        lblSnowPea.setText("Snow Pea");
        lblSnowPea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSnowPea.setOpaque(true);
        getContentPane().add(lblSnowPea);
        lblSnowPea.setBounds(530, 110, 60, 18);

        lblPotatoMine.setBackground(new java.awt.Color(248, 247, 203));
        lblPotatoMine.setText("Potato Mine");
        lblPotatoMine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPotatoMine.setOpaque(true);
        getContentPane().add(lblPotatoMine);
        lblPotatoMine.setBounds(445, 110, 70, 18);

        lblWallNut.setBackground(new java.awt.Color(248, 247, 203));
        lblWallNut.setText("Wall-Nut");
        lblWallNut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblWallNut.setOpaque(true);
        getContentPane().add(lblWallNut);
        lblWallNut.setBounds(372, 110, 50, 18);

        lblCherryBomb.setBackground(new java.awt.Color(248, 247, 203));
        lblCherryBomb.setText("Cherry Bomb");
        lblCherryBomb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCherryBomb.setOpaque(true);
        getContentPane().add(lblCherryBomb);
        lblCherryBomb.setBounds(279, 110, 80, 18);

        lblSunFlower.setBackground(new java.awt.Color(248, 247, 203));
        lblSunFlower.setText("Sunflower");
        lblSunFlower.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSunFlower.setOpaque(true);
        getContentPane().add(lblSunFlower);
        lblSunFlower.setBounds(205, 110, 60, 18);

        lblPeaShooter.setBackground(new java.awt.Color(248, 247, 203));
        lblPeaShooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeaShooter.setText("Peashooter");
        lblPeaShooter.setOpaque(true);
        getContentPane().add(lblPeaShooter);
        lblPeaShooter.setBounds(111, 110, 84, 16);

        lblPeaShooterNotEnoughSun.setBackground(new java.awt.Color(248, 247, 203));
        lblPeaShooterNotEnoughSun.setForeground(new java.awt.Color(255, 0, 0));
        lblPeaShooterNotEnoughSun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeaShooterNotEnoughSun.setText("<HTML> <center>not enough sun<br>Peashooter </center> </HTML>");
        lblPeaShooterNotEnoughSun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPeaShooterNotEnoughSun.setOpaque(true);
        getContentPane().add(lblPeaShooterNotEnoughSun);
        lblPeaShooterNotEnoughSun.setBounds(110, 88, 90, 45);

        imgZombie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/zombie4.gif"))); // NOI18N
        imgZombie5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgZombie5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgZombie5MouseExited(evt);
            }
        });
        getContentPane().add(imgZombie5);
        imgZombie5.setBounds(1090, 600, 154, 160);

        imgZombie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/zombie3.gif"))); // NOI18N
        imgZombie4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgZombie4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgZombie4MouseExited(evt);
            }
        });
        getContentPane().add(imgZombie4);
        imgZombie4.setBounds(1090, 480, 100, 160);

        imgZombie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/zombie12.gif"))); // NOI18N
        imgZombie3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgZombie3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgZombie3MouseExited(evt);
            }
        });
        getContentPane().add(imgZombie3);
        imgZombie3.setBounds(1090, 340, 100, 160);

        imgZombie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/zombie2.gif"))); // NOI18N
        imgZombie2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgZombie2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgZombie2MouseExited(evt);
            }
        });
        getContentPane().add(imgZombie2);
        imgZombie2.setBounds(1090, 190, 90, 180);

        imgZombie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/zombie1.gif"))); // NOI18N
        imgZombie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgZombie1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgZombie1MouseExited(evt);
            }
        });
        getContentPane().add(imgZombie1);
        imgZombie1.setBounds(1090, 80, 100, 150);

        imgPlant1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/plant1.gif"))); // NOI18N
        imgPlant1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPlant1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPlant1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgPlant1MouseExited(evt);
            }
        });
        getContentPane().add(imgPlant1);
        imgPlant1.setBounds(110, 110, 100, 120);

        imgPlant2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/Plant13.gif"))); // NOI18N
        imgPlant2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPlant2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPlant2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgPlant2MouseExited(evt);
            }
        });
        getContentPane().add(imgPlant2);
        imgPlant2.setBounds(110, 230, 100, 120);

        imgPlant3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/Plant12.gif"))); // NOI18N
        imgPlant3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPlant3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPlant3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgPlant3MouseExited(evt);
            }
        });
        getContentPane().add(imgPlant3);
        imgPlant3.setBounds(110, 360, 100, 120);

        imgPlant4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/Plant14.gif"))); // NOI18N
        imgPlant4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPlant4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPlant4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgPlant4MouseExited(evt);
            }
        });
        getContentPane().add(imgPlant4);
        imgPlant4.setBounds(110, 490, 100, 120);

        imgPlant5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/Plant11.gif"))); // NOI18N
        imgPlant5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPlant5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPlant5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgPlant5MouseExited(evt);
            }
        });
        getContentPane().add(imgPlant5);
        imgPlant5.setBounds(110, 630, 100, 120);

        imgProjectile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/projectile1.png"))); // NOI18N
        getContentPane().add(imgProjectile1);
        imgProjectile1.setBounds(140, 140, 30, 30);

        imgProjectile2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/projectile1.png"))); // NOI18N
        getContentPane().add(imgProjectile2);
        imgProjectile2.setBounds(140, 260, 30, 30);

        imgProjectile3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/projectile1.png"))); // NOI18N
        getContentPane().add(imgProjectile3);
        imgProjectile3.setBounds(140, 390, 30, 30);

        imgProjectile4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/projectile1.png"))); // NOI18N
        getContentPane().add(imgProjectile4);
        imgProjectile4.setBounds(140, 520, 30, 30);

        imgProjectile5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/projectile1.png"))); // NOI18N
        getContentPane().add(imgProjectile5);
        imgProjectile5.setBounds(140, 660, 30, 30);

        lblSun.setBackground(new java.awt.Color(252, 255, 195));
        lblSun.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        lblSun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSun.setText("500");
        getContentPane().add(lblSun);
        lblSun.setBounds(5, 87, 100, 37);

        imgMenuPlantBright.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlalantBright1.png"))); // NOI18N
        imgMenuPlantBright.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMenuPlantBrightMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMenuPlantBrightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMenuPlantBrightMouseExited(evt);
            }
        });
        getContentPane().add(imgMenuPlantBright);
        imgMenuPlantBright.setBounds(117, 11, 69, 97);

        imgMenuPlantBright1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlalantBright2.png"))); // NOI18N
        getContentPane().add(imgMenuPlantBright1);
        imgMenuPlantBright1.setBounds(200, 11, 69, 97);

        imgMenuPlantBright2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlalantBright3.png"))); // NOI18N
        getContentPane().add(imgMenuPlantBright2);
        imgMenuPlantBright2.setBounds(282, 11, 69, 97);

        imgMenuPlantBright3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlalantBright4.png"))); // NOI18N
        getContentPane().add(imgMenuPlantBright3);
        imgMenuPlantBright3.setBounds(364, 11, 69, 97);

        imgMenuPlantBright4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlalantBright5.png"))); // NOI18N
        getContentPane().add(imgMenuPlantBright4);
        imgMenuPlantBright4.setBounds(445, 10, 69, 97);

        imgMenuPlantBright5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlalantBright6.png"))); // NOI18N
        getContentPane().add(imgMenuPlantBright5);
        imgMenuPlantBright5.setBounds(528, 11, 69, 97);

        imgMenuShovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuShovel.png"))); // NOI18N
        imgMenuShovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMenuShovelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMenuShovelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMenuShovelMouseExited(evt);
            }
        });
        getContentPane().add(imgMenuShovel);
        imgMenuShovel.setBounds(618, 0, 98, 99);

        imgMenuPlant6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlant6.png"))); // NOI18N
        imgMenuPlant6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMenuPlant6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMenuPlant6MouseExited(evt);
            }
        });
        getContentPane().add(imgMenuPlant6);
        imgMenuPlant6.setBounds(528, 10, 69, 97);

        imgMenuPlant5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlant5.png"))); // NOI18N
        imgMenuPlant5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMenuPlant5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMenuPlant5MouseExited(evt);
            }
        });
        getContentPane().add(imgMenuPlant5);
        imgMenuPlant5.setBounds(445, 10, 69, 97);

        imgMenuPlant4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlant4.png"))); // NOI18N
        imgMenuPlant4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMenuPlant4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMenuPlant4MouseExited(evt);
            }
        });
        getContentPane().add(imgMenuPlant4);
        imgMenuPlant4.setBounds(364, 11, 69, 97);

        imgMenuPlant3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlant3.png"))); // NOI18N
        imgMenuPlant3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMenuPlant3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMenuPlant3MouseExited(evt);
            }
        });
        getContentPane().add(imgMenuPlant3);
        imgMenuPlant3.setBounds(282, 11, 69, 97);

        imgMenuPlant2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlant2.png"))); // NOI18N
        imgMenuPlant2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMenuPlant2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMenuPlant2MouseExited(evt);
            }
        });
        getContentPane().add(imgMenuPlant2);
        imgMenuPlant2.setBounds(200, 11, 69, 97);

        imgMenuPlant1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menuPlant1.png"))); // NOI18N
        imgMenuPlant1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMenuPlant1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMenuPlant1MouseExited(evt);
            }
        });
        getContentPane().add(imgMenuPlant1);
        imgMenuPlant1.setBounds(117, 11, 69, 97);

        imgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/menu.png"))); // NOI18N
        getContentPane().add(imgMenu);
        imgMenu.setBounds(0, 0, 716, 121);

        imgRedLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/RedLine.png"))); // NOI18N
        getContentPane().add(imgRedLine);
        imgRedLine.setBounds(690, 100, 27, 677);

        imgField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turillolucaplantsvszombies/Field.png"))); // NOI18N
        imgField.setText("Zombie1");
        imgField.setMaximumSize(new java.awt.Dimension(1080, 811));
        imgField.setMinimumSize(new java.awt.Dimension(1080, 811));
        imgField.setPreferredSize(new java.awt.Dimension(1080, 811));
        getContentPane().add(imgField);
        imgField.setBounds(0, 0, 1080, 811);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //COMPARSA E SCOMPARSA LABEL NOMI PIANTE\\
    private void imgMenuPlant1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant1MouseEntered
        lblPeaShooter.setVisible(true);
    }//GEN-LAST:event_imgMenuPlant1MouseEntered

    private void imgMenuPlant1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant1MouseExited
        lblPeaShooter.setVisible(false);
    }//GEN-LAST:event_imgMenuPlant1MouseExited

    private void imgMenuPlant2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant2MouseEntered
        lblSunFlower.setVisible(true);
    }//GEN-LAST:event_imgMenuPlant2MouseEntered

    private void imgMenuPlant2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant2MouseExited
        lblSunFlower.setVisible(false);
    }//GEN-LAST:event_imgMenuPlant2MouseExited

    private void imgMenuPlant3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant3MouseEntered
        lblCherryBomb.setVisible(true);
    }//GEN-LAST:event_imgMenuPlant3MouseEntered

    private void imgMenuPlant3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant3MouseExited
        lblCherryBomb.setVisible(false);
    }//GEN-LAST:event_imgMenuPlant3MouseExited

    private void imgMenuPlant4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant4MouseEntered
        lblWallNut.setVisible(true);
    }//GEN-LAST:event_imgMenuPlant4MouseEntered

    private void imgMenuPlant4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant4MouseExited
        lblWallNut.setVisible(false);
    }//GEN-LAST:event_imgMenuPlant4MouseExited

    private void imgMenuPlant5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant5MouseEntered
        lblPotatoMine.setVisible(true);
    }//GEN-LAST:event_imgMenuPlant5MouseEntered

    private void imgMenuPlant5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant5MouseExited
        lblPotatoMine.setVisible(false);
    }//GEN-LAST:event_imgMenuPlant5MouseExited

    private void imgMenuPlant6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant6MouseEntered
        lblSnowPea.setVisible(true);    }//GEN-LAST:event_imgMenuPlant6MouseEntered

    private void imgMenuPlant6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlant6MouseExited
        lblSnowPea.setVisible(false);    }//GEN-LAST:event_imgMenuPlant6MouseExited
    ////\\\\

    //PIANTA SELEZIONATA\\
    private void imgMenuPlantBrightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlantBrightMouseClicked
        if (sun > 0) {
            imgMenuPlantBright.setVisible(false);
            imgMenuShovel.setVisible(false);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    place[i][j].setVisible(true);// POSIZIONI NEL CAMPO DELLA PIANTA
                }
            }
            canStart = false;
            /* SFX */
            try {
                AudioInputStream plantGrabSFXaudio = AudioSystem.getAudioInputStream(new File("plantGrabSFX.wav"));
                Clip plantGrabSFXclip = AudioSystem.getClip();
                plantGrabSFXclip.open(plantGrabSFXaudio);
                plantGrabSFXclip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            }
        }
    }//GEN-LAST:event_imgMenuPlantBrightMouseClicked

    private void imgMenuPlantBrightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlantBrightMouseEntered
        /* MODIFICA CURSORE */
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblPeaShooter.setVisible(true);
        if (sun <= 0) {
            lblPeaShooterNotEnoughSun.setVisible(true); // SUN NON SUFFICENTI
        }
    }//GEN-LAST:event_imgMenuPlantBrightMouseEntered

    private void imgMenuPlantBrightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuPlantBrightMouseExited
        /* MODIFICA CURSORE */
        this.setCursor(Cursor.getDefaultCursor());
        lblPeaShooter.setVisible(false);
        lblPeaShooterNotEnoughSun.setVisible(false);
    }//GEN-LAST:event_imgMenuPlantBrightMouseExited

    //PALA PER RIMOZIONE PIANTE SELEZIONATA\\
    private void imgMenuShovelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuShovelMouseClicked
        if (sun < 500) {
            imgMenuPlantBright.setVisible(false);
            canRemove = true;
            canStart = false;
            /* SFX */
            try {
                AudioInputStream shovelGrabSFXaudio = AudioSystem.getAudioInputStream(new File("shovelGrabSFX.wav"));
                Clip shovelGrabSFXclip = AudioSystem.getClip();
                shovelGrabSFXclip.open(shovelGrabSFXaudio);
                shovelGrabSFXclip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            }
        }
    }//GEN-LAST:event_imgMenuShovelMouseClicked

    //APERTURA MENU'\\
    private void imgBtnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBtnMenuMouseClicked
        imgPopupMenu.setVisible(true);
        /* VARIABILE GLOBALE PER STOPPARE IL GIOCO SE IL MENU' E' APERTO */
        Main.setMenuOpen(true);
        /* SFX */
        try {
            AudioInputStream menuOpenedSFXaudio = AudioSystem.getAudioInputStream(new File("menuOpenedSFX.wav"));
            Clip menuOpenedSFXclip = AudioSystem.getClip();
            menuOpenedSFXclip.open(menuOpenedSFXaudio);
            menuOpenedSFXclip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
        }
    }//GEN-LAST:event_imgBtnMenuMouseClicked

    private void imgPopupMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPopupMenuMouseClicked
        imgPopupMenu.setVisible(false);
        Main.setMenuOpen(false);// RIPRESA DEL GIOCO
        /* MODIFICA CURSORE */
        this.setCursor(Cursor.getDefaultCursor());
        /* SFX */
        try {
            AudioInputStream menuClosedSFXaudio = AudioSystem.getAudioInputStream(new File("menuClosedSFX.wav"));
            Clip menuClosedSFXclip = AudioSystem.getClip();
            menuClosedSFXclip.open(menuClosedSFXaudio);
            menuClosedSFXclip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
        }
    }//GEN-LAST:event_imgPopupMenuMouseClicked

    private void imgBtnMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBtnMenuMouseEntered
        lblOpenMenu.setVisible(true);
        /* MODIFICA CURSORE */
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imgBtnMenuMouseEntered

    private void imgBtnMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBtnMenuMouseExited
        lblOpenMenu.setVisible(false);
        /* MODIFICA CURSORE */
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_imgBtnMenuMouseExited

    //POSIZIONAMENTO PIANTA\\
    private void Place00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place00MouseClicked
        plantPositionament(60, 130);
    }//GEN-LAST:event_Place00MouseClicked

    private void Place01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place01MouseClicked
        plantPositionament(160, 130);
    }//GEN-LAST:event_Place01MouseClicked

    private void Place02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place02MouseClicked
        plantPositionament(260, 130);
    }//GEN-LAST:event_Place02MouseClicked

    private void Place10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place10MouseClicked
        plantPositionament(60, 250);
    }//GEN-LAST:event_Place10MouseClicked

    private void Place11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place11MouseClicked
        plantPositionament(160, 250);
    }//GEN-LAST:event_Place11MouseClicked

    private void Place12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place12MouseClicked
        plantPositionament(260, 250);
    }//GEN-LAST:event_Place12MouseClicked

    private void Place20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place20MouseClicked
        plantPositionament(60, 380);
    }//GEN-LAST:event_Place20MouseClicked

    private void Place21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place21MouseClicked
        plantPositionament(160, 380);
    }//GEN-LAST:event_Place21MouseClicked

    private void Place22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place22MouseClicked
        plantPositionament(260, 380);
    }//GEN-LAST:event_Place22MouseClicked

    private void Place30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place30MouseClicked
        plantPositionament(60, 510);
    }//GEN-LAST:event_Place30MouseClicked

    private void Place31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place31MouseClicked
        plantPositionament(160, 510);
    }//GEN-LAST:event_Place31MouseClicked

    private void Place32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place32MouseClicked
        plantPositionament(260, 510);
    }//GEN-LAST:event_Place32MouseClicked

    private void Place40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place40MouseClicked
        plantPositionament(60, 650);
    }//GEN-LAST:event_Place40MouseClicked

    private void Place41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place41MouseClicked
        plantPositionament(160, 650);
    }//GEN-LAST:event_Place41MouseClicked

    private void Place42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place42MouseClicked
        plantPositionament(260, 650);
    }//GEN-LAST:event_Place42MouseClicked

    private void Place03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place03MouseClicked
        plantPositionament(380, 130);
    }//GEN-LAST:event_Place03MouseClicked

    private void Place04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place04MouseClicked
        plantPositionament(480, 130);
    }//GEN-LAST:event_Place04MouseClicked

    private void Place05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place05MouseClicked
        plantPositionament(590, 130);
    }//GEN-LAST:event_Place05MouseClicked

    private void Place13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place13MouseClicked
        plantPositionament(360, 250);
    }//GEN-LAST:event_Place13MouseClicked

    private void Place14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place14MouseClicked
        plantPositionament(480, 250);
    }//GEN-LAST:event_Place14MouseClicked

    private void Place15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place15MouseClicked
        plantPositionament(590, 250);
    }//GEN-LAST:event_Place15MouseClicked

    private void Place23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place23MouseClicked
        plantPositionament(380, 380);
    }//GEN-LAST:event_Place23MouseClicked

    private void Place24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place24MouseClicked
        plantPositionament(480, 380);
    }//GEN-LAST:event_Place24MouseClicked

    private void Place25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place25MouseClicked
        plantPositionament(590, 380);
    }//GEN-LAST:event_Place25MouseClicked

    private void Place33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place33MouseClicked
        plantPositionament(380, 510);
    }//GEN-LAST:event_Place33MouseClicked

    private void Place34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place34MouseClicked
        plantPositionament(480, 510);
    }//GEN-LAST:event_Place34MouseClicked

    private void Place35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place35MouseClicked
        plantPositionament(590, 510);
    }//GEN-LAST:event_Place35MouseClicked

    private void Place43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place43MouseClicked
        plantPositionament(390, 650);
    }//GEN-LAST:event_Place43MouseClicked

    private void Place44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place44MouseClicked
        plantPositionament(490, 650);
    }//GEN-LAST:event_Place44MouseClicked

    private void Place45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place45MouseClicked
        plantPositionament(590, 650);
    }//GEN-LAST:event_Place45MouseClicked
    ////\\\\

    //RIMOZIONE PIANTA\\
    private void imgPlant1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant1MouseClicked
        plantSpawn = 0;
        plantRemoval(plant[plantSpawn].getImgPlant(), plant[plantSpawn].getImgProjectile(), plant[plantSpawn].getPlantCanShoot());
    }//GEN-LAST:event_imgPlant1MouseClicked

    private void imgPlant2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant2MouseClicked
        plantSpawn = 1;
        plantRemoval(plant[plantSpawn].getImgPlant(), plant[plantSpawn].getImgProjectile(), plant[plantSpawn].getPlantCanShoot());
    }//GEN-LAST:event_imgPlant2MouseClicked

    private void imgPlant3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant3MouseClicked
        plantSpawn = 2;
        plantRemoval(plant[plantSpawn].getImgPlant(), plant[plantSpawn].getImgProjectile(), plant[plantSpawn].getPlantCanShoot());
    }//GEN-LAST:event_imgPlant3MouseClicked

    private void imgPlant4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant4MouseClicked
        plantSpawn = 3;
        plantRemoval(plant[plantSpawn].getImgPlant(), plant[plantSpawn].getImgProjectile(), plant[plantSpawn].getPlantCanShoot());
    }//GEN-LAST:event_imgPlant4MouseClicked

    private void imgPlant5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant5MouseClicked
        plantSpawn = 4;
        plantRemoval(plant[plantSpawn].getImgPlant(), plant[plantSpawn].getImgProjectile(), plant[plantSpawn].getPlantCanShoot());
    }//GEN-LAST:event_imgPlant5MouseClicked
    ////\\\\

    //PULSANTE START\\
    private void imgStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgStartMouseEntered
        if (canStart) {
            imgStartHover.setVisible(true);
            imgStart.setVisible(false);
        }
    }//GEN-LAST:event_imgStartMouseEntered

    private void imgStartHoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgStartHoverMouseExited
        imgStartHover.setVisible(false);
        imgStart.setVisible(true);
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_imgStartHoverMouseExited

    private void imgStartHoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgStartHoverMouseClicked
        if (canStart) {
            imgStartHover.setLocation(999, 999);
            imgStartHover.setVisible(false);
            imgStart.setLocation(999, 999);
            imgStart.setVisible(false);
            imgMenuPlantBright.setVisible(false);
            imgMenuShovel.setVisible(false);
            imgRedLine.setVisible(false);
            /* START DEI THREAD */
            threadStart(130, imgZombie[0]);
            threadStart(250, imgZombie[1]);
            threadStart(380, imgZombie[2]);
            threadStart(510, imgZombie[3]);
            threadStart(650, imgZombie[4]);
            for (int i = 0; i < 5; i++) {
                ThreadZombieMovement ThreadWalk = new ThreadZombieMovement(imgZombie[i], i + 1, position[0], position[1], position[2], position[3], position[4]);
                Thread cWalk = new Thread(ThreadWalk);
                cWalk.start();
            }
            /* SFX */
            try {
                AudioInputStream startSFXaudio = AudioSystem.getAudioInputStream(new File("startSFX.wav"));
                Clip startSFXclip = AudioSystem.getClip();
                startSFXclip.open(startSFXaudio);
                startSFXclip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            }
            /* SFX */
            try {
                AudioInputStream zombiesComingSFXaudio = AudioSystem.getAudioInputStream(new File("zombiesComingSFX.wav"));
                Clip zombiesComingSFXclip = AudioSystem.getClip();
                zombiesComingSFXclip.open(zombiesComingSFXaudio);
                zombiesComingSFXclip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            }
        }
    }//GEN-LAST:event_imgStartHoverMouseClicked
    ////\\\\

    private void imgMenuShovelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuShovelMouseEntered
        lblRP.setVisible(true);
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imgMenuShovelMouseEntered

    private void imgMenuShovelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuShovelMouseExited
        lblRP.setVisible(false);
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_imgMenuShovelMouseExited

    private void imgPlant1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant1MouseEntered
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_imgPlant1MouseEntered

    private void imgPlant2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant2MouseEntered
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_imgPlant2MouseEntered

    private void imgPlant3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant3MouseEntered
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_imgPlant3MouseEntered

    private void imgPlant4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant4MouseEntered
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_imgPlant4MouseEntered

    private void imgPlant5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant5MouseEntered
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_imgPlant5MouseEntered

    private void imgPlant1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant1MouseExited
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_imgPlant1MouseExited

    private void imgPlant2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant2MouseExited
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_imgPlant2MouseExited

    private void imgPlant3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant3MouseExited
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_imgPlant3MouseExited

    private void imgPlant4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant4MouseExited
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_imgPlant4MouseExited

    private void imgPlant5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPlant5MouseExited
        if (canRemove) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_imgPlant5MouseExited

    private void imgStartHoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgStartHoverMouseEntered
        if (canStart) {
            /*MODIFICA CURSORE*/
            this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_imgStartHoverMouseEntered

    private void Place00MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place00MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place00MouseEntered

    private void Place01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place01MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place01MouseEntered

    private void Place02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place02MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place02MouseEntered

    private void Place03MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place03MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place03MouseEntered

    private void Place04MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place04MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place04MouseEntered

    private void Place05MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place05MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place05MouseEntered

    private void Place10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place10MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place10MouseEntered

    private void Place11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place11MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place11MouseEntered

    private void Place12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place12MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place12MouseEntered

    private void Place13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place13MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place13MouseEntered

    private void Place14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place14MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place14MouseEntered

    private void Place15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place15MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place15MouseEntered

    private void Place20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place20MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place20MouseEntered

    private void Place21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place21MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place21MouseEntered

    private void Place22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place22MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place22MouseEntered

    private void Place23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place23MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place23MouseEntered

    private void Place24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place24MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place24MouseEntered

    private void Place25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place25MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place25MouseEntered

    private void Place30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place30MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place30MouseEntered

    private void Place31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place31MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place31MouseEntered

    private void Place32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place32MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place32MouseEntered

    private void Place33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place33MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place33MouseEntered

    private void Place34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place34MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place34MouseEntered

    private void Place35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place35MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place35MouseEntered

    private void Place40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place40MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place40MouseEntered

    private void Place41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place41MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place41MouseEntered

    private void Place42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place42MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place42MouseEntered

    private void Place43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place43MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place43MouseEntered

    private void Place44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place44MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place44MouseEntered

    private void Place45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place45MouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place45MouseEntered

    private void Place00MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place00MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place00MouseExited

    private void Place01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place01MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place01MouseExited

    private void Place02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place02MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place02MouseExited

    private void Place03MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place03MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place03MouseExited

    private void Place04MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place04MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place04MouseExited

    private void Place05MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place05MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place05MouseExited

    private void Place10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place10MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place10MouseExited

    private void Place11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place11MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place11MouseExited

    private void Place12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place12MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place12MouseExited

    private void Place13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place13MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place13MouseExited

    private void Place14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place14MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place14MouseExited

    private void Place15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place15MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place15MouseExited

    private void Place20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place20MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place20MouseExited

    private void Place21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place21MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place21MouseExited

    private void Place22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place22MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place22MouseExited

    private void Place23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place23MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place23MouseExited

    private void Place24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place24MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place24MouseExited

    private void Place25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place25MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place25MouseExited

    private void Place30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place30MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place30MouseExited

    private void Place31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place31MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place31MouseExited

    private void Place32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place32MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place32MouseExited

    private void Place33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place33MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place33MouseExited

    private void Place34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place34MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place34MouseExited

    private void Place35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place35MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place35MouseExited

    private void Place40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place40MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place40MouseExited

    private void Place41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place41MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place41MouseExited

    private void Place42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place42MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place42MouseExited

    private void Place43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place43MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place43MouseExited

    private void Place44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place44MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place44MouseExited

    private void Place45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place45MouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_Place45MouseExited

    private void imgPopupMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPopupMenuMouseEntered
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imgPopupMenuMouseEntered

    private void imgPopupMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPopupMenuMouseExited
        /*MODIFICA CURSORE*/
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_imgPopupMenuMouseExited

    private void imgZombie1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie1MouseEntered
        lblZombiesNames.setLocation(imgZombie[0].getLocation().x, imgZombie[0].getLocation().y);
        lblZombiesNames.setText("Coby");
        lblZombiesNames.setVisible(true);
    }//GEN-LAST:event_imgZombie1MouseEntered

    private void imgZombie2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie2MouseEntered
        lblZombiesNames.setLocation(imgZombie[1].getLocation().x, imgZombie[1].getLocation().y);
        lblZombiesNames.setText("Dustin");
        lblZombiesNames.setVisible(true);
    }//GEN-LAST:event_imgZombie2MouseEntered

    private void imgZombie3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie3MouseEntered
        lblZombiesNames.setLocation(imgZombie[2].getLocation().x, imgZombie[2].getLocation().y);
        lblZombiesNames.setText("Jax");
        lblZombiesNames.setVisible(true);
    }//GEN-LAST:event_imgZombie3MouseEntered

    private void imgZombie4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie4MouseEntered
        lblZombiesNames.setLocation(imgZombie[3].getLocation().x, imgZombie[3].getLocation().y);
        lblZombiesNames.setText("Seth");
        lblZombiesNames.setVisible(true);
    }//GEN-LAST:event_imgZombie4MouseEntered

    private void imgZombie5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie5MouseEntered
        lblZombiesNames.setLocation(imgZombie[4].getLocation().x, imgZombie[4].getLocation().y);
        lblZombiesNames.setText("Zenith");
        lblZombiesNames.setVisible(true);
    }//GEN-LAST:event_imgZombie5MouseEntered

    private void imgZombie1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie1MouseExited
        lblZombiesNames.setLocation(730, 10);
        lblZombiesNames.setVisible(false);
        lblZombiesNames.setText("Zombie Name:");

    }//GEN-LAST:event_imgZombie1MouseExited

    private void imgZombie2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie2MouseExited
        lblZombiesNames.setLocation(730, 10);
        lblZombiesNames.setVisible(false);
        lblZombiesNames.setText("Zombie Name:");
    }//GEN-LAST:event_imgZombie2MouseExited

    private void imgZombie3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie3MouseExited
        lblZombiesNames.setLocation(730, 10);
        lblZombiesNames.setVisible(false);
        lblZombiesNames.setText("Zombie Name:");
    }//GEN-LAST:event_imgZombie3MouseExited

    private void imgZombie4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie4MouseExited
        lblZombiesNames.setLocation(730, 10);
        lblZombiesNames.setVisible(false);
        lblZombiesNames.setText("Zombie Name:");
    }//GEN-LAST:event_imgZombie4MouseExited

    private void imgZombie5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgZombie5MouseExited
        lblZombiesNames.setLocation(730, 10);
        lblZombiesNames.setVisible(false);
        lblZombiesNames.setText("Zombie Name:");
    }//GEN-LAST:event_imgZombie5MouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    //FUNZIONI & PROCEDURE\\
    //POSIZIONAMENTO PIANTA\\
    public void plantPositionament(Integer x, Integer y) {
        /* CONTROLLO SE C'E' GIA' UNA PIANTA NELLA POSIZIONE IN CUI VOGLIO POSIZIONARLA */
        if (onlyOnePlace(y, x)) {
            /* CONTROLLO DI QUALE PIANTA NON E' POSIZIONATA PER POSIZIONARLA */
            for (int i = 0; i < 5; i++) {
                if (!plant[i].getImgPlant().isVisible()) {
                    plantSpawn = i;
                }
            }
            /* POSIZIONAMENTO PIANTA */
            plant[plantSpawn].getImgPlant().setLocation(x, y);
            plant[plantSpawn].getImgPlant().setVisible(true);
            plant[plantSpawn].getImgProjectile().setVisible(true);
            plant[plantSpawn].getImgProjectile().setLocation(plant[plantSpawn].getImgPlant().getLocation().x + 30, plant[plantSpawn].getImgPlant().getLocation().y + 30);
            plant[plantSpawn].setPlantCanShoot(true);
            /* SFX */
            try {
                AudioInputStream plantPlantedSFXaudio = AudioSystem.getAudioInputStream(new File("plantPlantedSFX.wav"));
                Clip plantPlantedSFXclip = AudioSystem.getClip();
                plantPlantedSFXclip.open(plantPlantedSFXaudio);
                plantPlantedSFXclip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            }

            sun -= 100;
            lblSun.setText(String.valueOf(sun));
            imgMenuPlantBright.setVisible(true);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    place[i][j].setVisible(false);
                }
            }
            canStart = true;
            imgMenuShovel.setVisible(true);
        }
    }

    //RIMOZIONE PIANTA\\
    public void plantRemoval(JLabel plant, JLabel projectile, Boolean plantCanShoot) {
        if (canRemove) {
            plant.setVisible(false);
            plant.setLocation(999, 999);
            projectile.setLocation(999, 999);
            projectile.setVisible(false);
            plantCanShoot = false;
            sun += 100;
            lblSun.setText(String.valueOf(sun));
            imgMenuPlantBright.setVisible(true);
            canRemove = false;
            canStart = true;
            /* MODIFICA CURSORE */
            this.setCursor(Cursor.getDefaultCursor());
            /* SFX */
            try {
                AudioInputStream plantRemovedSFXaudio = AudioSystem.getAudioInputStream(new File("plantRemovedSFX.wav"));
                Clip plantRemovedSFXclip = AudioSystem.getClip();
                plantRemovedSFXclip.open(plantRemovedSFXaudio);
                plantRemovedSFXclip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            }
        }
    }

    //CONTROLLO SE C'E' GIA' UNA PIANTA NELLA POSIZIONE IN CUI VOGLIO POSIZIONARLA\\
    public Boolean onlyOnePlace(Integer y, Integer x) {
        Integer counter = 0;
        for (int i = 0; i < 5; i++) {
            if (!(plant[i].getImgPlant().getLocation().y == y && plant[i].getImgPlant().getLocation().x == x)) {
                counter++;
            }
        }
        return counter == 5;
    }

    //START DEI THREAD\\
    public void threadStart(Integer y, JLabel zombie) {
        for (int i = 0; i < 5; i++) {
            if (plant[i].getImgPlant().getLocation().y == y && plant[i].getImgPlant().isVisible()) {
                ThreadClass ThreadPlant = new ThreadClass(zombie, plant[i].getImgPlant(), plant[i].getImgProjectile(), plant[i].getPlantCanShoot());
                Thread cPlant = new Thread(ThreadPlant);
                cPlant.start();
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel O;
    private javax.swing.JLabel P;
    private javax.swing.JLabel Place00;
    private javax.swing.JLabel Place01;
    private javax.swing.JLabel Place02;
    private javax.swing.JLabel Place03;
    private javax.swing.JLabel Place04;
    private javax.swing.JLabel Place05;
    private javax.swing.JLabel Place10;
    private javax.swing.JLabel Place11;
    private javax.swing.JLabel Place12;
    private javax.swing.JLabel Place13;
    private javax.swing.JLabel Place14;
    private javax.swing.JLabel Place15;
    private javax.swing.JLabel Place20;
    private javax.swing.JLabel Place21;
    private javax.swing.JLabel Place22;
    private javax.swing.JLabel Place23;
    private javax.swing.JLabel Place24;
    private javax.swing.JLabel Place25;
    private javax.swing.JLabel Place30;
    private javax.swing.JLabel Place31;
    private javax.swing.JLabel Place32;
    private javax.swing.JLabel Place33;
    private javax.swing.JLabel Place34;
    private javax.swing.JLabel Place35;
    private javax.swing.JLabel Place40;
    private javax.swing.JLabel Place41;
    private javax.swing.JLabel Place42;
    private javax.swing.JLabel Place43;
    private javax.swing.JLabel Place44;
    private javax.swing.JLabel Place45;
    private javax.swing.JLabel R;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel S;
    private javax.swing.JLabel SS;
    private javax.swing.JLabel T;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel imgBtnMenu;
    private javax.swing.JLabel imgField;
    private javax.swing.JLabel imgMenu;
    private javax.swing.JLabel imgMenuPlant1;
    private javax.swing.JLabel imgMenuPlant2;
    private javax.swing.JLabel imgMenuPlant3;
    private javax.swing.JLabel imgMenuPlant4;
    private javax.swing.JLabel imgMenuPlant5;
    private javax.swing.JLabel imgMenuPlant6;
    private javax.swing.JLabel imgMenuPlantBright;
    private javax.swing.JLabel imgMenuPlantBright1;
    private javax.swing.JLabel imgMenuPlantBright2;
    private javax.swing.JLabel imgMenuPlantBright3;
    private javax.swing.JLabel imgMenuPlantBright4;
    private javax.swing.JLabel imgMenuPlantBright5;
    private javax.swing.JLabel imgMenuShovel;
    private javax.swing.JLabel imgPlant1;
    private javax.swing.JLabel imgPlant2;
    private javax.swing.JLabel imgPlant3;
    private javax.swing.JLabel imgPlant4;
    private javax.swing.JLabel imgPlant5;
    private javax.swing.JLabel imgPopupMenu;
    private javax.swing.JLabel imgProjectile1;
    private javax.swing.JLabel imgProjectile2;
    private javax.swing.JLabel imgProjectile3;
    private javax.swing.JLabel imgProjectile4;
    private javax.swing.JLabel imgProjectile5;
    private javax.swing.JLabel imgRedLine;
    private javax.swing.JLabel imgStart;
    private javax.swing.JLabel imgStartHover;
    private javax.swing.JLabel imgZombie1;
    private javax.swing.JLabel imgZombie2;
    private javax.swing.JLabel imgZombie3;
    private javax.swing.JLabel imgZombie4;
    private javax.swing.JLabel imgZombie5;
    private javax.swing.JLabel lblCherryBomb;
    private javax.swing.JLabel lblOpenMenu;
    private javax.swing.JLabel lblPeaShooter;
    private javax.swing.JLabel lblPeaShooterNotEnoughSun;
    private javax.swing.JLabel lblPotatoMine;
    private javax.swing.JLabel lblRP;
    private javax.swing.JLabel lblSnowPea;
    private javax.swing.JLabel lblSun;
    private javax.swing.JLabel lblSunFlower;
    private javax.swing.JLabel lblWallNut;
    private javax.swing.JLabel lblZombiesNames;
    private javax.swing.JPanel pnl;
    private javax.swing.JLabel position1;
    private javax.swing.JLabel position2;
    private javax.swing.JLabel position3;
    private javax.swing.JLabel position4;
    private javax.swing.JLabel position5;
    // End of variables declaration//GEN-END:variables
}
