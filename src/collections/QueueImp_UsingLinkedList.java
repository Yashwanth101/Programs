package collections;

public class QueueImp_UsingLinkedList {
	
	public Node head = null;
	public Node tail = null;
	
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void push(int data){
		
		Node node = new Node(data);
		
		if(head==null){
			head = node;
			tail = node;
		}else{
			tail.next = node;
			tail = node;
		}		
		
	}
	
	public void pop(){
		
	   //Node current = head;
	   
		if(head!=null){
			System.out.println(head.data);
			head = head.next;
		}else{
			System.out.println("Queue is Empty");
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		QueueImp_UsingLinkedList queue = new QueueImp_UsingLinkedList();
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		
		
		
		
		

	}

}
