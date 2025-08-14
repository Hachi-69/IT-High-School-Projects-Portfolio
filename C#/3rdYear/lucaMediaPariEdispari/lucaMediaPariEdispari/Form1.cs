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
    public partial class frmLuca : Form
    {
        public frmLuca()
        {
            InitializeComponent();
        }

        private void btnCalcola_Click(object sender, EventArgs e)
        {
            int nNum, nP, nD, sommaP, sommaD, n, i;
            double mediaP, mediaD;

            nD = 0;
            nP = 0;
            sommaD = 0;
            sommaP = 0;

            nNum = Convert.ToInt16(txtnNum.Text);

            

            for (i = 0; i < nNum; i++)
            {

                n = Convert.ToInt16(Interaction.InputBox("inserisci un numero", "input"));

                if (n % 2 == 0 || n == 0)
                {
                    nP = nP + 1;
                    sommaP = sommaP + n;
                }

                else
                {
                    nD = nD + 1;
                    sommaD = sommaD + n;
                }

            }


            if (nP == 0)
            {
                nP = nP + 1;
            }

            if (nD == 0)
            {
                nD = nD + 1;
            }

            mediaP = sommaP / nP;

            mediaD = sommaD / nD;

            MessageBox.Show("la media dei pari e' " + mediaP);

            MessageBox.Show("la media dei dispari e' " + mediaD);

        }
    }
}
