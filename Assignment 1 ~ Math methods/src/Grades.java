import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade");
		int grade = input.nextInt();
	    if (grade >= 90) {
	    	System.out.println("Your grade is A!");
	    }
	    
	    else if (grade >= 80) {
	    	System.out.println("Your grade is B!");
	    }
	    
	    else if (grade >= 70) {
	    	System.out.println("Your grade is C!");
	    }
	    
	    else if (grade >= 60) {
	    	System.out.println("Your grade is D!");
	    }
	    
	    if (grade < 60) {
	    	System.out.println("Your grade is F!");
	    }
	    
	    double x= 4, y = 5;
	    System.out.println(10 + (++(x)+15));
	    x = Math.sqrt(grade);
	    System.out.print(x);
	}

}
