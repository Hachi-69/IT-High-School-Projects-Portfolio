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
            this.txtnNumeri = new System.Windows.Forms.TextBox();
            this.lblnNumeri = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnCalcola
            // 
            this.btnCalcola.BackColor = System.Drawing.Color.Cyan;
            this.btnCalcola.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcola.Location = new System.Drawing.Point(487, 274);
            this.btnCalcola.Name = "btnCalcola";
            this.btnCalcola.Size = new System.Drawing.Size(133, 34);
            this.btnCalcola.TabIndex = 0;
            this.btnCalcola.Text = "Calcola";
            this.btnCalcola.UseVisualStyleBackColor = false;
            this.btnCalcola.Click += new System.EventHandler(this.button1_Click);
            // 
            // txtnNumeri
            // 
            this.txtnNumeri.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtnNumeri.Location = new System.Drawing.Point(487, 176);
            this.txtnNumeri.Name = "txtnNumeri";
            this.txtnNumeri.Size = new System.Drawing.Size(133, 29);
            this.txtnNumeri.TabIndex = 1;
            // 
            // lblnNumeri
            // 
            this.lblnNumeri.AutoSize = true;
            this.lblnNumeri.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblnNumeri.Location = new System.Drawing.Point(215, 184);
            this.lblnNumeri.Name = "lblnNumeri";
            this.lblnNumeri.Size = new System.Drawing.Size(217, 21);
            this.lblnNumeri.TabIndex = 2;
            this.lblnNumeri.Text = "Quanti numeri vuoi inserire?";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.CornflowerBlue;
            this.ClientSize = new System.Drawing.Size(917, 524);
            this.Controls.Add(this.lblnNumeri);
            this.Controls.Add(this.txtnNumeri);
            this.Controls.Add(this.btnCalcola);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnCalcola;
        private System.Windows.Forms.TextBox txtnNumeri;
        private System.Windows.Forms.Label lblnNumeri;
    }
}

