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

        private void button1_Click(object sender, EventArgs e)
        {
            string parola1, parola2;
            bool rima = false;
            int i = 0,l1,l2;
            parola1 = "pane";
            parola2 = "cccc";
            l1 = parola1.Length;
            l2 = parola2.Length;

            while (rima == false)
            {

                if (i < l1 || i < l2)
                {
                    parola1 = parola1.Substring(i);
                    parola2 = parola2.Substring(i);

                    if (parola1 == parola2)
                    {
                        rima = true;
                    }

                    else
                    {
                        i++;
                    }  
                }     
              
            }

            if (i == 0)
            {
                MessageBox.Show("le parole sono uguali");
            }

            else if (i == 1 || i == 2 || i == 3 || i == 4)
            {
                MessageBox.Show("le parole fanno rima");
            }

            else
            {
                MessageBox.Show("le parole non fanno rima");
            }
              
        }
    }
}
