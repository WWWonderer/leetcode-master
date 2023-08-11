package src.main.java;

public class Lc_0110_isHeightBalanced {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        //add a flag (-1) to signify the presence of non-balanced tree
        if(leftDepth == -1 || rightDepth == -1) return -1;
        if(Math.abs(leftDepth - rightDepth) > 1) return -1;
        return 1 + Math.max(getDepth(root.left),  getDepth(root.right));
    }
}
