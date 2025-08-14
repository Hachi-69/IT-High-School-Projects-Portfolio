namespace WindowsFormsApplication1
{
    partial class Form1
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
            this.listViewNome = new System.Windows.Forms.ListView();
            this.listViewDurata = new System.Windows.Forms.ListView();
            this.listViewPriorita = new System.Windows.Forms.ListView();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.btnDati = new System.Windows.Forms.Button();
            this.txtProcessoAttivo = new System.Windows.Forms.TextBox();
            this.txtTempoRimasto = new System.Windows.Forms.TextBox();
            this.txtPriorita = new System.Windows.Forms.TextBox();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.rdbSJF = new System.Windows.Forms.RadioButton();
            this.rdbPriorita = new System.Windows.Forms.RadioButton();
            this.rdbFCFS = new System.Windows.Forms.RadioButton();
            this.btnRun = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // listViewNome
            // 
            this.listViewNome.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.listViewNome.Location = new System.Drawing.Point(121, 168);
            this.listViewNome.Name = "listViewNome";
            this.listViewNome.Size = new System.Drawing.Size(67, 127);
            this.listViewNome.TabIndex = 0;
            this.listViewNome.UseCompatibleStateImageBehavior = false;
            // 
            // listViewDurata
            // 
            this.listViewDurata.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.listViewDurata.Location = new System.Drawing.Point(226, 168);
            this.listViewDurata.Name = "listViewDurata";
            this.listViewDurata.Size = new System.Drawing.Size(67, 127);
            this.listViewDurata.TabIndex = 1;
            this.listViewDurata.UseCompatibleStateImageBehavior = false;
            // 
            // listViewPriorita
            // 
            this.listViewPriorita.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.listViewPriorita.Location = new System.Drawing.Point(331, 168);
            this.listViewPriorita.Name = "listViewPriorita";
            this.listViewPriorita.Size = new System.Drawing.Size(67, 127);
            this.listViewPriorita.TabIndex = 2;
            this.listViewPriorita.UseCompatibleStateImageBehavior = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(116, 128);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(76, 27);
            this.label1.TabIndex = 3;
            this.label1.Text = "Nome:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Times New Roman", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(221, 128);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(84, 27);
            this.label2.TabIndex = 4;
            this.label2.Text = "Durata:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Times New Roman", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(326, 128);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(90, 27);
            this.label3.TabIndex = 5;
            this.label3.Text = "Priorità:";
            // 
            // btnDati
            // 
            this.btnDati.BackColor = System.Drawing.Color.DarkTurquoise;
            this.btnDati.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.btnDati.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnDati.Font = new System.Drawing.Font("Times New Roman", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDati.Location = new System.Drawing.Point(191, 363);
            this.btnDati.Name = "btnDati";
            this.btnDati.Size = new System.Drawing.Size(160, 85);
            this.btnDati.TabIndex = 6;
            this.btnDati.Text = "Inserisci i dati";
            this.btnDati.UseVisualStyleBackColor = false;
            this.btnDati.Click += new System.EventHandler(this.btnDati_Click);
            // 
            // txtProcessoAttivo
            // 
            this.txtProcessoAttivo.Enabled = false;
            this.txtProcessoAttivo.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtProcessoAttivo.Location = new System.Drawing.Point(593, 131);
            this.txtProcessoAttivo.Multiline = true;
            this.txtProcessoAttivo.Name = "txtProcessoAttivo";
            this.txtProcessoAttivo.Size = new System.Drawing.Size(74, 40);
            this.txtProcessoAttivo.TabIndex = 8;
            // 
            // txtTempoRimasto
            // 
            this.txtTempoRimasto.Enabled = false;
            this.txtTempoRimasto.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtTempoRimasto.Location = new System.Drawing.Point(593, 193);
            this.txtTempoRimasto.Multiline = true;
            this.txtTempoRimasto.Name = "txtTempoRimasto";
            this.txtTempoRimasto.Size = new System.Drawing.Size(74, 40);
            this.txtTempoRimasto.TabIndex = 9;
            // 
            // txtPriorita
            // 
            this.txtPriorita.Enabled = false;
            this.txtPriorita.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtPriorita.Location = new System.Drawing.Point(593, 255);
            this.txtPriorita.Multiline = true;
            this.txtPriorita.Name = "txtPriorita";
            this.txtPriorita.Size = new System.Drawing.Size(74, 40);
            this.txtPriorita.TabIndex = 10;
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackColor = System.Drawing.Color.DarkTurquoise;
            this.pictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.pictureBox1.Location = new System.Drawing.Point(553, 89);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(275, 236);
            this.pictureBox1.TabIndex = 7;
            this.pictureBox1.TabStop = false;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.BackColor = System.Drawing.Color.DarkTurquoise;
            this.label4.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(657, 96);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(47, 21);
            this.label4.TabIndex = 11;
            this.label4.Text = "CPU";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.BackColor = System.Drawing.Color.DarkTurquoise;
            this.label5.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.ForeColor = System.Drawing.Color.Black;
            this.label5.Location = new System.Drawing.Point(682, 145);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(105, 19);
            this.label5.TabIndex = 12;
            this.label5.Text = "Processo Attivo";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.BackColor = System.Drawing.Color.DarkTurquoise;
            this.label6.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(682, 205);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(104, 19);
            this.label6.TabIndex = 13;
            this.label6.Text = "Tempo Rimasto";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.BackColor = System.Drawing.Color.DarkTurquoise;
            this.label7.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(682, 266);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(53, 19);
            this.label7.TabIndex = 14;
            this.label7.Text = "Priorità";
            // 
            // rdbSJF
            // 
            this.rdbSJF.AutoSize = true;
            this.rdbSJF.Enabled = false;
            this.rdbSJF.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rdbSJF.Location = new System.Drawing.Point(553, 42);
            this.rdbSJF.Name = "rdbSJF";
            this.rdbSJF.Size = new System.Drawing.Size(57, 25);
            this.rdbSJF.TabIndex = 15;
            this.rdbSJF.TabStop = true;
            this.rdbSJF.Text = "SJF";
            this.rdbSJF.UseVisualStyleBackColor = true;
            this.rdbSJF.CheckedChanged += new System.EventHandler(this.rdbSJF_CheckedChanged);
            // 
            // rdbPriorita
            // 
            this.rdbPriorita.AutoSize = true;
            this.rdbPriorita.Enabled = false;
            this.rdbPriorita.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rdbPriorita.Location = new System.Drawing.Point(650, 42);
            this.rdbPriorita.Name = "rdbPriorita";
            this.rdbPriorita.Size = new System.Drawing.Size(82, 25);
            this.rdbPriorita.TabIndex = 16;
            this.rdbPriorita.TabStop = true;
            this.rdbPriorita.Text = "Priorità";
            this.rdbPriorita.UseVisualStyleBackColor = true;
            this.rdbPriorita.CheckedChanged += new System.EventHandler(this.rdbPriorita_CheckedChanged);
            // 
            // rdbFCFS
            // 
            this.rdbFCFS.AutoSize = true;
            this.rdbFCFS.Enabled = false;
            this.rdbFCFS.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rdbFCFS.Location = new System.Drawing.Point(772, 42);
            this.rdbFCFS.Name = "rdbFCFS";
            this.rdbFCFS.Size = new System.Drawing.Size(74, 25);
            this.rdbFCFS.TabIndex = 17;
            this.rdbFCFS.TabStop = true;
            this.rdbFCFS.Text = "FCFS";
            this.rdbFCFS.UseVisualStyleBackColor = true;
            this.rdbFCFS.CheckedChanged += new System.EventHandler(this.rdbFCFS_CheckedChanged);
            // 
            // btnRun
            // 
            this.btnRun.BackColor = System.Drawing.Color.DarkTurquoise;
            this.btnRun.Enabled = false;
            this.btnRun.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnRun.Font = new System.Drawing.Font("Times New Roman", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRun.Location = new System.Drawing.Point(617, 363);
            this.btnRun.Name = "btnRun";
            this.btnRun.Size = new System.Drawing.Size(145, 85);
            this.btnRun.TabIndex = 18;
            this.btnRun.Text = "AVANZA";
            this.btnRun.UseVisualStyleBackColor = false;
            this.btnRun.Click += new System.EventHandler(this.btnRun_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.LightSeaGreen;
            this.ClientSize = new System.Drawing.Size(933, 524);
            this.Controls.Add(this.btnRun);
            this.Controls.Add(this.rdbFCFS);
            this.Controls.Add(this.rdbPriorita);
            this.Controls.Add(this.rdbSJF);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txtPriorita);
            this.Controls.Add(this.txtTempoRimasto);
            this.Controls.Add(this.txtProcessoAttivo);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.btnDati);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.listViewPriorita);
            this.Controls.Add(this.listViewDurata);
            this.Controls.Add(this.listViewNome);
            this.Name = "Form1";
            this.Text = "Simulazione CPU";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView listViewNome;
        private System.Windows.Forms.ListView listViewDurata;
        private System.Windows.Forms.ListView listViewPriorita;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnDati;
        private System.Windows.Forms.TextBox txtProcessoAttivo;
        private System.Windows.Forms.TextBox txtTempoRimasto;
        private System.Windows.Forms.TextBox txtPriorita;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.RadioButton rdbSJF;
        private System.Windows.Forms.RadioButton rdbPriorita;
        private System.Windows.Forms.RadioButton rdbFCFS;
        private System.Windows.Forms.Button btnRun;
    }
}

