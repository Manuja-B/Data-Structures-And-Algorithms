import java.util.Scanner;

public class Arrayinput {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter size of array");
		int n=scanner.nextInt();
		int[] a=getIntegers(n);
		for(int i=0; i<a.length; i++) {
			System.out.println("You have entered "+a[i]);
		}
		double avg=average(a);
		System.out.println("Avergae is"+avg);
		
	}

	private static int[] getIntegers(int num) {
		int[] a = new int[num];
		
		System.out.println("Enter the numbers for array");
		for(int i=0; i<a.length; i++) {
		 a[i]=scanner.nextInt();
		}
		
		return a;
	}
	private static double average(int[] array) {
		double avg=0.0;
		double sum=0;
		for(int i=0;i<array.length; i++)
		{
			sum +=array[i];
		}
		avg=Math.ceil((double)sum/(array.length));
		return avg;
	}
}
