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
            this.btnLunghezza = new System.Windows.Forms.Button();
            this.btnDoppie = new System.Windows.Forms.Button();
            this.btnVocECon = new System.Windows.Forms.Button();
            this.btnCarattere = new System.Windows.Forms.Button();
            this.lbl1 = new System.Windows.Forms.Label();
            this.lbl2 = new System.Windows.Forms.Label();
            this.lbl3 = new System.Windows.Forms.Label();
            this.lbl4 = new System.Windows.Forms.Label();
            this.txtParola = new System.Windows.Forms.TextBox();
            this.txtCarattere = new System.Windows.Forms.TextBox();
            this.lblCarattere = new System.Windows.Forms.Label();
            this.lblParola = new System.Windows.Forms.Label();
            this.btnMaiuscola = new System.Windows.Forms.Button();
            this.lbl5 = new System.Windows.Forms.Label();
            this.btnPalindroma = new System.Windows.Forms.Button();
            this.lbl6 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnLunghezza
            // 
            this.btnLunghezza.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLunghezza.Location = new System.Drawing.Point(13, 111);
            this.btnLunghezza.Name = "btnLunghezza";
            this.btnLunghezza.Size = new System.Drawing.Size(134, 34);
            this.btnLunghezza.TabIndex = 0;
            this.btnLunghezza.Text = "Calcola Lunghezza";
            this.btnLunghezza.UseVisualStyleBackColor = true;
            this.btnLunghezza.Click += new System.EventHandler(this.btnLunghezza_Click);
            // 
            // btnDoppie
            // 
            this.btnDoppie.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDoppie.Location = new System.Drawing.Point(13, 196);
            this.btnDoppie.Name = "btnDoppie";
            this.btnDoppie.Size = new System.Drawing.Size(134, 34);
            this.btnDoppie.TabIndex = 1;
            this.btnDoppie.Text = "Calcola Doppie";
            this.btnDoppie.UseVisualStyleBackColor = true;
            this.btnDoppie.Click += new System.EventHandler(this.btnDoppie_Click);
            // 
            // btnVocECon
            // 
            this.btnVocECon.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVocECon.Location = new System.Drawing.Point(13, 281);
            this.btnVocECon.Name = "btnVocECon";
            this.btnVocECon.Size = new System.Drawing.Size(134, 49);
            this.btnVocECon.TabIndex = 2;
            this.btnVocECon.Text = "Calcola Vocali e Consonanti";
            this.btnVocECon.UseVisualStyleBackColor = true;
            this.btnVocECon.Click += new System.EventHandler(this.btnVocECon_Click);
            // 
            // btnCarattere
            // 
            this.btnCarattere.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCarattere.Location = new System.Drawing.Point(13, 381);
            this.btnCarattere.Name = "btnCarattere";
            this.btnCarattere.Size = new System.Drawing.Size(134, 34);
            this.btnCarattere.TabIndex = 3;
            this.btnCarattere.Text = "Trova Carattere";
            this.btnCarattere.UseVisualStyleBackColor = true;
            this.btnCarattere.Click += new System.EventHandler(this.btnCarattere_Click);
            // 
            // lbl1
            // 
            this.lbl1.AutoSize = true;
            this.lbl1.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl1.Location = new System.Drawing.Point(201, 119);
            this.lbl1.Name = "lbl1";
            this.lbl1.Size = new System.Drawing.Size(118, 19);
            this.lbl1.TabIndex = 4;
            this.lbl1.Text = "La Lunghezza e\' 0";
            // 
            // lbl2
            // 
            this.lbl2.AutoSize = true;
            this.lbl2.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl2.Location = new System.Drawing.Point(201, 193);
            this.lbl2.Name = "lbl2";
            this.lbl2.Size = new System.Drawing.Size(116, 19);
            this.lbl2.TabIndex = 5;
            this.lbl2.Text = "Le doppie sono 0";
            // 
            // lbl3
            // 
            this.lbl3.AutoSize = true;
            this.lbl3.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl3.Location = new System.Drawing.Point(201, 267);
            this.lbl3.Name = "lbl3";
            this.lbl3.Size = new System.Drawing.Size(214, 19);
            this.lbl3.TabIndex = 6;
            this.lbl3.Text = "le vocali sono  le consonanti sono ";
            // 
            // lbl4
            // 
            this.lbl4.AutoSize = true;
            this.lbl4.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl4.Location = new System.Drawing.Point(370, 359);
            this.lbl4.Name = "lbl4";
            this.lbl4.Size = new System.Drawing.Size(75, 19);
            this.lbl4.TabIndex = 7;
            this.lbl4.Text = "caratteri = ";
            // 
            // txtParola
            // 
            this.txtParola.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtParola.Location = new System.Drawing.Point(13, 47);
            this.txtParola.Name = "txtParola";
            this.txtParola.Size = new System.Drawing.Size(208, 26);
            this.txtParola.TabIndex = 8;
            // 
            // txtCarattere
            // 
            this.txtCarattere.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCarattere.Location = new System.Drawing.Point(246, 375);
            this.txtCarattere.Name = "txtCarattere";
            this.txtCarattere.Size = new System.Drawing.Size(21, 26);
            this.txtCarattere.TabIndex = 9;
            // 
            // lblCarattere
            // 
            this.lblCarattere.AutoSize = true;
            this.lblCarattere.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCarattere.Location = new System.Drawing.Point(211, 341);
            this.lblCarattere.Name = "lblCarattere";
            this.lblCarattere.Size = new System.Drawing.Size(133, 19);
            this.lblCarattere.TabIndex = 10;
            this.lblCarattere.Text = "Inserisci un carattere";
            // 
            // lblParola
            // 
            this.lblParola.AutoSize = true;
            this.lblParola.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblParola.Location = new System.Drawing.Point(57, 9);
            this.lblParola.Name = "lblParola";
            this.lblParola.Size = new System.Drawing.Size(140, 21);
            this.lblParola.TabIndex = 11;
            this.lblParola.Text = "Inserisci la parola";
            // 
            // btnMaiuscola
            // 
            this.btnMaiuscola.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMaiuscola.Location = new System.Drawing.Point(12, 466);
            this.btnMaiuscola.Name = "btnMaiuscola";
            this.btnMaiuscola.Size = new System.Drawing.Size(134, 48);
            this.btnMaiuscola.TabIndex = 12;
            this.btnMaiuscola.Text = "Prima Lettera Maiusola";
            this.btnMaiuscola.UseVisualStyleBackColor = true;
            this.btnMaiuscola.Click += new System.EventHandler(this.btnMaiuscola_Click);
            // 
            // lbl5
            // 
            this.lbl5.AutoSize = true;
            this.lbl5.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl5.Location = new System.Drawing.Point(242, 496);
            this.lbl5.Name = "lbl5";
            this.lbl5.Size = new System.Drawing.Size(0, 19);
            this.lbl5.TabIndex = 13;
            // 
            // btnPalindroma
            // 
            this.btnPalindroma.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnPalindroma.Location = new System.Drawing.Point(12, 565);
            this.btnPalindroma.Name = "btnPalindroma";
            this.btnPalindroma.Size = new System.Drawing.Size(134, 33);
            this.btnPalindroma.TabIndex = 14;
            this.btnPalindroma.Text = "Palindroma";
            this.btnPalindroma.UseVisualStyleBackColor = true;
            this.btnPalindroma.Click += new System.EventHandler(this.btnPalindroma_Click);
            // 
            // lbl6
            // 
            this.lbl6.AutoSize = true;
            this.lbl6.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl6.Location = new System.Drawing.Point(242, 570);
            this.lbl6.Name = "lbl6";
            this.lbl6.Size = new System.Drawing.Size(0, 19);
            this.lbl6.TabIndex = 15;
            // 
            // frmLuca
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1336, 719);
            this.Controls.Add(this.lbl6);
            this.Controls.Add(this.btnPalindroma);
            this.Controls.Add(this.lbl5);
            this.Controls.Add(this.btnMaiuscola);
            this.Controls.Add(this.lblParola);
            this.Controls.Add(this.lblCarattere);
            this.Controls.Add(this.txtCarattere);
            this.Controls.Add(this.txtParola);
            this.Controls.Add(this.lbl4);
            this.Controls.Add(this.lbl3);
            this.Controls.Add(this.lbl2);
            this.Controls.Add(this.lbl1);
            this.Controls.Add(this.btnCarattere);
            this.Controls.Add(this.btnVocECon);
            this.Controls.Add(this.btnDoppie);
            this.Controls.Add(this.btnLunghezza);
            this.Name = "frmLuca";
            this.Text = "Luca";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnLunghezza;
        private System.Windows.Forms.Button btnDoppie;
        private System.Windows.Forms.Button btnVocECon;
        private System.Windows.Forms.Button btnCarattere;
        private System.Windows.Forms.Label lbl1;
        private System.Windows.Forms.Label lbl2;
        private System.Windows.Forms.Label lbl3;
        private System.Windows.Forms.Label lbl4;
        private System.Windows.Forms.TextBox txtParola;
        private System.Windows.Forms.TextBox txtCarattere;
        private System.Windows.Forms.Label lblCarattere;
        private System.Windows.Forms.Label lblParola;
        private System.Windows.Forms.Button btnMaiuscola;
        private System.Windows.Forms.Label lbl5;
        private System.Windows.Forms.Button btnPalindroma;
        private System.Windows.Forms.Label lbl6;
    }
}

