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

        private void btnLunghezza_Click(object sender, EventArgs e)
        {
            string Lunghezza;

            Lunghezza =(txtParola.Text);

            int l = Lunghezza.Length;

            lbl1.Text = "La Lunghezza e' " + l;
        }

        private void btnVocECon_Click(object sender, EventArgs e)
        {
            string parola;

            parola = Convert.ToString(txtParola.Text).ToLower();

            byte ContatoreV = 0,ContatoreC = 0;

            int l = parola.Length;

            for (byte i = 0; i < l; i++)
            {

                int codice;

                codice=(int)parola[i];

                if (codice <= 122 && codice >= 97)
                {

                    if (parola[i] == 'a' || parola[i] == 'e' || parola[i] == 'i' || parola[i] == 'o' || parola[i] == 'u')
                    {
                        ContatoreV++;
                    }

                    else
                    {
                        ContatoreC++;
                    }
                    
                }

            }

            lbl3.Text = "le vocali sono " + ContatoreV + " le consonanti sono " + ContatoreC;
        }

        private void btnDoppie_Click(object sender, EventArgs e)
        {
            string Lunghezza;

            Lunghezza = Convert.ToString(txtParola.Text);

            byte Contatore = 0;

            int l = Lunghezza.Length;

            char c=' ';

            Lunghezza = Lunghezza.ToLower();

            for (byte i = 0; i < l; i++)
            {
                if (c == Lunghezza[i])
                {
                    Contatore += 1;
                }
                c = Lunghezza[i];
            }

            lbl2.Text = "Le doppie sono " + Contatore;
        }

        private void btnCarattere_Click(object sender, EventArgs e)
        {
            string Lunghezza,parola;

            Lunghezza = Convert.ToString(txtParola.Text);

            int Contatore = 0;

            char c;

            if (txtCarattere.Text == "")
            {
                MessageBox.Show("inserire un carattere");
            }

            else
            {
                c = Convert.ToChar(txtCarattere.Text.ToLower());

                parola = txtParola.Text;

                int l = parola.Length;

                parola = parola.ToLower();

                if (c == ' ')
                {
                    MessageBox.Show("inserisci un carattere");
                }

                else
                {
                    for (byte i = 0; i < l; i++)
                    {
                        if (c == parola[i])
                        {
                            Contatore = Contatore + 1;
                        }
                    }
                    lbl4.Text = "caratteri = " + Contatore;
                }
            }

            
        }

        private void btnMaiuscola_Click(object sender, EventArgs e)
        {
            string parola;

            parola = Convert.ToString(txtParola.Text).ToLower();

            int l = parola.Length;

            string minuscolo, maiuscolo, upper;

            byte i = 0;

            bool c = true;

            while (c==true)
            {
                i=i++;

                int codice;

                codice = (int)parola[i];

                if (codice <= 122 && codice >= 97)
                {
                    parola = txtParola.Text;

                    minuscolo = parola.Substring(1).ToLower();

                    upper = Convert.ToString(parola[i]);

                    maiuscolo = upper.ToUpper();

                    lbl5.Text = maiuscolo + minuscolo;

                    c = false;
                }

            }

        }

        private void btnPalindroma_Click(object sender, EventArgs e)
        {
            char par;

            string stringa = "";

            string parola;

            int lunghezza, i;

            parola = Convert.ToString(txtParola.Text);

            parola = parola.ToLower();

            parola = parola.Replace(" ", "");

            lunghezza = parola.Length;

            for (i = lunghezza-1; i >= 0; i--)
            {

                par = parola[i];

                stringa = stringa + par;

                if (stringa == parola)
                {
                    lbl6.Text = ("la parola e' palindroma");
                }

                else
                {
                    lbl6.Text = ("la parola non e' palindroma");
                }

            }
        }













///////////////////////////////////////
    }
}
