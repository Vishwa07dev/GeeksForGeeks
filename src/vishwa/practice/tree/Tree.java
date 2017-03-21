package vishwa.practice.tree;

public class Tree {
    private TreeNode root ;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
    
	public void printRootToLeaf( String path){
		if(root ==null){
			return ;
		}
		path = path + " " +root.getData();
		if(root.getLeft()==null && root.getRight()==null){
			System.out.println(path);
		}
		printRootToLeaf( path);
		printRootToLeaf( path);
	}
    
}
