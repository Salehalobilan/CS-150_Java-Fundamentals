import java.util.Arrays;

public class ArraysTest03 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 22, 33};
	    Arrays.sort(arr);
		int key = 21;
		System.out.println(key+ " found at index = " 
		+ Arrays.binarySearch(arr, key) 
		+ "\n" + Arrays.toString(arr));
		
		
		

	}

}

