namespace WindowsFormsApplication1
{
    partial class FrameFilosofi
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
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FrameFilosofi));
            this.btnRUN = new System.Windows.Forms.Button();
            this.lblAttesa1 = new System.Windows.Forms.Label();
            this.lblAttesa2 = new System.Windows.Forms.Label();
            this.lblAttesa3 = new System.Windows.Forms.Label();
            this.lblAttesa4 = new System.Windows.Forms.Label();
            this.lblAttesa5 = new System.Windows.Forms.Label();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.btnStop = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.pctForch4 = new System.Windows.Forms.PictureBox();
            this.pctForch5 = new System.Windows.Forms.PictureBox();
            this.pctForch1 = new System.Windows.Forms.PictureBox();
            this.pctForch2 = new System.Windows.Forms.PictureBox();
            this.pctForch3 = new System.Windows.Forms.PictureBox();
            this.pctFilAtt1 = new System.Windows.Forms.PictureBox();
            this.pctFilAtt4 = new System.Windows.Forms.PictureBox();
            this.pctFilAtt3 = new System.Windows.Forms.PictureBox();
            this.pctFilAtt2 = new System.Windows.Forms.PictureBox();
            this.pctFilMang1 = new System.Windows.Forms.PictureBox();
            this.pctFilDorm1 = new System.Windows.Forms.PictureBox();
            this.pctFilMang2 = new System.Windows.Forms.PictureBox();
            this.pctFilDorm2 = new System.Windows.Forms.PictureBox();
            this.pctFilMang3 = new System.Windows.Forms.PictureBox();
            this.pctFilDorm3 = new System.Windows.Forms.PictureBox();
            this.pctFilMang4 = new System.Windows.Forms.PictureBox();
            this.pctFilDorm4 = new System.Windows.Forms.PictureBox();
            this.pctFilAtt5 = new System.Windows.Forms.PictureBox();
            this.pctFilMang5 = new System.Windows.Forms.PictureBox();
            this.pctFilDorm5 = new System.Windows.Forms.PictureBox();
            this.btnEXIT = new System.Windows.Forms.Button();
            this.txtTimerTick = new System.Windows.Forms.TextBox();
            this.lblTimerTick = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch4)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch5)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt4)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang4)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm4)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt5)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang5)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm5)).BeginInit();
            this.SuspendLayout();
            // 
            // btnRUN
            // 
            this.btnRUN.BackColor = System.Drawing.Color.Lime;
            this.btnRUN.Enabled = false;
            this.btnRUN.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnRUN.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.btnRUN.Location = new System.Drawing.Point(12, 12);
            this.btnRUN.Name = "btnRUN";
            this.btnRUN.Size = new System.Drawing.Size(80, 80);
            this.btnRUN.TabIndex = 0;
            this.btnRUN.Text = "RUN";
            this.btnRUN.UseVisualStyleBackColor = false;
            this.btnRUN.Click += new System.EventHandler(this.btnRUN_Click);
            // 
            // lblAttesa1
            // 
            this.lblAttesa1.AutoSize = true;
            this.lblAttesa1.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblAttesa1.Location = new System.Drawing.Point(301, 102);
            this.lblAttesa1.Name = "lblAttesa1";
            this.lblAttesa1.Size = new System.Drawing.Size(57, 19);
            this.lblAttesa1.TabIndex = 11;
            this.lblAttesa1.Text = "Durata:";
            // 
            // lblAttesa2
            // 
            this.lblAttesa2.AutoSize = true;
            this.lblAttesa2.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblAttesa2.Location = new System.Drawing.Point(481, 276);
            this.lblAttesa2.Name = "lblAttesa2";
            this.lblAttesa2.Size = new System.Drawing.Size(57, 19);
            this.lblAttesa2.TabIndex = 12;
            this.lblAttesa2.Text = "Durata:";
            // 
            // lblAttesa3
            // 
            this.lblAttesa3.AutoSize = true;
            this.lblAttesa3.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblAttesa3.Location = new System.Drawing.Point(426, 587);
            this.lblAttesa3.Name = "lblAttesa3";
            this.lblAttesa3.Size = new System.Drawing.Size(57, 19);
            this.lblAttesa3.TabIndex = 13;
            this.lblAttesa3.Text = "Durata:";
            // 
            // lblAttesa4
            // 
            this.lblAttesa4.AutoSize = true;
            this.lblAttesa4.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblAttesa4.Location = new System.Drawing.Point(197, 587);
            this.lblAttesa4.Name = "lblAttesa4";
            this.lblAttesa4.Size = new System.Drawing.Size(57, 19);
            this.lblAttesa4.TabIndex = 14;
            this.lblAttesa4.Text = "Durata:";
            // 
            // lblAttesa5
            // 
            this.lblAttesa5.AutoSize = true;
            this.lblAttesa5.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblAttesa5.Location = new System.Drawing.Point(104, 276);
            this.lblAttesa5.Name = "lblAttesa5";
            this.lblAttesa5.Size = new System.Drawing.Size(57, 19);
            this.lblAttesa5.TabIndex = 15;
            this.lblAttesa5.Text = "Durata:";
            // 
            // timer1
            // 
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // btnStop
            // 
            this.btnStop.BackColor = System.Drawing.Color.Gold;
            this.btnStop.Enabled = false;
            this.btnStop.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnStop.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.btnStop.Location = new System.Drawing.Point(610, 12);
            this.btnStop.Name = "btnStop";
            this.btnStop.Size = new System.Drawing.Size(80, 80);
            this.btnStop.TabIndex = 37;
            this.btnStop.Text = "STOP";
            this.btnStop.UseVisualStyleBackColor = false;
            this.btnStop.Click += new System.EventHandler(this.button1_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::WindowsFormsApplication1.Properties.Resources._800px_Circle___black_simple_svg;
            this.pictureBox1.Location = new System.Drawing.Point(181, 194);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(321, 340);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 38;
            this.pictureBox1.TabStop = false;
            // 
            // pctForch4
            // 
            this.pctForch4.Image = global::WindowsFormsApplication1.Properties.Resources.Immagine_2022_11_18_102802_removebg_preview;
            this.pctForch4.Location = new System.Drawing.Point(120, 416);
            this.pctForch4.Name = "pctForch4";
            this.pctForch4.Size = new System.Drawing.Size(87, 95);
            this.pctForch4.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctForch4.TabIndex = 36;
            this.pctForch4.TabStop = false;
            this.pctForch4.Visible = false;
            // 
            // pctForch5
            // 
            this.pctForch5.Image = global::WindowsFormsApplication1.Properties.Resources.b102802_removebg_preview;
            this.pctForch5.Location = new System.Drawing.Point(162, 164);
            this.pctForch5.Name = "pctForch5";
            this.pctForch5.Size = new System.Drawing.Size(86, 95);
            this.pctForch5.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctForch5.TabIndex = 35;
            this.pctForch5.TabStop = false;
            this.pctForch5.Visible = false;
            // 
            // pctForch1
            // 
            this.pctForch1.Image = global::WindowsFormsApplication1.Properties.Resources.Immagine_2022_11_18_1bovebg_preview;
            this.pctForch1.Location = new System.Drawing.Point(451, 164);
            this.pctForch1.Name = "pctForch1";
            this.pctForch1.Size = new System.Drawing.Size(87, 95);
            this.pctForch1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctForch1.TabIndex = 33;
            this.pctForch1.TabStop = false;
            this.pctForch1.Visible = false;
            // 
            // pctForch2
            // 
            this.pctForch2.Image = global::WindowsFormsApplication1.Properties.Resources.Immagine_2022_11_18_1apreview;
            this.pctForch2.Location = new System.Drawing.Point(483, 416);
            this.pctForch2.Name = "pctForch2";
            this.pctForch2.Size = new System.Drawing.Size(87, 95);
            this.pctForch2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctForch2.TabIndex = 32;
            this.pctForch2.TabStop = false;
            this.pctForch2.Visible = false;
            // 
            // pctForch3
            // 
            this.pctForch3.Image = global::WindowsFormsApplication1.Properties.Resources.forSot;
            this.pctForch3.Location = new System.Drawing.Point(316, 509);
            this.pctForch3.Name = "pctForch3";
            this.pctForch3.Size = new System.Drawing.Size(43, 99);
            this.pctForch3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctForch3.TabIndex = 31;
            this.pctForch3.TabStop = false;
            this.pctForch3.Visible = false;
            // 
            // pctFilAtt1
            // 
            this.pctFilAtt1.Image = global::WindowsFormsApplication1.Properties.Resources.attesa;
            this.pctFilAtt1.Location = new System.Drawing.Point(305, 124);
            this.pctFilAtt1.Name = "pctFilAtt1";
            this.pctFilAtt1.Size = new System.Drawing.Size(86, 99);
            this.pctFilAtt1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilAtt1.TabIndex = 20;
            this.pctFilAtt1.TabStop = false;
            // 
            // pctFilAtt4
            // 
            this.pctFilAtt4.Image = global::WindowsFormsApplication1.Properties.Resources.attesa;
            this.pctFilAtt4.Location = new System.Drawing.Point(187, 485);
            this.pctFilAtt4.Name = "pctFilAtt4";
            this.pctFilAtt4.Size = new System.Drawing.Size(86, 99);
            this.pctFilAtt4.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilAtt4.TabIndex = 19;
            this.pctFilAtt4.TabStop = false;
            // 
            // pctFilAtt3
            // 
            this.pctFilAtt3.Image = global::WindowsFormsApplication1.Properties.Resources.attesa;
            this.pctFilAtt3.Location = new System.Drawing.Point(416, 485);
            this.pctFilAtt3.Name = "pctFilAtt3";
            this.pctFilAtt3.Size = new System.Drawing.Size(86, 99);
            this.pctFilAtt3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilAtt3.TabIndex = 18;
            this.pctFilAtt3.TabStop = false;
            // 
            // pctFilAtt2
            // 
            this.pctFilAtt2.Image = global::WindowsFormsApplication1.Properties.Resources.attesa;
            this.pctFilAtt2.Location = new System.Drawing.Point(484, 298);
            this.pctFilAtt2.Name = "pctFilAtt2";
            this.pctFilAtt2.Size = new System.Drawing.Size(86, 99);
            this.pctFilAtt2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilAtt2.TabIndex = 17;
            this.pctFilAtt2.TabStop = false;
            // 
            // pctFilMang1
            // 
            this.pctFilMang1.Image = ((System.Drawing.Image)(resources.GetObject("pctFilMang1.Image")));
            this.pctFilMang1.Location = new System.Drawing.Point(305, 124);
            this.pctFilMang1.Name = "pctFilMang1";
            this.pctFilMang1.Size = new System.Drawing.Size(86, 99);
            this.pctFilMang1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilMang1.TabIndex = 30;
            this.pctFilMang1.TabStop = false;
            this.pctFilMang1.Visible = false;
            // 
            // pctFilDorm1
            // 
            this.pctFilDorm1.Image = ((System.Drawing.Image)(resources.GetObject("pctFilDorm1.Image")));
            this.pctFilDorm1.Location = new System.Drawing.Point(305, 124);
            this.pctFilDorm1.Name = "pctFilDorm1";
            this.pctFilDorm1.Size = new System.Drawing.Size(86, 99);
            this.pctFilDorm1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilDorm1.TabIndex = 25;
            this.pctFilDorm1.TabStop = false;
            this.pctFilDorm1.Visible = false;
            // 
            // pctFilMang2
            // 
            this.pctFilMang2.Image = ((System.Drawing.Image)(resources.GetObject("pctFilMang2.Image")));
            this.pctFilMang2.Location = new System.Drawing.Point(485, 299);
            this.pctFilMang2.Name = "pctFilMang2";
            this.pctFilMang2.Size = new System.Drawing.Size(86, 99);
            this.pctFilMang2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilMang2.TabIndex = 27;
            this.pctFilMang2.TabStop = false;
            this.pctFilMang2.Visible = false;
            // 
            // pctFilDorm2
            // 
            this.pctFilDorm2.Image = ((System.Drawing.Image)(resources.GetObject("pctFilDorm2.Image")));
            this.pctFilDorm2.Location = new System.Drawing.Point(485, 299);
            this.pctFilDorm2.Name = "pctFilDorm2";
            this.pctFilDorm2.Size = new System.Drawing.Size(86, 99);
            this.pctFilDorm2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilDorm2.TabIndex = 22;
            this.pctFilDorm2.TabStop = false;
            this.pctFilDorm2.Visible = false;
            // 
            // pctFilMang3
            // 
            this.pctFilMang3.Image = ((System.Drawing.Image)(resources.GetObject("pctFilMang3.Image")));
            this.pctFilMang3.Location = new System.Drawing.Point(415, 486);
            this.pctFilMang3.Name = "pctFilMang3";
            this.pctFilMang3.Size = new System.Drawing.Size(86, 99);
            this.pctFilMang3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilMang3.TabIndex = 28;
            this.pctFilMang3.TabStop = false;
            this.pctFilMang3.Visible = false;
            // 
            // pctFilDorm3
            // 
            this.pctFilDorm3.Image = ((System.Drawing.Image)(resources.GetObject("pctFilDorm3.Image")));
            this.pctFilDorm3.Location = new System.Drawing.Point(416, 486);
            this.pctFilDorm3.Name = "pctFilDorm3";
            this.pctFilDorm3.Size = new System.Drawing.Size(86, 99);
            this.pctFilDorm3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilDorm3.TabIndex = 23;
            this.pctFilDorm3.TabStop = false;
            this.pctFilDorm3.Visible = false;
            // 
            // pctFilMang4
            // 
            this.pctFilMang4.Image = ((System.Drawing.Image)(resources.GetObject("pctFilMang4.Image")));
            this.pctFilMang4.Location = new System.Drawing.Point(187, 486);
            this.pctFilMang4.Name = "pctFilMang4";
            this.pctFilMang4.Size = new System.Drawing.Size(86, 99);
            this.pctFilMang4.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilMang4.TabIndex = 29;
            this.pctFilMang4.TabStop = false;
            this.pctFilMang4.Visible = false;
            // 
            // pctFilDorm4
            // 
            this.pctFilDorm4.Image = ((System.Drawing.Image)(resources.GetObject("pctFilDorm4.Image")));
            this.pctFilDorm4.Location = new System.Drawing.Point(187, 485);
            this.pctFilDorm4.Name = "pctFilDorm4";
            this.pctFilDorm4.Size = new System.Drawing.Size(86, 99);
            this.pctFilDorm4.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilDorm4.TabIndex = 24;
            this.pctFilDorm4.TabStop = false;
            this.pctFilDorm4.Visible = false;
            // 
            // pctFilAtt5
            // 
            this.pctFilAtt5.Image = global::WindowsFormsApplication1.Properties.Resources.attesa;
            this.pctFilAtt5.Location = new System.Drawing.Point(108, 298);
            this.pctFilAtt5.Name = "pctFilAtt5";
            this.pctFilAtt5.Size = new System.Drawing.Size(86, 99);
            this.pctFilAtt5.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilAtt5.TabIndex = 16;
            this.pctFilAtt5.TabStop = false;
            // 
            // pctFilMang5
            // 
            this.pctFilMang5.Image = ((System.Drawing.Image)(resources.GetObject("pctFilMang5.Image")));
            this.pctFilMang5.Location = new System.Drawing.Point(110, 298);
            this.pctFilMang5.Name = "pctFilMang5";
            this.pctFilMang5.Size = new System.Drawing.Size(86, 99);
            this.pctFilMang5.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilMang5.TabIndex = 26;
            this.pctFilMang5.TabStop = false;
            this.pctFilMang5.Visible = false;
            // 
            // pctFilDorm5
            // 
            this.pctFilDorm5.Image = ((System.Drawing.Image)(resources.GetObject("pctFilDorm5.Image")));
            this.pctFilDorm5.Location = new System.Drawing.Point(108, 298);
            this.pctFilDorm5.Name = "pctFilDorm5";
            this.pctFilDorm5.Size = new System.Drawing.Size(86, 99);
            this.pctFilDorm5.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pctFilDorm5.TabIndex = 21;
            this.pctFilDorm5.TabStop = false;
            this.pctFilDorm5.Visible = false;
            // 
            // btnEXIT
            // 
            this.btnEXIT.BackColor = System.Drawing.Color.Red;
            this.btnEXIT.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnEXIT.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.btnEXIT.Location = new System.Drawing.Point(311, 12);
            this.btnEXIT.Name = "btnEXIT";
            this.btnEXIT.Size = new System.Drawing.Size(80, 80);
            this.btnEXIT.TabIndex = 39;
            this.btnEXIT.Text = "EXIT";
            this.btnEXIT.UseVisualStyleBackColor = false;
            this.btnEXIT.Click += new System.EventHandler(this.btnEXIT_Click);
            // 
            // txtTimerTick
            // 
            this.txtTimerTick.BackColor = System.Drawing.Color.PaleGreen;
            this.txtTimerTick.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtTimerTick.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.txtTimerTick.Location = new System.Drawing.Point(110, 53);
            this.txtTimerTick.Name = "txtTimerTick";
            this.txtTimerTick.Size = new System.Drawing.Size(97, 27);
            this.txtTimerTick.TabIndex = 40;
            this.txtTimerTick.TextChanged += new System.EventHandler(this.txtTimerTick_TextChanged);
            // 
            // lblTimerTick
            // 
            this.lblTimerTick.AutoSize = true;
            this.lblTimerTick.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblTimerTick.Location = new System.Drawing.Point(104, 12);
            this.lblTimerTick.Name = "lblTimerTick";
            this.lblTimerTick.Size = new System.Drawing.Size(110, 38);
            this.lblTimerTick.TabIndex = 41;
            this.lblTimerTick.Text = "Scegli velocita\' \r\ndi esecuzione:";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Calibri", 9.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.label1.Location = new System.Drawing.Point(115, 83);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(81, 15);
            this.label1.TabIndex = 42;
            this.label1.Text = "Tick al minuto";
            // 
            // FrameFilosofi
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(704, 681);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblTimerTick);
            this.Controls.Add(this.txtTimerTick);
            this.Controls.Add(this.btnEXIT);
            this.Controls.Add(this.btnStop);
            this.Controls.Add(this.pctForch5);
            this.Controls.Add(this.pctForch1);
            this.Controls.Add(this.pctForch3);
            this.Controls.Add(this.pctFilAtt1);
            this.Controls.Add(this.pctFilAtt4);
            this.Controls.Add(this.pctFilAtt3);
            this.Controls.Add(this.pctFilAtt2);
            this.Controls.Add(this.lblAttesa5);
            this.Controls.Add(this.lblAttesa4);
            this.Controls.Add(this.lblAttesa3);
            this.Controls.Add(this.lblAttesa2);
            this.Controls.Add(this.lblAttesa1);
            this.Controls.Add(this.btnRUN);
            this.Controls.Add(this.pctFilMang1);
            this.Controls.Add(this.pctFilDorm1);
            this.Controls.Add(this.pctFilMang2);
            this.Controls.Add(this.pctFilDorm2);
            this.Controls.Add(this.pctFilMang3);
            this.Controls.Add(this.pctFilDorm3);
            this.Controls.Add(this.pctFilMang4);
            this.Controls.Add(this.pctFilDorm4);
            this.Controls.Add(this.pctFilAtt5);
            this.Controls.Add(this.pctFilMang5);
            this.Controls.Add(this.pctFilDorm5);
            this.Controls.Add(this.pctForch2);
            this.Controls.Add(this.pctForch4);
            this.Controls.Add(this.pictureBox1);
            this.ForeColor = System.Drawing.Color.Black;
            this.Name = "FrameFilosofi";
            this.Text = "Filosofi - Turillo Luca";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch4)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch5)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctForch3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt4)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang4)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm4)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilAtt5)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilMang5)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pctFilDorm5)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnRUN;
        private System.Windows.Forms.Label lblAttesa1;
        private System.Windows.Forms.Label lblAttesa2;
        private System.Windows.Forms.Label lblAttesa3;
        private System.Windows.Forms.Label lblAttesa4;
        private System.Windows.Forms.Label lblAttesa5;
        private System.Windows.Forms.PictureBox pctFilAtt5;
        private System.Windows.Forms.PictureBox pctFilAtt2;
        private System.Windows.Forms.PictureBox pctFilAtt3;
        private System.Windows.Forms.PictureBox pctFilAtt4;
        private System.Windows.Forms.PictureBox pctFilAtt1;
        private System.Windows.Forms.PictureBox pctFilDorm1;
        private System.Windows.Forms.PictureBox pctFilDorm4;
        private System.Windows.Forms.PictureBox pctFilDorm3;
        private System.Windows.Forms.PictureBox pctFilDorm2;
        private System.Windows.Forms.PictureBox pctFilDorm5;
        private System.Windows.Forms.PictureBox pctFilMang1;
        private System.Windows.Forms.PictureBox pctFilMang4;
        private System.Windows.Forms.PictureBox pctFilMang3;
        private System.Windows.Forms.PictureBox pctFilMang2;
        private System.Windows.Forms.PictureBox pctFilMang5;
        private System.Windows.Forms.PictureBox pctForch3;
        private System.Windows.Forms.PictureBox pctForch2;
        private System.Windows.Forms.PictureBox pctForch1;
        private System.Windows.Forms.PictureBox pctForch5;
        private System.Windows.Forms.PictureBox pctForch4;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.Button btnStop;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button btnEXIT;
        private System.Windows.Forms.TextBox txtTimerTick;
        private System.Windows.Forms.Label lblTimerTick;
        private System.Windows.Forms.Label label1;
    }
}

