namespace WindowsFormsApplication1
{
    partial class frmLifeGame
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            this.grd = new System.Windows.Forms.DataGridView();
            this.btnGenera = new System.Windows.Forms.Button();
            this.txtCelle = new System.Windows.Forms.TextBox();
            this.btnVivi = new System.Windows.Forms.Button();
            this.txtVivi = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.btnAvanza = new System.Windows.Forms.Button();
            this.btnRestart = new System.Windows.Forms.Button();
            this.btnVia = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.txtNPassi = new System.Windows.Forms.TextBox();
            this.btnAliante = new System.Windows.Forms.Button();
            this.btnPulsar = new System.Windows.Forms.Button();
            this.btnpentomino = new System.Windows.Forms.Button();
            this.btnGosperglidergun = new System.Windows.Forms.Button();
            this.btnBlinker = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.grd)).BeginInit();
            this.SuspendLayout();
            // 
            // grd
            // 
            this.grd.AllowUserToAddRows = false;
            this.grd.AllowUserToDeleteRows = false;
            this.grd.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.DisableResizing;
            this.grd.ColumnHeadersVisible = false;
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle1.BackColor = System.Drawing.Color.White;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.Color.SkyBlue;
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.grd.DefaultCellStyle = dataGridViewCellStyle1;
            this.grd.EnableHeadersVisualStyles = false;
            this.grd.Location = new System.Drawing.Point(316, 12);
            this.grd.Name = "grd";
            this.grd.RowHeadersVisible = false;
            this.grd.ScrollBars = System.Windows.Forms.ScrollBars.None;
            this.grd.Size = new System.Drawing.Size(734, 734);
            this.grd.TabIndex = 0;
            this.grd.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.prova);
            this.grd.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.prova);
            // 
            // btnGenera
            // 
            this.btnGenera.BackColor = System.Drawing.Color.SkyBlue;
            this.btnGenera.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnGenera.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGenera.Location = new System.Drawing.Point(41, 30);
            this.btnGenera.Name = "btnGenera";
            this.btnGenera.Size = new System.Drawing.Size(82, 27);
            this.btnGenera.TabIndex = 1;
            this.btnGenera.Text = "Genera";
            this.btnGenera.UseVisualStyleBackColor = false;
            this.btnGenera.Click += new System.EventHandler(this.btnGenera_Click);
            // 
            // txtCelle
            // 
            this.txtCelle.Location = new System.Drawing.Point(152, 35);
            this.txtCelle.Name = "txtCelle";
            this.txtCelle.Size = new System.Drawing.Size(34, 20);
            this.txtCelle.TabIndex = 2;
            // 
            // btnVivi
            // 
            this.btnVivi.BackColor = System.Drawing.Color.SkyBlue;
            this.btnVivi.Enabled = false;
            this.btnVivi.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnVivi.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVivi.Location = new System.Drawing.Point(41, 109);
            this.btnVivi.Name = "btnVivi";
            this.btnVivi.Size = new System.Drawing.Size(82, 27);
            this.btnVivi.TabIndex = 3;
            this.btnVivi.Text = "Vivi";
            this.btnVivi.UseVisualStyleBackColor = false;
            this.btnVivi.Click += new System.EventHandler(this.btnVivi_Click);
            // 
            // txtVivi
            // 
            this.txtVivi.Enabled = false;
            this.txtVivi.Location = new System.Drawing.Point(152, 114);
            this.txtVivi.Name = "txtVivi";
            this.txtVivi.Size = new System.Drawing.Size(34, 20);
            this.txtVivi.TabIndex = 4;
            this.txtVivi.TextChanged += new System.EventHandler(this.txtVivi_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(87, 8);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(99, 19);
            this.label1.TabIndex = 5;
            this.label1.Text = "Quante celle?";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(53, 87);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(142, 19);
            this.label2.TabIndex = 6;
            this.label2.Text = "Qanti esseri viventi?";
            // 
            // btnAvanza
            // 
            this.btnAvanza.BackColor = System.Drawing.Color.SkyBlue;
            this.btnAvanza.Enabled = false;
            this.btnAvanza.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnAvanza.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAvanza.Location = new System.Drawing.Point(41, 267);
            this.btnAvanza.Name = "btnAvanza";
            this.btnAvanza.Size = new System.Drawing.Size(92, 29);
            this.btnAvanza.TabIndex = 7;
            this.btnAvanza.Text = "Avanza di 1";
            this.btnAvanza.UseVisualStyleBackColor = false;
            this.btnAvanza.Click += new System.EventHandler(this.btnAvanza_Click);
            // 
            // btnRestart
            // 
            this.btnRestart.BackColor = System.Drawing.Color.Red;
            this.btnRestart.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnRestart.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRestart.ForeColor = System.Drawing.Color.Snow;
            this.btnRestart.Location = new System.Drawing.Point(1243, 4);
            this.btnRestart.Name = "btnRestart";
            this.btnRestart.Size = new System.Drawing.Size(82, 27);
            this.btnRestart.TabIndex = 8;
            this.btnRestart.Text = "Restart";
            this.btnRestart.UseVisualStyleBackColor = false;
            this.btnRestart.Click += new System.EventHandler(this.btnRestart_Click);
            // 
            // btnVia
            // 
            this.btnVia.BackColor = System.Drawing.Color.SkyBlue;
            this.btnVia.Enabled = false;
            this.btnVia.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnVia.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVia.Location = new System.Drawing.Point(41, 188);
            this.btnVia.Name = "btnVia";
            this.btnVia.Size = new System.Drawing.Size(82, 27);
            this.btnVia.TabIndex = 9;
            this.btnVia.Text = "VIA";
            this.btnVia.UseVisualStyleBackColor = false;
            this.btnVia.Click += new System.EventHandler(this.btnVia_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(63, 166);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(123, 19);
            this.label3.TabIndex = 10;
            this.label3.Text = "Avanza di N passi";
            // 
            // txtNPassi
            // 
            this.txtNPassi.Enabled = false;
            this.txtNPassi.Location = new System.Drawing.Point(152, 193);
            this.txtNPassi.Name = "txtNPassi";
            this.txtNPassi.Size = new System.Drawing.Size(34, 20);
            this.txtNPassi.TabIndex = 11;
            this.txtNPassi.TextChanged += new System.EventHandler(this.txtNPassi_TextChanged);
            // 
            // btnAliante
            // 
            this.btnAliante.BackColor = System.Drawing.Color.SkyBlue;
            this.btnAliante.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnAliante.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAliante.Location = new System.Drawing.Point(41, 430);
            this.btnAliante.Name = "btnAliante";
            this.btnAliante.Size = new System.Drawing.Size(82, 29);
            this.btnAliante.TabIndex = 12;
            this.btnAliante.Text = "ALIANTE";
            this.btnAliante.UseVisualStyleBackColor = false;
            this.btnAliante.Click += new System.EventHandler(this.btnAliante_Click);
            // 
            // btnPulsar
            // 
            this.btnPulsar.BackColor = System.Drawing.Color.SkyBlue;
            this.btnPulsar.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnPulsar.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnPulsar.Location = new System.Drawing.Point(41, 497);
            this.btnPulsar.Name = "btnPulsar";
            this.btnPulsar.Size = new System.Drawing.Size(82, 29);
            this.btnPulsar.TabIndex = 13;
            this.btnPulsar.Text = "PULSAR";
            this.btnPulsar.UseVisualStyleBackColor = false;
            this.btnPulsar.Click += new System.EventHandler(this.btnPulsar_Click);
            // 
            // btnpentomino
            // 
            this.btnpentomino.BackColor = System.Drawing.Color.SkyBlue;
            this.btnpentomino.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnpentomino.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnpentomino.Location = new System.Drawing.Point(24, 631);
            this.btnpentomino.Name = "btnpentomino";
            this.btnpentomino.Size = new System.Drawing.Size(116, 29);
            this.btnpentomino.TabIndex = 14;
            this.btnpentomino.Text = "R-PENTOMINO";
            this.btnpentomino.UseVisualStyleBackColor = false;
            this.btnpentomino.Click += new System.EventHandler(this.btnpentomino_Click);
            // 
            // btnGosperglidergun
            // 
            this.btnGosperglidergun.BackColor = System.Drawing.Color.SkyBlue;
            this.btnGosperglidergun.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnGosperglidergun.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGosperglidergun.Location = new System.Drawing.Point(5, 698);
            this.btnGosperglidergun.Name = "btnGosperglidergun";
            this.btnGosperglidergun.Size = new System.Drawing.Size(160, 29);
            this.btnGosperglidergun.TabIndex = 15;
            this.btnGosperglidergun.Text = "GOSPER GLIDER GUN";
            this.btnGosperglidergun.UseVisualStyleBackColor = false;
            this.btnGosperglidergun.Click += new System.EventHandler(this.btnGosperglidergun_Click);
            // 
            // btnBlinker
            // 
            this.btnBlinker.BackColor = System.Drawing.Color.SkyBlue;
            this.btnBlinker.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnBlinker.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnBlinker.Location = new System.Drawing.Point(41, 564);
            this.btnBlinker.Name = "btnBlinker";
            this.btnBlinker.Size = new System.Drawing.Size(82, 29);
            this.btnBlinker.TabIndex = 16;
            this.btnBlinker.Text = "BLINKER";
            this.btnBlinker.UseVisualStyleBackColor = false;
            this.btnBlinker.Click += new System.EventHandler(this.btnBlinker_Click);
            // 
            // frmLifeGame
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.NavajoWhite;
            this.ClientSize = new System.Drawing.Size(1337, 758);
            this.Controls.Add(this.btnBlinker);
            this.Controls.Add(this.btnGosperglidergun);
            this.Controls.Add(this.btnpentomino);
            this.Controls.Add(this.btnPulsar);
            this.Controls.Add(this.btnAliante);
            this.Controls.Add(this.txtNPassi);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.btnVia);
            this.Controls.Add(this.btnRestart);
            this.Controls.Add(this.btnAvanza);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.txtVivi);
            this.Controls.Add(this.btnVivi);
            this.Controls.Add(this.txtCelle);
            this.Controls.Add(this.btnGenera);
            this.Controls.Add(this.grd);
            this.Name = "frmLifeGame";
            this.Text = "Life Game Luca Turillo";
            this.Load += new System.EventHandler(this.frmLifeGame_Load);
            ((System.ComponentModel.ISupportInitialize)(this.grd)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView grd;
        private System.Windows.Forms.Button btnGenera;
        private System.Windows.Forms.TextBox txtCelle;
        private System.Windows.Forms.Button btnVivi;
        private System.Windows.Forms.TextBox txtVivi;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btnAvanza;
        private System.Windows.Forms.Button btnRestart;
        private System.Windows.Forms.Button btnVia;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtNPassi;
        private System.Windows.Forms.Button btnAliante;
        private System.Windows.Forms.Button btnPulsar;
        private System.Windows.Forms.Button btnpentomino;
        private System.Windows.Forms.Button btnGosperglidergun;
        private System.Windows.Forms.Button btnBlinker;
    }
}

