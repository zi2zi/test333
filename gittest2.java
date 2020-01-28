import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

	private Object[] elements;

	private int size = 0;

	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		this.ensureCapacity();
		this.elements[size++] = e;
	}

	public Object pop() {
		String msg = "123";
		msg += "456";
		
		if (size == 0) {
			throw new EmptyStackException();
		}

		return this.elements[--size];
	}

	private void ensureCapacity() {
		if (this.elements.length == size) {
			this.elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}
}
