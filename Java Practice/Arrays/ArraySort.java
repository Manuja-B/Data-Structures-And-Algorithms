import java.util.Scanner;

public class ArraySort {
	public static void main(String args[]) {
		int d[]=getIntegers();
		//printArray(d);
		int b[]=sortIntegers(d);
		printArray(b);
	}

	private static int[] sortIntegers(int[] a) {
		int temp=0;
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			for(int j=i+1;j<b.length;j++) {
				if (b[j]>b[i]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;	
				}
			}	
			}
			
		/*for(int i=0; i<a.length;i++) {
			System.out.println("Sorted array is"+a[i]);
		}*/
		return b;
		
	}

	private static void printArray(int[] f) {
		System.out.println("You have entered:");
		for(int i=0; i<f.length; i++) {
			System.out.println(f[i]);
		}
	}

	private static int[] getIntegers() {
		Scanner scanner = new Scanner(System.in);
		int a[]=null;
		System.out.println("Enter size of array");
		int size=scanner.nextInt();
		a=new int[size];
		System.out.println("Enter elements of array");
		for(int i=0; i<a.length; i++) {
			a[i]=scanner.nextInt();	
		}
		
		return a;
		
		
	}

}
