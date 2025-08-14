using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class frmGioco : Form
    {
        public frmGioco()
        {
            InitializeComponent();
        }
        public bool controllo (int x=0)
        {
            int somma = 0;
            somma = mat[0, 0] + mat[0, 1] + mat[0, 2];
            if (somma == 3||somma==-3)
                return true;
    
            somma = mat[1, 0] + mat[1, 1] + mat[1, 2];
            if (somma == 3 || somma == -3)
                return true;
        
            somma = mat[2, 0] + mat[2, 1] + mat[2, 2];
            if (somma == 3 || somma == -3)
                return true;
                     
            somma = mat[0, 0] + mat[1, 0] + mat[2, 0];
            if (somma == 3 || somma == -3)
                return true;
            
            somma = mat[0, 1] + mat[1, 1] + mat[2, 1];
            if (somma == 3 || somma == -3)
                return true;
            
            somma = mat[0, 2] + mat[1, 2] + mat[2, 2];
            if (somma == 3 || somma == -3)
                return true;

            somma = mat[0, 0] + mat[1, 1] + mat[2, 2];
            if (somma == 3 || somma == -3)
                return true;

            somma = mat[0, 2] + mat[1, 1] + mat[2, 0];
            if (somma == 3 || somma == -3)
                return true;

            return false;
        }

        int[,] mat = new int[3,3];
        int turno = 2,btn=0,random;
        public Random rnd = new Random();
        private void Form1_Load(object sender, EventArgs e)
        {
            grd.ColumnCount = 3;
            grd.RowCount = grd.ColumnCount = 3;

            for (int i = 0; i < 3; i++)
            {
                grd.Columns[i].Width = 500 / 3;
            }

            for (int j = 0; j < 3; j++)
            {
                grd.Rows[j].Height = 500 / 3;
            }

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    mat[i, j] = 0;
                }
            }

            random = rnd.Next(1, 3);
            if (random==1)
            {
                lblGiocatore1.BackColor = Color.Cyan;
            }
            else
            {
                lblGiocatore2.BackColor = Color.Cyan;
            }

        }

        private void grd_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            string giocatore="";

            if (lblGiocatore2.BackColor==Color.Cyan)
            {
                if (mat[e.ColumnIndex, e.RowIndex] ==0)
                {
                    mat[e.ColumnIndex, e.RowIndex] = 1;
                    grd[e.ColumnIndex, e.RowIndex].Value = "X";
                    lblGiocatore1.BackColor = Color.Cyan;
                    lblGiocatore2.BackColor = Color.Empty;
                    giocatore = lblGiocatore1.Text;
                    turno = 2; 
                }
                
            }

            else
            {
                if (mat[e.ColumnIndex, e.RowIndex] == 0)
                {
                    mat[e.ColumnIndex, e.RowIndex] = -1;
                    grd[e.ColumnIndex, e.RowIndex].Value = "O";
                    lblGiocatore2.BackColor = Color.Cyan;
                    lblGiocatore1.BackColor = Color.Empty;
                    giocatore = lblGiocatore2.Text;
                    turno = 1;
                }
            }
            grd.CurrentCell.Selected = false;

            if (controllo()==true)
            {
                MessageBox.Show("Il giocatore: " + giocatore + " ha vinto!");
                grd.Enabled = false;
            }

        }

        private void btnGioca_Click(object sender, EventArgs e)
        {
            btnGioca.Visible = false;
            txtGiocatore1.Visible = false;
            txtGiocatore2.Visible = false;
            lblGiocatoreIniziale1.Visible = false;
            lblGiocatoreIniziale2.Visible = false;

            grd.Visible = true;
            grd.CurrentCell.Selected = false;

            lblGiocatore1.Visible = true;
            lblGiocatore2.Visible = true;
            lblGiocatore1.Text = txtGiocatore1.Text;
            lblGiocatore2.Text = txtGiocatore2.Text;

            if (lblGiocatore1.Text == "")
                lblGiocatore1.Text = "Giocatore 1";

            if (lblGiocatore2.Text == "")
                lblGiocatore2.Text = "Giocatore 2";
                
            
        }

        private void frmGioco_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

       }
   }

