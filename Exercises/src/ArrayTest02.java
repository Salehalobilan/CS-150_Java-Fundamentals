import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
/*Way 2*/	int grades[];
/**/    grades = new int[5];
		int sum;
		float avg;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 0th grade: ");
		grades[0]= input.nextInt();
		System.out.print("Enter the 1th grade: ");
		grades[1]= input.nextInt();
		System.out.print("Enter the 2th grade: ");
		grades[2]= input.nextInt();
		System.out.print("Enter the 3th grade: ");
		grades[3]= input.nextInt();
		System.out.print("Enter the 4th grade: ");
		grades[4]= input.nextInt();
		
		sum = grades[0] + grades[1] + grades[2]
			  + grades[3] + grades[4];
		avg = (float) sum / 5;
		
		System.out.printf("%s%d%s%.1f%n","the sum is: ",
				sum, "the avrage is", avg );
		System.out.println("the sum is: " + sum +
				" the avrage is: " + avg );

	}

}
