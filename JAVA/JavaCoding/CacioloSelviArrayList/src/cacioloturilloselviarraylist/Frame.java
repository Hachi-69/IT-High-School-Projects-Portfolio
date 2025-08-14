package cacioloturilloselviarraylist;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import mydata.Data;

/**
 *
 * @author Turillo.Luca / Caciolo.Alexander / Selvi.Nicola
 */
public class Frame extends javax.swing.JFrame {

    private ArrayList<QuattroZampe> animaleQZ;// ArrayList della classe QuattroZampe
    private ArrayList<DueZampe> animaleDZ;// ArrayList della classe DueZampe
    private ArrayList<ZeroZampe> animaleZZ;// ArrayList della classe ZeroZampe
    private Integer dimArray, dimGet;// valori Integer per gestire gli Slider

    public Frame() {
        initComponents();
        pnl1.setVisible(false);
        dimGet = 0;
        dimArray = 1;

        // colorazione della frame e degli oggetti grafici \\
        getContentPane().setBackground(new java.awt.Color(227, 253, 253));
        pnl1.setBackground(new java.awt.Color(113, 201, 206));
        sldIndex.setBackground(new java.awt.Color(113, 201, 206));
        sldGetIndex.setBackground(new java.awt.Color(113, 201, 206));
        cmbSort.setBackground(new java.awt.Color(203, 241, 245));
        btnIndex.setBackground(new java.awt.Color(203, 241, 245));
        btnIsEmpty.setBackground(new java.awt.Color(203, 241, 245));
        btnGetIndex.setBackground(new java.awt.Color(203, 241, 245));
        btnSetIndex.setBackground(new java.awt.Color(203, 241, 245));
        btnRemove.setBackground(new java.awt.Color(203, 241, 245));
        btnIndexOf.setBackground(new java.awt.Color(203, 241, 245));
        btnSort.setBackground(new java.awt.Color(203, 241, 245));
        atxLog.setBackground(new java.awt.Color(166, 227, 233));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbNZampe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbSpecie = new javax.swing.JComboBox<>();
        btnCrea = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtGiorno = new javax.swing.JTextField();
        txtMese = new javax.swing.JTextField();
        txtAnno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxLog = new javax.swing.JTextArea();
        pnl1 = new javax.swing.JPanel();
        btnIndex = new javax.swing.JButton();
        sldIndex = new javax.swing.JSlider();
        btnGetIndex = new javax.swing.JButton();
        sldGetIndex = new javax.swing.JSlider();
        lblGetIndex = new javax.swing.JLabel();
        btnSetIndex = new javax.swing.JButton();
        btnIsEmpty = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnIndexOf = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        lblIndex = new javax.swing.JLabel();
        cmbSort = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fattoria");
        setMaximumSize(new java.awt.Dimension(1161, 632));
        setMinimumSize(new java.awt.Dimension(1161, 632));
        setPreferredSize(new java.awt.Dimension(1161, 632));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Numero Zampe:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 100, 14);

        cmbNZampe.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbNZampe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 Zampe", "2 Zampe", "0 Zampe" }));
        cmbNZampe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNZampeItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbNZampe);
        cmbNZampe.setBounds(130, 40, 110, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Specie:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 60, 14);

        cmbSpecie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbSpecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cane", "Gatto", "Cavallo", "Maiale", "Toro", "Mucca", "Pecora", "Capra", "Asino", "Axolotl", "Tartaruga", "Volpe", "Giraffa", "Zebra", "Cammello", "Riccio" }));
        getContentPane().add(cmbSpecie);
        cmbSpecie.setBounds(130, 80, 110, 20);

        btnCrea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCrea.setText("Crea Array List");
        btnCrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrea);
        btnCrea.setBounds(270, 50, 130, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Data di nascita:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 90, 14);

        txtGiorno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtGiorno);
        txtGiorno.setBounds(130, 120, 20, 20);

        txtMese.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtMese);
        txtMese.setBounds(150, 120, 20, 20);

        txtAnno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtAnno);
        txtAnno.setBounds(170, 120, 50, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("G");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(136, 105, 20, 14);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("M");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(155, 105, 20, 14);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("A");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 105, 20, 14);

        atxLog.setColumns(20);
        atxLog.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        atxLog.setRows(5);
        atxLog.setFocusable(false);
        jScrollPane1.setViewportView(atxLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(486, 20, 640, 540);

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl1.setLayout(null);

        btnIndex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnIndex.setText("Add Posizione");
        btnIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndexActionPerformed(evt);
            }
        });
        pnl1.add(btnIndex);
        btnIndex.setBounds(120, 40, 120, 21);

        sldIndex.setMaximum(1);
        sldIndex.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldIndexStateChanged(evt);
            }
        });
        pnl1.add(sldIndex);
        sldIndex.setBounds(10, 40, 100, 20);

        btnGetIndex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnGetIndex.setText("Get Posizione");
        btnGetIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetIndexActionPerformed(evt);
            }
        });
        pnl1.add(btnGetIndex);
        btnGetIndex.setBounds(120, 120, 120, 21);

        sldGetIndex.setMaximum(0);
        sldGetIndex.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldGetIndexStateChanged(evt);
            }
        });
        pnl1.add(sldGetIndex);
        sldGetIndex.setBounds(10, 120, 100, 20);

        lblGetIndex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblGetIndex.setText("0");
        pnl1.add(lblGetIndex);
        lblGetIndex.setBounds(50, 100, 30, 20);

        btnSetIndex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSetIndex.setText("Set Posizione");
        btnSetIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetIndexActionPerformed(evt);
            }
        });
        pnl1.add(btnSetIndex);
        btnSetIndex.setBounds(240, 120, 120, 21);

        btnIsEmpty.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnIsEmpty.setText("IsEmpty");
        btnIsEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsEmptyActionPerformed(evt);
            }
        });
        pnl1.add(btnIsEmpty);
        btnIsEmpty.setBounds(360, 40, 100, 21);

        btnRemove.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        pnl1.add(btnRemove);
        btnRemove.setBounds(360, 120, 100, 21);

        btnIndexOf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnIndexOf.setText("IndexOf");
        btnIndexOf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndexOfActionPerformed(evt);
            }
        });
        pnl1.add(btnIndexOf);
        btnIndexOf.setBounds(10, 200, 100, 21);

        btnSort.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        pnl1.add(btnSort);
        btnSort.setBounds(180, 280, 100, 21);

        lblIndex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIndex.setText("0");
        pnl1.add(lblIndex);
        lblIndex.setBounds(50, 20, 30, 20);

        cmbSort.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Specie (crescente)", "Data (crescente)", "Specie (decrescente)", "Data (decrescente)" }));
        pnl1.add(cmbSort);
        cmbSort.setBounds(10, 280, 150, 20);

        getContentPane().add(pnl1);
        pnl1.setBounds(0, 170, 480, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * variazione della ComboBox per scegliere gli animali in base alla ComboBox
     * del numero di zampe
     *
     */
    private void cmbNZampeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNZampeItemStateChanged
        cmbSpecie.removeAllItems();
        switch (cmbNZampe.getSelectedIndex()) {
            case 0: { // 4 zampe
                cmbSpecie.addItem("Cane");
                cmbSpecie.addItem("Gatto");
                cmbSpecie.addItem("Cavallo");
                cmbSpecie.addItem("Maiale");
                cmbSpecie.addItem("Toro");
                cmbSpecie.addItem("Mucca");
                cmbSpecie.addItem("Pecora");
                cmbSpecie.addItem("Capra");
                cmbSpecie.addItem("Asino");
                cmbSpecie.addItem("Axolotl");
                cmbSpecie.addItem("Tartaruga");
                cmbSpecie.addItem("Volpe");
                cmbSpecie.addItem("Giraffa");
                cmbSpecie.addItem("Zebra");
                cmbSpecie.addItem("Cammello");
                cmbSpecie.addItem("Riccio");
            }
            break;
            case 1: { // 2 zampe
                cmbSpecie.addItem("Gallina");
                cmbSpecie.addItem("Oca");
                cmbSpecie.addItem("Gallo");
                cmbSpecie.addItem("Anatra");
                cmbSpecie.addItem("Struzzo");
                cmbSpecie.addItem("Fenicottero");
                cmbSpecie.addItem("Pinguino");
                cmbSpecie.addItem("Canguro");
                cmbSpecie.addItem("Trex");
                cmbSpecie.addItem("Kiwi");
            }
            break;
            case 2: { // 0 zampe
                cmbSpecie.addItem("Serpente");
                cmbSpecie.addItem("Sanguisuga");
                cmbSpecie.addItem("Lumaca");
                cmbSpecie.addItem("Stella Marina");
                cmbSpecie.addItem("Corallo");
                cmbSpecie.addItem("Spugna");
            }
        }
    }//GEN-LAST:event_cmbNZampeItemStateChanged

    /**
     * creazione dell'ArrayList in base al tipo scelto dalla ComboBox
     *
     */
    private void btnCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaActionPerformed
        try {
            switch (cmbNZampe.getSelectedIndex()) {
                case 0: { // 4 zampe
                    animaleQZ = new ArrayList<>();
                    Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                    if (isDataNull(d)) { // controllo se la data e' stata inserita correttamente
                        throw new NumberFormatException();// errore forzato nel caso della data inserita non correttamente
                    } else {
                        QuattroZampe qz = new QuattroZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                        animaleQZ.add(qz);// aggiunge il nuovo Animale nell'ArrayList
                        atxLog.append(animaleQZ.toString() + "\n");
                        btnCrea.setEnabled(false);
                        cmbNZampe.setEnabled(false);
                        pnl1.setVisible(true);
                    }
                }
                break;
                case 1: { // 2 zampe
                    animaleDZ = new ArrayList<>();
                    Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                    if (isDataNull(d)) {// controllo se la data e' stata inserita correttamente
                        throw new NumberFormatException();// errore forzato nel caso della data inserita non correttamente
                    } else {
                        DueZampe dz = new DueZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                        animaleDZ.add(dz);// aggiunge il nuovo Animale nell'ArrayList
                        atxLog.append(animaleDZ.toString() + "\n");
                        btnCrea.setEnabled(false);
                        cmbNZampe.setEnabled(false);
                        pnl1.setVisible(true);
                    }
                }
                break;
                case 2: { // 0 zampe
                    animaleZZ = new ArrayList<>();
                    Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                    if (isDataNull(d)) {// controllo se la data e' stata inserita correttamente
                        throw new NumberFormatException();// errore forzato nel caso della data inserita non correttamente
                    } else {
                        ZeroZampe zz = new ZeroZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                        animaleZZ.add(zz);// aggiunge il nuovo Animale nell'ArrayList
                        atxLog.append(animaleZZ.toString() + "\n");
                        btnCrea.setEnabled(false);
                        cmbNZampe.setEnabled(false);
                        pnl1.setVisible(true);
                    }
                }
            }
        } catch (NumberFormatException e) {
            txtError();// colorazione delle TextBox di rosso
        }
    }//GEN-LAST:event_btnCreaActionPerformed

    /**
     * metodo add in posizione, aggiunge il nuovo Animale all'interno
     * dell'ArrayList nella posizione passata dallo Slider
     *
     */
    private void btnIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndexActionPerformed
        try {
            switch (cmbNZampe.getSelectedIndex()) {
                case 0: { // 4 zampe
                    Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                    if (isDataNull(d)) {// controllo se la data e' stata inserita correttamente
                        throw new NumberFormatException();// errore forzato nel caso della data inserita non correttamente
                    } else {
                        QuattroZampe qz = new QuattroZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                        animaleQZ.add(sldIndex.getValue(), qz);// aggiunge il nuovo Animale in posizione nell'ArrayList
                        atxLog.setText(animaleQZ.toString());
                        dimArray++;
                        sldIndex.setMaximum(dimArray);// controllo Slider
                        dimGet++;
                        sldGetIndex.setMaximum(dimGet);
                    }
                }
                break;
                case 1: { // 2 zampe
                    Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                    if (isDataNull(d)) {// controllo se la data e' stata inserita correttamente
                        throw new NumberFormatException();// errore forzato nel caso della data inserita non correttamente
                    } else {
                        DueZampe dz = new DueZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                        animaleDZ.add(sldIndex.getValue(), dz);// aggiunge il nuovo Animale in posizione nell'ArrayList
                        atxLog.setText(animaleDZ.toString() + "\n");
                        dimArray++;
                        sldIndex.setMaximum(dimArray);// controllo Slider
                        dimGet++;
                        sldGetIndex.setMaximum(dimGet);
                    }
                }
                break;
                case 2: { // 0 zampe
                    Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                    if (isDataNull(d)) {// controllo se la data e' stata inserita correttamente
                        throw new NumberFormatException();// errore forzato nel caso della data inserita non correttamente
                    } else {
                        ZeroZampe zz = new ZeroZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                        animaleZZ.add(sldIndex.getValue(), zz);// aggiunge il nuovo Animale in posizione nell'ArrayList
                        atxLog.setText(animaleZZ.toString() + "\n");
                        dimArray++;
                        sldIndex.setMaximum(dimArray);// controllo Slider
                        dimGet++;
                        sldGetIndex.setMaximum(dimGet);
                    }
                }
            }
            if (dimGet == 0) { // controllo SliderGet per evitare errori
                sldGetIndex.setMinimum(0);
                btnGetIndex.setEnabled(true);
                btnSetIndex.setEnabled(true);
                btnRemove.setEnabled(true);
            }
        } catch (NumberFormatException e) {
            txtError();// colorazione delle TextBox di rosso
        }
    }//GEN-LAST:event_btnIndexActionPerformed

    private void sldIndexStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldIndexStateChanged
        // ogni volta che lo Slider viene spostato, il suo valore attuale viene scritto sulla Label sopra di lui \\
        lblIndex.setText(String.valueOf(sldIndex.getValue()));
    }//GEN-LAST:event_sldIndexStateChanged

    /**
     * metodo get in posizione, che restituisce l'Animale nella posizione dello
     * Slider
     *
     */
    private void btnGetIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetIndexActionPerformed
        switch (cmbNZampe.getSelectedIndex()) {
            case 0: { // 4 zampe
                atxLog.append("\n" + animaleQZ.get(sldGetIndex.getValue()));
            }
            break;
            case 1: { // 2 zampe
                atxLog.append("\n" + animaleDZ.get(sldGetIndex.getValue()));
            }
            break;
            case 2: { // 0 zampe
                atxLog.append("\n" + animaleZZ.get(sldGetIndex.getValue()));
            }
        }
    }//GEN-LAST:event_btnGetIndexActionPerformed

    private void sldGetIndexStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldGetIndexStateChanged
        // ogni volta che lo Slider viene spostato, il suo valore attuale viene scritto sulla Label sopra di lui \\
        lblGetIndex.setText(String.valueOf(sldGetIndex.getValue()));
    }//GEN-LAST:event_sldGetIndexStateChanged

    /**
     * metodo set in posizione, aggiunge il nuovo Animale all'interno
     * dell'ArrayList nella posizione passata dallo Slider, e sostituisce
     * l'Animale gia' presente in quella posizione
     */
    private void btnSetIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetIndexActionPerformed
        try {
            switch (cmbNZampe.getSelectedIndex()) {
                case 0: { // 4 zampe
                    Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                    if (isDataNull(d)) {// controllo se la data e' stata inserita correttamente
                        throw new NumberFormatException();// errore forzato nel caso della data inserita non correttamente
                    } else {
                        QuattroZampe qz = new QuattroZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                        Object val = animaleQZ.set(sldGetIndex.getValue(), qz);// aggiunge il nuovo Animale in posizione nell'ArrayListe sostituisce l'Animale gia' presente in quella posizione
                        atxLog.setText(animaleQZ.toString() + "\n");
                        atxLog.append("Animale sostituito: " + val + "\n");
                        atxLog.append("Nuovo Animale: " + qz + "\n");
                    }
                }
                break;
                case 1: { // 2 zampe
                    Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                    if (isDataNull(d)) {// controllo se la data e' stata inserita correttamente
                        throw new NumberFormatException();// errore forzato nel caso della data inserita non correttamente
                    } else {
                        DueZampe dz = new DueZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                        Object val = animaleDZ.set(sldGetIndex.getValue(), dz);// aggiunge il nuovo Animale in posizione nell'ArrayListe sostituisce l'Animale gia' presente in quella posizione
                        atxLog.setText(animaleDZ.toString() + "\n");
                        atxLog.append("Animale sostituito: " + val + "\n");
                        atxLog.append("Nuovo Animale: " + dz + "\n");
                    }
                }
                break;
                case 2: { // 0 zampe
                    Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                    if (isDataNull(d)) {// controllo se la data e' stata inserita correttamente
                        throw new NumberFormatException();// errore forzato nel caso della data inserita non correttamente
                    } else {
                        ZeroZampe zz = new ZeroZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                        Object val = animaleZZ.set(sldGetIndex.getValue(), zz);// aggiunge il nuovo Animale in posizione nell'ArrayListe sostituisce l'Animale gia' presente in quella posizione
                        atxLog.setText(animaleZZ.toString() + "\n");
                        atxLog.append("Animale sostituito: " + val + "\n");
                        atxLog.append("Nuovo Animale: " + zz + "\n");
                    }
                }
            }
        } catch (NumberFormatException e) {
            txtError();// colorazione delle TextBox di rosso
        }
    }//GEN-LAST:event_btnSetIndexActionPerformed

    /**
     * controllo se l'ArrayList e' vuoto
     *
     */
    private void btnIsEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsEmptyActionPerformed
        switch (cmbNZampe.getSelectedIndex()) {
            case 0: { // 4 zampe
                if (animaleQZ.isEmpty()) {
                    atxLog.append("La lista e' vuota \n");
                } else {
                    atxLog.append("La lista NON e' vuota \n");
                }
            }
            break;
            case 1: { // 2 zampe
                if (animaleDZ.isEmpty()) {
                    atxLog.append("La lista e' vuota \n");
                } else {
                    atxLog.append("La lista NON e' vuota \n");
                }
            }
            break;
            case 2: { // 0 zampe
                if (animaleZZ.isEmpty()) {
                    atxLog.append("La lista e' vuota \n");
                } else {
                    atxLog.append("La lista NON e' vuota \n");
                }
            }
        }
    }//GEN-LAST:event_btnIsEmptyActionPerformed

    /**
     * metodo remove in posizione, rimuove l'animale nella posizione passata
     * dallo Slider
     *
     */
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (dimArray > 0) {
            switch (cmbNZampe.getSelectedIndex()) {
                case 0: { // 4 zampe
                    atxLog.setText("Animale rimosso: " + animaleQZ.remove(sldGetIndex.getValue()) + "\n");
                    atxLog.append(animaleQZ.toString() + "\n");
                }
                break;
                case 1: { // 2 zampe
                    atxLog.setText("Animale rimosso: " + animaleDZ.remove(sldGetIndex.getValue()) + "\n");
                    atxLog.append(animaleDZ.toString() + "\n");
                }
                break;
                case 2: { // 0 zampe
                    atxLog.setText("Animale rimosso: " + animaleZZ.remove(sldGetIndex.getValue()) + "\n");
                    atxLog.append(animaleZZ.toString() + "\n");
                }
            }
        }

        // controllo Slider \\
        dimArray--;
        sldIndex.setMaximum(dimArray);
        dimGet--;
        sldGetIndex.setMaximum(dimGet);
        if (dimGet == -1) {
            atxLog.setText("La lista e' vuota" + "\n");
            btnGetIndex.setEnabled(false);
            btnSetIndex.setEnabled(false);
            btnRemove.setEnabled(false);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    /**
     * metodo indexOf, cerca all'interno dell'ArrayList l'Animale passato, e
     * restituiosce la posizione dove viene trovato, altrimenti restituisce -1
     *
     */
    private void btnIndexOfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndexOfActionPerformed
        switch (cmbNZampe.getSelectedIndex()) {
            case 0: { // 4 zampe
                Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                QuattroZampe qz = new QuattroZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                if (animaleQZ.indexOf(qz) != -1) {
                    atxLog.setText("Animale trovato in posizione: " + animaleQZ.indexOf(qz) + "\n");
                } else {
                    atxLog.setText("Animale NON trovato \n");
                }
                atxLog.append(animaleQZ.toString() + "\n");
            }
            break;
            case 1: { // 2 zampe
                Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                DueZampe dz = new DueZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                if (animaleDZ.indexOf(dz) != -1) {
                    atxLog.setText("Animale trovato in posizione: " + animaleDZ.indexOf(dz) + "\n");
                } else {
                    atxLog.setText("Animale NON trovato \n");
                }
                atxLog.append(animaleDZ.toString() + "\n");
            }
            break;
            case 2: { // 0 zampe
                Data d = new Data(Integer.valueOf(txtGiorno.getText()), Integer.valueOf(txtMese.getText()), Integer.valueOf(txtAnno.getText()));
                ZeroZampe zz = new ZeroZampe(String.valueOf(cmbSpecie.getSelectedItem()), d);
                if (animaleZZ.indexOf(zz) != -1) {
                    atxLog.setText("Animale trovato in posizione: " + animaleZZ.indexOf(zz) + "\n");
                } else {
                    atxLog.setText("Animale NON trovato \n");
                }
                atxLog.append(animaleZZ.toString() + "\n");
            }
        }
    }//GEN-LAST:event_btnIndexOfActionPerformed

    /**
     * richiama il metodo sort()
     *
     */
    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        sort(cmbSort.getSelectedIndex(), cmbNZampe.getSelectedIndex());
    }//GEN-LAST:event_btnSortActionPerformed

    /**
     * in base ai parametri passati ordina l'ArrayList, per specie in ordine
     * crescente, per data di nascita in ordine crescente, per specie in ordine
     * decrescente o per data di nascita in ordine decrescente
     *
     * @param s, parametro della ComboBox, per scegliere con che criterio
     * ordinare
     * @param z, parametro per controllare di che tipo di Animale e' l'ArrayList
     */
    private void sort(Integer s, Integer z) {
        if (z == 0) {
            Iterator<QuattroZampe> iter = animaleQZ.iterator();
            int i = 0;
            while (iter.hasNext()) {
                animaleQZ.get(i).setCompare(s);
                i++;
                iter.next();
            }
            Collections.sort(animaleQZ);
            atxLog.setText(animaleQZ.toString() + "\n");
            if (animaleQZ.isEmpty()) {
                atxLog.setText("La lista e' vuota" + "\n");
            }
        } else if (z == 1) {
            Iterator<DueZampe> iter = animaleDZ.iterator();
            int i = 0;
            while (iter.hasNext()) {
                animaleDZ.get(i).setCompare(s);
                i++;
                iter.next();
            }
            Collections.sort(animaleDZ);
            atxLog.setText(animaleDZ.toString() + "\n");
            if (animaleDZ.isEmpty()) {
                atxLog.setText("La lista e' vuota" + "\n");
            }
        } else if (z == 2) {
            Iterator<ZeroZampe> iter = animaleZZ.iterator();
            int i = 0;
            while (iter.hasNext()) {
                animaleZZ.get(i).setCompare(s);
                i++;
                iter.next();
            }
            Collections.sort(animaleZZ);
            atxLog.setText(animaleZZ.toString() + "\n");
            if (animaleZZ.isEmpty()) {
                atxLog.setText("La lista e' vuota" + "\n");
            }
        }

    }

    /**
     * controlla se la Data passata e' stata scritta correttamente, cosi' non
     * fosse colora le TextBox di rosso e restituisce true, altrimenti colora le
     * TextBox di bianco e restituisce false
     *
     * @param d, Data
     * @return true se la data passata e' nulla, altrimenti false
     */
    private Boolean isDataNull(Data d) {
        if (d.isNull()) {
            txtError();
            return true;
        }
        txtCorrect();
        return false;
    }

    /**
     * colorazione dello sfondo delle TextBox di rosso
     */
    private void txtError() {
        txtGiorno.setBackground(Color.red);
        txtMese.setBackground(Color.red);
        txtAnno.setBackground(Color.red);
    }

    /**
     * colorazione dello sfondo delle TextBox di bianco
     */
    private void txtCorrect() {
        txtGiorno.setBackground(Color.white);
        txtMese.setBackground(Color.white);
        txtAnno.setBackground(Color.white);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxLog;
    private javax.swing.JButton btnCrea;
    private javax.swing.JButton btnGetIndex;
    private javax.swing.JButton btnIndex;
    private javax.swing.JButton btnIndexOf;
    private javax.swing.JButton btnIsEmpty;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSetIndex;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> cmbNZampe;
    private javax.swing.JComboBox<String> cmbSort;
    private javax.swing.JComboBox<String> cmbSpecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGetIndex;
    private javax.swing.JLabel lblIndex;
    private javax.swing.JPanel pnl1;
    private javax.swing.JSlider sldGetIndex;
    private javax.swing.JSlider sldIndex;
    private javax.swing.JTextField txtAnno;
    private javax.swing.JTextField txtGiorno;
    private javax.swing.JTextField txtMese;
    // End of variables declaration//GEN-END:variables
}
