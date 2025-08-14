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
            int n, i, st;

            n = Convert.ToInt16(txtn.Text);

            for(i=0;i<=n;i++)
            {
                st = n - i;

                lstRisultato.Items.Add(i + "+" + st);

            }
        }
    }
}
