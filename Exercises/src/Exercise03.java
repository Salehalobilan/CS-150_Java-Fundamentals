import java.util.Scanner;
public class Exercise03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, min;
		System.out.println("Enter three numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		min = num1;
		if (min > num2)
			min = num2;
		if (min > num3)
			min = num3;
		System.out.println("Min = "+ min);
		
		
		
		
		

	}

}
