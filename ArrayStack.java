
public class ArrayStack<E> implements Stack<E> {
	public static final int CAPACITY = 100;
	private E[] data;
	private int t=-1;
	
	public ArrayStack() {
		this(CAPACITY);
	}
	
	public ArrayStack(int capacity) {
		data = ((E[]) new Object[capacity]);
	}
	public int size() {
		return (t+1);
	}
	public boolean isEmpty() {
		return(t==-1);
	}
	public E top(){
		if (isEmpty()){
			return null;
	}
		return data[t];
	
	}
	public E pop() {
		if (isEmpty()){
			return null;
	}
		E answer = data[t];
		data[t--]= null;
		return answer;
	}
	public void push(E entry) {
		if (size() == data.length-1) {
		throw new IllegalStateException();
	}
		else {
			data[++t] = entry;
		}
}
	
	
}
