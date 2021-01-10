package collections;

public class StackImp_UsingLinkedList {

	Node head;

	class Node {
		int value;
		Node next;
	}

	StackImp_UsingLinkedList() {
		head = null;
	}

	public void push(int value) {
		Node extrahead = head;
		head = new Node();
		head.value = value;
		head.next = extrahead;
	}

	public void pop() {

		if (head == null) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println(head.value);
			head = head.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImp_UsingLinkedList ll = new StackImp_UsingLinkedList();
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		
		ll.pop();
		ll.push(60);
		ll.pop();
		

	}

}
