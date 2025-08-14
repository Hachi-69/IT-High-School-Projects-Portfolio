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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        struct giorno_temperatura
        {
            public string giorno;
            public double temperatura;
        }

        giorno_temperatura[] settimana = new giorno_temperatura[7];

        int i = 0;

        private void btnGiornoTemperatura_Click(object sender, EventArgs e)
        {
            if (txtGiorno.Text == "" || txttemperatura.Text == "")
            {
                MessageBox.Show("Riempire i campi");
            }

            else
            {
                bool errore = false;

                string parola = txttemperatura.Text;

                for (int c = 0; c < parola.Length; c++)
                {
                    char carattere = (char)parola[c];
                    int codice = (int)carattere;
                    if (codice > 57 || codice < 47)
                    {
                        errore = true;
                    }

                    if (errore == false)
                    {
                        if (i < 7)
                        {
                            settimana[i].giorno = txtGiorno.Text;
                            settimana[i].temperatura = Convert.ToDouble(parola);

                            lstLista.Items.Add("Il Giorno " + settimana[i].giorno + "\n");

                            lstLista.Items.Add(" C'erano: " + settimana[i].temperatura + " gradi" + "\n" + "\n");

                            lstLista.Visible = true;

                            txtGiorno.Text = "";
                            txttemperatura.Text = "";

                            btnGiornoTemperatura.Enabled = false;
                        }

                        else
                        {
                            MessageBox.Show("Array pieno");
                        }
                        
                        i++;
                    }
                    else
                    {
                        MessageBox.Show("Valore non valido");
                    }
                }          
            }
        }

        private void txttemperatura_TextChanged(object sender, EventArgs e)
        {
            btnGiornoTemperatura.Enabled = true;
        }

        private void txtGiorno_TextChanged(object sender, EventArgs e)
        {
            



        }

        private void btnMax_Click(object sender, EventArgs e)
        {

            double max = settimana[0].temperatura;

            for(i=0;i<settimana.Length;i++)
            {
                max = Math.Max(max, settimana[i].temperatura);

            }
            lblMax.Text = "La temperatura massima è: " + max + "°C";
            
        }

        private void btnMinimo_Click(object sender, EventArgs e)
        {
            double min = settimana[0].temperatura;

            for (i = 0; i < settimana.Length; i++)
            {
               min = Math.Min(min, settimana[i].temperatura);

            }

            lblMin.Text = "La temperatura minima è: " + min + "°C";
        }

        private void btnMedia_Click(object sender, EventArgs e)
        {

            double somma = 0,media=0;

            for (i = 0; i < settimana.Length; i++)
            {
                somma = somma + settimana[i].temperatura;

            }

            media = somma / i;

            lblMedia.Text = "La media delle temperature è " + media + "°C";

        }
    }
}
