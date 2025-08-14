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
    public partial class frmMacchinettaLuca : Form
    {
        public frmMacchinettaLuca()
        {
            InitializeComponent();
        }

        double credito, resto;

        int progress;

        //btnAcquista.BackColor = Color.Blue;

        private void chk2_CheckedChanged(object sender, EventArgs e)
        {

            if (chk2.Checked == true)
            {
                credito = credito + 2;

                btnRitiraCredito.ForeColor = Color.Aqua;

                btnRitiraCredito.Enabled = true;

                grpBevanda.Enabled = true;

                optTe.ForeColor = Color.Cyan;

                optLatteMacchiato.ForeColor = Color.Cyan;

                optLatte.ForeColor = Color.Cyan;

                optCioccolata.ForeColor = Color.Cyan;

                optCappucino.ForeColor = Color.Cyan;

                optCaffe.ForeColor = Color.Cyan;

                grpBevanda.ForeColor = Color.Aqua;
            }

            lblCredito.Text = "Credito: " + (String.Format("{0:0.00}", credito) + "€");

            chk2.Checked = false;
        }

        private void chk1_CheckedChanged(object sender, EventArgs e)
        {

            if (chk1.Checked == true)
            {
                credito = credito + 1;

                btnRitiraCredito.ForeColor = Color.Aqua;

                btnRitiraCredito.Enabled = true;

                grpBevanda.Enabled = true;

                optTe.ForeColor = Color.Cyan;

                optLatteMacchiato.ForeColor = Color.Cyan;

                optLatte.ForeColor = Color.Cyan;

                optCioccolata.ForeColor = Color.Cyan;

                optCappucino.ForeColor = Color.Cyan;

                optCaffe.ForeColor = Color.Cyan;

                grpBevanda.ForeColor = Color.Aqua;
            }

            lblCredito.Text = "Credito: " + (String.Format("{0:0.00}", credito) + "€");

            chk1.Checked = false;
        }

        private void chk50_CheckedChanged(object sender, EventArgs e)
        {
            if (chk50.Checked == true)
            {
                credito = credito + 0.50;

                btnRitiraCredito.ForeColor = Color.Aqua;

                btnRitiraCredito.Enabled = true;

                grpBevanda.Enabled = true;

                optTe.ForeColor = Color.Cyan;

                optLatteMacchiato.ForeColor = Color.Cyan;

                optLatte.ForeColor = Color.Cyan;

                optCioccolata.ForeColor = Color.Cyan;

                optCappucino.ForeColor = Color.Cyan;

                optCaffe.ForeColor = Color.Cyan;

                grpBevanda.ForeColor = Color.Aqua;
            }

            lblCredito.Text = "Credito: " + (String.Format("{0:0.00}", credito) + "€");

            chk50.Checked = false;
        }

        private void chk20_CheckedChanged(object sender, EventArgs e)
        {
            if (chk20.Checked == true)
            {
                credito = credito + 0.20;

                btnRitiraCredito.ForeColor = Color.Aqua;

                btnRitiraCredito.Enabled = true;

                if (credito >= 0.40)
                {
                    grpBevanda.Enabled = true;

                    optTe.ForeColor = Color.Cyan;

                    optLatteMacchiato.ForeColor = Color.Cyan;

                    optLatte.ForeColor = Color.Cyan;

                    optCioccolata.ForeColor = Color.Cyan;

                    optCappucino.ForeColor = Color.Cyan;

                    optCaffe.ForeColor = Color.Cyan;

                    grpBevanda.ForeColor = Color.Aqua;
                }
            }

            lblCredito.Text = "Credito: " + (String.Format("{0:0.00}", credito) + "€");

            chk20.Checked = false;
        }

        private void chk10_CheckedChanged(object sender, EventArgs e)
        {
            if (chk10.Checked == true)
            {
                credito = credito + 0.10;

                btnRitiraCredito.ForeColor = Color.Aqua;

                btnRitiraCredito.Enabled = true;      
            }

            if (credito >= 0.40)
            {
                grpBevanda.Enabled = true;

                optTe.ForeColor = Color.Cyan;

                optLatteMacchiato.ForeColor = Color.Cyan;

                optLatte.ForeColor = Color.Cyan;

                optCioccolata.ForeColor = Color.Cyan;

                optCappucino.ForeColor = Color.Cyan;

                optCaffe.ForeColor = Color.Cyan;

                grpBevanda.ForeColor = Color.Aqua;
            }

            lblCredito.Text = "Credito: "+(String.Format("{0:0.00}", credito) + "€");

            chk10.Checked = false;
        }

        private void btnRitiraCredito_Click(object sender, EventArgs e)
        {

            resto = credito;

            lblResto.Text = "Resto: " + (String.Format("{0:0.00}", resto) + "€");

            credito=0;

            lblCredito.Text = "Credito: " + (String.Format("{0:0.00}", credito) + "€");

            grpBevanda.Enabled = false;

        }

        private void optLatte_CheckedChanged(object sender, EventArgs e)
        {
            btnAcquista.Enabled = true;
        }

        private void optCappucino_CheckedChanged(object sender, EventArgs e)
        {
            btnAcquista.Enabled = true;
        }

        private void optCioccolata_CheckedChanged(object sender, EventArgs e)
        {
            btnAcquista.Enabled = true;
        }

        private void optCaffe_CheckedChanged(object sender, EventArgs e)
        {
            btnAcquista.Enabled = true;
        }

        private void optLatteMacchiato_CheckedChanged(object sender, EventArgs e)
        {
            btnAcquista.Enabled = true;
        }

        private void optTe_CheckedChanged(object sender, EventArgs e)
        {
            btnAcquista.Enabled = true;
        }

        private void btnAcquista_Click(object sender, EventArgs e)
        {
            if (credito >= 0.40)
            {
                resto = credito - 0.40;

                lblResto.Text = "Resto: " + (String.Format("{0:0.00}", resto) + "€");

                credito = 0;

                lblCredito.Text = "Credito: " + (String.Format("{0:0.00}", credito) + "€");
            }

           

            grpBevanda.Enabled = false;

            btnAcquista.Enabled = false;

            timer1.Enabled = true;

            timer1.Interval = 100;

            prgAttendi.Visible = true;

            grpBevanda.Visible = false;

            btnAcquista.Visible = false;

            lblCredito.Visible = false;

            lblPrezzo.Visible = false;

            grpSoldi.Visible = false;

            btnRitiraCredito.Visible = false;

            lblAttendi.Visible = true;

            lblResto.Visible = true;

        }
        

        private void pctCappuccino_Click(object sender, EventArgs e)
        {
            pctCappuccino.Visible = false;

            progress = 0;

            prgAttendi.Visible = false;

            grpBevanda.Visible = true;

            btnAcquista.Visible = true;

            lblCredito.Visible = true;

            lblPrezzo.Visible = true;

            lblResto.Visible = true;

            grpSoldi.Visible = true;

            btnRitiraCredito.Visible = true;
        }

        private void pctLatte_Click(object sender, EventArgs e)
        {
            pctLatte.Visible = false;

            progress = 0;

            prgAttendi.Visible = false;

            grpBevanda.Visible = true;

            btnAcquista.Visible = true;

            lblCredito.Visible = true;

            lblPrezzo.Visible = true;

            lblResto.Visible = true;

            grpSoldi.Visible = true;

            btnRitiraCredito.Visible = true;
        }

        private void pctMacchiato_Click(object sender, EventArgs e)
        {
            pctMacchiato.Visible = false;

            progress = 0;

            prgAttendi.Visible = false;

            grpBevanda.Visible = true;

            btnAcquista.Visible = true;

            lblCredito.Visible = true;

            lblPrezzo.Visible = true;

            lblResto.Visible = true;

            grpSoldi.Visible = true;

            btnRitiraCredito.Visible = true;
        }

        private void pctCioccolata_Click(object sender, EventArgs e)
        {
            pctCioccolata.Visible = false;

            progress = 0;

            prgAttendi.Visible = false;

            grpBevanda.Visible = true;

            btnAcquista.Visible = true;

            lblCredito.Visible = true;

            lblPrezzo.Visible = true;

            lblResto.Visible = true;

            grpSoldi.Visible = true;

            btnRitiraCredito.Visible = true;
        }

        private void pctCaffe_Click(object sender, EventArgs e)
        {
            pctCaffe.Visible = false;

            progress = 0;

            prgAttendi.Visible = false;

            grpBevanda.Visible = true;

            btnAcquista.Visible = true;

            lblCredito.Visible = true;

            lblPrezzo.Visible = true;

            lblResto.Visible = true;

            grpSoldi.Visible = true;

            btnRitiraCredito.Visible = true;
        }

        private void pctTe_Click(object sender, EventArgs e)
        {
            pctTe.Visible = false;

            progress = 0;

            prgAttendi.Visible = false;

            grpBevanda.Visible = true;

            btnAcquista.Visible = true;

            lblCredito.Visible = true;

            lblPrezzo.Visible = true;

            lblResto.Visible = true;

            grpSoldi.Visible = true;

            btnRitiraCredito.Visible = true;
        }



        private void timer1_Tick(object sender, EventArgs e)
        {
            progress = progress + 2;

            prgAttendi.Value = progress;

            if (progress >= 100)

            {
                timer1.Enabled = false;

                timer1.Stop();

                if (optCaffe.Checked == true) 

                {
                    pctCaffe.Visible = true;
                }

                else if (optCappucino.Checked == true)

                {
                    pctCappuccino.Visible = true;
                }

                else if (optTe.Checked == true)

                {
                    pctTe.Visible = true;
                }

                else if (optCioccolata.Checked == true)

                {
                    pctCioccolata.Visible = true;
                }

                else if (optLatte.Checked == true)
                {
                    pctLatte.Visible = true;
                }

                else

                {
                    pctMacchiato.Visible = true;
                }

                MessageBox.Show("RITIRA LA BEVANDA");
            }
       }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void grpBevanda_Enter(object sender, EventArgs e)
        {

        }
















//////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
