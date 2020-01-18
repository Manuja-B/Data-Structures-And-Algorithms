import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSort {

	
private static int[] Selection_Sort(int arr[]) {
	int sorted_arr[];
	int unsorted_arr[];
	int min=0;
	
	for (int i = 0; i < arr.length-1; i++) 
    { 
        // Find the minimum element in unsorted array 
        int min_idx = i; 
        for (int j = i+1; j < arr.length; j++) 
            if (arr[j] < arr[min_idx]) 
                min_idx = j; 

        // Swap the found minimum element with the first 
        // element 
        int temp = arr[min_idx]; 
        arr[min_idx] = arr[i]; 
        arr[i] = temp; 
    } 
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
	int[] result = Selection_Sort(arr);
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
