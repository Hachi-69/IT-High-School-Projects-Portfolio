namespace WindowsFormsApplication1
{
    partial class frmMacchinettaLuca
    {
        /// <summary>
        /// Variabile di progettazione necessaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Liberare le risorse in uso.
        /// </summary>
        /// <param name="disposing">ha valore true se le risorse gestite devono essere eliminate, false in caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Codice generato da Progettazione Windows Form

        /// <summary>
        /// Metodo necessario per il supporto della finestra di progettazione. Non modificare
        /// il contenuto del metodo con l'editor di codice.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.grpBevanda = new System.Windows.Forms.GroupBox();
            this.optLatte = new System.Windows.Forms.RadioButton();
            this.optCappucino = new System.Windows.Forms.RadioButton();
            this.optCioccolata = new System.Windows.Forms.RadioButton();
            this.optCaffe = new System.Windows.Forms.RadioButton();
            this.optLatteMacchiato = new System.Windows.Forms.RadioButton();
            this.optTe = new System.Windows.Forms.RadioButton();
            this.grpSoldi = new System.Windows.Forms.GroupBox();
            this.chk2 = new System.Windows.Forms.CheckBox();
            this.chk1 = new System.Windows.Forms.CheckBox();
            this.chk50 = new System.Windows.Forms.CheckBox();
            this.chk20 = new System.Windows.Forms.CheckBox();
            this.chk10 = new System.Windows.Forms.CheckBox();
            this.btnAcquista = new System.Windows.Forms.Button();
            this.btnRitiraCredito = new System.Windows.Forms.Button();
            this.lblCredito = new System.Windows.Forms.Label();
            this.lblResto = new System.Windows.Forms.Label();
            this.lblPrezzo = new System.Windows.Forms.Label();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.prgAttendi = new System.Windows.Forms.ProgressBar();
            this.lblAttendi = new System.Windows.Forms.Label();
            this.pctCioccolata = new System.Windows.Forms.PictureBox();
            this.pctLatte = new System.Windows.Forms.PictureBox();
            this.pctMacchiato = new System.Windows.Forms.PictureBox();
            this.pctCappuccino = new System.Windows.Forms.PictureBox();
            this.pctCaffe = new System.Windows.Forms.PictureBox();
            this.pctTe = new System.Windows.Forms.PictureBox();
            this.grpBevanda.SuspendLayout();
            this.grpSoldi.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pctCioccolata)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctLatte)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctMacchiato)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctCappuccino)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctCaffe)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctTe)).BeginInit();
            this.SuspendLayout();
            // 
            // grpBevanda
            // 
            this.grpBevanda.BackColor = System.Drawing.Color.DarkGray;
            this.grpBevanda.Controls.Add(this.optLatte);
            this.grpBevanda.Controls.Add(this.optCappucino);
            this.grpBevanda.Controls.Add(this.optCioccolata);
            this.grpBevanda.Controls.Add(this.optCaffe);
            this.grpBevanda.Controls.Add(this.optLatteMacchiato);
            this.grpBevanda.Controls.Add(this.optTe);
            this.grpBevanda.Enabled = false;
            this.grpBevanda.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.grpBevanda.Location = new System.Drawing.Point(79, 87);
            this.grpBevanda.Name = "grpBevanda";
            this.grpBevanda.Size = new System.Drawing.Size(310, 210);
            this.grpBevanda.TabIndex = 0;
            this.grpBevanda.TabStop = false;
            this.grpBevanda.Text = "Scegli La Bevanda";
            this.grpBevanda.Enter += new System.EventHandler(this.grpBevanda_Enter);
            // 
            // optLatte
            // 
            this.optLatte.AutoSize = true;
            this.optLatte.Location = new System.Drawing.Point(166, 160);
            this.optLatte.Name = "optLatte";
            this.optLatte.Size = new System.Drawing.Size(58, 23);
            this.optLatte.TabIndex = 5;
            this.optLatte.TabStop = true;
            this.optLatte.Text = "Latte";
            this.optLatte.UseVisualStyleBackColor = true;
            this.optLatte.CheckedChanged += new System.EventHandler(this.optLatte_CheckedChanged);
            // 
            // optCappucino
            // 
            this.optCappucino.AutoSize = true;
            this.optCappucino.Location = new System.Drawing.Point(6, 160);
            this.optCappucino.Name = "optCappucino";
            this.optCappucino.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.optCappucino.Size = new System.Drawing.Size(100, 23);
            this.optCappucino.TabIndex = 4;
            this.optCappucino.TabStop = true;
            this.optCappucino.Text = "Cappuccino";
            this.optCappucino.UseVisualStyleBackColor = true;
            this.optCappucino.CheckedChanged += new System.EventHandler(this.optCappucino_CheckedChanged);
            // 
            // optCioccolata
            // 
            this.optCioccolata.AutoSize = true;
            this.optCioccolata.Location = new System.Drawing.Point(166, 101);
            this.optCioccolata.Name = "optCioccolata";
            this.optCioccolata.Size = new System.Drawing.Size(132, 23);
            this.optCioccolata.TabIndex = 3;
            this.optCioccolata.TabStop = true;
            this.optCioccolata.Text = "Cioccolata Calda";
            this.optCioccolata.UseVisualStyleBackColor = true;
            this.optCioccolata.CheckedChanged += new System.EventHandler(this.optCioccolata_CheckedChanged);
            // 
            // optCaffe
            // 
            this.optCaffe.AutoSize = true;
            this.optCaffe.Location = new System.Drawing.Point(38, 101);
            this.optCaffe.Name = "optCaffe";
            this.optCaffe.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.optCaffe.Size = new System.Drawing.Size(60, 23);
            this.optCaffe.TabIndex = 2;
            this.optCaffe.TabStop = true;
            this.optCaffe.Text = "Caffè";
            this.optCaffe.UseVisualStyleBackColor = true;
            this.optCaffe.CheckedChanged += new System.EventHandler(this.optCaffe_CheckedChanged);
            // 
            // optLatteMacchiato
            // 
            this.optLatteMacchiato.AutoSize = true;
            this.optLatteMacchiato.Location = new System.Drawing.Point(166, 42);
            this.optLatteMacchiato.Name = "optLatteMacchiato";
            this.optLatteMacchiato.Size = new System.Drawing.Size(122, 23);
            this.optLatteMacchiato.TabIndex = 1;
            this.optLatteMacchiato.TabStop = true;
            this.optLatteMacchiato.Text = "LatteMacchiato";
            this.optLatteMacchiato.UseVisualStyleBackColor = true;
            this.optLatteMacchiato.CheckedChanged += new System.EventHandler(this.optLatteMacchiato_CheckedChanged);
            // 
            // optTe
            // 
            this.optTe.AutoSize = true;
            this.optTe.Location = new System.Drawing.Point(50, 41);
            this.optTe.Name = "optTe";
            this.optTe.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.optTe.Size = new System.Drawing.Size(43, 23);
            this.optTe.TabIndex = 0;
            this.optTe.Text = "Tè";
            this.optTe.UseVisualStyleBackColor = true;
            this.optTe.CheckedChanged += new System.EventHandler(this.optTe_CheckedChanged);
            // 
            // grpSoldi
            // 
            this.grpSoldi.BackColor = System.Drawing.Color.DarkGray;
            this.grpSoldi.Controls.Add(this.chk2);
            this.grpSoldi.Controls.Add(this.chk1);
            this.grpSoldi.Controls.Add(this.chk50);
            this.grpSoldi.Controls.Add(this.chk20);
            this.grpSoldi.Controls.Add(this.chk10);
            this.grpSoldi.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.grpSoldi.ForeColor = System.Drawing.Color.Cyan;
            this.grpSoldi.Location = new System.Drawing.Point(1042, 87);
            this.grpSoldi.Name = "grpSoldi";
            this.grpSoldi.Size = new System.Drawing.Size(207, 166);
            this.grpSoldi.TabIndex = 1;
            this.grpSoldi.TabStop = false;
            this.grpSoldi.Text = "Inserisci i Soldi";
            // 
            // chk2
            // 
            this.chk2.AutoSize = true;
            this.chk2.ForeColor = System.Drawing.Color.Cyan;
            this.chk2.Location = new System.Drawing.Point(88, 130);
            this.chk2.Name = "chk2";
            this.chk2.Size = new System.Drawing.Size(44, 23);
            this.chk2.TabIndex = 4;
            this.chk2.Text = "2€";
            this.chk2.UseVisualStyleBackColor = true;
            this.chk2.CheckedChanged += new System.EventHandler(this.chk2_CheckedChanged);
            // 
            // chk1
            // 
            this.chk1.AutoSize = true;
            this.chk1.ForeColor = System.Drawing.Color.Cyan;
            this.chk1.Location = new System.Drawing.Point(139, 98);
            this.chk1.Name = "chk1";
            this.chk1.Size = new System.Drawing.Size(44, 23);
            this.chk1.TabIndex = 3;
            this.chk1.Text = "1€";
            this.chk1.UseVisualStyleBackColor = true;
            this.chk1.CheckedChanged += new System.EventHandler(this.chk1_CheckedChanged);
            // 
            // chk50
            // 
            this.chk50.AutoSize = true;
            this.chk50.ForeColor = System.Drawing.Color.Cyan;
            this.chk50.Location = new System.Drawing.Point(6, 98);
            this.chk50.Name = "chk50";
            this.chk50.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.chk50.Size = new System.Drawing.Size(64, 23);
            this.chk50.TabIndex = 2;
            this.chk50.Text = "0.50€";
            this.chk50.UseVisualStyleBackColor = true;
            this.chk50.CheckedChanged += new System.EventHandler(this.chk50_CheckedChanged);
            // 
            // chk20
            // 
            this.chk20.AutoSize = true;
            this.chk20.ForeColor = System.Drawing.Color.Cyan;
            this.chk20.Location = new System.Drawing.Point(139, 42);
            this.chk20.Name = "chk20";
            this.chk20.Size = new System.Drawing.Size(64, 23);
            this.chk20.TabIndex = 1;
            this.chk20.Text = "0.20€";
            this.chk20.UseVisualStyleBackColor = true;
            this.chk20.CheckedChanged += new System.EventHandler(this.chk20_CheckedChanged);
            // 
            // chk10
            // 
            this.chk10.AutoSize = true;
            this.chk10.ForeColor = System.Drawing.Color.Cyan;
            this.chk10.Location = new System.Drawing.Point(6, 42);
            this.chk10.Name = "chk10";
            this.chk10.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.chk10.Size = new System.Drawing.Size(64, 23);
            this.chk10.TabIndex = 0;
            this.chk10.Text = "0.10€";
            this.chk10.UseVisualStyleBackColor = true;
            this.chk10.CheckedChanged += new System.EventHandler(this.chk10_CheckedChanged);
            // 
            // btnAcquista
            // 
            this.btnAcquista.BackColor = System.Drawing.Color.Black;
            this.btnAcquista.Enabled = false;
            this.btnAcquista.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAcquista.ForeColor = System.Drawing.Color.Aqua;
            this.btnAcquista.Location = new System.Drawing.Point(162, 334);
            this.btnAcquista.Name = "btnAcquista";
            this.btnAcquista.Size = new System.Drawing.Size(97, 58);
            this.btnAcquista.TabIndex = 2;
            this.btnAcquista.Text = "ACQUISTA";
            this.btnAcquista.UseVisualStyleBackColor = false;
            this.btnAcquista.Click += new System.EventHandler(this.btnAcquista_Click);
            // 
            // btnRitiraCredito
            // 
            this.btnRitiraCredito.BackColor = System.Drawing.Color.Black;
            this.btnRitiraCredito.Enabled = false;
            this.btnRitiraCredito.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRitiraCredito.Location = new System.Drawing.Point(1184, 300);
            this.btnRitiraCredito.Name = "btnRitiraCredito";
            this.btnRitiraCredito.Size = new System.Drawing.Size(75, 47);
            this.btnRitiraCredito.TabIndex = 3;
            this.btnRitiraCredito.Text = "Ritira Credito";
            this.btnRitiraCredito.UseVisualStyleBackColor = false;
            this.btnRitiraCredito.Click += new System.EventHandler(this.btnRitiraCredito_Click);
            // 
            // lblCredito
            // 
            this.lblCredito.AutoSize = true;
            this.lblCredito.BackColor = System.Drawing.Color.DarkGray;
            this.lblCredito.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCredito.ForeColor = System.Drawing.Color.Cyan;
            this.lblCredito.Location = new System.Drawing.Point(1038, 313);
            this.lblCredito.Name = "lblCredito";
            this.lblCredito.Size = new System.Drawing.Size(116, 21);
            this.lblCredito.TabIndex = 4;
            this.lblCredito.Text = "Credito: 0.00€";
            // 
            // lblResto
            // 
            this.lblResto.AutoSize = true;
            this.lblResto.BackColor = System.Drawing.Color.Transparent;
            this.lblResto.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblResto.ForeColor = System.Drawing.Color.Black;
            this.lblResto.Location = new System.Drawing.Point(625, 174);
            this.lblResto.Name = "lblResto";
            this.lblResto.Size = new System.Drawing.Size(63, 21);
            this.lblResto.TabIndex = 5;
            this.lblResto.Text = "Resto: ";
            this.lblResto.Visible = false;
            // 
            // lblPrezzo
            // 
            this.lblPrezzo.AutoSize = true;
            this.lblPrezzo.BackColor = System.Drawing.Color.Transparent;
            this.lblPrezzo.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPrezzo.Location = new System.Drawing.Point(602, 9);
            this.lblPrezzo.Name = "lblPrezzo";
            this.lblPrezzo.Size = new System.Drawing.Size(177, 21);
            this.lblPrezzo.TabIndex = 6;
            this.lblPrezzo.Text = "Prezzo Prodotti: 0.40€";
            // 
            // timer1
            // 
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // prgAttendi
            // 
            this.prgAttendi.Location = new System.Drawing.Point(453, 211);
            this.prgAttendi.Name = "prgAttendi";
            this.prgAttendi.Size = new System.Drawing.Size(487, 42);
            this.prgAttendi.TabIndex = 13;
            this.prgAttendi.Visible = false;
            // 
            // lblAttendi
            // 
            this.lblAttendi.AutoSize = true;
            this.lblAttendi.BackColor = System.Drawing.Color.Transparent;
            this.lblAttendi.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAttendi.Location = new System.Drawing.Point(625, 129);
            this.lblAttendi.Name = "lblAttendi";
            this.lblAttendi.Size = new System.Drawing.Size(127, 21);
            this.lblAttendi.TabIndex = 14;
            this.lblAttendi.Text = "Attendi prego...";
            this.lblAttendi.Visible = false;
            // 
            // pctCioccolata
            // 
            this.pctCioccolata.BackColor = System.Drawing.Color.Transparent;
            this.pctCioccolata.Image = global::WindowsFormsApplication1.Properties.Resources.cioccolata_calda_removebg_preview;
            this.pctCioccolata.Location = new System.Drawing.Point(539, 266);
            this.pctCioccolata.Name = "pctCioccolata";
            this.pctCioccolata.Size = new System.Drawing.Size(300, 300);
            this.pctCioccolata.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctCioccolata.TabIndex = 10;
            this.pctCioccolata.TabStop = false;
            this.pctCioccolata.Visible = false;
            this.pctCioccolata.Click += new System.EventHandler(this.pctCioccolata_Click);
            // 
            // pctLatte
            // 
            this.pctLatte.BackColor = System.Drawing.Color.Transparent;
            this.pctLatte.Image = global::WindowsFormsApplication1.Properties.Resources._1272_png_800x600_q85_detail;
            this.pctLatte.Location = new System.Drawing.Point(539, 266);
            this.pctLatte.Name = "pctLatte";
            this.pctLatte.Size = new System.Drawing.Size(300, 300);
            this.pctLatte.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctLatte.TabIndex = 12;
            this.pctLatte.TabStop = false;
            this.pctLatte.Visible = false;
            this.pctLatte.Click += new System.EventHandler(this.pctLatte_Click);
            // 
            // pctMacchiato
            // 
            this.pctMacchiato.BackColor = System.Drawing.Color.Transparent;
            this.pctMacchiato.Image = global::WindowsFormsApplication1.Properties.Resources.DeLonghi_eletta_cappuccino_ecam_4_removebg_preview;
            this.pctMacchiato.Location = new System.Drawing.Point(539, 266);
            this.pctMacchiato.Name = "pctMacchiato";
            this.pctMacchiato.Size = new System.Drawing.Size(300, 300);
            this.pctMacchiato.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctMacchiato.TabIndex = 11;
            this.pctMacchiato.TabStop = false;
            this.pctMacchiato.Visible = false;
            this.pctMacchiato.Click += new System.EventHandler(this.pctMacchiato_Click);
            // 
            // pctCappuccino
            // 
            this.pctCappuccino.BackColor = System.Drawing.Color.Transparent;
            this.pctCappuccino.Image = global::WindowsFormsApplication1.Properties.Resources.Cappuccino;
            this.pctCappuccino.Location = new System.Drawing.Point(539, 266);
            this.pctCappuccino.Name = "pctCappuccino";
            this.pctCappuccino.Size = new System.Drawing.Size(300, 300);
            this.pctCappuccino.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctCappuccino.TabIndex = 9;
            this.pctCappuccino.TabStop = false;
            this.pctCappuccino.Visible = false;
            this.pctCappuccino.Click += new System.EventHandler(this.pctCappuccino_Click);
            // 
            // pctCaffe
            // 
            this.pctCaffe.BackColor = System.Drawing.Color.Transparent;
            this.pctCaffe.Image = global::WindowsFormsApplication1.Properties.Resources.CaffeLAND_1600x800_removebg_preview;
            this.pctCaffe.Location = new System.Drawing.Point(539, 266);
            this.pctCaffe.Name = "pctCaffe";
            this.pctCaffe.Size = new System.Drawing.Size(300, 300);
            this.pctCaffe.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctCaffe.TabIndex = 8;
            this.pctCaffe.TabStop = false;
            this.pctCaffe.Visible = false;
            this.pctCaffe.Click += new System.EventHandler(this.pctCaffe_Click);
            // 
            // pctTe
            // 
            this.pctTe.BackColor = System.Drawing.Color.Transparent;
            this.pctTe.Image = global::WindowsFormsApplication1.Properties.Resources.Te;
            this.pctTe.Location = new System.Drawing.Point(539, 266);
            this.pctTe.Name = "pctTe";
            this.pctTe.Size = new System.Drawing.Size(300, 300);
            this.pctTe.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctTe.TabIndex = 7;
            this.pctTe.TabStop = false;
            this.pctTe.Visible = false;
            this.pctTe.Click += new System.EventHandler(this.pctTe_Click);
            // 
            // frmMacchinettaLuca
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Black;
            this.BackgroundImage = global::WindowsFormsApplication1.Properties.Resources.Sfondo_legno_bianco1;
            this.ClientSize = new System.Drawing.Size(1333, 657);
            this.Controls.Add(this.pctCioccolata);
            this.Controls.Add(this.lblAttendi);
            this.Controls.Add(this.prgAttendi);
            this.Controls.Add(this.btnAcquista);
            this.Controls.Add(this.grpBevanda);
            this.Controls.Add(this.lblResto);
            this.Controls.Add(this.lblCredito);
            this.Controls.Add(this.btnRitiraCredito);
            this.Controls.Add(this.grpSoldi);
            this.Controls.Add(this.pctLatte);
            this.Controls.Add(this.pctMacchiato);
            this.Controls.Add(this.pctCappuccino);
            this.Controls.Add(this.pctCaffe);
            this.Controls.Add(this.pctTe);
            this.Controls.Add(this.lblPrezzo);
            this.Name = "frmMacchinettaLuca";
            this.Text = "Distributore Automatico";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.grpBevanda.ResumeLayout(false);
            this.grpBevanda.PerformLayout();
            this.grpSoldi.ResumeLayout(false);
            this.grpSoldi.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pctCioccolata)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctLatte)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctMacchiato)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctCappuccino)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctCaffe)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctTe)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox grpBevanda;
        private System.Windows.Forms.RadioButton optLatte;
        private System.Windows.Forms.RadioButton optCappucino;
        private System.Windows.Forms.RadioButton optCioccolata;
        private System.Windows.Forms.RadioButton optCaffe;
        private System.Windows.Forms.RadioButton optLatteMacchiato;
        private System.Windows.Forms.RadioButton optTe;
        private System.Windows.Forms.GroupBox grpSoldi;
        private System.Windows.Forms.CheckBox chk2;
        private System.Windows.Forms.CheckBox chk1;
        private System.Windows.Forms.CheckBox chk50;
        private System.Windows.Forms.CheckBox chk20;
        private System.Windows.Forms.CheckBox chk10;
        private System.Windows.Forms.Button btnAcquista;
        private System.Windows.Forms.Button btnRitiraCredito;
        private System.Windows.Forms.Label lblCredito;
        private System.Windows.Forms.Label lblResto;
        private System.Windows.Forms.Label lblPrezzo;
        private System.Windows.Forms.PictureBox pctTe;
        private System.Windows.Forms.PictureBox pctCaffe;
        private System.Windows.Forms.PictureBox pctCappuccino;
        private System.Windows.Forms.PictureBox pctCioccolata;
        private System.Windows.Forms.PictureBox pctMacchiato;
        private System.Windows.Forms.PictureBox pctLatte;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.ProgressBar prgAttendi;
        private System.Windows.Forms.Label lblAttendi;
    }
}

