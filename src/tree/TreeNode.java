package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {

	int data;
	TreeNode leftNode;
	TreeNode rightNode;

	public TreeNode(int data) {
		super();
		this.data = data;
	}
	
	public TreeNode get(int value) {
		if(this.data == value) {
			return this;
		}
		if(value<this.data) {
			if(this.leftNode !=null) {
				leftNode.get(value);
			}
		}else {
			if(this.rightNode !=null) {
				rightNode.get(value);
			}
		}
		return null;
	}
	
	public void insert(int value) {
		if (data == value) {
			return;
		}
		if (value < data) {
			if (this.leftNode == null) {
				this.leftNode = new TreeNode(value);
			} else {
				leftNode.insert(value);
			}
		} else {
			if (this.rightNode == null) {
				this.rightNode = new TreeNode(value);
			} else {
				this.rightNode.insert(value);
			}
		}

	}

	public List<Integer> preOrderTraversal(TreeNode root) {

		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			res.add(temp.data);
			if (temp.rightNode != null) {
				stack.push(temp.rightNode);
			}
			if (temp.leftNode != null) {
				stack.push(temp.leftNode);
			}

		}
		return res;

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.leftNode;
			}
			curr = stack.pop();
			res.add(curr.data);
			curr = curr.rightNode;
		}
		return res;
	}

}
