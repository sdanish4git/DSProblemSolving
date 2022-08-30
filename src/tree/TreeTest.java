package tree;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bt=new BinarySearchTree();
		bt.insert(5);
		bt.insert(10);
		bt.insert(20);
		bt.insert(12);
		bt.insert(2);
		System.out.println(bt.get(5));
	}

}
