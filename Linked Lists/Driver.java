
public class Driver {
	
	public static String linkedListString(Node head) {
		String toReturn = "";
		Node curr = head;
		while(curr != null) {
			toReturn += curr.data;
			curr = curr.next;
		}
		
		return toReturn;
	}
	
	public static void main(String[] args) {
		
		// remove duplicates
		Node head = new Node(0);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(3);
		System.out.println(linkedListString(head));
		RemoveDuplicates.removeDuplicates(head);
		System.out.println(linkedListString(head));
		
		// return kth to last
		System.out.println(ReturnKthToLast.returnKthToLast(head, 3).data);
		
		// delete node
		DeleteNode.delete(head, head.next);
		System.out.println(linkedListString(head));
		
		// partition linked list
		Node head1 = new Node(5);
		head1.next = new Node(7);
		head1.next.next = new Node(2);
		head1.next.next.next = new Node(6);
		head1.next.next.next.next = new Node(1);
		head1.next.next.next.next.next = new Node(0);
		head1.next.next.next.next.next.next = new Node(9);
		System.out.println(linkedListString(head1));
		head1 = Partition.partition(head1, 6);
		System.out.println(linkedListString(head1));
		
		// sum lists
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head1 = new Node(3);
		head1.next = new Node(2);
		head1.next.next = new Node(1);
		Node headSum = SumLists.sumListsReverse(head, head1);
		System.out.println(linkedListString(headSum));
		Node headSum1 = SumLists.sumListsOrder(head, head1);
		System.out.println(linkedListString(headSum1));
	}

}
