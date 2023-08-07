package src.main.java;

public class Lc_0104_maxDepth {
    public int maxDepth(TreeNode root) {
        // base case
        if(root == null) return 0;

        //inductive hypothesis
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        //inductive step
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
