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
            this.lblAttuale = new System.Windows.Forms.Label();
            this.lblPrecedente = new System.Windows.Forms.Label();
            this.lblNome = new System.Windows.Forms.Label();
            this.txtPrecedente = new System.Windows.Forms.TextBox();
            this.txtAttuale = new System.Windows.Forms.TextBox();
            this.txtNome = new System.Windows.Forms.TextBox();
            this.btnCalcola = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblAttuale
            // 
            this.lblAttuale.AutoSize = true;
            this.lblAttuale.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAttuale.Location = new System.Drawing.Point(214, 312);
            this.lblAttuale.Name = "lblAttuale";
            this.lblAttuale.Size = new System.Drawing.Size(174, 21);
            this.lblAttuale.TabIndex = 0;
            this.lblAttuale.Text = "Inserisci lettura attuale";
            // 
            // lblPrecedente
            // 
            this.lblPrecedente.AutoSize = true;
            this.lblPrecedente.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPrecedente.Location = new System.Drawing.Point(214, 212);
            this.lblPrecedente.Name = "lblPrecedente";
            this.lblPrecedente.Size = new System.Drawing.Size(208, 21);
            this.lblPrecedente.TabIndex = 1;
            this.lblPrecedente.Text = "Inserisci lettura precedente";
            // 
            // lblNome
            // 
            this.lblNome.AutoSize = true;
            this.lblNome.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNome.Location = new System.Drawing.Point(214, 112);
            this.lblNome.Name = "lblNome";
            this.lblNome.Size = new System.Drawing.Size(118, 21);
            this.lblNome.TabIndex = 2;
            this.lblNome.Text = "Inserisci nome";
            // 
            // txtPrecedente
            // 
            this.txtPrecedente.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtPrecedente.Location = new System.Drawing.Point(548, 207);
            this.txtPrecedente.Name = "txtPrecedente";
            this.txtPrecedente.Size = new System.Drawing.Size(107, 26);
            this.txtPrecedente.TabIndex = 3;
            // 
            // txtAttuale
            // 
            this.txtAttuale.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtAttuale.Location = new System.Drawing.Point(548, 307);
            this.txtAttuale.Name = "txtAttuale";
            this.txtAttuale.Size = new System.Drawing.Size(107, 26);
            this.txtAttuale.TabIndex = 4;
            this.txtAttuale.TextChanged += new System.EventHandler(this.txtAttuale_TextChanged);
            // 
            // txtNome
            // 
            this.txtNome.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtNome.Location = new System.Drawing.Point(548, 107);
            this.txtNome.Name = "txtNome";
            this.txtNome.Size = new System.Drawing.Size(107, 26);
            this.txtNome.TabIndex = 5;
            // 
            // btnCalcola
            // 
            this.btnCalcola.BackColor = System.Drawing.Color.Coral;
            this.btnCalcola.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcola.Location = new System.Drawing.Point(548, 388);
            this.btnCalcola.Name = "btnCalcola";
            this.btnCalcola.Size = new System.Drawing.Size(107, 46);
            this.btnCalcola.TabIndex = 6;
            this.btnCalcola.Text = "Calcola";
            this.btnCalcola.UseVisualStyleBackColor = false;
            this.btnCalcola.Click += new System.EventHandler(this.btnCalcola_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.CornflowerBlue;
            this.ClientSize = new System.Drawing.Size(917, 527);
            this.Controls.Add(this.btnCalcola);
            this.Controls.Add(this.txtNome);
            this.Controls.Add(this.txtAttuale);
            this.Controls.Add(this.txtPrecedente);
            this.Controls.Add(this.lblNome);
            this.Controls.Add(this.lblPrecedente);
            this.Controls.Add(this.lblAttuale);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblAttuale;
        private System.Windows.Forms.Label lblPrecedente;
        private System.Windows.Forms.Label lblNome;
        private System.Windows.Forms.TextBox txtPrecedente;
        private System.Windows.Forms.TextBox txtAttuale;
        private System.Windows.Forms.TextBox txtNome;
        private System.Windows.Forms.Button btnCalcola;
    }
}

