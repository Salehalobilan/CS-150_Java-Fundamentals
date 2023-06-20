import java.util.Scanner;
import java.util.Arrays;
public class LabExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 5 days temperatures: ");
		int temp[];
		temp = new int[5];
		temp[0] = input.nextInt();
		temp[1] = input.nextInt();
		temp[2] = input.nextInt();
		temp[3] = input.nextInt();
		temp[4] = input.nextInt();
		Arrays.sort(temp);
		System.out.print("The lowest temperature is " + temp[0]);
		System.out.print("\nThe highest temperature is " + temp[4]);
		System.out.println("\nDay     Temperature" );
		System.out.println(Arrays.binarySearch(temp, temp[0])+1 + "        " + temp[4]);
		System.out.println(Arrays.binarySearch(temp, temp[1])+1 + "        " + temp[3]);
		System.out.println(Arrays.binarySearch(temp, temp[2])+1 + "        " + temp[2]);
		System.out.println(Arrays.binarySearch(temp, temp[3])+1 + "        " + temp[1]);
		System.out.println(Arrays.binarySearch(temp, temp[4])+1 + "        " + temp[0]);

		

	}

}
