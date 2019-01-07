import java.util.ArrayList;

/* Write code to partition a linked list around a value x, such that all 
 * nodes less than x come before all nodes greater than or equal to x. If x
 * is contained within the list, the values of x only need to be after the
 * elements less than x */

public class Partition {

	public static Node partition(Node head, int x) {
		ArrayList<Node> lessThanValue = new ArrayList<Node>();
		ArrayList<Node> greaterThanOrEqual = new ArrayList<Node>();
		Node curr = head;
		
		while(curr != null) {
			if(curr.data < x) {
				lessThanValue.add(curr);
			} else {
				greaterThanOrEqual.add(curr);
			}
			curr = curr.next;
		}
		
		curr = new Node(lessThanValue.get(0).data);
		head = curr;
		for(int i = 1; i < lessThanValue.size(); i++) {
			curr.next = lessThanValue.get(i);
			curr = curr.next;
		}
		for(Node n : greaterThanOrEqual) {
			curr.next = n;
			curr = curr.next;
		}
		return head;
	}
}
