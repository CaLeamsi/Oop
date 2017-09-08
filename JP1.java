import javax.swing.JOptionPane;

public class JP1{

	public static void main (String []args){
	
	String bills;
	String amounts;
	double bill;
	double amount;
	double charge;
	double tax;
	double change;
	double tem;
	double total;
	
	bills=JOptionPane.showInputDialog("Bill");
	amounts=JOptionPane.showInputDialog("Amount");
	bill=Double.parseDouble(bills);
	amount=Double.parseDouble(amounts);
	
	charge=bill + 12;
	tax=bill + 7;
	tem= charge + amount;
	total= tem + tax;
	change = amount - total;
	
	JOptionPane.showMessageDialog(null,"The net bill is"+ total);
	JOptionPane.showMessageDialog(null,"Your charge is"+ change);
	
	System.exit(0);
	}
	
}
	