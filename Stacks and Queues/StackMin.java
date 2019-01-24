import java.util.EmptyStackException;

/* Design a stack which, in addition to push and pop, has a function min
 * which returns the minimum element. Push, pop, and min should all operate
 * in O(1) time. */

public class StackMin<T> {
	
	private static class StackMinNode<T> {
		T data;
		StackMinNode<T> next = null;
		
		private StackMinNode(T data) {
			this.data = data;
		}
	}
	
	private StackMinNode<T> top;
	
	public T pop() {
		if (top == null) {
			throw new EmptyStackException();
		} 
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item) {
		StackMinNode<T> t = new StackMinNode<T>(item);
		t.next = top;
		top = t;
	}
	
	// min method for the problem that retuns the minimum element
	public T min() {
		StackMinNode<T> curr = top;
		T currMin = top.data;
		if(currMin instanceof Comparable) {
			
			while(curr != null) {
				if(((Comparable) curr.data).compareTo(currMin) < 0) {
					currMin = curr.data;
				}
				curr = curr.next;
			}
		} else {
			return null;
		}
		return currMin;
	}
}
