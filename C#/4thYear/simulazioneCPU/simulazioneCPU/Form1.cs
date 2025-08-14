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

        public Random rnd = new Random();

        string[] rndnome_array = new string[] { "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "p30", "p31", "p32", "p33", "p34", "p35", "p36", "p37", "p38", "p39", "p40", "p41", "p42", "p43", "p44", "p45", "p46", "p47", "p48", "p49", "p50", "p51", "p52", "p53", "54", "p55", "p56", "p57", "p58", "p59", "p60", "p61", "p62", "p63", "p64", "p65", "p66", "p67", "p68", "p69", "p70", "p71", "p72", "p73", "p74", "p75", "p76", "p77", "p78", "p79", "p80", "p81", "p82", "p83", "p84", "p85", "p86", "p87", "p88", "p89", "p90", "p91", "p92", "p93", "p94", "p95", "p96", "p97", "p98", "p99"};

        int[] durata_array = new int[3];
        int[] priorita_array = new int[3];
        string[] nomi_array = new string[3];

        public int rnd_nome;
        public int rnd_durata;
        public int rnd_priorita;

        bool unaVolta = false;

        public int x = 0;
        public int y = 0;
        public int z = 0;


        private void btnRun_Click(object sender, EventArgs e)
        {
            if (rdbFCFS.Checked == true)
            {
                txtTempoRimasto.Text = Convert.ToString(durata_array[x]);
                txtProcessoAttivo.Text = Convert.ToString(nomi_array[x]);
                txtPriorita.Text = Convert.ToString(priorita_array[x]);
                durata_array[x]--;

                if (durata_array[x] <= 0 && txtTempoRimasto.Text == "0")
                {
                    x++;
                }
            }


            else if (rdbSJF.Checked == true)
            {
                int posMin = 0;

                for (int i = 0; i < 3; i++)
                {
                    if (durata_array[posMin] > durata_array[i])
                    {
                        posMin = i;
                    }
                }

                if (durata_array[posMin] <= 10)
                {
                    txtTempoRimasto.Text = Convert.ToString(durata_array[posMin]);

                    txtProcessoAttivo.Text = Convert.ToString(nomi_array[posMin]);

                    txtPriorita.Text = Convert.ToString(priorita_array[posMin]);

                    durata_array[posMin]--;
                }

                if (durata_array[posMin] <= 0 && txtTempoRimasto.Text == "0")
                {
                    durata_array[posMin] = 11;
                }
            }

            else if (rdbPriorita.Checked == true)
            {
                int posMax = 0;

                for (int i = 0; i < 3; i++)
                {
                    if (priorita_array[posMax] < priorita_array[i])
                    {
                        posMax = i;
                    }
                }

                if (durata_array[posMax] <= 10)
                {
                    txtTempoRimasto.Text = Convert.ToString(durata_array[posMax]);

                    txtProcessoAttivo.Text = Convert.ToString(nomi_array[posMax]);

                    txtPriorita.Text = Convert.ToString(priorita_array[posMax]);

                    durata_array[posMax]--;
                }

                if (durata_array[posMax] <= 0 && txtTempoRimasto.Text == "0")
                {
                    priorita_array[posMax] = 0;
                }
            }
        }

        private void btnDati_Click(object sender, EventArgs e)
        {
            rdbFCFS.Focus();
            for (int i = 0; i < 3; i++)
            {
                
                rnd_durata = rnd.Next(1, 11);
                rnd_priorita = rnd.Next(1, 11);

                listViewDurata.Items.Add(Convert.ToString(rnd_durata));
                durata_array[i] = rnd_durata;

                listViewPriorita.Items.Add(Convert.ToString(rnd_priorita));
                priorita_array[i] = rnd_priorita;
            }

            for (int i = 0; i < 3; i++)
            {
                rnd_nome = rnd.Next(0, 99);
                listViewNome.Items.Add(rndnome_array[rnd_nome]);
                nomi_array[i] = rndnome_array[rnd_nome];
            }

            btnDati.Enabled = false;
            rdbFCFS.Enabled = true;
            rdbPriorita.Enabled = true;
            rdbSJF.Enabled = true;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void rdbPriorita_CheckedChanged(object sender, EventArgs e)
        {
            btnRun.Enabled = true;
        }

        private void rdbFCFS_CheckedChanged(object sender, EventArgs e)
        {
            btnRun.Enabled = true;
        }

        private void rdbSJF_CheckedChanged(object sender, EventArgs e)
        {
            btnRun.Enabled = true;
        }
    }
}
