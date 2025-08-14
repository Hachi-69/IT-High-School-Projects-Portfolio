namespace WindowsFormsApplication1
{
    partial class frmNumeri
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            this.grd = new System.Windows.Forms.DataGridView();
            this.lblmosse = new System.Windows.Forms.Label();
            this.btnStart = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.btnFacile = new System.Windows.Forms.Button();
            this.btnDifficile = new System.Windows.Forms.Button();
            this.btnImpossibile = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.btnRestart = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.grd)).BeginInit();
            this.SuspendLayout();
            // 
            // grd
            // 
            this.grd.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.grd.ColumnHeadersVisible = false;
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle1.BackColor = System.Drawing.Color.Khaki;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Calibri", 21.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.Color.Transparent;
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.Color.Transparent;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.grd.DefaultCellStyle = dataGridViewCellStyle1;
            this.grd.Location = new System.Drawing.Point(78, 152);
            this.grd.Name = "grd";
            this.grd.RowHeadersVisible = false;
            this.grd.Size = new System.Drawing.Size(273, 273);
            this.grd.TabIndex = 0;
            this.grd.Visible = false;
            this.grd.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.grd_CellContentClick);
            this.grd.CellMouseClick += new System.Windows.Forms.DataGridViewCellMouseEventHandler(this.grd_CellMouseClick);
            // 
            // lblmosse
            // 
            this.lblmosse.AutoSize = true;
            this.lblmosse.Font = new System.Drawing.Font("Calibri", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblmosse.Location = new System.Drawing.Point(130, 9);
            this.lblmosse.Name = "lblmosse";
            this.lblmosse.Size = new System.Drawing.Size(166, 26);
            this.lblmosse.TabIndex = 1;
            this.lblmosse.Text = "Mosse rimanenti: ";
            this.lblmosse.Visible = false;
            // 
            // btnStart
            // 
            this.btnStart.Font = new System.Drawing.Font("Calibri", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.btnStart.Location = new System.Drawing.Point(166, 89);
            this.btnStart.Name = "btnStart";
            this.btnStart.Size = new System.Drawing.Size(108, 52);
            this.btnStart.TabIndex = 2;
            this.btnStart.Text = "START";
            this.btnStart.UseVisualStyleBackColor = true;
            this.btnStart.Visible = false;
            this.btnStart.Click += new System.EventHandler(this.btnStart_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Calibri", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.label1.Location = new System.Drawing.Point(65, 464);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(286, 69);
            this.label1.TabIndex = 3;
            this.label1.Text = "Mettere in fila i numeri, da 1 a 8, \r\nsi possono effettuare scambi solo\r\n con le " +
                "celle adiacenti a quella vuota ";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.label1.Visible = false;
            // 
            // btnFacile
            // 
            this.btnFacile.BackColor = System.Drawing.Color.GreenYellow;
            this.btnFacile.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnFacile.Font = new System.Drawing.Font("Calibri", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.btnFacile.Location = new System.Drawing.Point(147, 89);
            this.btnFacile.Name = "btnFacile";
            this.btnFacile.Size = new System.Drawing.Size(127, 107);
            this.btnFacile.TabIndex = 4;
            this.btnFacile.Text = "FACILE";
            this.btnFacile.UseVisualStyleBackColor = false;
            this.btnFacile.Click += new System.EventHandler(this.btnFacile_Click);
            // 
            // btnDifficile
            // 
            this.btnDifficile.BackColor = System.Drawing.Color.Yellow;
            this.btnDifficile.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnDifficile.Font = new System.Drawing.Font("Calibri", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.btnDifficile.Location = new System.Drawing.Point(147, 233);
            this.btnDifficile.Name = "btnDifficile";
            this.btnDifficile.Size = new System.Drawing.Size(127, 107);
            this.btnDifficile.TabIndex = 5;
            this.btnDifficile.Text = "DIFFICILE";
            this.btnDifficile.UseVisualStyleBackColor = false;
            this.btnDifficile.Click += new System.EventHandler(this.btnDifficile_Click);
            // 
            // btnImpossibile
            // 
            this.btnImpossibile.BackColor = System.Drawing.Color.Crimson;
            this.btnImpossibile.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnImpossibile.Font = new System.Drawing.Font("Calibri", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.btnImpossibile.Location = new System.Drawing.Point(147, 377);
            this.btnImpossibile.Name = "btnImpossibile";
            this.btnImpossibile.Size = new System.Drawing.Size(127, 107);
            this.btnImpossibile.TabIndex = 6;
            this.btnImpossibile.Text = "IMPOSSIBILE";
            this.btnImpossibile.UseVisualStyleBackColor = false;
            this.btnImpossibile.Click += new System.EventHandler(this.btnImpossibile_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Calibri", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.label2.Location = new System.Drawing.Point(143, 37);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(144, 23);
            this.label2.TabIndex = 7;
            this.label2.Text = "Scegli la difficolta\'";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Calibri", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.label3.Location = new System.Drawing.Point(43, 487);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(356, 23);
            this.label3.TabIndex = 8;
            this.label3.Text = "Questo influenza\' sui spostamenti effettuabili";
            // 
            // btnRestart
            // 
            this.btnRestart.BackColor = System.Drawing.Color.Red;
            this.btnRestart.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnRestart.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.btnRestart.ForeColor = System.Drawing.Color.White;
            this.btnRestart.Location = new System.Drawing.Point(3, 9);
            this.btnRestart.Name = "btnRestart";
            this.btnRestart.Size = new System.Drawing.Size(83, 26);
            this.btnRestart.TabIndex = 9;
            this.btnRestart.Text = "Restart";
            this.btnRestart.UseVisualStyleBackColor = false;
            this.btnRestart.Visible = false;
            this.btnRestart.Click += new System.EventHandler(this.btnRestart_Click);
            // 
            // frmNumeri
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Aquamarine;
            this.ClientSize = new System.Drawing.Size(411, 546);
            this.Controls.Add(this.btnRestart);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.btnImpossibile);
            this.Controls.Add(this.btnDifficile);
            this.Controls.Add(this.btnFacile);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnStart);
            this.Controls.Add(this.lblmosse);
            this.Controls.Add(this.grd);
            this.Name = "frmNumeri";
            this.Text = "GiocoDelNove";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.grd)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView grd;
        private System.Windows.Forms.Label lblmosse;
        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnFacile;
        private System.Windows.Forms.Button btnDifficile;
        private System.Windows.Forms.Button btnImpossibile;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnRestart;
    }
}

