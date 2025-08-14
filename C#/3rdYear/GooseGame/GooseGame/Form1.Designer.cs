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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmLuca));
            this.pct2 = new System.Windows.Forms.PictureBox();
            this.btnDadi = new System.Windows.Forms.Button();
            this.lblDado = new System.Windows.Forms.Label();
            this.lblGiocatore1 = new System.Windows.Forms.Label();
            this.lblGiocatore2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.pct1 = new System.Windows.Forms.PictureBox();
            this.label14 = new System.Windows.Forms.Label();
            this.imprevisti = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pct2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pct1)).BeginInit();
            this.SuspendLayout();
            // 
            // pct2
            // 
            this.pct2.BackColor = System.Drawing.Color.Transparent;
            this.pct2.Image = ((System.Drawing.Image)(resources.GetObject("pct2.Image")));
            this.pct2.Location = new System.Drawing.Point(12, 612);
            this.pct2.Name = "pct2";
            this.pct2.Size = new System.Drawing.Size(107, 97);
            this.pct2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pct2.TabIndex = 2;
            this.pct2.TabStop = false;
            // 
            // btnDadi
            // 
            this.btnDadi.Font = new System.Drawing.Font("Times New Roman", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDadi.Location = new System.Drawing.Point(273, 144);
            this.btnDadi.Name = "btnDadi";
            this.btnDadi.Size = new System.Drawing.Size(111, 54);
            this.btnDadi.TabIndex = 3;
            this.btnDadi.Text = "tira i dadi";
            this.btnDadi.UseVisualStyleBackColor = true;
            this.btnDadi.Click += new System.EventHandler(this.btnDadi_Click);
            // 
            // lblDado
            // 
            this.lblDado.AutoSize = true;
            this.lblDado.Font = new System.Drawing.Font("Times New Roman", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblDado.Location = new System.Drawing.Point(480, 163);
            this.lblDado.Name = "lblDado";
            this.lblDado.Size = new System.Drawing.Size(0, 24);
            this.lblDado.TabIndex = 4;
            // 
            // lblGiocatore1
            // 
            this.lblGiocatore1.AutoSize = true;
            this.lblGiocatore1.BackColor = System.Drawing.Color.Cyan;
            this.lblGiocatore1.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblGiocatore1.Location = new System.Drawing.Point(263, 328);
            this.lblGiocatore1.Name = "lblGiocatore1";
            this.lblGiocatore1.Size = new System.Drawing.Size(111, 22);
            this.lblGiocatore1.TabIndex = 5;
            this.lblGiocatore1.Text = "Oca Bianca:";
            // 
            // lblGiocatore2
            // 
            this.lblGiocatore2.AutoSize = true;
            this.lblGiocatore2.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblGiocatore2.Location = new System.Drawing.Point(263, 374);
            this.lblGiocatore2.Name = "lblGiocatore2";
            this.lblGiocatore2.Size = new System.Drawing.Size(96, 22);
            this.lblGiocatore2.TabIndex = 6;
            this.lblGiocatore2.Text = "Oca Rosa:";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(377, 329);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(15, 21);
            this.label1.TabIndex = 7;
            this.label1.Text = " ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Times New Roman", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(377, 375);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(15, 21);
            this.label2.TabIndex = 8;
            this.label2.Text = " ";
            // 
            // pictureBox2
            // 
            this.pictureBox2.BackColor = System.Drawing.Color.White;
            this.pictureBox2.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox2.Image")));
            this.pictureBox2.Location = new System.Drawing.Point(640, 125);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(199, 204);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 9;
            this.pictureBox2.TabStop = false;
            // 
            // pct1
            // 
            this.pct1.BackColor = System.Drawing.Color.Transparent;
            this.pct1.Image = ((System.Drawing.Image)(resources.GetObject("pct1.Image")));
            this.pct1.Location = new System.Drawing.Point(12, 509);
            this.pct1.Name = "pct1";
            this.pct1.Size = new System.Drawing.Size(107, 97);
            this.pct1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pct1.TabIndex = 12;
            this.pct1.TabStop = false;
            // 
            // label14
            // 
            this.label14.AutoSize = true;
            this.label14.Font = new System.Drawing.Font("Times New Roman", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.label14.Location = new System.Drawing.Point(385, 163);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(79, 24);
            this.label14.TabIndex = 14;
            this.label14.Text = "Lancio:";
            // 
            // imprevisti
            // 
            this.imprevisti.Font = new System.Drawing.Font("Times New Roman", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.imprevisti.ForeColor = System.Drawing.Color.Red;
            this.imprevisti.Location = new System.Drawing.Point(12, 12);
            this.imprevisti.Name = "imprevisti";
            this.imprevisti.Size = new System.Drawing.Size(107, 72);
            this.imprevisti.TabIndex = 15;
            this.imprevisti.Text = "Guarda Imprevisti";
            this.imprevisti.UseVisualStyleBackColor = true;
            this.imprevisti.Click += new System.EventHandler(this.imprevisti_Click);
            // 
            // frmLuca
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.ClientSize = new System.Drawing.Size(1328, 721);
            this.Controls.Add(this.imprevisti);
            this.Controls.Add(this.label14);
            this.Controls.Add(this.pct2);
            this.Controls.Add(this.pct1);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblGiocatore2);
            this.Controls.Add(this.lblGiocatore1);
            this.Controls.Add(this.lblDado);
            this.Controls.Add(this.btnDadi);
            this.DoubleBuffered = true;
            this.Name = "frmLuca";
            this.StartPosition = System.Windows.Forms.FormStartPosition.Manual;
            this.Text = "Goose Game";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pct2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pct1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pct2;
        private System.Windows.Forms.Button btnDadi;
        private System.Windows.Forms.Label lblDado;
        private System.Windows.Forms.Label lblGiocatore1;
        private System.Windows.Forms.Label lblGiocatore2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.PictureBox pct1;
        private System.Windows.Forms.Label label14;
        private System.Windows.Forms.Button imprevisti;

    }
}

