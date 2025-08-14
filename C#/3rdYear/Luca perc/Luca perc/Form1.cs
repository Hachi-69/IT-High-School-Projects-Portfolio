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

        private void button1_Click(object sender, EventArgs e)
        {
            int nP,nN, nNumeri, i;

                nP = 0;

                nN = 0;

                double n,percP,percN;
            
            nNumeri = Convert.ToInt16(txtnNumeri.Text);

            for (i = 0; i < nNumeri; i++)
            {
                n = Convert.ToDouble(Interaction.InputBox("Inserisci un numero", "input"));

                if(n>=0)
                {
                    nP=nP+1;
                }

                else
                {
                    nN = nN + 1;
                }
            }

            percP = (nP * 100) / nNumeri;

            percN = (nN * 100) / nNumeri;

            MessageBox.Show(percN +"-"+ percP);

        }
    }
}
