package collections;

public class QueueImp_UsingArrays {
	
	int size;
	int top;
	int arr[];
	int range = 0;
	
	public QueueImp_UsingArrays(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	public void push(int data){
		if(!isFull()){
		  top++;
		  arr[top] = data;
		}else{
			System.out.println("Queue is full");
		}
	}
	
	public void pop()
	{
		if(!isEmpty()){
		System.out.println(arr[range]);
		range++;
		}else{
			System.out.println("Queue is Empty");
		}
	}
	
	public void printAllValues(){
		for(int i=0;i<=top;i++){
			System.out.println(arr[i]);
		}
	}
	
	
	public boolean isFull(){
		return (size-1==top);
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void peek(){
		System.out.println(arr[range]);
	}

	public static void main(String[] args) {
		
		QueueImp_UsingArrays queue = new QueueImp_UsingArrays(10);
		
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		
		
		for(int i=0;i<=3;i++){
			queue.pop();
		}

	}

}
