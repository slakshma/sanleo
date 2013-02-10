import java.util.Stack;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class BinaryTree {

	public TreeNode root;
	
	public BinaryTree() {
		
	}

	public void buildTree(int num) {
		if (root == null) {
			root = new TreeNode();
			root.data = num;
		} else {
			TreeNode temp = root;
			TreeNode parent = null;
			while (temp != null) {
				parent = temp;
				if (num < temp.data) {
					temp = temp.left;
				} else if (num > temp.data) {
					temp = temp.right;
				} else {
					System.out.println("Data exist already");
					break;
				}
			}
			if (temp == null) {
				temp = new TreeNode();
				temp.data = num;
				if (num < parent.data) {
				  parent.left = temp;
				} else {
				  parent.right = temp;
				}
			}
		  }
	   }
     
	public void buildTreeR(int num) {
		if (root == null) {
			root = buildTreeRecursion(root, num);
		} else {
			buildTreeRecursion(root, num);
		}
	}
	
	private TreeNode buildTreeRecursion(TreeNode node, int num) {
		if (node == null) {
			node = new TreeNode();
			node.data = num;
			return node;
		}
		if (num < node.data) {
			node.left = buildTreeRecursion(node.left, num);
		} else if (num > node.data) {
			node.right = buildTreeRecursion(node.right, num);
		}
		return node;
	}
	
	
	
	public void display() {
		inorder(root);
	}
	
	private void inorder(TreeNode node) {
		if (node == null) {
			return;
		}
		
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
		
		
	}
	
	public void displayNonR() {
		TreeNode temp = root;
		BlockingQueue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
		queue.add(temp);
	    int left_height = 0, right_height = 0;
		while (!queue.isEmpty()) {
				temp = queue.poll();
				if (temp != null) {
					System.out.println(temp.data);
				}
			
			    if (temp.left != null) {
				   queue.add(temp.left);
				   left_height++;
			    }
			 
			    if (temp.right != null) {
			    	queue.add(temp.right);
			    	right_height++;
			    }
	        }
			
		  System.out.println("Height of the tree :"+ (left_height > right_height ? left_height : right_height));
		}
	
	public void displayInOrderNonR() {
		TreeNode temp = root;
		
		if (temp == null) return;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(temp);
		
		
	
		while (!stack.isEmpty()) {
			
			   while (temp.left != null) {
				    temp = temp.left;
				  	stack.push(temp);
				  	
			    }
			   
			    while (!stack.isEmpty()) {
				    temp = stack.pop();
				   
					if (temp != null) {
						System.out.println(temp.data);
					} 
					if (temp.right != null) {
				    	temp = temp.right;
				    	stack.push(temp);
				    	
				    	break;
				    } else {
				    	continue;
				    }
			    }
	        }
		
		  
			
		}
	
	public int findHeight(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(findHeight(node.left), findHeight(node.right));
		}
	}
	
	
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		/*
		tree.buildTree(10);
		tree.buildTree(7);
		tree.buildTree(8);
		tree.buildTree(9);
		*/
		
		tree.buildTreeR(10);
		tree.buildTreeR(15);
		tree.buildTreeR(7);
		
		tree.buildTreeR(6);
		/*
		tree.buildTreeR(9);
		tree.buildTreeR(8);
		tree.buildTreeR(11);
		*/
		tree.buildTreeR(13);
		tree.buildTreeR(12);
		
		
		tree.display();
		
		System.out.println("-----");
		tree.displayNonR();
		
		System.out.println("Height of the tree :"+tree.findHeight(tree.root));
		
		//tree.displayInOrderNonR();

	}

}
