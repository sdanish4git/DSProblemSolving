package tree;

public class BinarySearchTree {
	TreeNode root;
	
	public void insert(int value) {
		if(root == null) {
			root=new TreeNode(value);
		}else {		
		root.insert(value);
		}
	}
	public TreeNode get(int value) {
		if(root !=null) {
			return root.get(value);
		}
		return null;
	}
}
