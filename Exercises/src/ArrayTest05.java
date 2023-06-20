import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {
		int Arr[] = {10, 20 , 15, 22, 35};
		int key = 0;
		Arrays.fill(Arr, key);
		System.out.println("Intger Array on filling: "
				+  Arrays.toString(Arr));

	}

}
