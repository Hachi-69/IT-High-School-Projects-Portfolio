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

        public int P1 = 6, P2 = 9, P3 = 4, P4 = 5, Q = 3,i = 0;
        public int T1, T2, T3, T4,Tm;

        public bool P1t = false, P2t = false, P3t = false, P4t = false;
          
        private void button1_Click(object sender, EventArgs e)
        {
                if (i == 4)
                {
                    MessageBox.Show("tutti i processi terminati"); 
                }
                else
                {
                    if (P1t == false)
                    {
                        if (P1 >= Q)
                        {
                            P1 = P1 - Q;
                        }
                        else
                        {
                            P1 = P1 - P1;
                        }

                        if (P1 == 0)
                        {
                            i++;
                            P1t = true;
                            T1 = 12-3;
                            lbltw1.Text = "TW1 = " + T1;
                            MessageBox.Show("P1 terminato");
                        }
                    }
                    lbl1.Text = "P1 = " + P1;



                    if (P2t == false)
                    {
                        if (P2 >= Q)
                        {
                            P2 = P2 - Q;
                        }
                        else
                        {
                            P2 = P2 - P2;
                        }


                        if (P2 == 0)
                        {

                            i++;
                            P2t = true;
                            T2 = 3+(15-6)+(21-18);
                            lbltw2.Text = "TW2 = " + T2;
                            MessageBox.Show("P2 terminato");
                        }
                    }
                    lbl2.Text = "P2 = " + P2;




                    if (P3t == false)
                    {
                        if (P3 >= Q)
                        {
                            P3 = P3 - Q;
                        }
                        else
                        {
                            P3 = P3 - P3;
                        }


                        if (P3 == 0)
                        {
                            i++;
                            P3t = true;
                            T3 = 6+(18-9);
                            lbltw3.Text = "TW3 = " + T3;
                            MessageBox.Show("P3 terminato");
                        }
                    }
                    lbl3.Text = "P3 = " + P3;




                    if (P4t == false)
                    {
                        if (P4 >= Q)
                        {
                            P4 = P4 - Q;
                        }
                        else
                        {
                            P4 = P4 - P4;
                        }


                        if (P4 == 0)
                        {
                            i++;
                            P4t = true;
                            T4 = 9+(19-12);
                            lbltw4.Text = "TW4 = " + T4;
                            MessageBox.Show("P4 terminato");
                        }
                    }
                    lbl4.Text = "P4 = " + P4;
                }

                if (i == 4)
                {
                    MessageBox.Show("tutti i processi terminati");
                    Tm=(T1+T2+T3+T4)/4;
                    lblTWm.Text = "TWm = " + Tm;
                }
            

        }


////////////////////////////////////////////////////////////////////////////
    }
}
