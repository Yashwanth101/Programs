package collections;

public class LinkedList {
	
	public Node head = null;
	public  Node tail = null;
	
	// Node Implementation
	static class Node{
		int data;
		Node ref;
		
		Node(int data){
			this.data = data;
			ref = null;
		}
	}
	
	
	public void add(int data){
		
		Node node = new Node(data);
		
		if(head == null){
			head = node;
			tail = node;
		}else{
			tail.ref = node;
			tail = node;
		}
			
	}
	
	public void display(){
		
		Node current = head;
		
		while(current!=null){
			System.out.println(current.data);
			current = current.ref;
		}
		
	}
	
	
	public void deleteByKey(int key){
		
		Node current = head;
		
		while(current!=null){
			
			if(current.data!=key){
			System.out.println(current.data);
			current = current.ref;
			}else{
				current = current.ref;
			}
		}
		
	}
	

	public static void main(String[] args) {
	
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.display();	
		System.out.println("------------------");
		list.deleteByKey(2);

	}

}
