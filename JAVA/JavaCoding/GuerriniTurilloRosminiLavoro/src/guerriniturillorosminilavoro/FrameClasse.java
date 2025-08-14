package guerriniturillorosminilavoro;

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameClasse extends javax.swing.JFrame {
    
    private JTextField[][] voti = new JTextField[14][12];
    private Integer[][] matriceVoti = new Integer[14][12];
    private Integer riga;
    private Random rnd;
    private String nome = "";
    
    private JTextField[] media = new JTextField[14];
    
    private JLabel[] risultati = new JLabel[14];
    
    public FrameClasse() {
        initComponents();
        
        lblMat.setText("<HTML>M<br>A<br>T</HTML>");
        lblSto.setText("<HTML>S<br>T<br>O</HTML>");
        lblIng.setText("<HTML>I<br>N<br>G</HTML>");
        lblEdf.setText("<HTML>E<br>D<br>F</HTML>");
        lblEdc.setText("<HTML>E<br>D<br>C</HTML>");
        lblCom.setText("<HTML>C<br>O<br>M</HTML>");
        lblsi.setText("<HTML>S<br>I<br>S</HTML>");
        lblIta.setText("<HTML>I<br>T<br>A</HTML>");
        lblTps.setText("<HTML>T<br>P<br>S</HTML>");
        lblTlc.setText("<HTML>T<br>L<br>C</HTML>");
        lblRel.setText("<HTML>R<br>E<br>L</HTML>");
        lblInf.setText("<HTML>I<br>N<br>F</HTML>");
        lblMed.setText("<HTML>M<br>E<br>D<br>I<br>A</HTML>");
        
        this.setLocation(550, 150);
        
        risultati[0] = jLabel3;
        risultati[1] = jLabel2;
        risultati[2] = jLabel5;
        risultati[3] = jLabel4;
        risultati[4] = jLabel7;
        risultati[5] = jLabel6;
        risultati[6] = jLabel9;
        risultati[7] = jLabel8;
        risultati[8] = jLabel11;
        risultati[9] = jLabel10;
        risultati[10] = jLabel13;
        risultati[11] = jLabel12;
        risultati[12] = jLabel15;
        risultati[13] = jLabel14;
        
        media[0] = T8;
        media[1] = T7;
        media[2] = T100;
        media[3] = T9;
        media[4] = T102;
        media[5] = T101;
        media[6] = T104;
        media[7] = T103;
        media[8] = T106;
        media[9] = T105;
        media[10] = T108;
        media[11] = T107;
        media[12] = T112;
        media[13] = T109;
        
        voti[0][0] = T00;
        voti[0][1] = T01;
        voti[0][2] = T02;
        voti[0][3] = T03;
        voti[0][4] = T04;
        voti[0][5] = T05;
        voti[0][6] = T06;
        voti[0][7] = T07;
        voti[0][8] = T08;
        voti[0][9] = T09;
        voti[0][10] = T010;
        voti[0][11] = T011;
        
        voti[1][0] = T10;
        voti[1][1] = T11;
        voti[1][2] = T12;
        voti[1][3] = T13;
        voti[1][4] = T14;
        voti[1][5] = T15;
        voti[1][6] = T16;
        voti[1][7] = T17;
        voti[1][8] = T18;
        voti[1][9] = T19;
        voti[1][10] = T110;
        voti[1][11] = T111;
        
        voti[2][0] = T20;
        voti[2][1] = T21;
        voti[2][2] = T22;
        voti[2][3] = T23;
        voti[2][4] = T24;
        voti[2][5] = T25;
        voti[2][6] = T26;
        voti[2][7] = T27;
        voti[2][8] = T28;
        voti[2][9] = T29;
        voti[2][10] = T210;
        voti[2][11] = T211;
        
        voti[3][0] = T30;
        voti[3][1] = T31;
        voti[3][2] = T32;
        voti[3][3] = T33;
        voti[3][4] = T34;
        voti[3][5] = T35;
        voti[3][6] = T36;
        voti[3][7] = T37;
        voti[3][8] = T38;
        voti[3][9] = T39;
        voti[3][10] = T310;
        voti[3][11] = T311;
        
        voti[4][0] = T40;
        voti[4][1] = T41;
        voti[4][2] = T42;
        voti[4][3] = T43;
        voti[4][4] = T44;
        voti[4][5] = T45;
        voti[4][6] = T46;
        voti[4][7] = T47;
        voti[4][8] = T48;
        voti[4][9] = T49;
        voti[4][10] = T410;
        voti[4][11] = T411;
        
        voti[5][0] = T50;
        voti[5][1] = T51;
        voti[5][2] = T52;
        voti[5][3] = T53;
        voti[5][4] = T54;
        voti[5][5] = T55;
        voti[5][6] = T56;
        voti[5][7] = T57;
        voti[5][8] = T58;
        voti[5][9] = T59;
        voti[5][10] = T510;
        voti[5][11] = T511;
        
        voti[6][0] = T60;
        voti[6][1] = T61;
        voti[6][2] = T62;
        voti[6][3] = T63;
        voti[6][4] = T64;
        voti[6][5] = T65;
        voti[6][6] = T66;
        voti[6][7] = T67;
        voti[6][8] = T68;
        voti[6][9] = T69;
        voti[6][10] = T610;
        voti[6][11] = T611;
        
        voti[7][0] = T70;
        voti[7][1] = T71;
        voti[7][2] = T72;
        voti[7][3] = T73;
        voti[7][4] = T74;
        voti[7][5] = T75;
        voti[7][6] = T76;
        voti[7][7] = T77;
        voti[7][8] = T78;
        voti[7][9] = T79;
        voti[7][10] = T710;
        voti[7][11] = T711;
        
        voti[8][0] = T80;
        voti[8][1] = T81;
        voti[8][2] = T82;
        voti[8][3] = T83;
        voti[8][4] = T84;
        voti[8][5] = T85;
        voti[8][6] = T86;
        voti[8][7] = T87;
        voti[8][8] = T88;
        voti[8][9] = T89;
        voti[8][10] = T810;
        voti[8][11] = T811;
        
        voti[9][0] = T90;
        voti[9][1] = T91;
        voti[9][2] = T92;
        voti[9][3] = T93;
        voti[9][4] = T94;
        voti[9][5] = T95;
        voti[9][6] = T96;
        voti[9][7] = T97;
        voti[9][8] = T98;
        voti[9][9] = T99;
        voti[9][10] = T910;
        voti[9][11] = T911;
        
        voti[10][0] = TT100;
        voti[10][1] = TT101;
        voti[10][2] = TT102;
        voti[10][3] = TT103;
        voti[10][4] = TT104;
        voti[10][5] = TT105;
        voti[10][6] = TT106;
        voti[10][7] = TT107;
        voti[10][8] = TT108;
        voti[10][9] = TT109;
        voti[10][10] = TT1010;
        voti[10][11] = TT1011;
        
        voti[11][0] = TT110;
        voti[11][1] = TT111;
        voti[11][2] = TT112;
        voti[11][3] = TT113;
        voti[11][4] = TT114;
        voti[11][5] = TT115;
        voti[11][6] = TT116;
        voti[11][7] = TT117;
        voti[11][8] = TT118;
        voti[11][9] = TT119;
        voti[11][10] = TT1110;
        voti[11][11] = TT1111;
        
        voti[12][0] = TT120;
        voti[12][1] = TT121;
        voti[12][2] = TT122;
        voti[12][3] = TT123;
        voti[12][4] = TT124;
        voti[12][5] = TT125;
        voti[12][6] = TT126;
        voti[12][7] = TT127;
        voti[12][8] = TT128;
        voti[12][9] = TT129;
        voti[12][10] = TT1210;
        voti[12][11] = TT1211;
        
        voti[13][0] = TT130;
        voti[13][1] = TT131;
        voti[13][2] = TT132;
        voti[13][3] = TT133;
        voti[13][4] = TT134;
        voti[13][5] = TT135;
        voti[13][6] = TT136;
        voti[13][7] = TT137;
        voti[13][8] = TT138;
        voti[13][9] = TT139;
        voti[13][10] = TT1310;
        voti[13][11] = TT1311;
        
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 12; j++) {
                voti[i][j].setText(" ");
                matriceVoti[i][j] = 0;
            }
        }
    }
    
    public FrameClasse(Integer inf, Integer ing, Integer sto, Integer ita, Integer tps, Integer tlc, Integer comp, Integer sist, Integer edF, Integer edC, Integer mat, Integer rel, Integer riga1, Integer[][] matriceVoti) {
        initComponents();
        
        this.setLocation(550, 150);
        
        risultati[0] = jLabel3;
        risultati[1] = jLabel2;
        risultati[2] = jLabel5;
        risultati[3] = jLabel4;
        risultati[4] = jLabel7;
        risultati[5] = jLabel6;
        risultati[6] = jLabel9;
        risultati[7] = jLabel8;
        risultati[8] = jLabel11;
        risultati[9] = jLabel10;
        risultati[10] = jLabel13;
        risultati[11] = jLabel12;
        risultati[12] = jLabel15;
        risultati[13] = jLabel14;
        
        lblMat.setText("<HTML>M<br>A<br>T</HTML>");
        lblSto.setText("<HTML>S<br>T<br>O</HTML>");
        lblIng.setText("<HTML>I<br>N<br>G</HTML>");
        lblEdf.setText("<HTML>E<br>D<br>F</HTML>");
        lblEdc.setText("<HTML>E<br>D<br>C</HTML>");
        lblCom.setText("<HTML>C<br>O<br>M</HTML>");
        lblsi.setText("<HTML>S<br>I<br>S</HTML>");
        lblIta.setText("<HTML>I<br>T<br>A</HTML>");
        lblTps.setText("<HTML>T<br>P<br>S</HTML>");
        lblTlc.setText("<HTML>T<br>L<br>C</HTML>");
        lblRel.setText("<HTML>R<br>E<br>L</HTML>");
        lblInf.setText("<HTML>I<br>N<br>F</HTML>");
        lblMed.setText("<HTML>M<br>E<br>D<br>I<br>A</HTML>");
        
        media[0] = T8;
        media[1] = T7;
        media[2] = T100;
        media[3] = T9;
        media[4] = T102;
        media[5] = T101;
        media[6] = T104;
        media[7] = T103;
        media[8] = T106;
        media[9] = T105;
        media[10] = T108;
        media[11] = T107;
        media[12] = T112;
        media[13] = T109;
        
        voti[0][0] = T00;
        voti[0][1] = T01;
        voti[0][2] = T02;
        voti[0][3] = T03;
        voti[0][4] = T04;
        voti[0][5] = T05;
        voti[0][6] = T06;
        voti[0][7] = T07;
        voti[0][8] = T08;
        voti[0][9] = T09;
        voti[0][10] = T010;
        voti[0][11] = T011;
        
        voti[1][0] = T10;
        voti[1][1] = T11;
        voti[1][2] = T12;
        voti[1][3] = T13;
        voti[1][4] = T14;
        voti[1][5] = T15;
        voti[1][6] = T16;
        voti[1][7] = T17;
        voti[1][8] = T18;
        voti[1][9] = T19;
        voti[1][10] = T110;
        voti[1][11] = T111;
        
        voti[2][0] = T20;
        voti[2][1] = T21;
        voti[2][2] = T22;
        voti[2][3] = T23;
        voti[2][4] = T24;
        voti[2][5] = T25;
        voti[2][6] = T26;
        voti[2][7] = T27;
        voti[2][8] = T28;
        voti[2][9] = T29;
        voti[2][10] = T210;
        voti[2][11] = T211;
        
        voti[3][0] = T30;
        voti[3][1] = T31;
        voti[3][2] = T32;
        voti[3][3] = T33;
        voti[3][4] = T34;
        voti[3][5] = T35;
        voti[3][6] = T36;
        voti[3][7] = T37;
        voti[3][8] = T38;
        voti[3][9] = T39;
        voti[3][10] = T310;
        voti[3][11] = T311;
        
        voti[4][0] = T40;
        voti[4][1] = T41;
        voti[4][2] = T42;
        voti[4][3] = T43;
        voti[4][4] = T44;
        voti[4][5] = T45;
        voti[4][6] = T46;
        voti[4][7] = T47;
        voti[4][8] = T48;
        voti[4][9] = T49;
        voti[4][10] = T410;
        voti[4][11] = T411;
        
        voti[5][0] = T50;
        voti[5][1] = T51;
        voti[5][2] = T52;
        voti[5][3] = T53;
        voti[5][4] = T54;
        voti[5][5] = T55;
        voti[5][6] = T56;
        voti[5][7] = T57;
        voti[5][8] = T58;
        voti[5][9] = T59;
        voti[5][10] = T510;
        voti[5][11] = T511;
        
        voti[6][0] = T60;
        voti[6][1] = T61;
        voti[6][2] = T62;
        voti[6][3] = T63;
        voti[6][4] = T64;
        voti[6][5] = T65;
        voti[6][6] = T66;
        voti[6][7] = T67;
        voti[6][8] = T68;
        voti[6][9] = T69;
        voti[6][10] = T610;
        voti[6][11] = T611;
        
        voti[7][0] = T70;
        voti[7][1] = T71;
        voti[7][2] = T72;
        voti[7][3] = T73;
        voti[7][4] = T74;
        voti[7][5] = T75;
        voti[7][6] = T76;
        voti[7][7] = T77;
        voti[7][8] = T78;
        voti[7][9] = T79;
        voti[7][10] = T710;
        voti[7][11] = T711;
        
        voti[8][0] = T80;
        voti[8][1] = T81;
        voti[8][2] = T82;
        voti[8][3] = T83;
        voti[8][4] = T84;
        voti[8][5] = T85;
        voti[8][6] = T86;
        voti[8][7] = T87;
        voti[8][8] = T88;
        voti[8][9] = T89;
        voti[8][10] = T810;
        voti[8][11] = T811;
        
        voti[9][0] = T90;
        voti[9][1] = T91;
        voti[9][2] = T92;
        voti[9][3] = T93;
        voti[9][4] = T94;
        voti[9][5] = T95;
        voti[9][6] = T96;
        voti[9][7] = T97;
        voti[9][8] = T98;
        voti[9][9] = T99;
        voti[9][10] = T910;
        voti[9][11] = T911;
        
        voti[10][0] = TT100;
        voti[10][1] = TT101;
        voti[10][2] = TT102;
        voti[10][3] = TT103;
        voti[10][4] = TT104;
        voti[10][5] = TT105;
        voti[10][6] = TT106;
        voti[10][7] = TT107;
        voti[10][8] = TT108;
        voti[10][9] = TT109;
        voti[10][10] = TT1010;
        voti[10][11] = TT1011;
        
        voti[11][0] = TT110;
        voti[11][1] = TT111;
        voti[11][2] = TT112;
        voti[11][3] = TT113;
        voti[11][4] = TT114;
        voti[11][5] = TT115;
        voti[11][6] = TT116;
        voti[11][7] = TT117;
        voti[11][8] = TT118;
        voti[11][9] = TT119;
        voti[11][10] = TT1110;
        voti[11][11] = TT1111;
        
        voti[12][0] = TT120;
        voti[12][1] = TT121;
        voti[12][2] = TT122;
        voti[12][3] = TT123;
        voti[12][4] = TT124;
        voti[12][5] = TT125;
        voti[12][6] = TT126;
        voti[12][7] = TT127;
        voti[12][8] = TT128;
        voti[12][9] = TT129;
        voti[12][10] = TT1210;
        voti[12][11] = TT1211;
        
        voti[13][0] = TT130;
        voti[13][1] = TT131;
        voti[13][2] = TT132;
        voti[13][3] = TT133;
        voti[13][4] = TT134;
        voti[13][5] = TT135;
        voti[13][6] = TT136;
        voti[13][7] = TT137;
        voti[13][8] = TT138;
        voti[13][9] = TT139;
        voti[13][10] = TT1310;
        voti[13][11] = TT1311;
        
        this.matriceVoti = matriceVoti;
        
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 12; j++) {
                voti[i][j].setText(String.valueOf(this.matriceVoti[i][j]));
            }
        }
        
        voti[riga1][0].setText(String.valueOf(inf));
        voti[riga1][1].setText(String.valueOf(ing));
        voti[riga1][2].setText(String.valueOf(sto));
        voti[riga1][3].setText(String.valueOf(ita));
        voti[riga1][4].setText(String.valueOf(tps));
        voti[riga1][5].setText(String.valueOf(tlc));
        voti[riga1][6].setText(String.valueOf(comp));
        voti[riga1][7].setText(String.valueOf(sist));
        voti[riga1][8].setText(String.valueOf(edF));
        voti[riga1][9].setText(String.valueOf(edC));
        voti[riga1][10].setText(String.valueOf(mat));
        voti[riga1][11].setText(String.valueOf(rel));
        
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 12; j++) {
                if ("0".equals(voti[i][j].getText())) {
                    voti[i][j].setText(" ");
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        T010 = new javax.swing.JTextField();
        T110 = new javax.swing.JTextField();
        T210 = new javax.swing.JTextField();
        T310 = new javax.swing.JTextField();
        T410 = new javax.swing.JTextField();
        T510 = new javax.swing.JTextField();
        T610 = new javax.swing.JTextField();
        T710 = new javax.swing.JTextField();
        T810 = new javax.swing.JTextField();
        T910 = new javax.swing.JTextField();
        TT1110 = new javax.swing.JTextField();
        TT1010 = new javax.swing.JTextField();
        TT1211 = new javax.swing.JTextField();
        TT1310 = new javax.swing.JTextField();
        TT139 = new javax.swing.JTextField();
        TT1210 = new javax.swing.JTextField();
        T09 = new javax.swing.JTextField();
        T29 = new javax.swing.JTextField();
        T19 = new javax.swing.JTextField();
        T49 = new javax.swing.JTextField();
        T39 = new javax.swing.JTextField();
        T59 = new javax.swing.JTextField();
        T69 = new javax.swing.JTextField();
        T79 = new javax.swing.JTextField();
        T89 = new javax.swing.JTextField();
        T99 = new javax.swing.JTextField();
        TT119 = new javax.swing.JTextField();
        TT109 = new javax.swing.JTextField();
        TT138 = new javax.swing.JTextField();
        TT129 = new javax.swing.JTextField();
        T08 = new javax.swing.JTextField();
        T28 = new javax.swing.JTextField();
        T18 = new javax.swing.JTextField();
        T48 = new javax.swing.JTextField();
        T38 = new javax.swing.JTextField();
        T58 = new javax.swing.JTextField();
        T68 = new javax.swing.JTextField();
        T78 = new javax.swing.JTextField();
        T88 = new javax.swing.JTextField();
        T98 = new javax.swing.JTextField();
        TT118 = new javax.swing.JTextField();
        TT108 = new javax.swing.JTextField();
        TT137 = new javax.swing.JTextField();
        TT136 = new javax.swing.JTextField();
        TT128 = new javax.swing.JTextField();
        T27 = new javax.swing.JTextField();
        T17 = new javax.swing.JTextField();
        TT127 = new javax.swing.JTextField();
        T07 = new javax.swing.JTextField();
        T57 = new javax.swing.JTextField();
        T67 = new javax.swing.JTextField();
        T47 = new javax.swing.JTextField();
        T37 = new javax.swing.JTextField();
        T26 = new javax.swing.JTextField();
        T16 = new javax.swing.JTextField();
        T46 = new javax.swing.JTextField();
        T36 = new javax.swing.JTextField();
        T56 = new javax.swing.JTextField();
        T66 = new javax.swing.JTextField();
        T77 = new javax.swing.JTextField();
        T87 = new javax.swing.JTextField();
        T97 = new javax.swing.JTextField();
        TT117 = new javax.swing.JTextField();
        TT107 = new javax.swing.JTextField();
        TT106 = new javax.swing.JTextField();
        TT116 = new javax.swing.JTextField();
        T06 = new javax.swing.JTextField();
        T96 = new javax.swing.JTextField();
        T86 = new javax.swing.JTextField();
        T76 = new javax.swing.JTextField();
        T35 = new javax.swing.JTextField();
        T65 = new javax.swing.JTextField();
        T55 = new javax.swing.JTextField();
        T45 = new javax.swing.JTextField();
        T15 = new javax.swing.JTextField();
        T25 = new javax.swing.JTextField();
        T05 = new javax.swing.JTextField();
        TT126 = new javax.swing.JTextField();
        TT135 = new javax.swing.JTextField();
        TT105 = new javax.swing.JTextField();
        TT115 = new javax.swing.JTextField();
        T95 = new javax.swing.JTextField();
        T75 = new javax.swing.JTextField();
        T85 = new javax.swing.JTextField();
        TT125 = new javax.swing.JTextField();
        TT134 = new javax.swing.JTextField();
        TT1311 = new javax.swing.JTextField();
        TT104 = new javax.swing.JTextField();
        TT114 = new javax.swing.JTextField();
        T94 = new javax.swing.JTextField();
        T84 = new javax.swing.JTextField();
        T74 = new javax.swing.JTextField();
        T34 = new javax.swing.JTextField();
        T64 = new javax.swing.JTextField();
        T54 = new javax.swing.JTextField();
        T44 = new javax.swing.JTextField();
        T14 = new javax.swing.JTextField();
        T24 = new javax.swing.JTextField();
        T04 = new javax.swing.JTextField();
        TT120 = new javax.swing.JTextField();
        TT133 = new javax.swing.JTextField();
        TT1011 = new javax.swing.JTextField();
        TT1111 = new javax.swing.JTextField();
        T911 = new javax.swing.JTextField();
        T711 = new javax.swing.JTextField();
        T811 = new javax.swing.JTextField();
        T411 = new javax.swing.JTextField();
        T311 = new javax.swing.JTextField();
        TT132 = new javax.swing.JTextField();
        T511 = new javax.swing.JTextField();
        TT131 = new javax.swing.JTextField();
        T611 = new javax.swing.JTextField();
        TT124 = new javax.swing.JTextField();
        TT123 = new javax.swing.JTextField();
        T011 = new javax.swing.JTextField();
        T211 = new javax.swing.JTextField();
        T111 = new javax.swing.JTextField();
        T23 = new javax.swing.JTextField();
        T13 = new javax.swing.JTextField();
        T22 = new javax.swing.JTextField();
        T12 = new javax.swing.JTextField();
        TT122 = new javax.swing.JTextField();
        T03 = new javax.swing.JTextField();
        T53 = new javax.swing.JTextField();
        T63 = new javax.swing.JTextField();
        T43 = new javax.swing.JTextField();
        T33 = new javax.swing.JTextField();
        T83 = new javax.swing.JTextField();
        T21 = new javax.swing.JTextField();
        T93 = new javax.swing.JTextField();
        T11 = new javax.swing.JTextField();
        TT113 = new javax.swing.JTextField();
        T42 = new javax.swing.JTextField();
        TT103 = new javax.swing.JTextField();
        T32 = new javax.swing.JTextField();
        T31 = new javax.swing.JTextField();
        T52 = new javax.swing.JTextField();
        T62 = new javax.swing.JTextField();
        T73 = new javax.swing.JTextField();
        TT102 = new javax.swing.JTextField();
        T51 = new javax.swing.JTextField();
        T41 = new javax.swing.JTextField();
        T61 = new javax.swing.JTextField();
        T72 = new javax.swing.JTextField();
        T82 = new javax.swing.JTextField();
        T92 = new javax.swing.JTextField();
        TT112 = new javax.swing.JTextField();
        TT101 = new javax.swing.JTextField();
        T71 = new javax.swing.JTextField();
        T30 = new javax.swing.JTextField();
        T91 = new javax.swing.JTextField();
        T81 = new javax.swing.JTextField();
        T40 = new javax.swing.JTextField();
        T10 = new javax.swing.JTextField();
        T60 = new javax.swing.JTextField();
        T50 = new javax.swing.JTextField();
        T02 = new javax.swing.JTextField();
        T01 = new javax.swing.JTextField();
        TT111 = new javax.swing.JTextField();
        TT130 = new javax.swing.JTextField();
        TT100 = new javax.swing.JTextField();
        TT110 = new javax.swing.JTextField();
        T90 = new javax.swing.JTextField();
        T70 = new javax.swing.JTextField();
        T80 = new javax.swing.JTextField();
        T20 = new javax.swing.JTextField();
        TT121 = new javax.swing.JTextField();
        T00 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblMat = new javax.swing.JLabel();
        lblInf = new javax.swing.JLabel();
        lblIta = new javax.swing.JLabel();
        lblIng = new javax.swing.JLabel();
        lblEdf = new javax.swing.JLabel();
        lblsi = new javax.swing.JLabel();
        lblSto = new javax.swing.JLabel();
        lblTps = new javax.swing.JLabel();
        lblTlc = new javax.swing.JLabel();
        lblCom = new javax.swing.JLabel();
        lblEdc = new javax.swing.JLabel();
        lblRel = new javax.swing.JLabel();
        T7 = new javax.swing.JTextField();
        T8 = new javax.swing.JTextField();
        T9 = new javax.swing.JTextField();
        T100 = new javax.swing.JTextField();
        T101 = new javax.swing.JTextField();
        T102 = new javax.swing.JTextField();
        T103 = new javax.swing.JTextField();
        T104 = new javax.swing.JTextField();
        T105 = new javax.swing.JTextField();
        T106 = new javax.swing.JTextField();
        T107 = new javax.swing.JTextField();
        T108 = new javax.swing.JTextField();
        T109 = new javax.swing.JTextField();
        T112 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblMed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField1.setText("Boudal Abderrhamane");
        jTextField1.setFocusable(false);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked1(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 60, 130, 20);

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField2.setText("Caciolo Alexander");
        jTextField2.setFocusable(false);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(20, 80, 130, 20);

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField3.setText("Campriani Mattia");
        jTextField3.setFocusable(false);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(20, 100, 130, 20);

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField4.setText("Carocci Tommaso");
        jTextField4.setFocusable(false);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(20, 120, 130, 20);

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField5.setText("Chen Jiale");
        jTextField5.setFocusable(false);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(20, 140, 130, 20);

        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField6.setText("Grasso Matteo");
        jTextField6.setFocusable(false);
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(20, 160, 130, 20);

        jTextField7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField7.setText("Guerrini Tommaso");
        jTextField7.setFocusable(false);
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(20, 180, 130, 20);

        jTextField8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField8.setText("Mazzini Nicola");
        jTextField8.setFocusable(false);
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(20, 200, 130, 20);

        jTextField9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField9.setText("Jad Nekrachi");
        jTextField9.setFocusable(false);
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(20, 220, 130, 20);

        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField10.setText("Ricciardi Ettore");
        jTextField10.setFocusable(false);
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField10);
        jTextField10.setBounds(20, 240, 130, 20);

        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField11.setText("Rosmini Giacomo");
        jTextField11.setFocusable(false);
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField11);
        jTextField11.setBounds(20, 260, 130, 20);

        jTextField12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField12.setText("Savini Mattia");
        jTextField12.setFocusable(false);
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField12);
        jTextField12.setBounds(20, 280, 130, 20);

        jTextField13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField13.setText("Selvi Nicola");
        jTextField13.setFocusable(false);
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField13);
        jTextField13.setBounds(20, 300, 130, 20);

        jTextField14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField14.setText("Turillo Luca");
        jTextField14.setFocusable(false);
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField14);
        jTextField14.setBounds(20, 320, 130, 20);

        T010.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T010.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T010.setFocusable(false);
        getContentPane().add(T010);
        T010.setBounds(390, 60, 30, 20);

        T110.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T110.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T110.setFocusable(false);
        getContentPane().add(T110);
        T110.setBounds(390, 80, 30, 20);

        T210.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T210.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T210.setFocusable(false);
        getContentPane().add(T210);
        T210.setBounds(390, 100, 30, 20);

        T310.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T310.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T310.setFocusable(false);
        getContentPane().add(T310);
        T310.setBounds(390, 120, 30, 20);

        T410.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T410.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T410.setFocusable(false);
        getContentPane().add(T410);
        T410.setBounds(390, 140, 30, 20);

        T510.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T510.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T510.setFocusable(false);
        getContentPane().add(T510);
        T510.setBounds(390, 160, 30, 20);

        T610.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T610.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T610.setFocusable(false);
        getContentPane().add(T610);
        T610.setBounds(390, 180, 30, 20);

        T710.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T710.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T710.setFocusable(false);
        getContentPane().add(T710);
        T710.setBounds(390, 200, 30, 20);

        T810.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T810.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T810.setFocusable(false);
        getContentPane().add(T810);
        T810.setBounds(390, 220, 30, 20);

        T910.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T910.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T910.setFocusable(false);
        getContentPane().add(T910);
        T910.setBounds(390, 240, 30, 20);

        TT1110.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT1110.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT1110.setFocusable(false);
        getContentPane().add(TT1110);
        TT1110.setBounds(390, 280, 30, 20);

        TT1010.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT1010.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT1010.setFocusable(false);
        getContentPane().add(TT1010);
        TT1010.setBounds(390, 260, 30, 20);

        TT1211.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT1211.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT1211.setFocusable(false);
        getContentPane().add(TT1211);
        TT1211.setBounds(450, 300, 30, 20);

        TT1310.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT1310.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT1310.setFocusable(false);
        getContentPane().add(TT1310);
        TT1310.setBounds(390, 320, 30, 20);

        TT139.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT139.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT139.setFocusable(false);
        getContentPane().add(TT139);
        TT139.setBounds(420, 320, 30, 20);

        TT1210.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT1210.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT1210.setFocusable(false);
        getContentPane().add(TT1210);
        TT1210.setBounds(390, 300, 30, 20);

        T09.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T09.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T09.setFocusable(false);
        getContentPane().add(T09);
        T09.setBounds(420, 60, 30, 20);

        T29.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T29.setFocusable(false);
        getContentPane().add(T29);
        T29.setBounds(420, 100, 30, 20);

        T19.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T19.setFocusable(false);
        getContentPane().add(T19);
        T19.setBounds(420, 80, 30, 20);

        T49.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T49.setFocusable(false);
        getContentPane().add(T49);
        T49.setBounds(420, 140, 30, 20);

        T39.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T39.setFocusable(false);
        getContentPane().add(T39);
        T39.setBounds(420, 120, 30, 20);

        T59.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T59.setFocusable(false);
        getContentPane().add(T59);
        T59.setBounds(420, 160, 30, 20);

        T69.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T69.setFocusable(false);
        getContentPane().add(T69);
        T69.setBounds(420, 180, 30, 20);

        T79.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T79.setFocusable(false);
        getContentPane().add(T79);
        T79.setBounds(420, 200, 30, 20);

        T89.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T89.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T89.setFocusable(false);
        getContentPane().add(T89);
        T89.setBounds(420, 220, 30, 20);

        T99.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T99.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T99.setFocusable(false);
        getContentPane().add(T99);
        T99.setBounds(420, 240, 30, 20);

        TT119.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT119.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT119.setFocusable(false);
        getContentPane().add(TT119);
        TT119.setBounds(420, 280, 30, 20);

        TT109.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT109.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT109.setFocusable(false);
        getContentPane().add(TT109);
        TT109.setBounds(420, 260, 30, 20);

        TT138.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT138.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT138.setFocusable(false);
        getContentPane().add(TT138);
        TT138.setBounds(240, 320, 30, 20);

        TT129.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT129.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT129.setFocusable(false);
        getContentPane().add(TT129);
        TT129.setBounds(420, 300, 30, 20);

        T08.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T08.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T08.setFocusable(false);
        getContentPane().add(T08);
        T08.setBounds(240, 60, 30, 20);

        T28.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T28.setFocusable(false);
        getContentPane().add(T28);
        T28.setBounds(240, 100, 30, 20);

        T18.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T18.setFocusable(false);
        getContentPane().add(T18);
        T18.setBounds(240, 80, 30, 20);

        T48.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T48.setFocusable(false);
        getContentPane().add(T48);
        T48.setBounds(240, 140, 30, 20);

        T38.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T38.setFocusable(false);
        getContentPane().add(T38);
        T38.setBounds(240, 120, 30, 20);

        T58.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T58.setFocusable(false);
        getContentPane().add(T58);
        T58.setBounds(240, 160, 30, 20);

        T68.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T68.setFocusable(false);
        getContentPane().add(T68);
        T68.setBounds(240, 180, 30, 20);

        T78.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T78.setFocusable(false);
        getContentPane().add(T78);
        T78.setBounds(240, 200, 30, 20);

        T88.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T88.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T88.setFocusable(false);
        getContentPane().add(T88);
        T88.setBounds(240, 220, 30, 20);

        T98.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T98.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T98.setFocusable(false);
        getContentPane().add(T98);
        T98.setBounds(240, 240, 30, 20);

        TT118.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT118.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT118.setFocusable(false);
        getContentPane().add(TT118);
        TT118.setBounds(240, 280, 30, 20);

        TT108.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT108.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT108.setFocusable(false);
        getContentPane().add(TT108);
        TT108.setBounds(240, 260, 30, 20);

        TT137.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT137.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT137.setFocusable(false);
        getContentPane().add(TT137);
        TT137.setBounds(270, 320, 30, 20);

        TT136.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT136.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT136.setFocusable(false);
        getContentPane().add(TT136);
        TT136.setBounds(480, 320, 30, 20);

        TT128.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT128.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT128.setFocusable(false);
        getContentPane().add(TT128);
        TT128.setBounds(240, 300, 30, 20);

        T27.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T27.setFocusable(false);
        getContentPane().add(T27);
        T27.setBounds(270, 100, 30, 20);

        T17.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T17.setFocusable(false);
        getContentPane().add(T17);
        T17.setBounds(270, 80, 30, 20);

        TT127.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT127.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT127.setFocusable(false);
        getContentPane().add(TT127);
        TT127.setBounds(270, 300, 30, 20);

        T07.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T07.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T07.setFocusable(false);
        getContentPane().add(T07);
        T07.setBounds(270, 60, 30, 20);

        T57.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T57.setFocusable(false);
        getContentPane().add(T57);
        T57.setBounds(270, 160, 30, 20);

        T67.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T67.setFocusable(false);
        getContentPane().add(T67);
        T67.setBounds(270, 180, 30, 20);

        T47.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T47.setFocusable(false);
        getContentPane().add(T47);
        T47.setBounds(270, 140, 30, 20);

        T37.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T37.setFocusable(false);
        getContentPane().add(T37);
        T37.setBounds(270, 120, 30, 20);

        T26.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T26.setFocusable(false);
        getContentPane().add(T26);
        T26.setBounds(480, 100, 30, 20);

        T16.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T16.setFocusable(false);
        getContentPane().add(T16);
        T16.setBounds(480, 80, 30, 20);

        T46.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T46.setFocusable(false);
        getContentPane().add(T46);
        T46.setBounds(480, 140, 30, 20);

        T36.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T36.setFocusable(false);
        getContentPane().add(T36);
        T36.setBounds(480, 120, 30, 20);

        T56.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T56.setFocusable(false);
        getContentPane().add(T56);
        T56.setBounds(480, 160, 30, 20);

        T66.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T66.setFocusable(false);
        getContentPane().add(T66);
        T66.setBounds(480, 180, 30, 20);

        T77.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T77.setFocusable(false);
        getContentPane().add(T77);
        T77.setBounds(270, 200, 30, 20);

        T87.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T87.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T87.setFocusable(false);
        getContentPane().add(T87);
        T87.setBounds(270, 220, 30, 20);

        T97.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T97.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T97.setFocusable(false);
        getContentPane().add(T97);
        T97.setBounds(270, 240, 30, 20);

        TT117.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT117.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT117.setFocusable(false);
        getContentPane().add(TT117);
        TT117.setBounds(270, 280, 30, 20);

        TT107.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT107.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT107.setFocusable(false);
        getContentPane().add(TT107);
        TT107.setBounds(270, 260, 30, 20);

        TT106.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT106.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT106.setFocusable(false);
        getContentPane().add(TT106);
        TT106.setBounds(480, 260, 30, 20);

        TT116.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT116.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT116.setFocusable(false);
        getContentPane().add(TT116);
        TT116.setBounds(480, 280, 30, 20);

        T06.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T06.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T06.setFocusable(false);
        getContentPane().add(T06);
        T06.setBounds(480, 60, 30, 20);

        T96.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T96.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T96.setFocusable(false);
        getContentPane().add(T96);
        T96.setBounds(480, 240, 30, 20);

        T86.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T86.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T86.setFocusable(false);
        getContentPane().add(T86);
        T86.setBounds(480, 220, 30, 20);

        T76.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T76.setFocusable(false);
        getContentPane().add(T76);
        T76.setBounds(480, 200, 30, 20);

        T35.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T35.setFocusable(false);
        getContentPane().add(T35);
        T35.setBounds(360, 120, 30, 20);

        T65.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T65.setFocusable(false);
        getContentPane().add(T65);
        T65.setBounds(360, 180, 30, 20);

        T55.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T55.setFocusable(false);
        getContentPane().add(T55);
        T55.setBounds(360, 160, 30, 20);

        T45.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T45.setFocusable(false);
        getContentPane().add(T45);
        T45.setBounds(360, 140, 30, 20);

        T15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T15.setFocusable(false);
        getContentPane().add(T15);
        T15.setBounds(360, 80, 30, 20);

        T25.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T25.setFocusable(false);
        getContentPane().add(T25);
        T25.setBounds(360, 100, 30, 20);

        T05.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T05.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T05.setFocusable(false);
        getContentPane().add(T05);
        T05.setBounds(360, 60, 30, 20);

        TT126.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT126.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT126.setFocusable(false);
        getContentPane().add(TT126);
        TT126.setBounds(480, 300, 30, 20);

        TT135.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT135.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT135.setFocusable(false);
        getContentPane().add(TT135);
        TT135.setBounds(360, 320, 30, 20);

        TT105.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT105.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT105.setFocusable(false);
        getContentPane().add(TT105);
        TT105.setBounds(360, 260, 30, 20);

        TT115.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT115.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT115.setFocusable(false);
        getContentPane().add(TT115);
        TT115.setBounds(360, 280, 30, 20);

        T95.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T95.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T95.setFocusable(false);
        getContentPane().add(T95);
        T95.setBounds(360, 240, 30, 20);

        T75.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T75.setFocusable(false);
        getContentPane().add(T75);
        T75.setBounds(360, 200, 30, 20);

        T85.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T85.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T85.setFocusable(false);
        getContentPane().add(T85);
        T85.setBounds(360, 220, 30, 20);

        TT125.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT125.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT125.setFocusable(false);
        getContentPane().add(TT125);
        TT125.setBounds(360, 300, 30, 20);

        TT134.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT134.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT134.setFocusable(false);
        getContentPane().add(TT134);
        TT134.setBounds(330, 320, 30, 20);

        TT1311.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT1311.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT1311.setFocusable(false);
        getContentPane().add(TT1311);
        TT1311.setBounds(450, 320, 30, 20);

        TT104.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT104.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT104.setFocusable(false);
        getContentPane().add(TT104);
        TT104.setBounds(330, 260, 30, 20);

        TT114.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT114.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT114.setFocusable(false);
        getContentPane().add(TT114);
        TT114.setBounds(330, 280, 30, 20);

        T94.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T94.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T94.setFocusable(false);
        getContentPane().add(T94);
        T94.setBounds(330, 240, 30, 20);

        T84.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T84.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T84.setFocusable(false);
        getContentPane().add(T84);
        T84.setBounds(330, 220, 30, 20);

        T74.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T74.setFocusable(false);
        getContentPane().add(T74);
        T74.setBounds(330, 200, 30, 20);

        T34.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T34.setFocusable(false);
        getContentPane().add(T34);
        T34.setBounds(330, 120, 30, 20);

        T64.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T64.setFocusable(false);
        getContentPane().add(T64);
        T64.setBounds(330, 180, 30, 20);

        T54.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T54.setFocusable(false);
        getContentPane().add(T54);
        T54.setBounds(330, 160, 30, 20);

        T44.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T44.setFocusable(false);
        getContentPane().add(T44);
        T44.setBounds(330, 140, 30, 20);

        T14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T14.setFocusable(false);
        getContentPane().add(T14);
        T14.setBounds(330, 80, 30, 20);

        T24.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T24.setFocusable(false);
        getContentPane().add(T24);
        T24.setBounds(330, 100, 30, 20);

        T04.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T04.setFocusable(false);
        getContentPane().add(T04);
        T04.setBounds(330, 60, 30, 20);

        TT120.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT120.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT120.setFocusable(false);
        getContentPane().add(TT120);
        TT120.setBounds(150, 300, 30, 20);

        TT133.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT133.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT133.setFocusable(false);
        getContentPane().add(TT133);
        TT133.setBounds(180, 320, 30, 20);

        TT1011.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT1011.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT1011.setFocusable(false);
        getContentPane().add(TT1011);
        TT1011.setBounds(450, 260, 30, 20);

        TT1111.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT1111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT1111.setFocusable(false);
        getContentPane().add(TT1111);
        TT1111.setBounds(450, 280, 30, 20);

        T911.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T911.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T911.setFocusable(false);
        getContentPane().add(T911);
        T911.setBounds(450, 240, 30, 20);

        T711.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T711.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T711.setFocusable(false);
        getContentPane().add(T711);
        T711.setBounds(450, 200, 30, 20);

        T811.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T811.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T811.setFocusable(false);
        getContentPane().add(T811);
        T811.setBounds(450, 220, 30, 20);

        T411.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T411.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T411.setFocusable(false);
        getContentPane().add(T411);
        T411.setBounds(450, 140, 30, 20);

        T311.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T311.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T311.setFocusable(false);
        getContentPane().add(T311);
        T311.setBounds(450, 120, 30, 20);

        TT132.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT132.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT132.setFocusable(false);
        getContentPane().add(TT132);
        TT132.setBounds(300, 320, 30, 20);

        T511.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T511.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T511.setFocusable(false);
        getContentPane().add(T511);
        T511.setBounds(450, 160, 30, 20);

        TT131.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT131.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT131.setFocusable(false);
        getContentPane().add(TT131);
        TT131.setBounds(210, 320, 30, 20);

        T611.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T611.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T611.setFocusable(false);
        getContentPane().add(T611);
        T611.setBounds(450, 180, 30, 20);

        TT124.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT124.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT124.setFocusable(false);
        getContentPane().add(TT124);
        TT124.setBounds(330, 300, 30, 20);

        TT123.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT123.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT123.setFocusable(false);
        getContentPane().add(TT123);
        TT123.setBounds(180, 300, 30, 20);

        T011.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T011.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T011.setFocusable(false);
        getContentPane().add(T011);
        T011.setBounds(450, 60, 30, 20);

        T211.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T211.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T211.setFocusable(false);
        getContentPane().add(T211);
        T211.setBounds(450, 100, 30, 20);

        T111.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T111.setFocusable(false);
        getContentPane().add(T111);
        T111.setBounds(450, 80, 30, 20);

        T23.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T23.setFocusable(false);
        getContentPane().add(T23);
        T23.setBounds(180, 100, 30, 20);

        T13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T13.setFocusable(false);
        getContentPane().add(T13);
        T13.setBounds(180, 80, 30, 20);

        T22.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T22.setFocusable(false);
        getContentPane().add(T22);
        T22.setBounds(300, 100, 30, 20);

        T12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T12.setFocusable(false);
        getContentPane().add(T12);
        T12.setBounds(300, 80, 30, 20);

        TT122.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT122.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT122.setFocusable(false);
        getContentPane().add(TT122);
        TT122.setBounds(300, 300, 30, 20);

        T03.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T03.setFocusable(false);
        getContentPane().add(T03);
        T03.setBounds(180, 60, 30, 20);

        T53.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T53.setFocusable(false);
        getContentPane().add(T53);
        T53.setBounds(180, 160, 30, 20);

        T63.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T63.setFocusable(false);
        getContentPane().add(T63);
        T63.setBounds(180, 180, 30, 20);

        T43.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T43.setFocusable(false);
        getContentPane().add(T43);
        T43.setBounds(180, 140, 30, 20);

        T33.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T33.setFocusable(false);
        getContentPane().add(T33);
        T33.setBounds(180, 120, 30, 20);

        T83.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T83.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T83.setFocusable(false);
        getContentPane().add(T83);
        T83.setBounds(180, 220, 30, 20);

        T21.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T21.setFocusable(false);
        getContentPane().add(T21);
        T21.setBounds(210, 100, 30, 20);

        T93.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T93.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T93.setFocusable(false);
        getContentPane().add(T93);
        T93.setBounds(180, 240, 30, 20);

        T11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T11.setFocusable(false);
        getContentPane().add(T11);
        T11.setBounds(210, 80, 30, 20);

        TT113.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT113.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT113.setFocusable(false);
        getContentPane().add(TT113);
        TT113.setBounds(180, 280, 30, 20);

        T42.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T42.setFocusable(false);
        getContentPane().add(T42);
        T42.setBounds(300, 140, 30, 20);

        TT103.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT103.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT103.setFocusable(false);
        getContentPane().add(TT103);
        TT103.setBounds(180, 260, 30, 20);

        T32.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T32.setFocusable(false);
        getContentPane().add(T32);
        T32.setBounds(300, 120, 30, 20);

        T31.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T31.setFocusable(false);
        getContentPane().add(T31);
        T31.setBounds(210, 120, 30, 20);

        T52.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T52.setFocusable(false);
        getContentPane().add(T52);
        T52.setBounds(300, 160, 30, 20);

        T62.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T62.setFocusable(false);
        getContentPane().add(T62);
        T62.setBounds(300, 180, 30, 20);

        T73.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T73.setFocusable(false);
        getContentPane().add(T73);
        T73.setBounds(180, 200, 30, 20);

        TT102.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT102.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT102.setFocusable(false);
        getContentPane().add(TT102);
        TT102.setBounds(300, 260, 30, 20);

        T51.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T51.setFocusable(false);
        getContentPane().add(T51);
        T51.setBounds(210, 160, 30, 20);

        T41.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T41.setFocusable(false);
        getContentPane().add(T41);
        T41.setBounds(210, 140, 30, 20);

        T61.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T61.setFocusable(false);
        getContentPane().add(T61);
        T61.setBounds(210, 180, 30, 20);

        T72.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T72.setFocusable(false);
        getContentPane().add(T72);
        T72.setBounds(300, 200, 30, 20);

        T82.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T82.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T82.setFocusable(false);
        getContentPane().add(T82);
        T82.setBounds(300, 220, 30, 20);

        T92.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T92.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T92.setFocusable(false);
        getContentPane().add(T92);
        T92.setBounds(300, 240, 30, 20);

        TT112.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT112.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT112.setFocusable(false);
        getContentPane().add(TT112);
        TT112.setBounds(300, 280, 30, 20);

        TT101.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT101.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT101.setFocusable(false);
        getContentPane().add(TT101);
        TT101.setBounds(210, 260, 30, 20);

        T71.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T71.setFocusable(false);
        getContentPane().add(T71);
        T71.setBounds(210, 200, 30, 20);

        T30.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T30.setFocusable(false);
        getContentPane().add(T30);
        T30.setBounds(150, 120, 30, 20);

        T91.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T91.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T91.setFocusable(false);
        getContentPane().add(T91);
        T91.setBounds(210, 240, 30, 20);

        T81.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T81.setFocusable(false);
        getContentPane().add(T81);
        T81.setBounds(210, 220, 30, 20);

        T40.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T40.setFocusable(false);
        getContentPane().add(T40);
        T40.setBounds(150, 140, 30, 20);

        T10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T10.setFocusable(false);
        getContentPane().add(T10);
        T10.setBounds(150, 80, 30, 20);

        T60.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T60.setFocusable(false);
        getContentPane().add(T60);
        T60.setBounds(150, 180, 30, 20);

        T50.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T50.setFocusable(false);
        getContentPane().add(T50);
        T50.setBounds(150, 160, 30, 20);

        T02.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T02.setFocusable(false);
        getContentPane().add(T02);
        T02.setBounds(300, 60, 30, 20);

        T01.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T01.setFocusable(false);
        getContentPane().add(T01);
        T01.setBounds(210, 60, 30, 20);

        TT111.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT111.setFocusable(false);
        getContentPane().add(TT111);
        TT111.setBounds(210, 280, 30, 20);

        TT130.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT130.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT130.setFocusable(false);
        getContentPane().add(TT130);
        TT130.setBounds(150, 320, 30, 20);

        TT100.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT100.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT100.setFocusable(false);
        getContentPane().add(TT100);
        TT100.setBounds(150, 260, 30, 20);

        TT110.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT110.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT110.setFocusable(false);
        getContentPane().add(TT110);
        TT110.setBounds(150, 280, 30, 20);

        T90.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T90.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T90.setFocusable(false);
        getContentPane().add(T90);
        T90.setBounds(150, 240, 30, 20);

        T70.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T70.setFocusable(false);
        getContentPane().add(T70);
        T70.setBounds(150, 200, 30, 20);

        T80.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T80.setFocusable(false);
        getContentPane().add(T80);
        T80.setBounds(150, 220, 30, 20);

        T20.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T20.setFocusable(false);
        getContentPane().add(T20);
        T20.setBounds(150, 100, 30, 20);

        TT121.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TT121.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TT121.setFocusable(false);
        getContentPane().add(TT121);
        TT121.setBounds(210, 300, 30, 20);

        T00.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T00.setFocusable(false);
        getContentPane().add(T00);
        T00.setBounds(150, 60, 30, 20);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel1.setText("NOMI ALUNNI");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 130, 50);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setText("CONTROLLO");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 353, 230, 30);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("RIEMPI");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 353, 240, 30);

        lblMat.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblMat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMat.setText("M\nA\nT");
        lblMat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMat);
        lblMat.setBounds(390, 10, 30, 50);

        lblInf.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblInf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInf.setText("INF");
        lblInf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblInf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblInf);
        lblInf.setBounds(150, 10, 30, 50);

        lblIta.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblIta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIta.setText("ITA");
        lblIta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblIta);
        lblIta.setBounds(180, 10, 30, 50);

        lblIng.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblIng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIng.setText("ING");
        lblIng.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIng.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblIng);
        lblIng.setBounds(210, 10, 30, 50);

        lblEdf.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblEdf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdf.setText("EDF");
        lblEdf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblEdf);
        lblEdf.setBounds(240, 10, 30, 50);

        lblsi.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblsi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsi.setText("SIST");
        lblsi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblsi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblsi);
        lblsi.setBounds(270, 10, 30, 50);

        lblSto.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblSto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSto.setText("STO");
        lblSto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblSto);
        lblSto.setBounds(300, 10, 30, 50);

        lblTps.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblTps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTps.setText("TPS");
        lblTps.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTps.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTps);
        lblTps.setBounds(330, 10, 30, 50);

        lblTlc.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblTlc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTlc.setText("TLC");
        lblTlc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTlc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTlc);
        lblTlc.setBounds(360, 10, 30, 50);

        lblCom.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblCom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCom.setText("COM");
        lblCom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblCom);
        lblCom.setBounds(480, 10, 30, 50);

        lblEdc.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblEdc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdc.setText("EDC");
        lblEdc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEdc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblEdc);
        lblEdc.setBounds(420, 10, 30, 50);

        lblRel.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRel.setText("REL");
        lblRel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblRel);
        lblRel.setBounds(450, 10, 30, 50);

        T7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T7.setFocusable(false);
        getContentPane().add(T7);
        T7.setBounds(530, 80, 30, 20);

        T8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T8.setFocusable(false);
        getContentPane().add(T8);
        T8.setBounds(530, 60, 30, 20);

        T9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T9.setFocusable(false);
        getContentPane().add(T9);
        T9.setBounds(530, 120, 30, 20);

        T100.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T100.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T100.setFocusable(false);
        getContentPane().add(T100);
        T100.setBounds(530, 100, 30, 20);

        T101.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T101.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T101.setFocusable(false);
        getContentPane().add(T101);
        T101.setBounds(530, 160, 30, 20);

        T102.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T102.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T102.setFocusable(false);
        getContentPane().add(T102);
        T102.setBounds(530, 140, 30, 20);

        T103.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T103.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T103.setFocusable(false);
        getContentPane().add(T103);
        T103.setBounds(530, 200, 30, 20);

        T104.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T104.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T104.setFocusable(false);
        getContentPane().add(T104);
        T104.setBounds(530, 180, 30, 20);

        T105.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T105.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T105.setFocusable(false);
        getContentPane().add(T105);
        T105.setBounds(530, 240, 30, 20);

        T106.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T106.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T106.setFocusable(false);
        getContentPane().add(T106);
        T106.setBounds(530, 220, 30, 20);

        T107.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T107.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T107.setFocusable(false);
        getContentPane().add(T107);
        T107.setBounds(530, 280, 30, 20);

        T108.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T108.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T108.setFocusable(false);
        getContentPane().add(T108);
        T108.setBounds(530, 260, 30, 20);

        T109.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T109.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T109.setFocusable(false);
        getContentPane().add(T109);
        T109.setBounds(530, 320, 30, 20);

        T112.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        T112.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T112.setFocusable(false);
        getContentPane().add(T112);
        T112.setBounds(530, 300, 30, 20);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("risultato finale");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 80, 190, 18);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("risultato finale");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 60, 190, 18);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("risultato finale");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 120, 190, 18);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("risultato finale");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 100, 190, 18);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("risultato finale");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(580, 160, 190, 18);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("risultato finale");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(580, 140, 190, 18);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("risultato finale");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 200, 190, 18);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setText("risultato finale");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(580, 180, 190, 18);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel10.setText("risultato finale");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(580, 240, 190, 18);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel11.setText("risultato finale");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(580, 220, 190, 18);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel12.setText("risultato finale");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(580, 280, 190, 18);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel13.setText("risultato finale");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(580, 260, 190, 18);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel14.setText("risultato finale");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(580, 320, 190, 18);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel15.setText("risultato finale");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(580, 300, 190, 18);

        lblMed.setFont(new java.awt.Font("Comic Sans MS", 0, 7)); // NOI18N
        lblMed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMed.setText("MED");
        lblMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMed);
        lblMed.setBounds(530, 10, 30, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 12; j++) {
                if (matriceVoti[i][j] != 0) {
                    if (Integer.parseInt(voti[i][j].getText()) >= 6) {
                        voti[i][j].setBackground(Color.green);
                    }
                    if (Integer.parseInt(voti[i][j].getText()) <= 5) {
                        voti[i][j].setBackground(Color.red);
                    }
                }
            }
        }
        float somma = 0;
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 12; j++) {
                somma += matriceVoti[i][j];
            }
            media[i].setText(String.valueOf(Math.round(somma / 12)));
            somma = 0;
        }
        
        for (int j = 0; j < 14; j++) {
            if (Integer.parseInt(media[j].getText()) > 5) {
                media[j].setBackground(Color.green);
            }
            else{
                media[j].setBackground(Color.red);
            }
        }
        
        Integer contatore = 0;
        
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 12; j++) {
                if (matriceVoti[i][j] < 6) {
                    contatore++;
                }
            }
            
            if (contatore >= 3) {
                risultati[i].setText("bocciato; " + contatore + " debiti");
            }
            else if (contatore < 3 && contatore > 0) {
                risultati[i].setText("rimandato; "+ contatore+ " debiti");
            }
            else if (contatore == 0) {
                risultati[i].setText("promosso; 0 debiti");
            }
            contatore = 0;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        rnd = new Random();
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 12; j++) {
                if (matriceVoti[i][j] == 0) {
                    voti[i][j].setText(String.valueOf(rnd.nextInt(10) + 1));
                    matriceVoti[i][j] = Integer.parseInt(voti[i][j].getText());
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        //caciolo
        riga = 1;
        nome = "Alexander Caciolo";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked1
        //boudal
        riga = 0;
        nome = "Boudal Abderrhamane";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField1MouseClicked1

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        //carocci
        riga = 3;
        nome = "Carocci Tommaso";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        //chen
        riga = 4;
        nome = "Chen Jiale";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        //grasso
        riga = 5;
        nome = "Grasso Matteo";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        //cumpriani
        riga = 2;
        nome = "Campriani Mattia";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        //guerrini
        riga = 6;
        nome = "Guerrini Tommaso";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        //mazzini
        riga = 7;
        nome = "Mazzini Nicola";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        //jad
        riga = 8;
        nome = "Nekrachi Jad";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        //ricciardi
        riga = 9;
        nome = "Ricciardi Ettore";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        // rosmini
        riga = 10;
        nome = "Rosmini Giacomo";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        // savini
        riga = 11;
        nome = "Savini Mattia";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        // selvi
        riga = 12;
        nome = "Selvi Nicola";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        //tvriddv
        riga = 13;
        nome = "Turillo Luca";
        FrameVoti fV = new FrameVoti(riga, nome, matriceVoti);
        fV.setSize(215, 500);
        fV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTextField14MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T00;
    private javax.swing.JTextField T01;
    private javax.swing.JTextField T010;
    private javax.swing.JTextField T011;
    private javax.swing.JTextField T02;
    private javax.swing.JTextField T03;
    private javax.swing.JTextField T04;
    private javax.swing.JTextField T05;
    private javax.swing.JTextField T06;
    private javax.swing.JTextField T07;
    private javax.swing.JTextField T08;
    private javax.swing.JTextField T09;
    private javax.swing.JTextField T10;
    private javax.swing.JTextField T100;
    private javax.swing.JTextField T101;
    private javax.swing.JTextField T102;
    private javax.swing.JTextField T103;
    private javax.swing.JTextField T104;
    private javax.swing.JTextField T105;
    private javax.swing.JTextField T106;
    private javax.swing.JTextField T107;
    private javax.swing.JTextField T108;
    private javax.swing.JTextField T109;
    private javax.swing.JTextField T11;
    private javax.swing.JTextField T110;
    private javax.swing.JTextField T111;
    private javax.swing.JTextField T112;
    private javax.swing.JTextField T12;
    private javax.swing.JTextField T13;
    private javax.swing.JTextField T14;
    private javax.swing.JTextField T15;
    private javax.swing.JTextField T16;
    private javax.swing.JTextField T17;
    private javax.swing.JTextField T18;
    private javax.swing.JTextField T19;
    private javax.swing.JTextField T20;
    private javax.swing.JTextField T21;
    private javax.swing.JTextField T210;
    private javax.swing.JTextField T211;
    private javax.swing.JTextField T22;
    private javax.swing.JTextField T23;
    private javax.swing.JTextField T24;
    private javax.swing.JTextField T25;
    private javax.swing.JTextField T26;
    private javax.swing.JTextField T27;
    private javax.swing.JTextField T28;
    private javax.swing.JTextField T29;
    private javax.swing.JTextField T30;
    private javax.swing.JTextField T31;
    private javax.swing.JTextField T310;
    private javax.swing.JTextField T311;
    private javax.swing.JTextField T32;
    private javax.swing.JTextField T33;
    private javax.swing.JTextField T34;
    private javax.swing.JTextField T35;
    private javax.swing.JTextField T36;
    private javax.swing.JTextField T37;
    private javax.swing.JTextField T38;
    private javax.swing.JTextField T39;
    private javax.swing.JTextField T40;
    private javax.swing.JTextField T41;
    private javax.swing.JTextField T410;
    private javax.swing.JTextField T411;
    private javax.swing.JTextField T42;
    private javax.swing.JTextField T43;
    private javax.swing.JTextField T44;
    private javax.swing.JTextField T45;
    private javax.swing.JTextField T46;
    private javax.swing.JTextField T47;
    private javax.swing.JTextField T48;
    private javax.swing.JTextField T49;
    private javax.swing.JTextField T50;
    private javax.swing.JTextField T51;
    private javax.swing.JTextField T510;
    private javax.swing.JTextField T511;
    private javax.swing.JTextField T52;
    private javax.swing.JTextField T53;
    private javax.swing.JTextField T54;
    private javax.swing.JTextField T55;
    private javax.swing.JTextField T56;
    private javax.swing.JTextField T57;
    private javax.swing.JTextField T58;
    private javax.swing.JTextField T59;
    private javax.swing.JTextField T60;
    private javax.swing.JTextField T61;
    private javax.swing.JTextField T610;
    private javax.swing.JTextField T611;
    private javax.swing.JTextField T62;
    private javax.swing.JTextField T63;
    private javax.swing.JTextField T64;
    private javax.swing.JTextField T65;
    private javax.swing.JTextField T66;
    private javax.swing.JTextField T67;
    private javax.swing.JTextField T68;
    private javax.swing.JTextField T69;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T70;
    private javax.swing.JTextField T71;
    private javax.swing.JTextField T710;
    private javax.swing.JTextField T711;
    private javax.swing.JTextField T72;
    private javax.swing.JTextField T73;
    private javax.swing.JTextField T74;
    private javax.swing.JTextField T75;
    private javax.swing.JTextField T76;
    private javax.swing.JTextField T77;
    private javax.swing.JTextField T78;
    private javax.swing.JTextField T79;
    private javax.swing.JTextField T8;
    private javax.swing.JTextField T80;
    private javax.swing.JTextField T81;
    private javax.swing.JTextField T810;
    private javax.swing.JTextField T811;
    private javax.swing.JTextField T82;
    private javax.swing.JTextField T83;
    private javax.swing.JTextField T84;
    private javax.swing.JTextField T85;
    private javax.swing.JTextField T86;
    private javax.swing.JTextField T87;
    private javax.swing.JTextField T88;
    private javax.swing.JTextField T89;
    private javax.swing.JTextField T9;
    private javax.swing.JTextField T90;
    private javax.swing.JTextField T91;
    private javax.swing.JTextField T910;
    private javax.swing.JTextField T911;
    private javax.swing.JTextField T92;
    private javax.swing.JTextField T93;
    private javax.swing.JTextField T94;
    private javax.swing.JTextField T95;
    private javax.swing.JTextField T96;
    private javax.swing.JTextField T97;
    private javax.swing.JTextField T98;
    private javax.swing.JTextField T99;
    private javax.swing.JTextField TT100;
    private javax.swing.JTextField TT101;
    private javax.swing.JTextField TT1010;
    private javax.swing.JTextField TT1011;
    private javax.swing.JTextField TT102;
    private javax.swing.JTextField TT103;
    private javax.swing.JTextField TT104;
    private javax.swing.JTextField TT105;
    private javax.swing.JTextField TT106;
    private javax.swing.JTextField TT107;
    private javax.swing.JTextField TT108;
    private javax.swing.JTextField TT109;
    private javax.swing.JTextField TT110;
    private javax.swing.JTextField TT111;
    private javax.swing.JTextField TT1110;
    private javax.swing.JTextField TT1111;
    private javax.swing.JTextField TT112;
    private javax.swing.JTextField TT113;
    private javax.swing.JTextField TT114;
    private javax.swing.JTextField TT115;
    private javax.swing.JTextField TT116;
    private javax.swing.JTextField TT117;
    private javax.swing.JTextField TT118;
    private javax.swing.JTextField TT119;
    private javax.swing.JTextField TT120;
    private javax.swing.JTextField TT121;
    private javax.swing.JTextField TT1210;
    private javax.swing.JTextField TT1211;
    private javax.swing.JTextField TT122;
    private javax.swing.JTextField TT123;
    private javax.swing.JTextField TT124;
    private javax.swing.JTextField TT125;
    private javax.swing.JTextField TT126;
    private javax.swing.JTextField TT127;
    private javax.swing.JTextField TT128;
    private javax.swing.JTextField TT129;
    private javax.swing.JTextField TT130;
    private javax.swing.JTextField TT131;
    private javax.swing.JTextField TT1310;
    private javax.swing.JTextField TT1311;
    private javax.swing.JTextField TT132;
    private javax.swing.JTextField TT133;
    private javax.swing.JTextField TT134;
    private javax.swing.JTextField TT135;
    private javax.swing.JTextField TT136;
    private javax.swing.JTextField TT137;
    private javax.swing.JTextField TT138;
    private javax.swing.JTextField TT139;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblCom;
    private javax.swing.JLabel lblEdc;
    private javax.swing.JLabel lblEdf;
    private javax.swing.JLabel lblInf;
    private javax.swing.JLabel lblIng;
    private javax.swing.JLabel lblIta;
    private javax.swing.JLabel lblMat;
    private javax.swing.JLabel lblMed;
    private javax.swing.JLabel lblRel;
    private javax.swing.JLabel lblSto;
    private javax.swing.JLabel lblTlc;
    private javax.swing.JLabel lblTps;
    private javax.swing.JLabel lblsi;
    // End of variables declaration//GEN-END:variables
}
