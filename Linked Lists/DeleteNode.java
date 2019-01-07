/* Implement an algorithm to delete any node (first, last, and any in the
 * middle) of a singly linked list, given only access to that node */

public class DeleteNode {
	
	public static void delete(Node head, Node n) {
		
		Node curr = head;
		Node prev = null;
		
		while(curr != null) {
			if(curr == n) {
				// delete
				if(curr == head) {
					head = curr.next;
				} else {
					prev.next = curr.next;
				}
			}
			prev = curr;
			curr = curr.next;
		}
	}
}
