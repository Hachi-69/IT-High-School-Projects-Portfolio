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
            this.btnGiornoTemperatura = new System.Windows.Forms.Button();
            this.txtGiorno = new System.Windows.Forms.TextBox();
            this.txttemperatura = new System.Windows.Forms.TextBox();
            this.lblGiorno = new System.Windows.Forms.Label();
            this.lblTemperatura = new System.Windows.Forms.Label();
            this.lstLista = new System.Windows.Forms.ListBox();
            this.btnMax = new System.Windows.Forms.Button();
            this.btnMinimo = new System.Windows.Forms.Button();
            this.btnMedia = new System.Windows.Forms.Button();
            this.lblMax = new System.Windows.Forms.Label();
            this.lblMin = new System.Windows.Forms.Label();
            this.lblMedia = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnGiornoTemperatura
            // 
            this.btnGiornoTemperatura.Enabled = false;
            this.btnGiornoTemperatura.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGiornoTemperatura.Location = new System.Drawing.Point(197, 82);
            this.btnGiornoTemperatura.Name = "btnGiornoTemperatura";
            this.btnGiornoTemperatura.Size = new System.Drawing.Size(116, 42);
            this.btnGiornoTemperatura.TabIndex = 0;
            this.btnGiornoTemperatura.Text = "Giorno e temperatura";
            this.btnGiornoTemperatura.UseVisualStyleBackColor = true;
            this.btnGiornoTemperatura.Click += new System.EventHandler(this.btnGiornoTemperatura_Click);
            // 
            // txtGiorno
            // 
            this.txtGiorno.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtGiorno.Location = new System.Drawing.Point(23, 47);
            this.txtGiorno.Name = "txtGiorno";
            this.txtGiorno.Size = new System.Drawing.Size(100, 23);
            this.txtGiorno.TabIndex = 2;
            this.txtGiorno.TextChanged += new System.EventHandler(this.txtGiorno_TextChanged);
            // 
            // txttemperatura
            // 
            this.txttemperatura.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txttemperatura.Location = new System.Drawing.Point(23, 137);
            this.txttemperatura.Name = "txttemperatura";
            this.txttemperatura.Size = new System.Drawing.Size(100, 23);
            this.txttemperatura.TabIndex = 3;
            this.txttemperatura.TextChanged += new System.EventHandler(this.txttemperatura_TextChanged);
            // 
            // lblGiorno
            // 
            this.lblGiorno.AutoSize = true;
            this.lblGiorno.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblGiorno.Location = new System.Drawing.Point(23, 31);
            this.lblGiorno.Name = "lblGiorno";
            this.lblGiorno.Size = new System.Drawing.Size(107, 15);
            this.lblGiorno.TabIndex = 4;
            this.lblGiorno.Text = "Inserisci il Giorno";
            // 
            // lblTemperatura
            // 
            this.lblTemperatura.AutoSize = true;
            this.lblTemperatura.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTemperatura.Location = new System.Drawing.Point(23, 118);
            this.lblTemperatura.Name = "lblTemperatura";
            this.lblTemperatura.Size = new System.Drawing.Size(142, 15);
            this.lblTemperatura.TabIndex = 5;
            this.lblTemperatura.Text = "Inserisci La Temperatura";
            // 
            // lstLista
            // 
            this.lstLista.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lstLista.FormattingEnabled = true;
            this.lstLista.ItemHeight = 15;
            this.lstLista.Location = new System.Drawing.Point(351, 12);
            this.lstLista.Name = "lstLista";
            this.lstLista.Size = new System.Drawing.Size(157, 214);
            this.lstLista.TabIndex = 6;
            this.lstLista.Visible = false;
            // 
            // btnMax
            // 
            this.btnMax.Location = new System.Drawing.Point(26, 243);
            this.btnMax.Name = "btnMax";
            this.btnMax.Size = new System.Drawing.Size(75, 36);
            this.btnMax.TabIndex = 7;
            this.btnMax.Text = "Temperatura Massima";
            this.btnMax.UseVisualStyleBackColor = true;
            this.btnMax.Click += new System.EventHandler(this.btnMax_Click);
            // 
            // btnMinimo
            // 
            this.btnMinimo.Location = new System.Drawing.Point(26, 314);
            this.btnMinimo.Name = "btnMinimo";
            this.btnMinimo.Size = new System.Drawing.Size(75, 36);
            this.btnMinimo.TabIndex = 8;
            this.btnMinimo.Text = "Temperatura Minima";
            this.btnMinimo.UseVisualStyleBackColor = true;
            this.btnMinimo.Click += new System.EventHandler(this.btnMinimo_Click);
            // 
            // btnMedia
            // 
            this.btnMedia.Location = new System.Drawing.Point(26, 393);
            this.btnMedia.Name = "btnMedia";
            this.btnMedia.Size = new System.Drawing.Size(75, 36);
            this.btnMedia.TabIndex = 9;
            this.btnMedia.Text = "Temperatura Media";
            this.btnMedia.UseVisualStyleBackColor = true;
            this.btnMedia.Click += new System.EventHandler(this.btnMedia_Click);
            // 
            // lblMax
            // 
            this.lblMax.AutoSize = true;
            this.lblMax.Location = new System.Drawing.Point(182, 243);
            this.lblMax.Name = "lblMax";
            this.lblMax.Size = new System.Drawing.Size(27, 13);
            this.lblMax.TabIndex = 10;
            this.lblMax.Text = "Max";
            // 
            // lblMin
            // 
            this.lblMin.AutoSize = true;
            this.lblMin.Location = new System.Drawing.Point(185, 314);
            this.lblMin.Name = "lblMin";
            this.lblMin.Size = new System.Drawing.Size(24, 13);
            this.lblMin.TabIndex = 11;
            this.lblMin.Text = "Min";
            // 
            // lblMedia
            // 
            this.lblMedia.AutoSize = true;
            this.lblMedia.Location = new System.Drawing.Point(185, 393);
            this.lblMedia.Name = "lblMedia";
            this.lblMedia.Size = new System.Drawing.Size(36, 13);
            this.lblMedia.TabIndex = 12;
            this.lblMedia.Text = "Media";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(821, 496);
            this.Controls.Add(this.lblMedia);
            this.Controls.Add(this.lblMin);
            this.Controls.Add(this.lblMax);
            this.Controls.Add(this.btnMedia);
            this.Controls.Add(this.btnMinimo);
            this.Controls.Add(this.btnMax);
            this.Controls.Add(this.lstLista);
            this.Controls.Add(this.lblTemperatura);
            this.Controls.Add(this.lblGiorno);
            this.Controls.Add(this.txttemperatura);
            this.Controls.Add(this.txtGiorno);
            this.Controls.Add(this.btnGiornoTemperatura);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnGiornoTemperatura;
        private System.Windows.Forms.TextBox txtGiorno;
        private System.Windows.Forms.TextBox txttemperatura;
        private System.Windows.Forms.Label lblGiorno;
        private System.Windows.Forms.Label lblTemperatura;
        private System.Windows.Forms.ListBox lstLista;
        private System.Windows.Forms.Button btnMax;
        private System.Windows.Forms.Button btnMinimo;
        private System.Windows.Forms.Button btnMedia;
        private System.Windows.Forms.Label lblMax;
        private System.Windows.Forms.Label lblMin;
        private System.Windows.Forms.Label lblMedia;
    }
}

