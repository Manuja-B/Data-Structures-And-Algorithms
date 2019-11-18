import java.util.Scanner;

public class ArrayMin {
	
public static void main(String args[]) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter count of integers");
	int count=scanner.nextInt();
	int a[]=readIntegers(count);
 int min=findMin(a);
 System.out.println("Minimum element of array is "+min);
 //readIntegers(min);
}
private static int[] readIntegers(int count) {
	Scanner scanner =new Scanner(System.in);
	int[] a=new int[count];
	System.out.println("Enter array elements");
	for(int i=0; i<count; i++) {
		a[i]=scanner.nextInt();
	}
	return a;
}
private static int findMin(int[] a) {
	int min=0;
	for(int i=0; i<a.length-1; i++) {
		if(a[i]<a[i+1]) {
			min=a[i];
		}
		else
			min=a[i+1];
	}
	return min;
}

}
