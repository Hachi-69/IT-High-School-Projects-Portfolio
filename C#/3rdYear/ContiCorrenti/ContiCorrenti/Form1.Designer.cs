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
            this.txtCrea = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.btnCrea = new System.Windows.Forms.Button();
            this.btnInserisci = new System.Windows.Forms.Button();
            this.txtCercaConto = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.btnCercaConto = new System.Windows.Forms.Button();
            this.lblCercaConto = new System.Windows.Forms.Label();
            this.lstVisualizza = new System.Windows.Forms.ListBox();
            this.txtRicercaNome = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.btnCercaNome = new System.Windows.Forms.Button();
            this.lblCercaNome = new System.Windows.Forms.Label();
            this.btnCercaRosso = new System.Windows.Forms.Button();
            this.label4 = new System.Windows.Forms.Label();
            this.lblCercaRosso = new System.Windows.Forms.Label();
            this.btnMax = new System.Windows.Forms.Button();
            this.lblSaldo = new System.Windows.Forms.Label();
            this.btnMedia = new System.Windows.Forms.Button();
            this.lblMedia = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // txtCrea
            // 
            this.txtCrea.Location = new System.Drawing.Point(106, 103);
            this.txtCrea.Name = "txtCrea";
            this.txtCrea.Size = new System.Drawing.Size(100, 20);
            this.txtCrea.TabIndex = 0;
            this.txtCrea.TextChanged += new System.EventHandler(this.txtCrea_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(67, 75);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(185, 17);
            this.label1.TabIndex = 1;
            this.label1.Text = "Quanti utenti si vuole inserire?";
            // 
            // btnCrea
            // 
            this.btnCrea.BackColor = System.Drawing.Color.White;
            this.btnCrea.Enabled = false;
            this.btnCrea.Location = new System.Drawing.Point(299, 101);
            this.btnCrea.Name = "btnCrea";
            this.btnCrea.Size = new System.Drawing.Size(75, 23);
            this.btnCrea.TabIndex = 2;
            this.btnCrea.Text = "Crea";
            this.btnCrea.UseVisualStyleBackColor = false;
            this.btnCrea.Click += new System.EventHandler(this.btnCrea_Click);
            // 
            // btnInserisci
            // 
            this.btnInserisci.BackColor = System.Drawing.Color.White;
            this.btnInserisci.Enabled = false;
            this.btnInserisci.Location = new System.Drawing.Point(436, 100);
            this.btnInserisci.Name = "btnInserisci";
            this.btnInserisci.Size = new System.Drawing.Size(75, 23);
            this.btnInserisci.TabIndex = 3;
            this.btnInserisci.Text = "Inserisci";
            this.btnInserisci.UseVisualStyleBackColor = false;
            this.btnInserisci.Click += new System.EventHandler(this.btnInserisci_Click);
            // 
            // txtCercaConto
            // 
            this.txtCercaConto.Enabled = false;
            this.txtCercaConto.Location = new System.Drawing.Point(106, 209);
            this.txtCercaConto.Name = "txtCercaConto";
            this.txtCercaConto.Size = new System.Drawing.Size(100, 20);
            this.txtCercaConto.TabIndex = 4;
            this.txtCercaConto.TextChanged += new System.EventHandler(this.txtCercaConto_TextChanged);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(100, 185);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(115, 17);
            this.label2.TabIndex = 5;
            this.label2.Text = "Cerca con il conto";
            // 
            // btnCercaConto
            // 
            this.btnCercaConto.BackColor = System.Drawing.Color.White;
            this.btnCercaConto.Enabled = false;
            this.btnCercaConto.Location = new System.Drawing.Point(299, 209);
            this.btnCercaConto.Name = "btnCercaConto";
            this.btnCercaConto.Size = new System.Drawing.Size(75, 23);
            this.btnCercaConto.TabIndex = 6;
            this.btnCercaConto.Text = "Cerca";
            this.btnCercaConto.UseVisualStyleBackColor = false;
            this.btnCercaConto.Click += new System.EventHandler(this.btnCercaConto_Click);
            // 
            // lblCercaConto
            // 
            this.lblCercaConto.AutoSize = true;
            this.lblCercaConto.Location = new System.Drawing.Point(106, 232);
            this.lblCercaConto.Name = "lblCercaConto";
            this.lblCercaConto.Size = new System.Drawing.Size(0, 13);
            this.lblCercaConto.TabIndex = 7;
            // 
            // lstVisualizza
            // 
            this.lstVisualizza.FormattingEnabled = true;
            this.lstVisualizza.Location = new System.Drawing.Point(546, 80);
            this.lstVisualizza.Name = "lstVisualizza";
            this.lstVisualizza.Size = new System.Drawing.Size(269, 199);
            this.lstVisualizza.TabIndex = 8;
            this.lstVisualizza.SelectedIndexChanged += new System.EventHandler(this.lstVisualizza_SelectedIndexChanged);
            // 
            // txtRicercaNome
            // 
            this.txtRicercaNome.Enabled = false;
            this.txtRicercaNome.Location = new System.Drawing.Point(106, 318);
            this.txtRicercaNome.Name = "txtRicercaNome";
            this.txtRicercaNome.Size = new System.Drawing.Size(100, 20);
            this.txtRicercaNome.TabIndex = 9;
            this.txtRicercaNome.TextChanged += new System.EventHandler(this.txtRicercaNome_TextChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(100, 295);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(115, 17);
            this.label3.TabIndex = 10;
            this.label3.Text = "Cerca con il nome";
            // 
            // btnCercaNome
            // 
            this.btnCercaNome.BackColor = System.Drawing.Color.White;
            this.btnCercaNome.Enabled = false;
            this.btnCercaNome.Location = new System.Drawing.Point(299, 318);
            this.btnCercaNome.Name = "btnCercaNome";
            this.btnCercaNome.Size = new System.Drawing.Size(75, 23);
            this.btnCercaNome.TabIndex = 11;
            this.btnCercaNome.Text = "Cerca";
            this.btnCercaNome.UseVisualStyleBackColor = false;
            this.btnCercaNome.Click += new System.EventHandler(this.btnCercaNome_Click);
            // 
            // lblCercaNome
            // 
            this.lblCercaNome.AutoSize = true;
            this.lblCercaNome.Location = new System.Drawing.Point(106, 341);
            this.lblCercaNome.Name = "lblCercaNome";
            this.lblCercaNome.Size = new System.Drawing.Size(0, 13);
            this.lblCercaNome.TabIndex = 12;
            // 
            // btnCercaRosso
            // 
            this.btnCercaRosso.BackColor = System.Drawing.Color.White;
            this.btnCercaRosso.Enabled = false;
            this.btnCercaRosso.Location = new System.Drawing.Point(106, 432);
            this.btnCercaRosso.Name = "btnCercaRosso";
            this.btnCercaRosso.Size = new System.Drawing.Size(75, 23);
            this.btnCercaRosso.TabIndex = 13;
            this.btnCercaRosso.Text = "Cerca";
            this.btnCercaRosso.UseVisualStyleBackColor = false;
            this.btnCercaRosso.Click += new System.EventHandler(this.btnCercaRosso_Click);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(66, 412);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(164, 17);
            this.label4.TabIndex = 14;
            this.label4.Text = "Cerca chi ha il conto rosso";
            // 
            // lblCercaRosso
            // 
            this.lblCercaRosso.AutoSize = true;
            this.lblCercaRosso.Location = new System.Drawing.Point(296, 442);
            this.lblCercaRosso.Name = "lblCercaRosso";
            this.lblCercaRosso.Size = new System.Drawing.Size(0, 13);
            this.lblCercaRosso.TabIndex = 15;
            // 
            // btnMax
            // 
            this.btnMax.BackColor = System.Drawing.Color.White;
            this.btnMax.Enabled = false;
            this.btnMax.Location = new System.Drawing.Point(106, 516);
            this.btnMax.Name = "btnMax";
            this.btnMax.Size = new System.Drawing.Size(75, 23);
            this.btnMax.TabIndex = 16;
            this.btnMax.Text = "Saldo Massimo";
            this.btnMax.UseVisualStyleBackColor = false;
            this.btnMax.Click += new System.EventHandler(this.btnMax_Click);
            // 
            // lblSaldo
            // 
            this.lblSaldo.AutoSize = true;
            this.lblSaldo.Location = new System.Drawing.Point(296, 516);
            this.lblSaldo.Name = "lblSaldo";
            this.lblSaldo.Size = new System.Drawing.Size(0, 13);
            this.lblSaldo.TabIndex = 17;
            // 
            // btnMedia
            // 
            this.btnMedia.BackColor = System.Drawing.Color.White;
            this.btnMedia.Enabled = false;
            this.btnMedia.Location = new System.Drawing.Point(106, 594);
            this.btnMedia.Name = "btnMedia";
            this.btnMedia.Size = new System.Drawing.Size(75, 23);
            this.btnMedia.TabIndex = 18;
            this.btnMedia.Text = "Media";
            this.btnMedia.UseVisualStyleBackColor = false;
            this.btnMedia.Click += new System.EventHandler(this.btnMedia_Click);
            // 
            // lblMedia
            // 
            this.lblMedia.AutoSize = true;
            this.lblMedia.Location = new System.Drawing.Point(299, 603);
            this.lblMedia.Name = "lblMedia";
            this.lblMedia.Size = new System.Drawing.Size(0, 13);
            this.lblMedia.TabIndex = 19;
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(918, 103);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(100, 20);
            this.textBox1.TabIndex = 20;
            // 
            // textBox2
            // 
            this.textBox2.Location = new System.Drawing.Point(918, 157);
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(100, 20);
            this.textBox2.TabIndex = 21;
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.White;
            this.button1.Location = new System.Drawing.Point(1085, 99);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 22;
            this.button1.Text = "button1";
            this.button1.UseVisualStyleBackColor = false;
            // 
            // button2
            // 
            this.button2.BackColor = System.Drawing.Color.White;
            this.button2.Location = new System.Drawing.Point(1085, 157);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 23;
            this.button2.Text = "button2";
            this.button2.UseVisualStyleBackColor = false;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(55, 496);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(182, 17);
            this.label5.TabIndex = 24;
            this.label5.Text = "Cerca chi ha il saldo massimo";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Times New Roman", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(97, 572);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(96, 17);
            this.label6.TabIndex = 25;
            this.label6.Text = "Media dei saldi";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.PowderBlue;
            this.ClientSize = new System.Drawing.Size(1324, 717);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.textBox2);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.lblMedia);
            this.Controls.Add(this.btnMedia);
            this.Controls.Add(this.lblSaldo);
            this.Controls.Add(this.btnMax);
            this.Controls.Add(this.lblCercaRosso);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.btnCercaRosso);
            this.Controls.Add(this.lblCercaNome);
            this.Controls.Add(this.btnCercaNome);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txtRicercaNome);
            this.Controls.Add(this.lstVisualizza);
            this.Controls.Add(this.lblCercaConto);
            this.Controls.Add(this.btnCercaConto);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txtCercaConto);
            this.Controls.Add(this.btnInserisci);
            this.Controls.Add(this.btnCrea);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.txtCrea);
            this.Name = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtCrea;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnCrea;
        private System.Windows.Forms.Button btnInserisci;
        private System.Windows.Forms.TextBox txtCercaConto;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btnCercaConto;
        private System.Windows.Forms.Label lblCercaConto;
        private System.Windows.Forms.ListBox lstVisualizza;
        private System.Windows.Forms.TextBox txtRicercaNome;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnCercaNome;
        private System.Windows.Forms.Label lblCercaNome;
        private System.Windows.Forms.Button btnCercaRosso;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label lblCercaRosso;
        private System.Windows.Forms.Button btnMax;
        private System.Windows.Forms.Label lblSaldo;
        private System.Windows.Forms.Button btnMedia;
        private System.Windows.Forms.Label lblMedia;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
    }
}

