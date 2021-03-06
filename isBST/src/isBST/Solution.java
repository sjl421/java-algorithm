

package isBST;

public class Solution {

	    /*   
	    // the inorder sequence of BST should ascendant.
	    List<Integer> inorder =new ArrayList<Integer>();
	    public boolean isValidBST(TreeNode root) {
	        helper(root);
	        if(inorder==null||inorder.size()==1) return true;
	        for(int i=0;i<inorder.size()-1;i++){
	            if(inorder.get(i)>=inorder.get(i+1)) return false;
	        }
	        return true;
	    }
	    private void helper(TreeNode root){
	        if(root==null) return;
	        helper(root.left);
	        inorder.add(root.val);
	        helper(root.right);
	    }*/
	
	
	    //recursive solution, check each node's value
	    public boolean isValidBST(TreeNode root) {
	        return helper(root, null, null);
	    }

	    boolean helper(TreeNode root, Integer min, Integer max) {
	        if (root == null)
	            return true;
	        if ((min != null && root.val <= min) || (max != null && root.val >= max))
	            return false;
	        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
	    }
	}

