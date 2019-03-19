import java.util.HashSet;

public class RemoveDuplicatesSol {
	
	public static void removeDuplicates(Node n) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		Node previous = null;
		while(n != null) {
			if(set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
}

/* O(N) time complexity where N is the number of elements
 * in the linked list. */