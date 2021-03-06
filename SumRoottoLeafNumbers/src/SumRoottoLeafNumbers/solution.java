package SumRoottoLeafNumbers;
import java.util.LinkedList;


public class solution {
	
	public class Solution {
	    /*recursive solution
	    public int sumNumbers(TreeNode root) {
	        if (root == null)
	            return 0;
	        return sumR(root, 0);
	    }
	    public int sumR(TreeNode root, int x) {
	        if (root.right == null && root.left == null)
	            return 10 * x + root.val;
	        int val = 0;
	        if (root.left != null)
	            val += sumR(root.left, 10 * x + root.val);
	        if (root.right != null)
	            val += sumR(root.right, 10 * x + root.val);
	        return val;
	    }*/
	    public int sumNumbers(TreeNode root) {
	    int total = 0;
	    LinkedList<TreeNode> q = new LinkedList<TreeNode>();
	    LinkedList<Integer> sumq = new LinkedList<Integer>();
	    if(root !=null){
	        q.addLast(root);
	        sumq.addLast(root.val);
	    }
	    while(!q.isEmpty()){
	        TreeNode current = q.removeFirst();
	        int partialSum = sumq.removeFirst();
	        if(current.left == null && current.right==null){
	            total+=partialSum;
	        }else{
	            if(current.right !=null){
	                q.addLast(current.right);
	                sumq.addLast(partialSum*10+current.right.val);
	            }
	            if(current.left!=null){
	                q.addLast(current.left);
	                sumq.addLast(partialSum*10+current.left.val);
	            }

	        }

	    }
	    return total;
	}
	}

}
