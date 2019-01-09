/* You have two numbers represented by a linked list, where each node contains
 * a single digit. Write a function that adds the two numbers and returns the
 * sum as a linked list. */

public class SumLists {
	
	public static Node sumListsReverse(Node head1, Node head2) {
		int val1 = 0, val2 = 0;
		
		// list 1
		Node curr = head1;
		int place = 1;
		while(curr != null) {
			val1 += curr.data * place;
			place *= 10;
			curr = curr.next;
		}
		
		// list 2
		curr = head2;
		place = 1;
		while(curr != null) {
			val2 += curr.data * place;
			place *= 10;
			curr = curr.next;
		}
		
		// return sum as linked list
		int sum = val1 + val2;
		Node sumHead = new Node(sum % 10);
		sum /= 10;
		curr = sumHead;
		while(sum != 0) {
			curr.next = new Node(sum % 10);
			sum /= 10;
			curr = curr.next;
		}
		return sumHead;
		
	}
	
	public static Node sumListsOrder(Node head1, Node head2) {
		double val1 = 0, val2 = 0;
		
		// list1
		Node curr = head1;
		double place = 1;
		while(curr != null) {
			val1 += curr.data * place;
			place /= 10;
			curr = curr.next;
		}
		while(val1 % 1 != 0) {
			val1 *= 10;
		}
		
		// list2
		curr = head2;
		place = 1;
		while(curr != null) {
			val2 += curr.data * place;
			place /= 10;
			curr = curr.next;
		}
		while(val2 % 1 != 0) {
			val2 *= 10;
		}
		
		// sum
		int sum = (int)(val1 + val2);
		int digits = 0;
		int calcDigits = sum;
		while(calcDigits % 10 != 0) {
			digits++;
			calcDigits /= 10;
		}

		Node sumHead = new Node((int) (sum / Math.pow(10, digits - 1)));
		curr = sumHead;
		for(int i = digits - 1; i > 0; i--) {
			curr.next = new Node((int) (sum / Math.pow(10, digits - 1)));
			curr = curr.next;
		}
		return sumHead;
	}
}
