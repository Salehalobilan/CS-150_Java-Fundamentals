import java.util.Scanner;
public class Multiply {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number1,number2 , multiply;
		System.out.print("Enter number1: ");
		number1 = input.nextInt();
		System.out.print("Enter number2: ");
		number2 = input.nextInt();
		multiply = number1 * number2;
		System.out.println("The sum is: " + multiply);

	}

}
