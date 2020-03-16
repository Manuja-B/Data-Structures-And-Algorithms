package Practice;

import java.util.Arrays;

//Sort stack using another stack
public class Stack {
	int size;
	int top;
	int arr[];
	Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public void push(int e) {
		if(!isFull()) {
			top++;
			arr[top]=e;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	public int pop() {
		if(!isEmpty()) {
			int currTop=top;
			top--;
			return arr[currTop];
			
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			int currTop=top;
			return arr[currTop];
			
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	public boolean isFull() {
		if(top==size-1) {
			return true;		
			}
	
	else {
		return false;
	}
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
			}
	}
	
	public static int[] SortUsingStack(int[] arr) {
		Stack s1=new Stack (arr.length);
		Stack s2=new Stack (arr.length);
		int[] output=new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			s1.push(arr[i]);
		}
		
		while(!s1.isEmpty()) {
			int currData=s1.pop();
			if(s2.isEmpty()) {
				s2.push(currData);
			}
			else {
				if(s2.peek()>currData) {
					s2.push(currData);
				}
				else {
					int temp=s2.pop();
					s2.push(currData);
					s2.push(temp);
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			output[i]=s2.pop();
		}
		return output;
		
	}
	public static void main(String[] args) {
		int[] arr= {3,5,7,2};
		int[] output;
		output=SortUsingStack(arr);
		System.out.println("Sorted array is "+Arrays.toString(output));
	}
}
