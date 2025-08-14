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
    public partial class frmNumeri : Form
    {
        public frmNumeri()
        {
            InitializeComponent();
        }

        public Random rnd = new Random();
        public int numero,posizionei,posizionej,tempi,tempj,counter;

        List<int> random = new List<int>();


        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void grd_CellMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            grd.CurrentCell.Selected = false;

            int riga = e.RowIndex;
            int colonna = e.ColumnIndex;

            if (counter>0)
            {
                if (riga == posizionei || colonna == posizionej)
                {
                    if (colonna == posizionej - 1 || colonna == posizionej + 1)
                    {
                        grd.Rows[posizionei].Cells[posizionej].Value = grd.Rows[riga].Cells[colonna].Value;
                        grd.Rows[riga].Cells[colonna].Value = grd.Rows[posizionei].Cells[posizionej].Value;
                        grd.Rows[riga].Cells[colonna].Style.BackColor = Color.Black;
                        grd.Rows[posizionei].Cells[posizionej].Style.BackColor = Color.Khaki;

                        tempi = riga;
                        riga = posizionei;
                        posizionei = tempi;

                        tempj = colonna;
                        colonna = posizionej;
                        posizionej = tempj;

                        counter--;
                    }

                    if (riga == posizionei - 1 || riga == posizionei + 1)
                    {
                        grd.Rows[posizionei].Cells[posizionej].Value = grd.Rows[riga].Cells[colonna].Value;
                        grd.Rows[riga].Cells[colonna].Value = grd.Rows[posizionei].Cells[posizionej].Value;
                        grd.Rows[riga].Cells[colonna].Style.BackColor = Color.Black;
                        grd.Rows[posizionei].Cells[posizionej].Style.BackColor = Color.Khaki;

                        tempi = riga;
                        riga = posizionei;
                        posizionei = tempi;

                        tempj = colonna;
                        colonna = posizionej;
                        posizionej = tempj;

                        counter--;

                        if (Convert.ToInt16(grd[0, 0].Value) == 1 && Convert.ToInt16(grd[1, 0].Value) == 2 && Convert.ToInt16(grd[2, 0].Value) == 3 && Convert.ToInt16(grd[0, 1].Value) == 4 && Convert.ToInt16(grd[1, 1].Value) == 5 && Convert.ToInt16(grd[2, 1].Value) == 6 && Convert.ToInt16(grd[0, 2].Value) == 7 && Convert.ToInt16(grd[1, 2].Value) == 8)
                        {
                            MessageBox.Show("HAI  VINTO!");
                        }


                        if (counter<=0)
                        {
                            MessageBox.Show("Hai Perso");
                        }
                    }
                }

                lblmosse.Text = "Mosse rimanenti: " + counter;

               

            }
        }

        private void grd_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            grd.ColumnCount = 3;
            grd.RowCount = 3;

            for (int i = 0; i < 3; i++)
            {
                grd.Columns[i].Width = 90;
            }

            for (int j = 0; j < 3; j++)
            {
                grd.Rows[j].Height = 90;
            }

            grd.CurrentCell.Selected = false;

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {

                    do
                    {
                        numero = rnd.Next(1, 10);
                    }

                    while (random.Contains(numero));
                    random.Add(numero);
                    grd.Rows[i].Cells[j].Value = numero;

                    if (numero == 9)
                    {
                        grd.Rows[i].Cells[j].Style.BackColor = Color.Black;
                        grd.Rows[i].Cells[j].Value = "";

                        posizionei = i;
                        posizionej = j;
                    }

                }
            }

            btnRestart.Visible = true;

            btnStart.Enabled = false;
        }

        private void btnFacile_Click(object sender, EventArgs e)
        {
            counter = 700;

            btnDifficile.Visible = false;
            btnFacile.Visible = false;
            btnImpossibile.Visible = false;

            label2.Visible = false;
            label3.Visible = false;

            grd.Visible = true;
            label1.Visible = true;
            lblmosse.Visible = true;
            btnStart.Visible = true;

            lblmosse.Text = "Mosse rimanenti: " + counter;
        }

        private void btnDifficile_Click(object sender, EventArgs e)
        {
            counter = 50;

            btnDifficile.Visible = false;
            btnFacile.Visible = false;
            btnImpossibile.Visible = false;

            label2.Visible = false;
            label3.Visible = false;

            grd.Visible = true;
            label1.Visible = true;
            lblmosse.Visible = true;
            btnStart.Visible = true;

            lblmosse.Text = "Mosse rimanenti: " + counter;
        }

        private void btnImpossibile_Click(object sender, EventArgs e)
        {
            counter = 30;

            btnDifficile.Visible = false;
            btnFacile.Visible = false;
            btnImpossibile.Visible = false;

            label2.Visible = false;
            label3.Visible = false;

            grd.Visible = true;
            label1.Visible = true;
            lblmosse.Visible = true;
            btnStart.Visible = true;

            lblmosse.Text = "Mosse rimanenti: " + counter;
        }

        private void btnRestart_Click(object sender, EventArgs e)
        {

            numero = 0;
            random.Clear();
            grd.Rows[posizionei].Cells[posizionej].Style.BackColor = Color.Khaki;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {

                    grd.Rows[i].Cells[j].Value = "";
                }
            }

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {

                    do
                    {
                        numero = rnd.Next(1, 10);
                    }

                    while (random.Contains(numero));
                    random.Add(numero);
                    grd.Rows[i].Cells[j].Value = numero;

                    if (numero == 9)
                    {
                        grd.Rows[i].Cells[j].Style.BackColor = Color.Black;
                        grd.Rows[i].Cells[j].Value = "";

                        posizionei = i;
                        posizionej = j;
                    }

                }
            }
        }














////////////////////////////////////////////////////////////////////////////////////////
    }
}
