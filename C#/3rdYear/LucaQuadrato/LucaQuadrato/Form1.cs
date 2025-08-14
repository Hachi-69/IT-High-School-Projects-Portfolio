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
            int num, i, somma, somma2;
            somma = -1;
            somma2 = 0;

            num = Convert.ToInt16(txtN.Text);

            for (i = 0; i < num;i++)
            {
                somma = somma + 2;

                lstVisualizza.Items.Add(somma);

                somma2 = somma2 + somma;

            }

            MessageBox.Show("il quadrato del numero e' "+somma2);

            
        }
    }
}
