package src.main.java;

public class Lc_0111_minDepth {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        // post-order traversal
        int leftDepth = minDepth(root.left);   // left
        int rightDepth = minDepth(root.right); // right
                                               // mid
        if(root.left == null && root.right != null) {
            return 1 + rightDepth;
        }
        if(root.left != null && root.right == null) {
            return 1 + leftDepth; 
        }
        return 1 + Math.min(leftDepth, rightDepth);
    }
}
