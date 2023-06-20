import java.util.Scanner;
import java.util.Locale;
public class CSTests {

	public static void main(String[] args) {

System.out.println("Hello World!");

// just trying to test something in java lava:P 
/*and 
 * this is another 	
 * test
 */
System.out.print("this is a \n text!");
System.out.print("this is \b another text");
System.out.print("this is \t another text");
System.out.print("this \n is \r another\r text");

//--------------------------------------------------

System.out.print("You are ");
System.out.println("Welcome in \n java" 
		+ " lava \t programming");
System.out.printf("%s%n%s%n", "I think you,", "are good");
//----------------------------------------------------
int x=7;
int y=12;
int z;
System.out.println(x++ + ++y);
System.out.print(x);
System.out.println("**********");
System.out.println(Math.ceil(9.2));

//----------------------------------------------------
Scanner input = new Scanner(System.in).useLocale(Locale.UK);
//char tax;
//tax = input.nextchar();

System.out.println();
System.out.printf("'%5d'\n", 10);
System.out.printf("'%-5d'\n", 10);
System.out.printf("'%05d'\n", 10);
System.out.printf("'%+5d'\n", 10);
System.out.printf("'%-+5d'\n", 10);

System.out.println();

System.out.printf("'%.1f'\n", 10.3456);
System.out.printf("'%.2f'\n", 10.3456);
System.out.printf("'%8.2f'\n", 10.3456);
System.out.printf("'%8.4f'\n", 10.3456);
System.out.printf("'%08.2f'\n", 10.3456);
System.out.printf("'%-8.2f'\n", 10.3456);

System.out.println();

System.out.printf("'%s'\n", "Hello");
System.out.printf("'%10s'\n", "Hello");
System.out.printf("'%-10s'\n", "Hello");



float a = (float)2.826;
System.out.printf("%f.2" , a);

//declare a scanner to input numbers


// declare 3 integer variables to input 
int number1, number2, number3;

// declare the max value to find
int max;

// prompt the user to enter 3 integers
System.out.println("Enter three numbers: ");
number1 = input.nextInt();
number2 = input.nextInt();
number3 = input.nextInt();

 // assign the first variable value to max
max = number1; 

// compare the max with the other variables:
//  - if the max still bigger, keep its value as it is
//  - if the max is smaller, update its value 

// compare the max with number2 and update the max if needed
if ( max < number2 )
    max = number2;

// compare the max with number3 and update the max if needed
if ( max < number3 )
    max = number3;

// print the max value
System.out.printf("Max = %d\n", max);


System.out.print("Enter two numbers: ");
number1 = input.nextInt();
number2 = input.nextInt();

if (number1 % number2 == 0)
    System.out.printf("%d is multiple of %d\n", number1, number2);

if (number1 % number2 != 0)
    System.out.printf("%d is not multiple of %d\n", number1, number2);

	}

}
