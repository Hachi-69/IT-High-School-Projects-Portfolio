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
            this.btnCalcola = new System.Windows.Forms.Button();
            this.txtnNum = new System.Windows.Forms.TextBox();
            this.lblnNum = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnCalcola
            // 
            this.btnCalcola.BackColor = System.Drawing.Color.PaleTurquoise;
            this.btnCalcola.Font = new System.Drawing.Font("Times New Roman", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcola.Location = new System.Drawing.Point(578, 361);
            this.btnCalcola.Name = "btnCalcola";
            this.btnCalcola.Size = new System.Drawing.Size(149, 57);
            this.btnCalcola.TabIndex = 0;
            this.btnCalcola.Text = "Calcola";
            this.btnCalcola.UseVisualStyleBackColor = false;
            this.btnCalcola.Click += new System.EventHandler(this.btnCalcola_Click);
            // 
            // txtnNum
            // 
            this.txtnNum.Font = new System.Drawing.Font("Times New Roman", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtnNum.Location = new System.Drawing.Point(578, 216);
            this.txtnNum.Name = "txtnNum";
            this.txtnNum.Size = new System.Drawing.Size(149, 35);
            this.txtnNum.TabIndex = 1;
            // 
            // lblnNum
            // 
            this.lblnNum.AutoSize = true;
            this.lblnNum.Font = new System.Drawing.Font("Times New Roman", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblnNum.Location = new System.Drawing.Point(241, 224);
            this.lblnNum.Name = "lblnNum";
            this.lblnNum.Size = new System.Drawing.Size(280, 27);
            this.lblnNum.TabIndex = 2;
            this.lblnNum.Text = "quanti numeri vuoi inserire?";
            // 
            // frmLuca
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.NavajoWhite;
            this.ClientSize = new System.Drawing.Size(1337, 670);
            this.Controls.Add(this.lblnNum);
            this.Controls.Add(this.txtnNum);
            this.Controls.Add(this.btnCalcola);
            this.Name = "frmLuca";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnCalcola;
        private System.Windows.Forms.TextBox txtnNum;
        private System.Windows.Forms.Label lblnNum;
    }
}

