import javax.swing.JOptionPane;

public class J5{
	public static void main(String[]args){

double x;
double y;
double z;
double total=0;

String a,b;

	a=JOptionPane.showInputDialog("Enter the Gross Bill");
	x=Float.parseFloat(a);

	b=JOptionPane.showInputDialog("Enter the Amount");
	y=Float.parseFloat(b);

	total=x - (0.07*x + 0.12*x);
	z=y-total;
	
JOptionPane.showMessageDialog(null,"Change="+total+"\nNetbill="+z);

System.exit (0);




}
}