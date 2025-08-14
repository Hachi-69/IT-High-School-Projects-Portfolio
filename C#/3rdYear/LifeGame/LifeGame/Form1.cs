using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Threading;

namespace WindowsFormsApplication1
{
    public partial class frmLifeGame : Form
    {
        public frmLifeGame()
        {
            InitializeComponent();
        }

        public int [,] matriceAttuale;
        public int[,] matriceSuccessiva;

        public Random rnd = new Random();
        
        public int c,vivi,random1,random2,somma;

        public string stringa;


        public int controllo_vivi (int i, int j)
        {
            somma = 0;

            somma = matriceAttuale[i, j - 1] + matriceAttuale[i, j + 1] + matriceAttuale[i - 1, j] + matriceAttuale[i + 1, j] + matriceAttuale[i - 1, j + 1] + matriceAttuale[i + 1, j - 1] + matriceAttuale[i - 1, j - 1] + matriceAttuale[i + 1, j + 1];

            if (matriceAttuale[i,j]==1)
            {
                if (somma==2||somma==3)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            if (somma==3)
            {
                return 1;
            }
            return 0;
        }

        private void btnGenera_Click(object sender, EventArgs e)
        {
            stringa = txtCelle.Text;

            c = Convert.ToInt32(stringa);

            matriceAttuale = new int[c+2, c+2];
            matriceSuccessiva = new int[c+2, c+2];

            for (int i = 0; i < c+2; i++)
            {
                for (int j = 0; j < c+2; j++)
                {
                    matriceAttuale[i, j] = 0;
                    matriceSuccessiva[i, j] = 0;
                }
            }

            grd.ColumnCount = c;
            grd.RowCount = grd.ColumnCount = c;

            for (int i = 0; i < c; i++)
            {
                grd.Columns[i].Width = 749/c;
            }

            for (int j = 0; j < c; j++)
            {
                grd.Rows[j].Height =  749/c;
            }

            btnGenera.Enabled = false;
            txtCelle.Enabled = false;
            grd.CurrentCell.Selected = false;
            
            
            txtNPassi.Enabled = true;
            txtVivi.Enabled = true;
        }

        private void btnVivi_Click(object sender, EventArgs e)
        {
            int i=0;

            stringa = txtVivi.Text;
            vivi= Convert.ToInt32(stringa);

            for (int j = 0; j < c; j++)
            {
                for (int l = 0; l < c; l++)
                {
                    if (grd[j, l].Style.BackColor == Color.PaleGreen)
                    {
                        grd[j, l].Style.BackColor = Color.Empty;

                        matriceAttuale[j, l] = 0;
                    }  
                }
            }

            while(i < vivi)
            {
                random1 = rnd.Next(1, c+1);
                random2 = rnd.Next(1, c+1);

                if (matriceAttuale[random1, random2] !=  1)
                {
                    i++;
                    matriceAttuale[random1, random2] = 1;
                }
            }
            
            for (int j = 1; j < c+1; j++)
            {
                for (int l = 1; l < c+1; l++)
                {
                    grd[j-1, l-1].Style.BackColor = Color.Empty;
                    if (matriceAttuale[j - 1, l - 1] == 1)
                        grd[j - 1, l - 1].Style.BackColor = Color.PaleGreen;
                }
            }
            btnAvanza.Enabled = true;

        }

        private void btnAvanza_Click(object sender, EventArgs e)
        {
            for (int i = 1; i < c+1; i++)
            {
                for (int j = 1; j < c+1; j++)
                {
                    matriceSuccessiva[i, j] = controllo_vivi(i, j);
                }
            }

            for (int i = 1; i < c+1; i++)
            {
                for (int j = 1; j < c+1; j++)
                {
                    matriceAttuale[i, j] = matriceSuccessiva[i, j];

                    if (matriceAttuale[i, j] == 1)
                    {
                        grd[i-1, j-1].Style.BackColor = Color.PaleGreen;
                    }
                    else
                    {
                        grd[i-1, j-1].Style.BackColor = Color.Empty;
                    }
                }
            }
        }

        private void btnRestart_Click(object sender, EventArgs e)
        {
            for (int i = 0; i < c; i++)
            {
                for (int j = 0; j < c; j++)
                {
                    grd[i, j].Style.BackColor = Color.Empty;
                    matriceAttuale[i, j] = 0;
                    matriceSuccessiva[i, j] = 0;
                }
            }
        }

        private void prova(object sender, DataGridViewCellEventArgs e)
        {
            grd[e.ColumnIndex, e.RowIndex].Style.BackColor = Color.Red;
            matriceAttuale[e.ColumnIndex + 1, e.RowIndex + 1] = 1;
            btnVia.Enabled = true;
            btnAvanza.Enabled = true;

        }

        private void btnVia_Click(object sender, EventArgs e)
        {
            int n;
            string stringaN;
            stringaN = txtNPassi.Text;
            n = Convert.ToInt32(stringaN);

            for (int l = 0; l < n; l++)
            {
                for (int i = 1; i < c + 1; i++)
                {
                    for (int j = 1; j < c + 1; j++)
                    {
                        matriceSuccessiva[i, j] = controllo_vivi(i, j);
                    }
                }

                for (int i = 1; i < c + 1; i++)
                {
                    for (int j = 1; j < c + 1; j++)
                    {
                        matriceAttuale[i, j] = matriceSuccessiva[i, j];

                        if (matriceAttuale[i, j] == 1)
                        {
                            grd[i - 1, j - 1].Style.BackColor = Color.PaleGreen;
                        }
                        else
                        {
                            grd[i - 1, j - 1].Style.BackColor = Color.Empty;
                        }
                    }
                }

                System.Threading.Thread.Sleep(30);
                grd.Refresh();

            }
            
        }

        private void frmLifeGame_Load(object sender, EventArgs e)
        {

        }

        private void txtVivi_TextChanged(object sender, EventArgs e)
        {
            
            btnVivi.Enabled = true;
        }

        private void txtNPassi_TextChanged(object sender, EventArgs e)
        {
            btnVia.Enabled = true;
        }

                        //CASI SPECIALI\\

        private void btnAliante_Click(object sender, EventArgs e)
        {
            int aliante = 20;
            c = aliante;
            matriceAttuale = new int[aliante + 2, aliante + 2];
            matriceSuccessiva = new int[aliante + 2, aliante + 2];

            for (int i = 0; i < aliante + 2; i++)
            {
                for (int j = 0; j < aliante + 2; j++)
                {
                    matriceAttuale[i, j] = 0;
                    matriceSuccessiva[i, j] = 0;
                }
            }

            grd.ColumnCount = aliante;
            grd.RowCount = grd.ColumnCount = aliante;

            for (int i = 0; i < aliante; i++)
            {
                grd.Columns[i].Width = 749 / aliante;
            }

            for (int j = 0; j < aliante; j++)
            {
                grd.Rows[j].Height = 749 / aliante;
            }

            matriceAttuale[2, 2] = 1;
            matriceAttuale[3, 3] = 1;
            matriceAttuale[3, 4] = 1;
            matriceAttuale[2, 4] = 1;
            matriceAttuale[1, 4] = 1;

            for (int j = 1; j < aliante + 1; j++)
            {
                for (int l = 1; l < aliante + 1; l++)
                {
                    grd[j - 1, l - 1].Style.BackColor = Color.Empty;
                    if (matriceAttuale[j - 1, l - 1] == 1)
                        grd[j - 1, l - 1].Style.BackColor = Color.PaleGreen;
                }
            }

            btnAvanza.Enabled = true;
            grd.CurrentCell.Selected = false;
            txtNPassi.Enabled = true;
        }

        private void btnPulsar_Click(object sender, EventArgs e)
        {
            int aliante = 15;
            c = aliante;
            matriceAttuale = new int[aliante + 2, aliante + 2];
            matriceSuccessiva = new int[aliante + 2, aliante + 2];

            for (int i = 0; i < aliante + 2; i++)
            {
                for (int j = 0; j < aliante + 2; j++)
                {
                    matriceAttuale[i, j] = 0;
                    matriceSuccessiva[i, j] = 0;
                }
            }

            grd.ColumnCount = aliante;
            grd.RowCount = grd.ColumnCount = aliante;

            for (int i = 0; i < aliante; i++)
            {
                grd.Columns[i].Width = 749 / aliante;
            }

            for (int j = 0; j < aliante; j++)
            {
                grd.Rows[j].Height = 749 / aliante;
            }

            matriceAttuale[4, 2] = 1;
            matriceAttuale[5, 2] = 1;
            matriceAttuale[6, 2] = 1;
            matriceAttuale[10, 2] = 1;
            matriceAttuale[11, 2] = 1;
            matriceAttuale[12, 2] = 1;

            matriceAttuale[2, 4] = 1;
            matriceAttuale[2, 5] = 1;
            matriceAttuale[2, 6] = 1;
            matriceAttuale[2, 5] = 1;
            matriceAttuale[2, 10] = 1;
            matriceAttuale[2, 11] = 1;
            matriceAttuale[2, 12] = 1;

            matriceAttuale[7, 4] = 1;
            matriceAttuale[7, 5] = 1;
            matriceAttuale[7, 6] = 1;
            matriceAttuale[7, 10] = 1;
            matriceAttuale[7, 11] = 1;
            matriceAttuale[7, 12] = 1;

            matriceAttuale[4, 7] = 1;
            matriceAttuale[5, 7] = 1;
            matriceAttuale[6, 7] = 1;
            matriceAttuale[10, 9] = 1;
            matriceAttuale[11, 9] = 1;
            matriceAttuale[12, 9] = 1;
            matriceAttuale[10, 14] = 1;
            matriceAttuale[11, 14] = 1;
            matriceAttuale[12, 14] = 1;

            matriceAttuale[9, 10] = 1;
            matriceAttuale[9, 11] = 1;
            matriceAttuale[9, 12] = 1;
            matriceAttuale[14, 10] = 1;
            matriceAttuale[14, 11] = 1;
            matriceAttuale[14, 12] = 1;

            matriceAttuale[4, 9] = 1;
            matriceAttuale[5, 9] = 1;
            matriceAttuale[6, 9] = 1;
            matriceAttuale[4, 14] = 1;
            matriceAttuale[5, 14] = 1;
            matriceAttuale[6, 14] = 1;

            matriceAttuale[9, 4] = 1;
            matriceAttuale[9, 5] = 1;
            matriceAttuale[9, 6] = 1;

            matriceAttuale[10, 2] = 1;
            matriceAttuale[11, 2] = 1;
            matriceAttuale[12, 2] = 1;

            matriceAttuale[14, 4] = 1;
            matriceAttuale[14, 5] = 1;
            matriceAttuale[14, 6] = 1;

            matriceAttuale[10, 7] = 1;
            matriceAttuale[11, 7] = 1;
            matriceAttuale[12, 7] = 1;


            

            for (int j = 1; j < aliante + 1; j++)
            {
                for (int l = 1; l < aliante + 1; l++)
                {
                    grd[j - 1, l - 1].Style.BackColor = Color.Empty;
                    if (matriceAttuale[j - 1, l - 1] == 1)
                        grd[j - 1, l - 1].Style.BackColor = Color.PaleGreen;
                }
            }

            btnAvanza.Enabled = true;
            grd.CurrentCell.Selected = false;
            txtNPassi.Enabled = true;
        }

        private void btnpentomino_Click(object sender, EventArgs e)
        {
            int aliante = 30;
            c = aliante;
            matriceAttuale = new int[aliante + 2, aliante + 2];
            matriceSuccessiva = new int[aliante + 2, aliante + 2];

            for (int i = 0; i < aliante + 2; i++)
            {
                for (int j = 0; j < aliante + 2; j++)
                {
                    matriceAttuale[i, j] = 0;
                    matriceSuccessiva[i, j] = 0;
                }
            }

            grd.ColumnCount = aliante;
            grd.RowCount = grd.ColumnCount = aliante;

            for (int i = 0; i < aliante; i++)
            {
                grd.Columns[i].Width = 749 / aliante;
            }

            for (int j = 0; j < aliante; j++)
            {
                grd.Rows[j].Height = 749 / aliante;
            }

            matriceAttuale[14, 14] = 1;
            matriceAttuale[13, 14] = 1;
            matriceAttuale[14, 15] = 1;
            matriceAttuale[14, 13] = 1;
            matriceAttuale[15, 13] = 1;

            for (int j = 1; j < aliante + 1; j++)
            {
                for (int l = 1; l < aliante + 1; l++)
                {
                    grd[j - 1, l - 1].Style.BackColor = Color.Empty;
                    if (matriceAttuale[j - 1, l - 1] == 1)
                        grd[j - 1, l - 1].Style.BackColor = Color.PaleGreen;
                }
            }

            btnAvanza.Enabled = true;
            grd.CurrentCell.Selected = false;
            txtNPassi.Enabled = true;
        }

        private void btnGosperglidergun_Click(object sender, EventArgs e)
        {
            int aliante = 40;
            c = aliante;
            matriceAttuale = new int[aliante + 2, aliante + 2];
            matriceSuccessiva = new int[aliante + 2, aliante + 2];

            for (int i = 0; i < aliante + 2; i++)
            {
                for (int j = 0; j < aliante + 2; j++)
                {
                    matriceAttuale[i, j] = 0;
                    matriceSuccessiva[i, j] = 0;
                }
            }

            grd.ColumnCount = aliante;
            grd.RowCount = grd.ColumnCount = aliante;

            for (int i = 0; i < aliante; i++)
            {
                grd.Columns[i].Width = 749 / aliante;
            }

            for (int j = 0; j < aliante; j++)
            {
                grd.Rows[j].Height = 749 / aliante;
            }

            matriceAttuale[25, 25] = 1;
            matriceAttuale[26, 23] = 1;
            matriceAttuale[27, 24] = 1;
            matriceAttuale[27, 25] = 1;
            matriceAttuale[28, 25] = 1;
            matriceAttuale[27, 26] = 1;
            matriceAttuale[26, 27] = 1;
            matriceAttuale[24, 22] = 1;
            matriceAttuale[23, 22] = 1;
            matriceAttuale[22, 23] = 1;
            matriceAttuale[21, 24] = 1;
            matriceAttuale[21, 25] = 1;
            matriceAttuale[21, 26] = 1;
            matriceAttuale[22, 27] = 1;
            matriceAttuale[23, 28] = 1;
            matriceAttuale[23, 28] = 1;
            matriceAttuale[24, 28] = 1;
            matriceAttuale[31, 24] = 1;
            matriceAttuale[31, 23] = 1;
            matriceAttuale[31, 22] = 1;
            matriceAttuale[32, 24] = 1;
            matriceAttuale[32, 23] = 1;
            matriceAttuale[32, 22] = 1;
            matriceAttuale[33, 21] = 1;
            matriceAttuale[33, 25] = 1;
            matriceAttuale[35, 21] = 1;
            matriceAttuale[35, 20] = 1;
            matriceAttuale[35, 25] = 1;
            matriceAttuale[35, 26] = 1;


            matriceAttuale[12, 25] = 1;
            matriceAttuale[11, 25] = 1;
            matriceAttuale[12, 24] = 1;
            matriceAttuale[11, 24] = 1;



            for (int j = 1; j < aliante + 1; j++)
            {
                for (int l = 1; l < aliante + 1; l++)
                {
                    grd[j - 1, l - 1].Style.BackColor = Color.Empty;
                    if (matriceAttuale[j - 1, l - 1] == 1)
                        grd[j - 1, l - 1].Style.BackColor = Color.PaleGreen;
                }
            }

            btnAvanza.Enabled = true;
            grd.CurrentCell.Selected = false;
            txtNPassi.Enabled = true;
        }

        private void btnBlinker_Click(object sender, EventArgs e)
        {
            int aliante = 9;
            c = aliante;
            matriceAttuale = new int[aliante + 2, aliante + 2];
            matriceSuccessiva = new int[aliante + 2, aliante + 2];

            for (int i = 0; i < aliante + 2; i++)
            {
                for (int j = 0; j < aliante + 2; j++)
                {
                    matriceAttuale[i, j] = 0;
                    matriceSuccessiva[i, j] = 0;
                }
            }

            grd.ColumnCount = aliante;
            grd.RowCount = grd.ColumnCount = aliante;

            for (int i = 0; i < aliante; i++)
            {
                grd.Columns[i].Width = 749 / aliante;
            }

            for (int j = 0; j < aliante; j++)
            {
                grd.Rows[j].Height = 749 / aliante;
            }

            matriceAttuale[4, 2] = 1;
            matriceAttuale[5, 2] = 1;
            matriceAttuale[6, 2] = 1;
            matriceAttuale[2, 4] = 1;
            matriceAttuale[2, 5] = 1;
            matriceAttuale[2, 6] = 1;
            matriceAttuale[8, 4] = 1;
            matriceAttuale[8, 5] = 1;
            matriceAttuale[8, 6] = 1;
            matriceAttuale[4, 8] = 1;
            matriceAttuale[5, 8] = 1;
            matriceAttuale[6, 8] = 1;

            for (int j = 1; j < aliante + 1; j++)
            {
                for (int l = 1; l < aliante + 1; l++)
                {
                    grd[j - 1, l - 1].Style.BackColor = Color.Empty;
                    if (matriceAttuale[j - 1, l - 1] == 1)
                        grd[j - 1, l - 1].Style.BackColor = Color.PaleGreen;
                }
            }

            btnAvanza.Enabled = true;
            grd.CurrentCell.Selected = false;
            txtNPassi.Enabled = true;
        }


///////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
