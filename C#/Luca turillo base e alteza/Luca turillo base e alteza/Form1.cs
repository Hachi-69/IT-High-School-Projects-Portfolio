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
    public partial class frmRettangolo : Form
    {
        public frmRettangolo()
        {
            InitializeComponent();
        }

        private void btnCalcola_Click(object sender, EventArgs e)
        {
            double bMaggiore, bMinore, Altezza, area, perimetro, cateto, ipotenusa, latoObliquo;

                bMaggiore = Convert.ToDouble(txtbMaggiore.Text);

                bMinore = Convert.ToDouble(txtbMinore.Text);

                Altezza = Convert.ToDouble(txtAltezza.Text);

                area = ((bMaggiore + bMinore) * Altezza) / 2;

                cateto = ((bMaggiore - bMinore) / 2);

                ipotenusa = (cateto * cateto) + (Altezza * Altezza);

                latoObliquo = Math.Sqrt(ipotenusa);

                perimetro = latoObliquo * 2 + bMaggiore + bMinore;

            MessageBox.Show("il perimetro è " + perimetro);

            MessageBox.Show("l'area è " + area);
        }

        private void frmRettangolo_Load(object sender, EventArgs e)
        {

        }
    }
}
