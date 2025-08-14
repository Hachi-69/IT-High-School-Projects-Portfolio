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

       
        public int rnd,max = 0,min = 100,p,max1 = 0,min1 = 100;
        public Random random = new Random();
        public int posizioneiMax, posizionejMax, posizioneiMin, posizionejMin;
        public int posizioneiMax1, posizionejMax1, posizioneiMin1, posizionejMin1,x = 0;

        private void Form1_Load(object sender, EventArgs e)
        {
            

            grd.ColumnCount = 10;
            grd.RowCount = 10;

            for (int i = 0; i < 10; i++)
            {
                grd.Columns[i].Width = 59;
            }

            for (int j = 0; j < 10; j++)
            {
                grd.Rows[j].Height = 59; 
            }

            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {                      
                    rnd = random.Next(1, 1001);
                    grd.Rows[i].Cells[j].Value = rnd;
                }
            }

            for (int i = 0; i < 10; i++)
            {
                for (int j = x; j < 10; j++)
                {
                   grd[i,j].Style.BackColor = Color.Yellow;
                }
                x++;
            }

            x = 10;
            int h = 0;
            for (h = 0; h < 10; h++)
            {
                for (int j = 9; j >0 ; j--)
                {
                    grd[j, h].Style.BackColor = Color.Yellow;
                }
                x--;
            }

            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    p = int.Parse(grd[i, j].Value.ToString());

                    if (max<p)
                    {
                        max = p;
                        posizioneiMax = i;
                        posizionejMax = j;
                    }

                    if (min>p)
                    {
                        min = p;

                        posizioneiMin = i;
                        posizionejMin = j;
                    }   
                }
            }

            lbltxt.Text = "Il massimo e' " + max+"  ";
            lbltxt.Text += "Il minimo e' " + min;

            grd[posizioneiMax,posizionejMax].Style.BackColor = Color.Cyan;
            grd[posizioneiMin, posizionejMin].Style.BackColor = Color.Red;

            for (int i = 0; i < 10; i++)
            {
                p = int.Parse(grd[i, i].Value.ToString());

                if (max1 < p)
                {
                    max1 = p;
                    posizioneiMax1 = i;
                    posizionejMax1 = i;
                }

                if (min1 > p)
                {
                    min1 = p;

                    posizioneiMin1 = i;
                    posizionejMin1 = i;
                }

                grd[i, i].Style.BackColor = Color.Green;

                
            }
            grd[posizioneiMax1, posizionejMax1].Style.BackColor = Color.Violet;
            grd[posizioneiMin1, posizionejMin1].Style.BackColor = Color.Coral;

            lblDiagonale.Text = "Il massimo e' " + max1 + "  ";
            lblDiagonale.Text += "Il minimo e' " + min1;

        }



    }
}
