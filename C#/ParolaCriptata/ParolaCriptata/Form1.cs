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
    public partial class frmLuca : Form
    {
        public frmLuca()
        {
            InitializeComponent();
        }

        string Parola, Chiavetxt, parolaCrypt,parolaDeCrypt;
        int LunghezzaParola,Chiavenum,CarattereCriptato,i=0;
        char Carattere;

        private void btnCripta_Click(object sender, EventArgs e)
        {
            Parola = txtParola.Text.ToLower();
            Chiavetxt = txtChiave.Text;
            LunghezzaParola=Parola.Length;
            Chiavenum=Convert.ToInt32(Chiavetxt);

            if (Chiavenum > 26)
            {
                Chiavenum = Chiavenum % 26;
            }
            for (i = 0; i < LunghezzaParola; i++)
            {
                int codice;

                codice = (int)Parola[i];

                if (codice == 32)
                {
                    parolaCrypt = parolaCrypt + (char)32;
                }
                else
                {
                    if (codice <= 122 && codice >= 97)
                    {
                        Carattere = Parola[i];
                        CarattereCriptato = (int)Carattere + Chiavenum;

                        if (CarattereCriptato > 122)
                        {
                            CarattereCriptato = CarattereCriptato - 26;
                        }
                        parolaCrypt = parolaCrypt + (char)CarattereCriptato;
                    }
                    else
                    {
                        codice = codice - 26;
                    }
                }
            }
            lblParolaCriptata.Text = parolaCrypt;
        }

        private void btnDecripta_Click(object sender, EventArgs e)
        {
            Carattere = ' ';
            CarattereCriptato = 0;
            LunghezzaParola = parolaCrypt.Length;

            for (i = 0; i < LunghezzaParola; i++)
            {
                int codice=0;

                codice = (int)parolaCrypt[i];

                if (codice == 32)
                {
                    parolaDeCrypt = parolaDeCrypt + (char)32;
                }

                else
                {

                    if (codice <= 122 && codice >= 97)
                    {
                        Carattere = parolaCrypt[i];
                        CarattereCriptato = (int)Carattere - Chiavenum;
                    }

                    if (CarattereCriptato < 97)
                    {
                        CarattereCriptato = CarattereCriptato + 26;
                    }
                    parolaDeCrypt = parolaDeCrypt + (char)CarattereCriptato;
                }
            }
            lblParolaDecriptata.Text = parolaDeCrypt;
        }

        private void btnResetta_Click(object sender, EventArgs e)
        {
            parolaDeCrypt = "";
            parolaCrypt = "";
            txtParola.Text = "";
            txtChiave.Text = "";
            CarattereCriptato = ' ';
            Carattere = ' ';
            Chiavenum = 0;
            Chiavetxt= "";
            LunghezzaParola = 0;
            lblParolaDecriptata.Text = parolaDeCrypt;
            lblParolaCriptata.Text = parolaCrypt;
        }
    }
}
