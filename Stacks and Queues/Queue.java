
public class Queue<T> {
	
	private static class QueueNode<T> {
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data) {
			this.data = data;
		}
	}
	
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	// add(item)
	
	// remove()
	
	// peek()
	
	// isEmpty()

}
