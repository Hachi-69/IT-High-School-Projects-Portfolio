namespace WindowsFormsApplication1
{
    partial class frmRettangolo
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
            this.btnCalcola = new System.Windows.Forms.Button();
            this.lblbMaggiore = new System.Windows.Forms.Label();
            this.lblbMinore = new System.Windows.Forms.Label();
            this.lblAltezza = new System.Windows.Forms.Label();
            this.txtbMaggiore = new System.Windows.Forms.TextBox();
            this.txtAltezza = new System.Windows.Forms.TextBox();
            this.txtbMinore = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // btnCalcola
            // 
            this.btnCalcola.BackColor = System.Drawing.Color.Cornsilk;
            this.btnCalcola.Font = new System.Drawing.Font("Comic Sans MS", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcola.Location = new System.Drawing.Point(604, 118);
            this.btnCalcola.Margin = new System.Windows.Forms.Padding(4);
            this.btnCalcola.Name = "btnCalcola";
            this.btnCalcola.Size = new System.Drawing.Size(169, 115);
            this.btnCalcola.TabIndex = 4;
            this.btnCalcola.Text = "calcola perimetro e area";
            this.btnCalcola.UseVisualStyleBackColor = false;
            this.btnCalcola.Click += new System.EventHandler(this.btnCalcola_Click);
            // 
            // lblbMaggiore
            // 
            this.lblbMaggiore.AutoSize = true;
            this.lblbMaggiore.Font = new System.Drawing.Font("Comic Sans MS", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblbMaggiore.Location = new System.Drawing.Point(75, 72);
            this.lblbMaggiore.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblbMaggiore.Name = "lblbMaggiore";
            this.lblbMaggiore.Size = new System.Drawing.Size(238, 26);
            this.lblbMaggiore.TabIndex = 5;
            this.lblbMaggiore.Text = "Inserisci la base maggiore";
            // 
            // lblbMinore
            // 
            this.lblbMinore.AutoSize = true;
            this.lblbMinore.Font = new System.Drawing.Font("Comic Sans MS", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblbMinore.Location = new System.Drawing.Point(75, 165);
            this.lblbMinore.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblbMinore.Name = "lblbMinore";
            this.lblbMinore.Size = new System.Drawing.Size(218, 26);
            this.lblbMinore.TabIndex = 6;
            this.lblbMinore.Text = "Inserisci la base minore";
            // 
            // lblAltezza
            // 
            this.lblAltezza.AutoSize = true;
            this.lblAltezza.Font = new System.Drawing.Font("Comic Sans MS", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAltezza.Location = new System.Drawing.Point(75, 276);
            this.lblAltezza.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblAltezza.Name = "lblAltezza";
            this.lblAltezza.Size = new System.Drawing.Size(170, 26);
            this.lblAltezza.TabIndex = 7;
            this.lblAltezza.Text = "Inserisci l\'altezza";
            // 
            // txtbMaggiore
            // 
            this.txtbMaggiore.Font = new System.Drawing.Font("Comic Sans MS", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtbMaggiore.Location = new System.Drawing.Point(400, 71);
            this.txtbMaggiore.Margin = new System.Windows.Forms.Padding(4);
            this.txtbMaggiore.Name = "txtbMaggiore";
            this.txtbMaggiore.Size = new System.Drawing.Size(73, 34);
            this.txtbMaggiore.TabIndex = 8;
            // 
            // txtAltezza
            // 
            this.txtAltezza.Font = new System.Drawing.Font("Comic Sans MS", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtAltezza.Location = new System.Drawing.Point(400, 275);
            this.txtAltezza.Margin = new System.Windows.Forms.Padding(4);
            this.txtAltezza.Name = "txtAltezza";
            this.txtAltezza.Size = new System.Drawing.Size(73, 34);
            this.txtAltezza.TabIndex = 9;
            // 
            // txtbMinore
            // 
            this.txtbMinore.Font = new System.Drawing.Font("Comic Sans MS", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtbMinore.Location = new System.Drawing.Point(400, 164);
            this.txtbMinore.Margin = new System.Windows.Forms.Padding(4);
            this.txtbMinore.Name = "txtbMinore";
            this.txtbMinore.Size = new System.Drawing.Size(73, 34);
            this.txtbMinore.TabIndex = 10;
            // 
            // frmRettangolo
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 19F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.LightBlue;
            this.ClientSize = new System.Drawing.Size(1444, 780);
            this.Controls.Add(this.txtbMinore);
            this.Controls.Add(this.txtAltezza);
            this.Controls.Add(this.txtbMaggiore);
            this.Controls.Add(this.lblAltezza);
            this.Controls.Add(this.lblbMinore);
            this.Controls.Add(this.lblbMaggiore);
            this.Controls.Add(this.btnCalcola);
            this.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "frmRettangolo";
            this.Text = "P e A del rettangolo";
            this.Load += new System.EventHandler(this.frmRettangolo_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnCalcola;
        private System.Windows.Forms.Label lblbMaggiore;
        private System.Windows.Forms.Label lblbMinore;
        private System.Windows.Forms.Label lblAltezza;
        private System.Windows.Forms.TextBox txtbMaggiore;
        private System.Windows.Forms.TextBox txtAltezza;
        private System.Windows.Forms.TextBox txtbMinore;
    }
}

