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

        private void btnCalcola_Click(object sender, EventArgs e)

        {
            string nome;

            double letturaAttuale, letturaPrecedente, consumo, spesa;

            const double fascia1 = 0.05;

            const double fascia2 = 0.07;

            const double canone = 37.5;

            letturaPrecedente = Convert.ToDouble(txtPrecedente.Text);

            letturaAttuale = Convert.ToDouble(txtAttuale.Text);

            consumo = letturaAttuale - letturaPrecedente;

            nome = (txtNome.Text);

            if (letturaAttuale < letturaPrecedente)
            {
                MessageBox.Show("Il valore attuale non può essere minore di quello precedente");

            }

            else

            {

                if (consumo < 100)
                {

                    spesa = consumo * fascia1 + canone;
                    MessageBox.Show("gentile " + nome + "la spesa rietra in fascia 1 ed è di " + spesa + " euro");

                }

                else
                {

                    spesa = consumo * fascia2 + canone;
                    MessageBox.Show("gentile " + nome + " la spesa rietra in fascia 2 ed è di " + spesa + " euro");

                }


            }

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void txtAttuale_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
