package vishwa.practice.tree.geeksForGeeks;

import vishwa.practice.tree.TreeNode;
/**
 * 
 * @author vmohan
 *
 */
public class DiameterOfTree {
	
	//Find the depth of the tree
	public int depth(TreeNode root){
		if(root ==null){
			return 0 ;
		}
		return Math.max(depth(root.getLeft()), depth(root.getRight())) +1;
	}
	/**
	 * 
	 * @param root
	 * @return
	 */
	public int diameter(TreeNode root){
		if(root ==null){
			return 0;
		}
		
		int leftDepth = depth(root.getLeft()) ;
		int rightdepth = depth(root.getRight()) ;
		int diameter = leftDepth + rightdepth +1 ;
		
		int leftDia = diameter(root.getLeft());
		int rightDia = diameter(root.getRight());
		
		return max(diameter,leftDia,rightDia);
		
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int max(int a , int b , int c){
		return Math.max(Math.max(a,b), c);
	}
	
	
	public static void main(String args[]){
		
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(4));
		root.setRight(new TreeNode(2));
		root.getRight().setRight(new TreeNode(3));
		
		root.getLeft().setLeft(new TreeNode(10));
		root.getLeft().setRight(new TreeNode(5));
		root.getLeft().getLeft().setLeft(new TreeNode(11));
		root.getLeft().getLeft().setRight(new TreeNode(12));
		root.getLeft().getLeft().getRight().setLeft(new TreeNode(13));
		root.getLeft().getLeft().getRight().getLeft().setLeft(new TreeNode(14));
		root.getLeft().getLeft().getRight().getLeft().setRight(new TreeNode(15));
		
		root.getLeft().getRight().setRight(new TreeNode(6));
		root.getLeft().getRight().getRight().setLeft(new TreeNode(7));
		root.getLeft().getRight().getRight().setRight(new TreeNode(8));
		root.getLeft().getRight().getRight().getRight().setRight(new TreeNode(9));
		
		DiameterOfTree diameterOfTree = new DiameterOfTree();
		
		
		System.out.println("depth : " +diameterOfTree.depth(root));
		System.out.println("diameter : " + diameterOfTree.diameter(root) );
		
		PrintAllRootToLeafNodes printAllRootToLeafNodes = new PrintAllRootToLeafNodes();
		printAllRootToLeafNodes.printRootToLeaf(root, "");
		
		
	}

}
