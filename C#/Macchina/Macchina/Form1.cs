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

        struct Macchina
        {
            public string marcaTXT;
            public string modelloTXT;
            public int annoINT;
            public int prezzoINT;
            public int giornoINT;
        }

        int sconto, prezzoScontato;
        string testo, a;
        string marcasub;
        string lettera;
        string modellosub;
        string lettera1;
        


        private void Form1_Load(object sender, EventArgs e)
        {
            cmbGiorno.Items.Add("Lunedì");
            cmbGiorno.Items.Add("Martedì");
            cmbGiorno.Items.Add("Mercoledì");
            cmbGiorno.Items.Add("Giovedì");
            cmbGiorno.Items.Add("Venerdì");
            cmbGiorno.Items.Add("Sabato");
            cmbGiorno.Items.Add("Domenica");
        }

        private void btnRegistra_Click(object sender, EventArgs e)
        {
           bool z = true;

            Macchina x;

            x.prezzoINT = 0;

            x.annoINT = 0;

            if (txtMarca.Text == "")
            {
                MessageBox.Show("inserire una marca");
                z = false;
            }
            else
            {
                x.marcaTXT = txtMarca.Text;
                marcasub = x.marcaTXT.Substring(1);
                lettera = "" + x.marcaTXT[0];
            }

            if (txtModello.Text == "")
            {
                MessageBox.Show("inserire un modello");
                z = false;
            }
            else
            {
                x.modelloTXT = txtModello.Text;
                modellosub = x.modelloTXT.Substring(1);
                lettera1 = "" + x.modelloTXT[0];
            }
            if (txtAnno.Text == "")
            {
                MessageBox.Show("Inserisci l'anno");
                z = false;
            }
            else
            {
                x.annoINT = Convert.ToInt32(txtAnno.Text);
            }

            if (txtPrezzo.Text == "")
            {
                MessageBox.Show("Inserisci il prezzo");
                z = false;
            }

            else 
            {
                x.prezzoINT = Convert.ToInt32(txtPrezzo.Text);
            }

            if (z == true)
            {
                lettera = lettera.ToUpper();
                x.marcaTXT = lettera + marcasub;

                lettera1 = lettera1.ToUpper();
                x.modelloTXT = lettera1 + modellosub;

                x.giornoINT = cmbGiorno.SelectedIndex;

                switch (x.giornoINT)
                {
                    case 0:
                        sconto = 21;
                        break;

                    case 1:
                        sconto = 14;
                        break;

                    case 2:
                        sconto = 6;
                        break;

                    case 3:
                        sconto = 4;
                        break;

                    case 4:
                        sconto = 18;
                        break;

                    case 5:
                        sconto = 12;
                        break;

                    case 6:
                        sconto = 9;
                        break;
                }

                switch (x.giornoINT)
                {
                    case 0:
                        prezzoScontato = (x.prezzoINT / 100) * sconto;
                        break;

                    case 1:
                        prezzoScontato = (x.prezzoINT / 100) * sconto;
                        break;

                    case 2:
                        prezzoScontato = (x.prezzoINT / 100) * sconto;
                        break;

                    case 3:
                        prezzoScontato = (x.prezzoINT / 100) * sconto;
                        break;

                    case 4:
                        prezzoScontato = (x.prezzoINT / 100) * sconto;
                        break;

                    case 5:
                        prezzoScontato = (x.prezzoINT / 100) * sconto;
                        break;

                    case 6:
                        prezzoScontato = (x.prezzoINT / 100) * sconto;
                        break;

                    default:
                        MessageBox.Show("Scegliere Un Giorno");
                        break;
                }

                testo += "\n" + "Marca: " + x.marcaTXT + "  Modello: " + x.modelloTXT + "  Anno: " + x.annoINT.ToString() + "  Prezzo: " + "€" + x.prezzoINT.ToString() + "  Prezzo Scontato: " + "€" + prezzoScontato;

                lblTesto.Text = testo;
            }

                                        
                
            
        }

        private void cmbGiorno_SelectedIndexChanged(object sender, EventArgs e)
        {
            Macchina x;

            x.prezzoINT = Convert.ToInt32(txtPrezzo.Text);

            x.giornoINT = cmbGiorno.SelectedIndex;

            switch (x.giornoINT)
            {
                case 0:
                    sconto = 21;
                    break;

                case 1:
                    sconto = 14;
                    break;

                case 2:
                    sconto = 6;
                    break;

                case 3:
                    sconto = 4;
                    break;

                case 4:
                    sconto = 18;
                    break;

                case 5:
                    sconto = 12;
                    break;

                case 6:
                    sconto = 9;
                    break;
            }

            switch (x.giornoINT)
            {
                case 0:
                    prezzoScontato = (x.prezzoINT / 100) * sconto;
                    lblSconto.Text = "Sconto del " + sconto + "%";
                    break;

                case 1:
                    prezzoScontato = (x.prezzoINT / 100) * sconto;
                    lblSconto.Text = "Sconto del " + sconto + "%";
                    break;

                case 2:
                    prezzoScontato = (x.prezzoINT / 100) * sconto;
                    lblSconto.Text = "Sconto del " + sconto + "%";
                    break;

                case 3:
                    prezzoScontato = (x.prezzoINT / 100) * sconto;
                    lblSconto.Text = "Sconto del " + sconto + "%";
                    break;

                case 4:
                    prezzoScontato = (x.prezzoINT / 100) * sconto;
                    lblSconto.Text = "Sconto del " + sconto + "%";
                    break;

                case 5:
                    prezzoScontato = (x.prezzoINT / 100) * sconto;
                    lblSconto.Text = "Sconto del " + sconto + "%";
                    break;

                case 6:
                    prezzoScontato = (x.prezzoINT / 100) * sconto;
                    lblSconto.Text = "Sconto del " + sconto + "%";
                    break;

                default:
                    MessageBox.Show("Scegliere Un Giorno");
                    break;
            }



















            
        }
    }
}
