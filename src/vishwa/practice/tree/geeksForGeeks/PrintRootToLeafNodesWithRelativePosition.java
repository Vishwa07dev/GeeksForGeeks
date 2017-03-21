package vishwa.practice.tree.geeksForGeeks;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author vmohan
 *
 */
public class PrintRootToLeafNodesWithRelativePosition {
	
	
public void printRelativePosition(TreeNode root , int vd ,TreeNode[] nodes , int index){
		
		if(root ==null){
			return ;
		}
		root.setVd(vd);
		nodes[index++]=root ;
		if(root.getLeft()==null && root.getRight()==null){
			//We have reached the lef node
			List<String> list = new ArrayList<>();
			int minVd =Integer.MAX_VALUE;
			for(int i=0;i<index ;i++){
				if(nodes[i].getVd() < minVd){
					minVd = nodes[i].getVd();
				}
			}
			
			for(int i=0;i<index ;i++){
				
				int count = nodes[i].getVd()-minVd;
				String ptr ="" ;
				if(count>=0){
					 while(count!=0){
						 ptr += "_" ;
						 count -- ;
					 }
					 list.add(ptr+nodes[i].getData());
				}else{
					count = -count ;
					while(count!=0){
						 ptr += "_" ;
						 count -- ;
					 }
					 list.add(nodes[i].getData()+ptr);
				}

			}
			for(String str: list){
				System.out.println(str);
			}
			System.out.println("############");
			
			
		}
		
		printRelativePosition( root.getLeft() , vd-1 , nodes , index);
		printRelativePosition( root.getRight() , vd+1 , nodes , index);
		
	}
	
	public static void main(String [] args){

		/**
		 *         1
		 *      2    3
		 *    4    5
		 *    
		 *     1
		 *   2  
		 *     5
		 *     
		 *     1
		 *   2   
		 * 4
		 *     1
		 *       3
		 */  
		TreeNode root = new TreeNode(1);
		TreeNode left1 = new TreeNode(2);
		TreeNode right1 = new TreeNode(3);
		
		root.setLeft(left1);
		root.setRight(right1);
		
		TreeNode left2 = new TreeNode(4);
		TreeNode right2 = new TreeNode(5);
		
		root.getLeft().setLeft(left2);
		root.getLeft().setRight(right2);
		
		PrintRootToLeafNodesWithRelativePosition p = new PrintRootToLeafNodesWithRelativePosition();
		
		TreeNode[] arr = new TreeNode[5];
		
		p.printRelativePosition(root, 0, arr, 0);
	}
	
	
	

}

class TreeNode {
	private int data ;
	private int vd ;
	private TreeNode left ;
	private TreeNode right ;
	
	public TreeNode(int data) {
		super();
		this.data = data;
	}
	
    public TreeNode(){
    	
    }

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getVd() {
		return vd;
	}

	public void setVd(int vd) {
		this.vd = vd;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
    
    
}
