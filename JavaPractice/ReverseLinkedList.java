
public class ReverseLinkedList {
	private Node head;
	private static class Node{
		int value;
		Node next;
		Node(int value) {
			this.value = value;
 
		}
	}
	
	public void insert(Node n) {
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = n;
		}
		
	}
	
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static Node reverse(Node head) {
		Node currnode=head;
		Node previousnode=null;
		Node nextnode;
		while(currnode!=null) {
			nextnode=currnode.next;
			currnode.next=previousnode;
			previousnode=currnode;
			currnode=nextnode;
		}
		return previousnode;
	}
	public static void main(String[] args) {
		ReverseLinkedList list=new ReverseLinkedList();
		// Creating a linked list
		Node head=new Node(5);
		list.insert(head);
		list.insert(new Node(6));
		list.insert(new Node(1));
		list.insert(new Node(6));
		list.insert(new Node(5));
		
		Node reverseHead=reverse(head);
		System.out.println("After reversing");
		list.printList(reverseHead);
		if (reverseHead==head) {
			System.out.println("LinkedList is palindrome");
		}
	}
 

}
