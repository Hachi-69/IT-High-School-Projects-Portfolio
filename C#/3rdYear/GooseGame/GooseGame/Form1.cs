using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class frmLuca : Form
    {
        public frmLuca()
        {
            InitializeComponent();
        }

        //DICHIARAZIONI /\ VARIABILI /\ RANDOM /\ STRUCT /\ ARRAY\\

       public Random rnd1;

       public struct punto
        {
            public int x;
            public int y;
        }

        public punto[] punti = new punto [50];

        public int posizioneOcaBianca = 0, posizioneOcaRosa = 0,ran;

        public int lancio;

        public bool turno = false, turno1 = false;

        private void Form1_Load(object sender, EventArgs e)
        {

            //RIEMPIMENDO DELL'ARRAY /\ CASELLE\\

            punti[0].x = 12;
            punti[0].y = 621;

            punti[1].x = 160 - 10;
            punti[1].y = 621 - 20;
            punti[2].x = 248 - 10;
            punti[2].y = 621 - 20;
            punti[3].x = 331 - 10;
            punti[3].y = 621 - 20;
            punti[4].x = 414 - 10;
            punti[4].y = 621 - 20;
            punti[5].x = 498 - 10;
            punti[5].y = 621 - 20;
            punti[6].x = 582 - 10;
            punti[6].y = 621 - 20;
            punti[7].x = 666 - 10;
            punti[7].y = 621 - 20;
            punti[8].x = 749 - 10;
            punti[8].y = 621 - 20;
            punti[9].x = 832 - 10;
            punti[9].y = 621 - 20;
            punti[10].x = 917 - 10;
            punti[10].y = 621 - 20;
            punti[11].x = 1002 - 10;
            punti[11].y = 621 - 20;
            punti[12].x = 1086 - 10;
            punti[12].y = 621 - 20;
            punti[13].x = 1086;
            punti[13].y = 533 - 20;
            punti[14].x = 1086;
            punti[14].y = 453 - 20;
            punti[15].x = 1086;
            punti[15].y = 362 - 20;
            punti[16].x = 1086;
            punti[16].y = 274 - 20;
            punti[17].x = 1086;
            punti[17].y = 193 - 20;
            punti[18].x = 1086;
            punti[18].y = 110 - 20;
            punti[19].x = 1086;
            punti[19].y = 31 - 20;
            punti[20].x = 1002;
            punti[20].y = 31 - 20;
            punti[21].x = 917;
            punti[21].y = 31 - 20;
            punti[22].x = 832;
            punti[22].y = 31 - 20;
            punti[23].x = 749;
            punti[23].y = 31 - 20;
            punti[24].x = 666;
            punti[24].y = 31 - 20;
            punti[25].x = 582;
            punti[25].y = 31 - 20;
            punti[26].x = 498;
            punti[26].y = 31 - 20;
            punti[27].x = 414;
            punti[27].y = 31 - 20;
            punti[28].x = 331;
            punti[28].y = 31 - 20;
            punti[29].x = 248;
            punti[29].y = 31 - 20;
            punti[30].x = 160;
            punti[30].y = 31;
            punti[31].x = 160;
            punti[31].y = 110 - 20;
            punti[32].x = 160;
            punti[32].y = 193 - 20;
            punti[33].x = 160;
            punti[33].y = 274 - 20;
            punti[34].x = 160;
            punti[34].y = 362 - 20;
            punti[35].x = 160;
            punti[35].y = 453 - 20;
            punti[36].x = 248;
            punti[36].y = 453 - 20;
            punti[37].x = 331;
            punti[37].y = 453 - 20;
            punti[38].x = 414;
            punti[38].y = 453 - 20;
            punti[39].x = 498;
            punti[39].y = 453 - 20;
            punti[40].x = 582;
            punti[40].y = 453 - 20;
            punti[41].x = 666;
            punti[41].y = 453 - 20;
            punti[42].x = 749;
            punti[42].y = 453 - 20;
            punti[43].x = 832;
            punti[43].y = 453 - 20;
            punti[44].x = 917;
            punti[44].y = 453 - 20;
            punti[45].x = 917;
            punti[45].y = 362;
            punti[46].x = 917;
            punti[46].y = 274;
            punti[47].x = 917;
            punti[47].y = 193;
            punti[48].x = 832;
            punti[48].y = 193;
            punti[49].x = 573;
            punti[49].y = 257;    
        }

        private void btnDadi_Click(object sender, EventArgs e)
        {
            //LANCIO DEL DADO\\

            rnd1 = new Random();
            ran = rnd1.Next(1,7);
            lancio = ran;
            string numero;
            numero = Convert.ToString(ran);
            lblDado.Text = numero;

            //MOVIMENTO DELLE PEDINE /\ ALTERNAZIONE TRA G1 E G2\\
           
            if (lblGiocatore2.BackColor==Color.Cyan)
            {
                lblGiocatore1.BackColor = Color.Cyan;
                lblGiocatore2.BackColor = Color.White;

                if (turno1 == false)
                {
                    posizioneOcaRosa += lancio;

                    if (posizioneOcaRosa >= 49)
                    {
                        MessageBox.Show("L'OCA ROSA HA VINTO!!");

                        pct2.Location = new Point(punti[49].x, punti[49].y);

                        posizioneOcaBianca = 0;
                        posizioneOcaRosa = 0;
                    }

                    else
                    {
                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);

                        label2.Text = Convert.ToString(posizioneOcaRosa);
                    }

                    //IMPREVISTI G2\\

                    if (posizioneOcaRosa == 6)
                    {
                        posizioneOcaRosa = posizioneOcaRosa - 1;

                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);

                        MessageBox.Show("-Casella 6- Retrocedi di una casella");
                    }

                    if (posizioneOcaRosa == 5)
                    {
                        turno1 = true;
                        MessageBox.Show("-Casella 5- Che sfortuna, stai fermo un turno");
                    }

                    if (posizioneOcaRosa == 9)
                    {
                        posizioneOcaRosa = posizioneOcaRosa + 6;

                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);

                        MessageBox.Show("-Casella 9- Hai avuto fortuna, avanzi di 6 caselle");
                    }

                    if (posizioneOcaRosa == 14)
                    {
                        posizioneOcaRosa = posizioneOcaRosa - 4;

                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);

                        MessageBox.Show("-Casella 14- Ahia, torni indietro di 4 caselle");
                    }

                    if (posizioneOcaRosa == 19)
                    {
                        posizioneOcaRosa = posizioneOcaRosa - 1;
                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);
                        MessageBox.Show("-Casella 19- Indietreggi di una casella");
                    }

                    if (posizioneOcaRosa == 18)
                    {
                        posizioneOcaRosa = posizioneOcaRosa + 6;
                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);
                        MessageBox.Show("-Casella 18- Wow, avanti di 6");
                    }

                    if (posizioneOcaRosa == 27)
                    {
                        posizioneOcaRosa = 23;
                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);
                        MessageBox.Show("-Casella 27- Ritorni alla casella 23");
                    }

                    if (posizioneOcaRosa == 23)
                    {
                        turno = true;
                        MessageBox.Show("-Casella 23- Vai con calma, stai fermo un turno");
                    }

                    if (posizioneOcaRosa == 31)
                    {
                        posizioneOcaRosa = 37;
                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);
                        MessageBox.Show("-Casella 31- Voli fino alla casella 37");
                    }

                    if (posizioneOcaRosa == 32)
                    {
                        posizioneOcaRosa = 28;
                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);
                        MessageBox.Show("-Casella 32- Cadi alla casella 28");
                    }

                    if (posizioneOcaRosa == 41)
                    {
                        posizioneOcaRosa = 47;
                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);
                        MessageBox.Show("-Casella 41- Corri fino alla casella 47");
                    }

                    if (posizioneOcaRosa == 42)
                    {
                        posizioneOcaRosa = posizioneOcaRosa - 5;
                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);
                        MessageBox.Show("-Casella 42- Ti cade un sasso in testa, retrocedi di 5");
                    }

                    if (posizioneOcaRosa == 45)
                    {
                        posizioneOcaRosa = 36;
                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);
                        MessageBox.Show("-Casella 45- Tranquillo, puo' succedere");
                    }

                    if (posizioneOcaRosa == 36)
                    {
                        posizioneOcaRosa = 1;

                        pct2.Location = new Point(punti[posizioneOcaRosa].x, punti[posizioneOcaRosa].y);

                        MessageBox.Show("-Casella 36- Incontri un'anatra nera, acerrimo nemico delle oche, scappi alla casella 1");
                    } 
                }

                else
                {
                    turno1 = false;
                }

                
                              
            }

            //MOVIMENTO DELLE PEDINE /\ ALTERNAZIONE TRA G1 E G2\\

            else if (lblGiocatore1.BackColor == Color.Cyan)
            {
                lblGiocatore2.BackColor = Color.Cyan;
                lblGiocatore1.BackColor = Color.White;

                if (turno == false)
                {
                    posizioneOcaBianca += lancio;

                    if (posizioneOcaBianca >= 49)
                    {
                        MessageBox.Show("L'OCA BIANCA HA VINTO!!");

                        pct1.Location = new Point(punti[49].x, punti[49].y);

                        btnDadi.Enabled = false;
                    }
                    else
                    {
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);

                        label1.Text = Convert.ToString(posizioneOcaBianca);
                    }

                    //IMPREVISTI G1\\

                    if (posizioneOcaBianca == 6)
                    {
                        posizioneOcaBianca = posizioneOcaBianca - 1;
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 6- Ci stai antipatico, retrocedi di 1");
                    }

                    if (posizioneOcaBianca == 5)
                    {
                        turno = true;
                        MessageBox.Show("-Casella 5- Dai, prenditi una pausa, fermati per un turno");
                    }

                    if (posizioneOcaBianca == 9)
                    {
                        posizioneOcaBianca = posizioneOcaBianca + 6;

                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 9- Avanzi di 6");
                    }

                    if (posizioneOcaBianca == 14)
                    {
                        posizioneOcaBianca = posizioneOcaBianca - 4;

                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 14- Scivola via di 4 caselle");
                    }

                    if (posizioneOcaBianca == 19)
                    {
                        posizioneOcaBianca = posizioneOcaBianca - 1;
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 19- Fai un passo indietro");
                    }

                    if (posizioneOcaBianca == 18)
                    {
                        posizioneOcaBianca = posizioneOcaBianca + 6;
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 18- Dai, ti diamo una mano, avanzi di 6");
                    }

                    if (posizioneOcaBianca == 27)
                    {
                        posizioneOcaBianca = 23;
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 27- Vai, indietro fino alla casella 23");
                    }

                    if (posizioneOcaBianca == 23)
                    {
                        turno = true;
                        MessageBox.Show("-Casella 23- ALT! sei un'oca sospetta, aspetti un turno");
                    }

                    if (posizioneOcaBianca == 31)
                    {
                        posizioneOcaBianca = 37;
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 31- Puoi farcela, vai alla casella 37");
                    }

                    if (posizioneOcaBianca == 32)
                    {
                        posizioneOcaBianca = 28;
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 32- Retrocedi fino alla casella 28");
                    }

                    if (posizioneOcaBianca == 41)
                    {
                        posizioneOcaBianca = 47;
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 41- Vola fino alla casella 47");
                    }

                    if (posizioneOcaBianca == 42)
                    {
                        posizioneOcaBianca = posizioneOcaBianca - 5;
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 42- Mi dispiace, retrocedi di 5 caselle");
                    }

                    if (posizioneOcaBianca == 45)
                    {
                        posizioneOcaBianca = 36;
                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 45- Puo' capitare a tutti");
                    }

                    if (posizioneOcaBianca == 36)
                    {
                        posizioneOcaBianca = 1;

                        pct1.Location = new Point(punti[posizioneOcaBianca].x, punti[posizioneOcaBianca].y);
                        MessageBox.Show("-Casella 36- Incontri un'anatra nera, acerrimo nemico delle oche, scappi alla casella 1");
                    }
                }

                else
                {
                    turno = false;
                }

                
            }
        }

        private void imprevisti_Click(object sender, EventArgs e)
        {

        }

    //IMPREVISTI\\

//5 fermo un turno \
//6 in dietro di una casella\
//9 avanzi fino alla casella 15\
//14 retrocedi di 4 caselle\
//18 avanzi di 6 caselle\
//19 retrocedi di 1 casella\
//23 fermo 1 turno\
//27 ritorni alla casella 23\
//31 avanzi alla casella 37\
//32 vai alla casella 28\
//36 ritorni alla casella 1\
//41 avanzi fino alla casella 47\
//42 indietro di 5 caselle\
//45 retrocedi fino alla casella 36\

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
    }
}
