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

        public int n,p,c,r,x,ran;

        public Random rnd1;

        private void Form1_Load(object sender, EventArgs e)
        {
            

            n = Convert.ToInt16(Interaction.InputBox("Quante righe e colonne?"));
            grdMat.ColumnCount = n;
            grdMat.RowCount = n;

            p = Convert.ToInt16(Interaction.InputBox("Quanti pixel?"));

            for (c = 0; c < n; c++)
            {
                grdMat.Columns[c].Width = p;
            }

            for (r = 0; r < n; r++)
            {
                grdMat.Rows[r].Height = p;
            }

            for (r = 0; r < n; r++)
            {
                for (c = 0; c < n; c++)
                {
                    rnd1 = new Random();
                    ran = rnd1.Next(1, n);
                    grdMat.Rows[r].Cells[c].Value = ran;
                }
            }
        }
    }
}
