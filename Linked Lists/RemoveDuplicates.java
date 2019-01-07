/* Write code to remove duplicates from an unsorted linked list. How 
 * would you solve this problem if a temporary buffer is not allowed? */

public class RemoveDuplicates {
	
	public static void removeDuplicates(Node head) {
		
		Node curr = head;
		
		while(curr != null) {
			
			Node search = curr.next;
			Node prev = curr;
			while(search != null) {
				if(curr.data == search.data) {
					// remove the node 
					prev.next = search.next;
					
				}
				prev = search;
				search = search.next;
			}
			curr = curr.next;
		}
	}
}
