package src.main.java;

public class Lc_0112_hasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumHelper(root, targetSum, 0);
    }

    private boolean hasPathSumHelper(TreeNode root, int targetSum, int currSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) {
            return currSum + root.val == targetSum;
        }
        boolean hasTargetLeft = hasPathSumHelper(root.left, targetSum, currSum + root.val);
        boolean hasTargetRight = hasPathSumHelper(root.right, targetSum, currSum + root.val);
        return hasTargetLeft || hasTargetRight;
    }
}