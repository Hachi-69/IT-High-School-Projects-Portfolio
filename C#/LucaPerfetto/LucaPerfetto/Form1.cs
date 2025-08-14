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
            int numero, i, somma, valoreAnalizzato;
           
            somma = 0;

            if (!int.TryParse(txtN.Text, out valoreAnalizzato))
            {
                MessageBox.Show("inserire un valore numerico");
                return;
            }

            numero = Convert.ToInt16(txtN.Text);

            for (i = 1; i < numero; i++)
            {
                if (numero % i == 0) 
                { 
                    somma = somma + i; 
                }
            }

            if (somma == numero) 
            {
                MessageBox.Show("il numero è perfetto"); 
            }

            else 
            { 
                MessageBox.Show("il numero non è perfetto"); 
            }
        }
    }
}
