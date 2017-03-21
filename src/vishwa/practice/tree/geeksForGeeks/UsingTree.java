package vishwa.practice.tree.geeksForGeeks;

import vishwa.practice.tree.Tree;
import vishwa.practice.tree.TreeNode;

public class UsingTree {
	
	public static void main(String[] args){
		
		
		//Cooking data
        TreeNode root = new TreeNode(1);
		
		TreeNode left1 = new TreeNode(2);
		TreeNode right1 = new TreeNode(3);
		
		root.setLeft(left1);
		root.setRight(right1);
		
		TreeNode left2 = new TreeNode(4);
		TreeNode right2 = new TreeNode(5);
		
		root.getLeft().setLeft(left2);
		root.getLeft().setRight(right2);
		
		//t.setRoot(root);
		
		//Printing all the nodes
		PrintAllRootToLeafNodes printAllRootToLeafNodes = new PrintAllRootToLeafNodes();
		//printAllRootToLeafNodes.printRootToLeaf(root, "");
		
		Tree t = new Tree(); 
		t.setRoot(root);
		t.printRootToLeaf("");
		
	}

}
