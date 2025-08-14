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
            this.txtMarca = new System.Windows.Forms.TextBox();
            this.txtModello = new System.Windows.Forms.TextBox();
            this.txtAnno = new System.Windows.Forms.TextBox();
            this.txtPrezzo = new System.Windows.Forms.TextBox();
            this.cmbGiorno = new System.Windows.Forms.ComboBox();
            this.lblMarca = new System.Windows.Forms.Label();
            this.lblModello = new System.Windows.Forms.Label();
            this.lblAnno = new System.Windows.Forms.Label();
            this.lblPrezzo = new System.Windows.Forms.Label();
            this.lblGiorno = new System.Windows.Forms.Label();
            this.lblSconto = new System.Windows.Forms.Label();
            this.btnRegistra = new System.Windows.Forms.Button();
            this.lblTesto = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // txtMarca
            // 
            this.txtMarca.Location = new System.Drawing.Point(37, 25);
            this.txtMarca.Name = "txtMarca";
            this.txtMarca.Size = new System.Drawing.Size(121, 20);
            this.txtMarca.TabIndex = 0;
            // 
            // txtModello
            // 
            this.txtModello.Location = new System.Drawing.Point(37, 96);
            this.txtModello.Name = "txtModello";
            this.txtModello.Size = new System.Drawing.Size(121, 20);
            this.txtModello.TabIndex = 1;
            // 
            // txtAnno
            // 
            this.txtAnno.Location = new System.Drawing.Point(37, 163);
            this.txtAnno.Name = "txtAnno";
            this.txtAnno.Size = new System.Drawing.Size(121, 20);
            this.txtAnno.TabIndex = 2;
            // 
            // txtPrezzo
            // 
            this.txtPrezzo.Location = new System.Drawing.Point(37, 234);
            this.txtPrezzo.Name = "txtPrezzo";
            this.txtPrezzo.Size = new System.Drawing.Size(121, 20);
            this.txtPrezzo.TabIndex = 3;
            // 
            // cmbGiorno
            // 
            this.cmbGiorno.FormattingEnabled = true;
            this.cmbGiorno.Location = new System.Drawing.Point(37, 304);
            this.cmbGiorno.Name = "cmbGiorno";
            this.cmbGiorno.Size = new System.Drawing.Size(121, 21);
            this.cmbGiorno.TabIndex = 4;
            this.cmbGiorno.SelectedIndexChanged += new System.EventHandler(this.cmbGiorno_SelectedIndexChanged);
            // 
            // lblMarca
            // 
            this.lblMarca.AutoSize = true;
            this.lblMarca.Location = new System.Drawing.Point(34, 9);
            this.lblMarca.Name = "lblMarca";
            this.lblMarca.Size = new System.Drawing.Size(81, 13);
            this.lblMarca.TabIndex = 5;
            this.lblMarca.Text = "Marca Dell\'auto";
            // 
            // lblModello
            // 
            this.lblModello.AutoSize = true;
            this.lblModello.Location = new System.Drawing.Point(34, 80);
            this.lblModello.Name = "lblModello";
            this.lblModello.Size = new System.Drawing.Size(88, 13);
            this.lblModello.TabIndex = 6;
            this.lblModello.Text = "Modello Dell\'auto";
            // 
            // lblAnno
            // 
            this.lblAnno.AutoSize = true;
            this.lblAnno.Location = new System.Drawing.Point(34, 147);
            this.lblAnno.Name = "lblAnno";
            this.lblAnno.Size = new System.Drawing.Size(170, 13);
            this.lblAnno.TabIndex = 7;
            this.lblAnno.Text = "Anno Di Immatricolazione Dell\'auto";
            // 
            // lblPrezzo
            // 
            this.lblPrezzo.AutoSize = true;
            this.lblPrezzo.Location = new System.Drawing.Point(34, 218);
            this.lblPrezzo.Name = "lblPrezzo";
            this.lblPrezzo.Size = new System.Drawing.Size(83, 13);
            this.lblPrezzo.TabIndex = 8;
            this.lblPrezzo.Text = "Prezzo Dell\'auto";
            // 
            // lblGiorno
            // 
            this.lblGiorno.AutoSize = true;
            this.lblGiorno.Location = new System.Drawing.Point(34, 288);
            this.lblGiorno.Name = "lblGiorno";
            this.lblGiorno.Size = new System.Drawing.Size(95, 13);
            this.lblGiorno.TabIndex = 9;
            this.lblGiorno.Text = "Giorno Di Acquisto";
            // 
            // lblSconto
            // 
            this.lblSconto.AutoSize = true;
            this.lblSconto.Location = new System.Drawing.Point(164, 312);
            this.lblSconto.Name = "lblSconto";
            this.lblSconto.Size = new System.Drawing.Size(61, 13);
            this.lblSconto.TabIndex = 10;
            this.lblSconto.Text = "Sconto del ";
            // 
            // btnRegistra
            // 
            this.btnRegistra.Location = new System.Drawing.Point(249, 7);
            this.btnRegistra.Name = "btnRegistra";
            this.btnRegistra.Size = new System.Drawing.Size(207, 55);
            this.btnRegistra.TabIndex = 11;
            this.btnRegistra.Text = "Registra";
            this.btnRegistra.UseVisualStyleBackColor = true;
            this.btnRegistra.Click += new System.EventHandler(this.btnRegistra_Click);
            // 
            // lblTesto
            // 
            this.lblTesto.AutoSize = true;
            this.lblTesto.Location = new System.Drawing.Point(246, 80);
            this.lblTesto.Name = "lblTesto";
            this.lblTesto.Size = new System.Drawing.Size(0, 13);
            this.lblTesto.TabIndex = 12;
            // 
            // frmLuca
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(911, 458);
            this.Controls.Add(this.lblTesto);
            this.Controls.Add(this.btnRegistra);
            this.Controls.Add(this.lblSconto);
            this.Controls.Add(this.lblGiorno);
            this.Controls.Add(this.lblPrezzo);
            this.Controls.Add(this.lblAnno);
            this.Controls.Add(this.lblModello);
            this.Controls.Add(this.lblMarca);
            this.Controls.Add(this.cmbGiorno);
            this.Controls.Add(this.txtPrezzo);
            this.Controls.Add(this.txtAnno);
            this.Controls.Add(this.txtModello);
            this.Controls.Add(this.txtMarca);
            this.Name = "frmLuca";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtMarca;
        private System.Windows.Forms.TextBox txtModello;
        private System.Windows.Forms.TextBox txtAnno;
        private System.Windows.Forms.TextBox txtPrezzo;
        private System.Windows.Forms.ComboBox cmbGiorno;
        private System.Windows.Forms.Label lblMarca;
        private System.Windows.Forms.Label lblModello;
        private System.Windows.Forms.Label lblAnno;
        private System.Windows.Forms.Label lblPrezzo;
        private System.Windows.Forms.Label lblGiorno;
        private System.Windows.Forms.Label lblSconto;
        private System.Windows.Forms.Button btnRegistra;
        private System.Windows.Forms.Label lblTesto;
    }
}

