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
            int num, x, a;

            a = Convert.ToInt16(txtA.Text);

            num = Convert.ToInt16(txtNum.Text);


            for (int i = 0; i < num; i++)
            {
                x = Convert.ToInt16(Interaction.InputBox("inserisci numeri", "", ""));

                if (x % a == 0)
                {
                    MessageBox.Show("E' multiplo");

                }

                else
                {
                    MessageBox.Show("Non è multiplo");

                }
            }
        }
    }
}