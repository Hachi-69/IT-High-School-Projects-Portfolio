namespace WindowsFormsApplication1
{
    public partial class FrameFilosofi : Form
    {
        public FrameFilosofi()
        {
            InitializeComponent();
        }

        public int[] filosofi = new int[5];
        public bool[] forchette = new bool[5];
        public int[] durate = new int[5];
        public Random r = new Random();
        public int i = 0;

        Label[] lblAttesa = new Label[5];

        PictureBox[] pctMangia = new PictureBox[5];
        PictureBox[] pctDorme = new PictureBox[5];
        PictureBox[] pctAttesa = new PictureBox[5];
        PictureBox[] pctForchette = new PictureBox[5];

        private void Form1_Load(object sender, EventArgs e)
        {
            for (int j = 0; j < 5; j++)
            {
                filosofi[j] = 2;
                forchette[j] = false;
                durate[j] = 0;
            }
        }

        private void btnRUN_Click(object sender, EventArgs e)
        {
            timer1.Start();
            btnRUN.Enabled = false;
            btnStop.Enabled = true;
            timer1.Interval = Convert.ToInt16(txtTimerTick.Text);
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            for (int i = 0; i < 5; i++)
            {

                if (filosofi[i] == 0)
                {
                    durate[i]--;

                    if (i == 0)
                    {

                        if (durate[i] == 0)
                        {
                            filosofi[i] = 1;
                            forchette[i] = false;
                            forchette[i + 4] = false;
                            durate[i] = r.Next(1, 11);
                        }
                    }
                    else
                    {

                        if (durate[i] == 0)
                        {
                            filosofi[i] = 1;
                            forchette[i] = false;
                            forchette[i - 1] = false;
                            durate[i] = r.Next(1, 11);
                        }
                    }
                }
                else if (filosofi[i] == 1)
                {
                    durate[i]--;

                    if (durate[i] == 0)
                    {
                        filosofi[i] = 2;
                        durate[i] = 0;
                    }

                    if (i == 0)
                    {

                    }
                    else
                    {

                    }
                }
                else if (filosofi[i] == 2)
                {

                    if (i == 0)
                    {

                        if (forchette[i] == false && forchette[i + 4] == false)
                        {
                            filosofi[i] = 0;
                            forchette[i] = true;
                            forchette[i + 4] = true;
                            durate[i] = r.Next(1, 11);
                        }
                    }
                    else
                    {

                        if (forchette[i] == false && forchette[i - 1] == false)
                        {
                            filosofi[i] = 0;
                            forchette[i] = true;
                            forchette[i - 1] = true;
                            durate[i] = r.Next(1, 11);
                        }
                    }

                }
                i++;

                if (i == 5)
                {
                    i = 0;
                }
            }


            lblAttesa[0] = lblAttesa1;
            lblAttesa[1] = lblAttesa2;
            lblAttesa[2] = lblAttesa3;
            lblAttesa[3] = lblAttesa4;
            lblAttesa[4] = lblAttesa5;

            pctMangia[0] = pctFilMang1;
            pctMangia[1] = pctFilMang2;
            pctMangia[2] = pctFilMang3;
            pctMangia[3] = pctFilMang4;
            pctMangia[4] = pctFilMang5;

            pctDorme[0] = pctFilDorm1;
            pctDorme[1] = pctFilDorm2;
            pctDorme[2] = pctFilDorm3;
            pctDorme[3] = pctFilDorm4;
            pctDorme[4] = pctFilDorm5;

            pctAttesa[0] = pctFilAtt1;
            pctAttesa[1] = pctFilAtt2;
            pctAttesa[2] = pctFilAtt3;
            pctAttesa[3] = pctFilAtt4;
            pctAttesa[4] = pctFilAtt5;

            pctForchette[0] = pctForch1;
            pctForchette[1] = pctForch2;
            pctForchette[2] = pctForch3;
            pctForchette[3] = pctForch4;
            pctForchette[4] = pctForch5;

            for (int i = 0; i < 5; i++)
            {

                if (filosofi[i] == 0)
                {
                    pctMangia[i].Visible = true;
                    pctDorme[i].Visible = false;
                    pctAttesa[i].Visible = false;
                }

                if (filosofi[i] == 1)
                {
                    pctDorme[i].Visible = true;
                    pctMangia[i].Visible = false;
                    pctAttesa[i].Visible = false;
                }

                if (filosofi[i] == 2)
                {
                    pctAttesa[i].Visible = true;
                    pctDorme[i].Visible = false;
                    pctMangia[i].Visible = false;
                }

                if (forchette[i])
                {
                    pctForchette[i].Visible = true;
                }

                else
                {
                    pctForchette[i].Visible = false;
                }

                lblAttesa[i].Text = Convert.ToString("Durata: " + durate[i]);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            timer1.Stop();
            btnRUN.Enabled = true;
            btnStop.Enabled = false;
        }

        private void btnEXIT_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void txtTimerTick_TextChanged(object sender, EventArgs e)
        {
            btnRUN.Enabled = true;
        }


    }
}

