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
    public partial class Luca : Form
    {
        public Luca()
        {
            InitializeComponent();
        }

        int[] numeri;
        int num;
        int i = 0;

        private void btnCrea_Click(object sender, EventArgs e)
        {    
            num = Convert.ToInt32(txtCrea.Text);  
            numeri = new int [num];

            lblNumeri.Visible = true;
            lblMin.Visible = true;
            lblMedia.Visible = true;
            lblMax.Visible = true;
            txtRiempi.Visible = true;
            btnRiempi.Visible = true;
            txtRiempi.Focus();
            btnCrea.Enabled = false;
            txtCrea.Enabled = false;
            lblLunghezza.Enabled = false;
            lstNumeri.Visible = true;
            
        }

        private void btnRiempi_Click(object sender, EventArgs e)
        {
            if (i < num-1)
            {
                numeri[i] = Convert.ToInt32(txtRiempi.Text);
                lstNumeri.Items.Add("Posizione "+i+": "+numeri[i]);
            }

            else 
            {
                txtRiempi.Text = "Array Pieno";
                lstNumeri.Items.Add("Array Pieno");
                txtRiempi.Enabled = false;
                btnMedia.Visible = true;
                btnMax.Visible = true;
                btnMin.Visible = true;
                btnMax.Enabled = true;
                btnMedia.Enabled = true;
                btnMin.Enabled = true;
                lblRicerca.Visible = true;
                txtRicerca.Visible = true;
                btnRicerca.Visible = true;
            }
      
            txtRiempi.Focus();
            txtRiempi.Text = "";
            btnRiempi.Enabled=false;

            i++;
        }

        private void btnMedia_Click(object sender, EventArgs e)
        {

            double somma=0,media=0;

            for (i = 0; i < num; i++)
            {
                somma = somma + numeri[i];
            }

            media = somma / num;

            lblMedia.Text = "La Media è: " + media;
            
        }

        private void btnMax_Click(object sender, EventArgs e)
        {
            double max = numeri[0];

            for(i=1; i<num; i++)
            {
                if (max < numeri[i])
                {
                    max = numeri[i];
                }                           
            }

            lblMax.Text = "Il Valore Massimo è: " + max;
        }

        private void btnMin_Click(object sender, EventArgs e)
        {
            double min = numeri[0];

            for (i = 1; i < num; i++)
            {
                if (min > numeri[i])
                {
                    min = numeri[i];
                }
            }

            lblMin.Text = "Il Valore Minimo è: " + min;
        }

        private void txtCrea_TextChanged(object sender, EventArgs e)
        {
            btnCrea.Enabled = true;
        }

        private void txtRiempi_TextChanged(object sender, EventArgs e)
        {
            btnRiempi.Enabled = true;
        }

        private void btnRicerca_Click(object sender, EventArgs e)
        {
            double R;
            byte c=0;
            R = Convert.ToInt32(txtRicerca.Text);


            for (i = 0; i < num; i++)
            {
                if (R == numeri[i])
                {
                    c++;
                }
            }

            lblNumRicerca.Text = "Ci sono " + c + " numeri uguali";
                
        }
    }
}
