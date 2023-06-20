import java.util.Scanner;
public class Execise05 {
//Calculator
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x,y,z; 
		char Off;
		
		do {
		System.out.print("Enter the first value: ");
		x = input.nextDouble();
		
		System.out.print("Enter the operation(+,-,*,/): ");
		String oper = input.next();
		
		System.out.print("Enter the second value: ");
		y = input.nextDouble();
		
		if(oper.equals("+")) {z = x + y;
			System.out.print("The result is: " + z);}
		
		else if(oper.equals("-")) {z = x - y;
			System.out.print("The result is: " + z);}
		
		else if(oper.equals("*")) {z = x * y;
			System.out.print("The result is: " + z);}
		
		else if(oper.equals("/")) {z = x / y;
			System.out.print("The result is: " + z);}
		
		System.out.print("Enter 'y' you want to close the calculator");
		 Off = input.next().charAt(0);
		   } while (Off != 'y');
		
		
		
		

	}

}
// the program had been edited for submitting the assignment.