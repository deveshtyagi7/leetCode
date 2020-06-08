package symmetricTree;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        else{
            return checkIsSymmentric(root.left , root.right);
        }
        
    }
    public boolean checkIsSymmentric(TreeNode left ,TreeNode right){
        if(left ==  null || right == null){
            return left == right;
        }
        if(left.val != right.val){
            return false;
        }
        else return checkIsSymmentric(left.left , right.right) && checkIsSymmentric(left.right , right.left);
    }
}
