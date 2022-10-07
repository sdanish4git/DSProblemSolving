package linkedlist;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LinkedListBasicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list=new SinglyLinkedList();
		list.insert(4);
		list.insert(10);
		list.insert(20);
		list.insert(50);
		list.printList();
		list.insertAtPosition(70, 0);
		list.printList();
		list.deleteAtPos(4);
		list.printList();
		list.reverseList();
		list.printList();
	
	}

}
