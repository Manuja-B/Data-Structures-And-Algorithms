
//Manuja Bandal

import org.junit.*;
import java.util.Arrays;

//Class to implement bubble sort on given array
public class BubbleSort {
	
	//Logic of bubble sort
	private static int[] bubble_sort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		if(arr.length>1) {
		for (int i = 0; i < n; i++) 
		{
			for (int j = 1; j < (n - i); j++) {
				
				if (arr[j - 1] > arr[j]) {

					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}

			}
		}
		}
		else
			System.out.println("Array need not to be sorted as it contains only one element");

		return arr;
	}

	//Print the sorted array
	private static void printArray(int[] arr) {
		System.out.println("Array after sorting is");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


	//Test Cases
	private void test_array(int[] arr) {
		int[] expected = arr.clone();
		Arrays.sort(expected);
		int[] result = bubble_sort(arr);
		Assert.assertArrayEquals(expected, result);
		printArray(result);
	}
	
	@Test
	public void empty() {
		test_array(new int[] {});
	}

	@Test
	public void test_small_1() {
		test_array(new int[] { 3, 5, 4, 2, 1 });
	}
	
	@Test
	public void test_small_2() {
		test_array(new int[] { 3 });
	}
	
	@Test
	public void test_small_3() {
		test_array(new int[] { 3, 1});
	}
	
	@Test
	public void test_small_4() {
		test_array(new int[] { 3, 1, 12, 2});
	}
	
	@Test
	public void test_large_1() {
		test_array(new int[] { 3, 1, 33, 21, 7, 43, 56, 21, 8});
	}
	
	@Test
	public void test_negative_elements1() {
		test_array(new int[] { -8, 1, 33, 7, 3, -1});
	}
	
	@Test
	public void test_repeated_elements1() {
		test_array(new int[] { 8, 1, 33, 8});
	}
	
	@Test
	public void test_repeated_elements2() {
		test_array(new int[] { 8, 1, 33, 8, 2, 7, 33, 4, 2});
	}
	
	@Test
	public void test_negative_elements_repeated() {
		test_array(new int[] { -8, 1, 33, 7, 3, -1, -8});
	}

	
}