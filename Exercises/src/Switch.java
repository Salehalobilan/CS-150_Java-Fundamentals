import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the name of item: ");
		String food = input.next();
//		String food= "";
		switch(food) {
			case "apple":
			case "banana":
			case "cheery":
				System.out.println("Fruite!");
				break;
			case "asparagus":
			case "broccoli":
			case "carrot":
				System.out.println("Vegetable!");
			default: System.out.println("Not here!");					
		}
		
		System.out.print("Enter the name of number (one to three): ");
		int number = input.nextInt();
//		int number = 2;
		String word = "";
		switch(number) {
		case 1: word ="one";
		break;
		case 2: word ="two";
		break;
		case 3: word ="three";
		break;
		default: System.out.println("Not here!");
		
		
		
		
		}

	}

}
