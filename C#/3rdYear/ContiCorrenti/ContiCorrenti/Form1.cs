using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Microsoft.VisualBasic;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        int n,i=0;
        string[] nome;
        string[] numero;
        long[] saldo;

        private void txtCrea_TextChanged(object sender, EventArgs e)
        {
            btnCrea.Enabled = true;
        }

        private void btnCrea_Click(object sender, EventArgs e)
        {
            if (txtCrea.Text == "" || txtCrea.Text == " ")
            {

            }

            else
            {
                n = Convert.ToInt32(txtCrea.Text);

                nome = new string[n];
                numero = new string[n];
                saldo = new long[n];

                txtCrea.Enabled = false;
                btnInserisci.Enabled = true;
                btnCrea.Enabled = false;
            }

            
            
        }

        private void btnInserisci_Click(object sender, EventArgs e)
        {
            for (i = 0; i < n; i++)
            {
                nome [i] = Interaction.InputBox("Inserisci il nome", "Nome", "", 390, 390);
                string stringa = "Nome: "+nome[i];

                numero [i] = Interaction.InputBox("Inserisci il numero del conto", "Conto", "", 390, 390);
                stringa += " Numero: "+numero[i];

                saldo [i] = Convert.ToInt32( Interaction.InputBox("Inserisci il saldo", "Saldo", "", 390, 390));
                stringa += Convert.ToString(" Saldo: "+saldo[i]);

                lstVisualizza.Items.Add(stringa);
            }

            txtCercaConto.Enabled = true;
            txtRicercaNome.Enabled = true;
            btnMedia.Enabled = true;
            btnMax.Enabled = true;
            btnCercaRosso.Enabled = true;
        }

        private void btnCercaConto_Click(object sender, EventArgs e)
        {
            bool x = false;
            int c = 0;

            for (c = 0; x==false; c++)
            {
                x = numero[c].Contains(txtCercaConto.Text);
            }

            if (x == true)
            {
                lblCercaConto.Text = "Il nome dell'utente è: " + nome[c-1] + " e il saldo è: " + saldo[c-1];
            }
            else
            {
                lblCercaConto.Text = "Corrispondenza non trovata";
            }

            txtRicercaNome.Enabled = true;
            
        }

        private void btnCercaNome_Click(object sender, EventArgs e)
        {
            bool z = false;
            int a = 0;

            for (a = 0; z==false; a++)
            {
                z = nome[a].Contains(txtRicercaNome.Text);
            }

            if (z == true)
            {
                lblCercaNome.Text = "Il numero è: " + numero[a - 1] + " e il saldo è: " + saldo[a - 1];
            }
            else
            {
                lblCercaNome.Text = "Corrispondenza non trovata";
            }

            btnCercaRosso.Enabled = true;
            btnMax.Enabled = true;
            btnMedia.Enabled = true;

        }

        private void btnCercaRosso_Click(object sender, EventArgs e)
        {
            for (i = 0; i < n; i++)
            {
                if (saldo[i] < 0)
                {
                    lblCercaRosso.Text += nome[i]+"\n";
                }
            }
        }

        private void lstVisualizza_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void btnMax_Click(object sender, EventArgs e)
        {
            long max = saldo[0];

            int i=0;

            int pos = 0;

            for (i = 0; i < n; i++)
            {
                if(max < saldo[i])
                {
                    max = Math.Max(saldo[i], max);

                    pos = i;
                }
                
            }

            lblSaldo.Text = "il saldo massimo è di: " + nome[pos];
            
        }

        private void btnMedia_Click(object sender, EventArgs e)
        {
            long somma = 0, media = 0;

            for (int i = 0; i < n; i++)
            {
                somma = somma + saldo[i];
            }

            media = somma / n;

            lblMedia.Text = "la media dei saldi è: " + media;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void txtCercaConto_TextChanged(object sender, EventArgs e)
        {
            btnCercaConto.Enabled = true;
        }

        private void txtRicercaNome_TextChanged(object sender, EventArgs e)
        {
            btnCercaNome.Enabled = true;
        }











///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
