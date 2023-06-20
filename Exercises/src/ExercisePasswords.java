import java.util.Scanner;
public class ExercisePasswords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your password: ");
		String pass = in.next();
		
		System.out.println("---------------------------------");
		System.out.printf("%8s | %10b\n", "Rule1" , pass.length() >= 8);
		System.out.printf("%8s | %10b\n", "Rule2" , pass.indexOf('?') != -1);
		System.out.printf("%8s | %10b\n", "Rule3" , pass.startsWith("#"));
		System.out.println("---------------------------------");
		
		
		
		
		System.out.println("Enter your password: ");
		String pw = in.next();
		
		if (pw.length()<=8)
		    System.out.println("Rule 1 is not satisified" ); 
		else System.out.println("Rule 1 is satisified" );
		
		if (pw.indexOf('?')!=-1)
		    System.out.println("Rule 2 is not satisified" ); 
		else System.out.println("Rule 2 is satisified" );
		
		if (pw.startsWith("#") )
		    System.out.println("Rule 3 is satisified" ); 
		else System.out.println("Rule 3 is not satisified" );
		


	}

}
