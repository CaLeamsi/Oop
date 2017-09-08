import java.util.Scanner;

public class Java Program3{
	public static void main(String [] args){
	Scanner InputDevice= new Scanner(System.in);
	
	int w,x,y,z;
	int a;
	System.out.print("Enter the value of w: ");
	w=InputDevice.nextInt();
	System.out.print("Enter the value of x: ");
	x=InputDevice.nextInt();
	System.out.print("Enter the value of y: ");
	y=InputDevice.nextInt();
	System.out.print("Enter the value of z: ");
	z=InputDevice.nextInt();
	a=w;
	w=x;
	x=y;
	y=z;
	z=a;
	System.out.print("\nThe New values of:");
	System.out.print("\nw="+w+"\nx="+x+"\ny="+y+"\nz="+z);
	
	System.exit(0);
	}
}