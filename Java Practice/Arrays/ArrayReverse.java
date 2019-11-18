import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter size of array");
		int n=scanner.nextInt();
		int[] a=getIntegers(n);
		reverse(a);

		
	}

	private static int[] getIntegers(int num) {
		int[] a = new int[num];
		
		System.out.println("Enter the numbers for array");
		for(int i=0; i<a.length; i++) {
		 a[i]=scanner.nextInt();
		}
		
		return a;
	}
	private static void reverse(int[] a) {
		System.out.println("The array elements in right order are:"+Arrays.toString(a));
		int[] revArray=new int[a.length];
		revArray=a;
		int[] reversedArray=new int[a.length];
		int temp;
		System.out.println("Size"+(a.length)/2);
		for(int i=0; i<a.length/2; i++) {
			
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		System.out.println("The array elements in reverse order are:"+Arrays.toString(a));
		
	}
}
