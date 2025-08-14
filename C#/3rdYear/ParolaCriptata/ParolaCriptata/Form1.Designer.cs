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
            this.txtParola = new System.Windows.Forms.TextBox();
            this.txtChiave = new System.Windows.Forms.TextBox();
            this.btnCripta = new System.Windows.Forms.Button();
            this.btnDecripta = new System.Windows.Forms.Button();
            this.lblParola = new System.Windows.Forms.Label();
            this.lblChiave = new System.Windows.Forms.Label();
            this.lblParolaCriptata = new System.Windows.Forms.Label();
            this.lblParolaDecriptata = new System.Windows.Forms.Label();
            this.btnResetta = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // txtParola
            // 
            this.txtParola.Font = new System.Drawing.Font("Times New Roman", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtParola.Location = new System.Drawing.Point(92, 79);
            this.txtParola.Name = "txtParola";
            this.txtParola.Size = new System.Drawing.Size(100, 22);
            this.txtParola.TabIndex = 0;
            // 
            // txtChiave
            // 
            this.txtChiave.Font = new System.Drawing.Font("Times New Roman", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtChiave.Location = new System.Drawing.Point(92, 159);
            this.txtChiave.Name = "txtChiave";
            this.txtChiave.Size = new System.Drawing.Size(100, 22);
            this.txtChiave.TabIndex = 1;
            // 
            // btnCripta
            // 
            this.btnCripta.Font = new System.Drawing.Font("Times New Roman", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCripta.Location = new System.Drawing.Point(39, 228);
            this.btnCripta.Name = "btnCripta";
            this.btnCripta.Size = new System.Drawing.Size(75, 23);
            this.btnCripta.TabIndex = 2;
            this.btnCripta.Text = "Cripta";
            this.btnCripta.UseVisualStyleBackColor = true;
            this.btnCripta.Click += new System.EventHandler(this.btnCripta_Click);
            // 
            // btnDecripta
            // 
            this.btnDecripta.Font = new System.Drawing.Font("Times New Roman", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDecripta.Location = new System.Drawing.Point(184, 228);
            this.btnDecripta.Name = "btnDecripta";
            this.btnDecripta.Size = new System.Drawing.Size(75, 23);
            this.btnDecripta.TabIndex = 3;
            this.btnDecripta.Text = "Decripta";
            this.btnDecripta.UseVisualStyleBackColor = true;
            this.btnDecripta.Click += new System.EventHandler(this.btnDecripta_Click);
            // 
            // lblParola
            // 
            this.lblParola.AutoSize = true;
            this.lblParola.Font = new System.Drawing.Font("Times New Roman", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblParola.Location = new System.Drawing.Point(92, 26);
            this.lblParola.Name = "lblParola";
            this.lblParola.Size = new System.Drawing.Size(103, 15);
            this.lblParola.TabIndex = 4;
            this.lblParola.Text = "Parola Da Criptare";
            // 
            // lblChiave
            // 
            this.lblChiave.AutoSize = true;
            this.lblChiave.Font = new System.Drawing.Font("Times New Roman", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblChiave.Location = new System.Drawing.Point(92, 120);
            this.lblChiave.Name = "lblChiave";
            this.lblChiave.Size = new System.Drawing.Size(44, 15);
            this.lblChiave.TabIndex = 5;
            this.lblChiave.Text = "Chiave";
            // 
            // lblParolaCriptata
            // 
            this.lblParolaCriptata.AutoSize = true;
            this.lblParolaCriptata.Font = new System.Drawing.Font("Times New Roman", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblParolaCriptata.Location = new System.Drawing.Point(36, 264);
            this.lblParolaCriptata.Name = "lblParolaCriptata";
            this.lblParolaCriptata.Size = new System.Drawing.Size(0, 15);
            this.lblParolaCriptata.TabIndex = 6;
            // 
            // lblParolaDecriptata
            // 
            this.lblParolaDecriptata.AutoSize = true;
            this.lblParolaDecriptata.Font = new System.Drawing.Font("Times New Roman", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblParolaDecriptata.Location = new System.Drawing.Point(183, 264);
            this.lblParolaDecriptata.Name = "lblParolaDecriptata";
            this.lblParolaDecriptata.Size = new System.Drawing.Size(0, 15);
            this.lblParolaDecriptata.TabIndex = 7;
            // 
            // btnResetta
            // 
            this.btnResetta.Font = new System.Drawing.Font("Times New Roman", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnResetta.Location = new System.Drawing.Point(114, 282);
            this.btnResetta.Name = "btnResetta";
            this.btnResetta.Size = new System.Drawing.Size(64, 27);
            this.btnResetta.TabIndex = 8;
            this.btnResetta.Text = "Resetta";
            this.btnResetta.UseVisualStyleBackColor = true;
            this.btnResetta.Click += new System.EventHandler(this.btnResetta_Click);
            // 
            // frmLuca
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(307, 352);
            this.Controls.Add(this.btnResetta);
            this.Controls.Add(this.lblParolaDecriptata);
            this.Controls.Add(this.lblParolaCriptata);
            this.Controls.Add(this.lblChiave);
            this.Controls.Add(this.lblParola);
            this.Controls.Add(this.btnDecripta);
            this.Controls.Add(this.btnCripta);
            this.Controls.Add(this.txtChiave);
            this.Controls.Add(this.txtParola);
            this.Name = "frmLuca";
            this.Text = "Cripta la parola";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtParola;
        private System.Windows.Forms.TextBox txtChiave;
        private System.Windows.Forms.Button btnCripta;
        private System.Windows.Forms.Button btnDecripta;
        private System.Windows.Forms.Label lblParola;
        private System.Windows.Forms.Label lblChiave;
        private System.Windows.Forms.Label lblParolaCriptata;
        private System.Windows.Forms.Label lblParolaDecriptata;
        private System.Windows.Forms.Button btnResetta;
    }
}

