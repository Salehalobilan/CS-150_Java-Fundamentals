import java.util.Scanner;
import java.lang.Math;
public class MathMethods {

	public static void main(String[] args) {
		double absolute = Math.abs(-25);
		System.out.println("The absolute value of " + "-25 is: " + absolute);
		
		double round = Math.ceil(9.1);
		System.out.println("The smallest integer not less than " + "9.1 is: " + round);
		
		double sin = Math.sin(0);
		System.out.println("The sin of 0 in radian is: " + sin);
		
		double cosin = Math.cos(0);
		System.out.println("The cosin of 0 in radian is: " + cosin);
		
		double tan = Math.tan(0);
		System.out.println("The tan of 0 in radian is: " + tan);
		
		double exponintial = Math.exp(2);
		System.out.println("The expotintial is: " + exponintial);
		
		double floor = Math.floor(13.4);
		System.out.println(floor);
		System.out.println(Math.floor(-18.2));
		
		double logarithm = Math.log(10);
		System.out.println(logarithm);
		System.out.println(Math.log(Math.E));
		
		double maximum = Math.max(102.3, 23);
		System.out.println(maximum);
		
		double minimum = Math.min(-320, -2);
		System.out.println(minimum);
		
		double power = Math.pow(2, 2);
		System.out.println(power);
		
		double squareroot = Math.sqrt(225);
		System.out.println(squareroot);
		

	}

}
