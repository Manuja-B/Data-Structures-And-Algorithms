import java.util.Arrays;
import java.util.Collections;
public class ArrayMissingNo {
public static void main(String args[]) {
	int[] arr=new int[] {1,2,4,5,6,7,8,9,10};
	int max=0;
	int sum=0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>max)
			max=arr[i];
		sum=sum+arr[i];
	}
	double actualsum=0;
	actualsum=(max*(max+1))/2;
	System.out.println("Missing no is"+(int)(actualsum-sum));
	
}
}
