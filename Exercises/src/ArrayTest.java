
public class ArrayTest {

	public static void main(String[] args) {
/*Way 1*/ int grades[]= {99,86,87,78};
/**/    int sum = grades[0]+ grades[1] + grades[2] + grades[3];
		float avg = (float)sum/4;
//		System.out.printf("%s%d%s%.1f%n","the sum is: ", sum, "the avrage is", avg );
		System.out.println("the sum is: " + sum + " the avrage is: " + avg );

	}

}
