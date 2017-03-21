package vishwa.practice.tree.geeksForGeeks;

import vishwa.practice.tree.TreeNode;

public class PrintAllRootToLeafNodes {
	
	public void printRootToLeaf(TreeNode root , String path){
		if(root ==null){
			return ;
		}
		path = path + " " +root.getData();
		if(root.getLeft()==null && root.getRight()==null){
			System.out.println(path);
		}
		printRootToLeaf(root.getLeft(), path);
		printRootToLeaf(root.getRight(), path);
	}
	
	public void printRootToLeaf2(TreeNode root , int[] arr , int start){
		if(root ==null){
			return ;
		}
		arr[start++] = root.getData();
		if(root.getLeft()==null && root.getRight()==null){
			//It's the leaf node , so print the root to leaf
			//System.out.println(arr +"  "+start);
			for(int i =0 ;i<start;i++ ){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		printRootToLeaf2(root.getLeft(), arr, start);
		printRootToLeaf2(root.getRight(), arr, start);
		
	}
	
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		
		TreeNode left1 = new TreeNode(2);
		TreeNode right1 = new TreeNode(3);
		
		root.setLeft(left1);
		root.setRight(right1);
		
		TreeNode left2 = new TreeNode(4);
		TreeNode right2 = new TreeNode(5);
		
		root.getLeft().setLeft(left2);
		root.getLeft().setRight(right2);
		
		PrintAllRootToLeafNodes p = new PrintAllRootToLeafNodes();
		p.printRootToLeaf(root, "");
		
		
		int[] arr = new int[5];
		p.printRootToLeaf2(root, arr, 0);
		
	}

}
