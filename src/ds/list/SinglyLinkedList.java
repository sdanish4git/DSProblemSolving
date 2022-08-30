package ds.list;

public class SinglyLinkedList {
	Node head;
	int size = 0;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	public void addFirst(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addLast(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		size++;
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
		size--;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		if (head.next == null) {
			head = null;
			size--;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			secondLast = secondLast.next;
			lastNode = lastNode.next;
		}
		secondLast.next = null;
		size--;
	}

	public void printList() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.print("null");
	}

	public void reverseList() {
		Node currentNode = head;
		Node previousNode = null;
		while (currentNode != null) {
			Node nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;

		}
		head = previousNode;
	}

	public void swapTwoAdjacentNode() {
		Node dummy = new Node();
		dummy.next = head;
		Node node = dummy;
		while (node != null) {
			Node first = node.next;
			Node second = null;
			if (first != null) {
				second = first.next;
			}
			if (second != null) {
				Node secondNext = second.next;
				second.next = first;
				first.next = secondNext;
				node.next = second;
				node = first;

			} else {
				break;
			}
		}
		head=dummy.next;
	}
	//remove dublicate from LinkedList  O(n^2)
	public void removeDuplicates() {
		if(head==null || head.next==null) {
			return;
		}
		Node current=head;
		
		while(current!=null) {
			Node runner=current;
			while(runner.next!=null) {
				if(runner.next.data==current.data) {
					runner.next=runner.next.next;
				}else {
					runner=runner.next;
				}
			}
			current=current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.addFirst(3);
		sll.addFirst(6);
		sll.addFirst(5);
		sll.addFirst(1);
		sll.addFirst(6);
		// sll.addLast(0);
		// sll.deleteFirst();
		// sll.deleteLast();
		// sll.deleteFirst();
		// sll.deleteLast();
		// sll.reverseList();
		//sll.swapTwoAdjacentNode();
		//System.out.println(sll.size);
		sll.printList();
		sll.removeDuplicates();
		sll.printList();
	}

}
