package src.main.java;

public class Lc_0404_sumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || root.left == null && root.right == null) return 0;
        return sumOfLeftLeavesHelper(root, false, 0);
    }

    private int sumOfLeftLeavesHelper(TreeNode root, boolean left, int sum) {
        if(root.left == null && root.right == null) {
            return left ? root.val + sum : sum;
        }
        int ans = sum;
        if(root.left != null) {
            ans += sumOfLeftLeavesHelper(root.left, true, sum);
        }
        if(root.right != null) {
            ans += sumOfLeftLeavesHelper(root.right, false, sum);
        }
        return ans;
    }
}
