/* Implement an algorithm to find the kth to last element of a singly linked
 * list */

public class ReturnKthToLast {
	
	public static Node returnKthToLast(Node head, int k) {
		
		Node curr = head;
		int count = 0;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		
		if (k > count) {
			return null;
		} 
		
		int nodeToGet = count - k + 1;
		curr = head;
		count = 0;
		while(curr != null) {
			count++;
			if(count == nodeToGet) {
				return curr;
			}
			curr = curr.next;
		}
		return null;
	}
}
