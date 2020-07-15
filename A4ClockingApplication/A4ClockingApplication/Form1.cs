using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace A4ClockingApplication
{
    public partial class Form1 : Form
    {
        Clocking mycloking;
        public Form1()
        {
            InitializeComponent();

            mycloking = new Clocking();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                mycloking.clockin();
            }
            catch(ClockingTimeException cte)
            {

            }
            catch(ClokcingHourException che)
            {

            }
            catch (ClockingException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
