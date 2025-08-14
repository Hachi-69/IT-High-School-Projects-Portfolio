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
            this.btnCalcola = new System.Windows.Forms.Button();
            this.txtn = new System.Windows.Forms.TextBox();
            this.lstRisultato = new System.Windows.Forms.ListBox();
            this.lblInserisci = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnCalcola
            // 
            this.btnCalcola.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcola.Location = new System.Drawing.Point(344, 284);
            this.btnCalcola.Name = "btnCalcola";
            this.btnCalcola.Size = new System.Drawing.Size(123, 45);
            this.btnCalcola.TabIndex = 0;
            this.btnCalcola.Text = "Calcola";
            this.btnCalcola.UseVisualStyleBackColor = true;
            this.btnCalcola.Click += new System.EventHandler(this.btnCalcola_Click);
            // 
            // txtn
            // 
            this.txtn.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtn.Location = new System.Drawing.Point(344, 179);
            this.txtn.Name = "txtn";
            this.txtn.Size = new System.Drawing.Size(123, 29);
            this.txtn.TabIndex = 1;
            // 
            // lstRisultato
            // 
            this.lstRisultato.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lstRisultato.FormattingEnabled = true;
            this.lstRisultato.ItemHeight = 21;
            this.lstRisultato.Location = new System.Drawing.Point(537, 179);
            this.lstRisultato.Name = "lstRisultato";
            this.lstRisultato.Size = new System.Drawing.Size(143, 151);
            this.lstRisultato.TabIndex = 2;
            // 
            // lblInserisci
            // 
            this.lblInserisci.AutoSize = true;
            this.lblInserisci.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblInserisci.Location = new System.Drawing.Point(125, 187);
            this.lblInserisci.Name = "lblInserisci";
            this.lblInserisci.Size = new System.Drawing.Size(156, 21);
            this.lblInserisci.TabIndex = 3;
            this.lblInserisci.Text = "Inserisci un numero";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(904, 522);
            this.Controls.Add(this.lblInserisci);
            this.Controls.Add(this.lstRisultato);
            this.Controls.Add(this.txtn);
            this.Controls.Add(this.btnCalcola);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnCalcola;
        private System.Windows.Forms.TextBox txtn;
        private System.Windows.Forms.ListBox lstRisultato;
        private System.Windows.Forms.Label lblInserisci;
    }
}

