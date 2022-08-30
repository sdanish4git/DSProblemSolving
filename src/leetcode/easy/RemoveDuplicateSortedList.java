package leetcode.easy;

public class RemoveDuplicateSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
	
		addLast(head, 1);
		addLast(head, 2);
		addLast(head, 2);
		addLast(head, 3);
		printList(head);
		System.out.println();
		//removeDuplicate(head);
		removeDuplciateInNTime(head);

		
	}
	
	public static void removeDuplciateInNTime(ListNode head) {
		ListNode current=head;
		while(current.next!=null) {
			if(current.val==current.next.val) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
		printList(head);
	}
	
	public static void removeDuplicateNSquare(ListNode node) {
		
			ListNode current=node;
			while(current!=null) {
				ListNode runner=current;
				while(runner.next!=null) {
					if(current.val==runner.next.val) {
						runner.next=runner.next.next;
						
					}else {
						runner=runner.next;
					}
				}
				current=current.next;
			}
			printList(node);
	}
	public static void addLast(ListNode head,int d) {
		ListNode newNode =new ListNode(d);
		if (head == null) {
			head = newNode;
			
			return;
		}
		ListNode currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		
	}

	  
	  public static void printList(ListNode head) {
			if (head == null) {
				System.out.println("List is Empty");
				return;
			}
			ListNode currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.val + " -> ");
				currentNode = currentNode.next;
			}
			System.out.print("null");
		}
	 
}
