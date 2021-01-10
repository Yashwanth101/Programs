package collections;

public class StackImp_UsingArrays {

	int size;
	int arr[];
	int top;

	public StackImp_UsingArrays(int size) {

		this.size = size;
		arr = new int[size];
		top = -1;
	}

	public void push(int data) {

		if (!isFull()) {
			top++;
			arr[top] = data;
		} else {
			System.out.println("Stack is Full");
		}

	}

	public void pop() {

		if (!isEmpty()) {
			int returnedElement = top;
			System.out.println(arr[returnedElement]);
			top--;
		} else {
			System.out.println("Stack is Empty");
		}

	}

	public void peek() {
		if (!isEmpty()) {
			System.out.println("Peeked Element is:" + arr[top]);
		} else {
			System.out.println("Stack is Empty");
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {
		StackImp_UsingArrays si = new StackImp_UsingArrays(10);

		si.push(20);
		si.push(30);
		si.push(40);
		si.push(50);

		si.pop();
		si.pop();
		si.pop();

		si.peek();

	}

}
