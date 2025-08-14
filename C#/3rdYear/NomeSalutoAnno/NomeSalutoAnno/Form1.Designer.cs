namespace WindowsFormsApplication1
{
    partial class frmLuca
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
            this.lblInserisciIlNome = new System.Windows.Forms.Label();
            this.txtNomeUtente = new System.Windows.Forms.TextBox();
            this.txtEtaUtente = new System.Windows.Forms.TextBox();
            this.lblEta = new System.Windows.Forms.Label();
            this.btnSaluti = new System.Windows.Forms.Button();
            this.lblCiao = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lblInserisciIlNome
            // 
            this.lblInserisciIlNome.AutoSize = true;
            this.lblInserisciIlNome.Font = new System.Drawing.Font("Calibri", 25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblInserisciIlNome.ForeColor = System.Drawing.SystemColors.Highlight;
            this.lblInserisciIlNome.Location = new System.Drawing.Point(12, 39);
            this.lblInserisciIlNome.Name = "lblInserisciIlNome";
            this.lblInserisciIlNome.Size = new System.Drawing.Size(297, 41);
            this.lblInserisciIlNome.TabIndex = 0;
            this.lblInserisciIlNome.Text = "Inserisci il tuo nome";
            this.lblInserisciIlNome.Click += new System.EventHandler(this.label1_Click);
            // 
            // txtNomeUtente
            // 
            this.txtNomeUtente.Location = new System.Drawing.Point(626, 60);
            this.txtNomeUtente.Name = "txtNomeUtente";
            this.txtNomeUtente.Size = new System.Drawing.Size(261, 20);
            this.txtNomeUtente.TabIndex = 1;
            // 
            // txtEtaUtente
            // 
            this.txtEtaUtente.Location = new System.Drawing.Point(626, 251);
            this.txtEtaUtente.Name = "txtEtaUtente";
            this.txtEtaUtente.Size = new System.Drawing.Size(261, 20);
            this.txtEtaUtente.TabIndex = 2;
            // 
            // lblEta
            // 
            this.lblEta.AutoSize = true;
            this.lblEta.Font = new System.Drawing.Font("Calibri", 25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEta.ForeColor = System.Drawing.SystemColors.Highlight;
            this.lblEta.Location = new System.Drawing.Point(12, 230);
            this.lblEta.Name = "lblEta";
            this.lblEta.Size = new System.Drawing.Size(275, 41);
            this.lblEta.TabIndex = 3;
            this.lblEta.Text = "Inserisci la tua eta\'";
            this.lblEta.Click += new System.EventHandler(this.label1_Click_1);
            // 
            // btnSaluti
            // 
            this.btnSaluti.BackColor = System.Drawing.Color.MediumSpringGreen;
            this.btnSaluti.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSaluti.Location = new System.Drawing.Point(725, 429);
            this.btnSaluti.Name = "btnSaluti";
            this.btnSaluti.Size = new System.Drawing.Size(162, 78);
            this.btnSaluti.TabIndex = 4;
            this.btnSaluti.Text = "Clicca per salutare";
            this.btnSaluti.UseVisualStyleBackColor = false;
            this.btnSaluti.Click += new System.EventHandler(this.btnSaluti_Click);
            // 
            // lblCiao
            // 
            this.lblCiao.AutoSize = true;
            this.lblCiao.Location = new System.Drawing.Point(110, 494);
            this.lblCiao.Name = "lblCiao";
            this.lblCiao.Size = new System.Drawing.Size(28, 13);
            this.lblCiao.TabIndex = 5;
            this.lblCiao.Text = "Ciao";
            // 
            // frmLuca
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Aquamarine;
            this.ClientSize = new System.Drawing.Size(1329, 632);
            this.Controls.Add(this.lblCiao);
            this.Controls.Add(this.btnSaluti);
            this.Controls.Add(this.lblEta);
            this.Controls.Add(this.txtEtaUtente);
            this.Controls.Add(this.txtNomeUtente);
            this.Controls.Add(this.lblInserisciIlNome);
            this.Name = "frmLuca";
            this.Text = "Luca";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblInserisciIlNome;
        private System.Windows.Forms.TextBox txtNomeUtente;
        private System.Windows.Forms.TextBox txtEtaUtente;
        private System.Windows.Forms.Label lblEta;
        private System.Windows.Forms.Button btnSaluti;
        private System.Windows.Forms.Label lblCiao;

    }
}

