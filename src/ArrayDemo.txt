import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] array = { 5, 2, 5, 1, 2, 5, 2, 3, 5, 52, 2, 5, 5, 4, 2, 5, 5, 2 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));

		Arrays.sort(array);
		System.out.println("After AscdingSorting");
		System.out.println(Arrays.toString(array));
	
		System.out.println("After DescdingSorting");
		for(int i = array.length-1 ; i >=0  ; i--) {
			System.out.print(array[i]+",");

			}
		}
	}

