namespace WindowsFormsApplication1
{
    partial class Luca
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
            this.txtCrea = new System.Windows.Forms.TextBox();
            this.txtRiempi = new System.Windows.Forms.TextBox();
            this.btnCrea = new System.Windows.Forms.Button();
            this.btnRiempi = new System.Windows.Forms.Button();
            this.lblLunghezza = new System.Windows.Forms.Label();
            this.lblNumeri = new System.Windows.Forms.Label();
            this.btnMedia = new System.Windows.Forms.Button();
            this.lblMedia = new System.Windows.Forms.Label();
            this.btnMax = new System.Windows.Forms.Button();
            this.btnMin = new System.Windows.Forms.Button();
            this.lblMax = new System.Windows.Forms.Label();
            this.lblMin = new System.Windows.Forms.Label();
            this.btnRicerca = new System.Windows.Forms.Button();
            this.txtRicerca = new System.Windows.Forms.TextBox();
            this.lblRicerca = new System.Windows.Forms.Label();
            this.lblNumRicerca = new System.Windows.Forms.Label();
            this.lstNumeri = new System.Windows.Forms.ListBox();
            this.SuspendLayout();
            // 
            // txtCrea
            // 
            this.txtCrea.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCrea.Location = new System.Drawing.Point(50, 44);
            this.txtCrea.Name = "txtCrea";
            this.txtCrea.Size = new System.Drawing.Size(100, 23);
            this.txtCrea.TabIndex = 0;
            this.txtCrea.TextChanged += new System.EventHandler(this.txtCrea_TextChanged);
            // 
            // txtRiempi
            // 
            this.txtRiempi.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtRiempi.Location = new System.Drawing.Point(50, 119);
            this.txtRiempi.Name = "txtRiempi";
            this.txtRiempi.Size = new System.Drawing.Size(100, 23);
            this.txtRiempi.TabIndex = 1;
            this.txtRiempi.Visible = false;
            this.txtRiempi.TextChanged += new System.EventHandler(this.txtRiempi_TextChanged);
            // 
            // btnCrea
            // 
            this.btnCrea.Enabled = false;
            this.btnCrea.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCrea.Location = new System.Drawing.Point(224, 44);
            this.btnCrea.Name = "btnCrea";
            this.btnCrea.Size = new System.Drawing.Size(75, 23);
            this.btnCrea.TabIndex = 2;
            this.btnCrea.Text = "CREA";
            this.btnCrea.UseVisualStyleBackColor = true;
            this.btnCrea.Click += new System.EventHandler(this.btnCrea_Click);
            // 
            // btnRiempi
            // 
            this.btnRiempi.Enabled = false;
            this.btnRiempi.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRiempi.Location = new System.Drawing.Point(224, 119);
            this.btnRiempi.Name = "btnRiempi";
            this.btnRiempi.Size = new System.Drawing.Size(75, 23);
            this.btnRiempi.TabIndex = 3;
            this.btnRiempi.Text = "RIEMPI";
            this.btnRiempi.UseVisualStyleBackColor = true;
            this.btnRiempi.Visible = false;
            this.btnRiempi.Click += new System.EventHandler(this.btnRiempi_Click);
            // 
            // lblLunghezza
            // 
            this.lblLunghezza.AutoSize = true;
            this.lblLunghezza.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblLunghezza.Location = new System.Drawing.Point(47, 26);
            this.lblLunghezza.Name = "lblLunghezza";
            this.lblLunghezza.Size = new System.Drawing.Size(95, 15);
            this.lblLunghezza.TabIndex = 4;
            this.lblLunghezza.Text = "Lunghezza Array";
            // 
            // lblNumeri
            // 
            this.lblNumeri.AutoSize = true;
            this.lblNumeri.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNumeri.Location = new System.Drawing.Point(47, 101);
            this.lblNumeri.Name = "lblNumeri";
            this.lblNumeri.Size = new System.Drawing.Size(119, 15);
            this.lblNumeri.TabIndex = 5;
            this.lblNumeri.Text = "Inserisci Un Numero";
            this.lblNumeri.Visible = false;
            // 
            // btnMedia
            // 
            this.btnMedia.Enabled = false;
            this.btnMedia.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMedia.Location = new System.Drawing.Point(50, 190);
            this.btnMedia.Name = "btnMedia";
            this.btnMedia.Size = new System.Drawing.Size(75, 23);
            this.btnMedia.TabIndex = 6;
            this.btnMedia.Text = "Media";
            this.btnMedia.UseVisualStyleBackColor = true;
            this.btnMedia.Visible = false;
            this.btnMedia.Click += new System.EventHandler(this.btnMedia_Click);
            // 
            // lblMedia
            // 
            this.lblMedia.AutoSize = true;
            this.lblMedia.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMedia.Location = new System.Drawing.Point(166, 198);
            this.lblMedia.Name = "lblMedia";
            this.lblMedia.Size = new System.Drawing.Size(0, 15);
            this.lblMedia.TabIndex = 7;
            this.lblMedia.Visible = false;
            // 
            // btnMax
            // 
            this.btnMax.Enabled = false;
            this.btnMax.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMax.Location = new System.Drawing.Point(50, 264);
            this.btnMax.Name = "btnMax";
            this.btnMax.Size = new System.Drawing.Size(75, 23);
            this.btnMax.TabIndex = 8;
            this.btnMax.Text = "Max";
            this.btnMax.UseVisualStyleBackColor = true;
            this.btnMax.Visible = false;
            this.btnMax.Click += new System.EventHandler(this.btnMax_Click);
            // 
            // btnMin
            // 
            this.btnMin.Enabled = false;
            this.btnMin.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMin.Location = new System.Drawing.Point(50, 338);
            this.btnMin.Name = "btnMin";
            this.btnMin.Size = new System.Drawing.Size(75, 23);
            this.btnMin.TabIndex = 9;
            this.btnMin.Text = "Min";
            this.btnMin.UseVisualStyleBackColor = true;
            this.btnMin.Visible = false;
            this.btnMin.Click += new System.EventHandler(this.btnMin_Click);
            // 
            // lblMax
            // 
            this.lblMax.AutoSize = true;
            this.lblMax.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMax.Location = new System.Drawing.Point(166, 264);
            this.lblMax.Name = "lblMax";
            this.lblMax.Size = new System.Drawing.Size(0, 15);
            this.lblMax.TabIndex = 10;
            this.lblMax.Visible = false;
            // 
            // lblMin
            // 
            this.lblMin.AutoSize = true;
            this.lblMin.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMin.Location = new System.Drawing.Point(166, 338);
            this.lblMin.Name = "lblMin";
            this.lblMin.Size = new System.Drawing.Size(0, 15);
            this.lblMin.TabIndex = 11;
            this.lblMin.Visible = false;
            // 
            // btnRicerca
            // 
            this.btnRicerca.Location = new System.Drawing.Point(47, 435);
            this.btnRicerca.Name = "btnRicerca";
            this.btnRicerca.Size = new System.Drawing.Size(75, 23);
            this.btnRicerca.TabIndex = 13;
            this.btnRicerca.Text = "Ricerca";
            this.btnRicerca.UseVisualStyleBackColor = true;
            this.btnRicerca.Visible = false;
            this.btnRicerca.Click += new System.EventHandler(this.btnRicerca_Click);
            // 
            // txtRicerca
            // 
            this.txtRicerca.Location = new System.Drawing.Point(47, 409);
            this.txtRicerca.Name = "txtRicerca";
            this.txtRicerca.Size = new System.Drawing.Size(100, 20);
            this.txtRicerca.TabIndex = 14;
            this.txtRicerca.Visible = false;
            // 
            // lblRicerca
            // 
            this.lblRicerca.AutoSize = true;
            this.lblRicerca.Location = new System.Drawing.Point(47, 390);
            this.lblRicerca.Name = "lblRicerca";
            this.lblRicerca.Size = new System.Drawing.Size(168, 13);
            this.lblRicerca.TabIndex = 15;
            this.lblRicerca.Text = "Inserisci Un Numero Da Ricercare";
            this.lblRicerca.Visible = false;
            // 
            // lblNumRicerca
            // 
            this.lblNumRicerca.AutoSize = true;
            this.lblNumRicerca.Location = new System.Drawing.Point(172, 439);
            this.lblNumRicerca.Name = "lblNumRicerca";
            this.lblNumRicerca.Size = new System.Drawing.Size(0, 13);
            this.lblNumRicerca.TabIndex = 16;
            // 
            // lstNumeri
            // 
            this.lstNumeri.FormattingEnabled = true;
            this.lstNumeri.Location = new System.Drawing.Point(323, 44);
            this.lstNumeri.Name = "lstNumeri";
            this.lstNumeri.Size = new System.Drawing.Size(111, 95);
            this.lstNumeri.TabIndex = 17;
            this.lstNumeri.Visible = false;
            // 
            // Luca
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(566, 505);
            this.Controls.Add(this.lstNumeri);
            this.Controls.Add(this.lblNumRicerca);
            this.Controls.Add(this.lblRicerca);
            this.Controls.Add(this.txtRicerca);
            this.Controls.Add(this.btnRicerca);
            this.Controls.Add(this.lblMin);
            this.Controls.Add(this.lblMax);
            this.Controls.Add(this.btnMin);
            this.Controls.Add(this.btnMax);
            this.Controls.Add(this.lblMedia);
            this.Controls.Add(this.btnMedia);
            this.Controls.Add(this.lblNumeri);
            this.Controls.Add(this.lblLunghezza);
            this.Controls.Add(this.btnRiempi);
            this.Controls.Add(this.btnCrea);
            this.Controls.Add(this.txtRiempi);
            this.Controls.Add(this.txtCrea);
            this.Name = "Luca";
            this.Text = "Luca";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtCrea;
        private System.Windows.Forms.TextBox txtRiempi;
        private System.Windows.Forms.Button btnCrea;
        private System.Windows.Forms.Button btnRiempi;
        private System.Windows.Forms.Label lblLunghezza;
        private System.Windows.Forms.Label lblNumeri;
        private System.Windows.Forms.Button btnMedia;
        private System.Windows.Forms.Label lblMedia;
        private System.Windows.Forms.Button btnMax;
        private System.Windows.Forms.Button btnMin;
        private System.Windows.Forms.Label lblMax;
        private System.Windows.Forms.Label lblMin;
        private System.Windows.Forms.Button btnRicerca;
        private System.Windows.Forms.TextBox txtRicerca;
        private System.Windows.Forms.Label lblRicerca;
        private System.Windows.Forms.Label lblNumRicerca;
        private System.Windows.Forms.ListBox lstNumeri;
    }
}

