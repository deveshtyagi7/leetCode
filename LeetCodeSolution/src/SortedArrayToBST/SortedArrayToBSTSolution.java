package SortedArrayToBST;

public class SortedArrayToBSTSolution {
	  public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums.length == 0) return null;
	        return createTree(nums , 0, nums.length-1);
	        
	    }
	    
	    private TreeNode createTree(int[] nums, int start, int end){
	        if(start> end) return null;
	        
	        int mid = (start+ end)/2;
	        
	        TreeNode temp = new TreeNode(nums[mid]);
	        temp.left = createTree(nums,start,mid-1);
	        temp.right = createTree(nums,mid+1,end);
	        return temp;
	        
	    }
}
