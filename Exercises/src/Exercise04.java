import java.util.Scanner;
public class Exercise04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("Please enter an integer value: ");
		n = input.nextInt();
		
		if(n % 2  == 0)
			System.out.print(n + " is even");
		else
			System.out.print(n + " is odd");

	}

}
