
public class ArrayRemoveDuplicates {
	public static void main(String args[]) {
		int[] arr=new int[]{1,2,3,3,4,5,6,7,7,8};
		int previous=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(previous == arr[i]) {
				System.out.println("Duplicate no is"+arr[i]);
			}
			else
				previous=arr[i];
			
		}
		
	}

}
