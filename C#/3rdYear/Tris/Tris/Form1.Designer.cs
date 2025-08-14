namespace WindowsFormsApplication1
{
    partial class frmGioco
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            this.lblGiocatore1 = new System.Windows.Forms.Label();
            this.lblGiocatore2 = new System.Windows.Forms.Label();
            this.grd = new System.Windows.Forms.DataGridView();
            this.txtGiocatore1 = new System.Windows.Forms.TextBox();
            this.txtGiocatore2 = new System.Windows.Forms.TextBox();
            this.lblGiocatoreIniziale1 = new System.Windows.Forms.Label();
            this.lblGiocatoreIniziale2 = new System.Windows.Forms.Label();
            this.btnGioca = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.grd)).BeginInit();
            this.SuspendLayout();
            // 
            // lblGiocatore1
            // 
            this.lblGiocatore1.AutoSize = true;
            this.lblGiocatore1.BackColor = System.Drawing.Color.Transparent;
            this.lblGiocatore1.Font = new System.Drawing.Font("Calibri", 21.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblGiocatore1.Location = new System.Drawing.Point(12, 9);
            this.lblGiocatore1.Name = "lblGiocatore1";
            this.lblGiocatore1.Size = new System.Drawing.Size(145, 36);
            this.lblGiocatore1.TabIndex = 1;
            this.lblGiocatore1.Text = "Giocatore1";
            this.lblGiocatore1.Visible = false;
            // 
            // lblGiocatore2
            // 
            this.lblGiocatore2.AutoSize = true;
            this.lblGiocatore2.Font = new System.Drawing.Font("Calibri", 21.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblGiocatore2.Location = new System.Drawing.Point(12, 114);
            this.lblGiocatore2.Name = "lblGiocatore2";
            this.lblGiocatore2.Size = new System.Drawing.Size(145, 36);
            this.lblGiocatore2.TabIndex = 2;
            this.lblGiocatore2.Text = "Giocatore2";
            this.lblGiocatore2.Visible = false;
            // 
            // grd
            // 
            this.grd.AllowUserToAddRows = false;
            this.grd.AllowUserToDeleteRows = false;
            this.grd.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.DisableResizing;
            this.grd.ColumnHeadersVisible = false;
            dataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle2.BackColor = System.Drawing.Color.LightCyan;
            dataGridViewCellStyle2.Font = new System.Drawing.Font("Calibri", 48F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle2.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle2.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle2.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.grd.DefaultCellStyle = dataGridViewCellStyle2;
            this.grd.EnableHeadersVisualStyles = false;
            this.grd.Location = new System.Drawing.Point(212, 9);
            this.grd.Name = "grd";
            this.grd.RowHeadersVisible = false;
            this.grd.ScrollBars = System.Windows.Forms.ScrollBars.None;
            this.grd.Size = new System.Drawing.Size(500, 500);
            this.grd.TabIndex = 3;
            this.grd.Visible = false;
            this.grd.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.grd_CellClick);
            // 
            // txtGiocatore1
            // 
            this.txtGiocatore1.Location = new System.Drawing.Point(339, 198);
            this.txtGiocatore1.Name = "txtGiocatore1";
            this.txtGiocatore1.Size = new System.Drawing.Size(100, 20);
            this.txtGiocatore1.TabIndex = 4;
            // 
            // txtGiocatore2
            // 
            this.txtGiocatore2.Location = new System.Drawing.Point(339, 283);
            this.txtGiocatore2.Name = "txtGiocatore2";
            this.txtGiocatore2.Size = new System.Drawing.Size(100, 20);
            this.txtGiocatore2.TabIndex = 5;
            // 
            // lblGiocatoreIniziale1
            // 
            this.lblGiocatoreIniziale1.AutoSize = true;
            this.lblGiocatoreIniziale1.BackColor = System.Drawing.Color.Transparent;
            this.lblGiocatoreIniziale1.Font = new System.Drawing.Font("Calibri", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblGiocatoreIniziale1.Location = new System.Drawing.Point(111, 194);
            this.lblGiocatoreIniziale1.Name = "lblGiocatoreIniziale1";
            this.lblGiocatoreIniziale1.Size = new System.Drawing.Size(187, 23);
            this.lblGiocatoreIniziale1.TabIndex = 6;
            this.lblGiocatoreIniziale1.Text = "Nome primo giocatore:";
            // 
            // lblGiocatoreIniziale2
            // 
            this.lblGiocatoreIniziale2.AutoSize = true;
            this.lblGiocatoreIniziale2.Font = new System.Drawing.Font("Calibri", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblGiocatoreIniziale2.Location = new System.Drawing.Point(111, 279);
            this.lblGiocatoreIniziale2.Name = "lblGiocatoreIniziale2";
            this.lblGiocatoreIniziale2.Size = new System.Drawing.Size(200, 23);
            this.lblGiocatoreIniziale2.TabIndex = 7;
            this.lblGiocatoreIniziale2.Text = "Nome secondo giocaore:";
            // 
            // btnGioca
            // 
            this.btnGioca.BackColor = System.Drawing.Color.GreenYellow;
            this.btnGioca.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnGioca.Font = new System.Drawing.Font("Calibri", 21.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGioca.Location = new System.Drawing.Point(474, 224);
            this.btnGioca.Name = "btnGioca";
            this.btnGioca.Size = new System.Drawing.Size(106, 59);
            this.btnGioca.TabIndex = 8;
            this.btnGioca.Text = "GIOCA";
            this.btnGioca.UseVisualStyleBackColor = false;
            this.btnGioca.Click += new System.EventHandler(this.btnGioca_Click);
            // 
            // frmGioco
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.PowderBlue;
            this.ClientSize = new System.Drawing.Size(728, 529);
            this.Controls.Add(this.btnGioca);
            this.Controls.Add(this.lblGiocatoreIniziale2);
            this.Controls.Add(this.lblGiocatoreIniziale1);
            this.Controls.Add(this.txtGiocatore2);
            this.Controls.Add(this.txtGiocatore1);
            this.Controls.Add(this.grd);
            this.Controls.Add(this.lblGiocatore2);
            this.Controls.Add(this.lblGiocatore1);
            this.Name = "frmGioco";
            this.Text = "frmGioco";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.frmGioco_FormClosing);
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.grd)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblGiocatore1;
        private System.Windows.Forms.Label lblGiocatore2;
        private System.Windows.Forms.DataGridView grd;
        private System.Windows.Forms.TextBox txtGiocatore1;
        private System.Windows.Forms.TextBox txtGiocatore2;
        private System.Windows.Forms.Label lblGiocatoreIniziale1;
        private System.Windows.Forms.Label lblGiocatoreIniziale2;
        private System.Windows.Forms.Button btnGioca;
    }
}

