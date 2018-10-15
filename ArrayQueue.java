public class ArrayQueue<E> implements Queue<E> {
	public static final int CAPACITY = 100;
	private E[] data;
	private int front = 0;
	private int size = 0;
	
	public ArrayQueue() {
		this(CAPACITY);
	}
	
	public ArrayQueue(int capacity) {
		data = ((E[]) new Object[capacity]);
	}
	
	public int size() {
		return(size);
	}
	public boolean isEmpty() {
		return (size==0);
	}
	public E first() {
		return (data[front]);
	}
	public void enqueue(E type) {
		if (size() == data.length) {
			throw new IllegalStateException();
		}
		int r = (front + size)%(data.length);
		data[r] = type;
		size++;
		
	}
	public E dequeue() {
		if (isEmpty()) {
			return null;
		}
		E type = data[front];
		front = (front + 1)% data.length;
		size--;
		return type;
	}
}