package src.main.java;

public class Lc_0513_findBottomLeftValue {

    public int findBottomLeftValue(TreeNode root) {
        int[] ans = {0};
        int[] maxDepth = {-1};
        findBottomLeftValueHelper(root, 0, maxDepth, ans);
        return ans[0];
    }

    public void findBottomLeftValueHelper(TreeNode root, int depth, int[] maxDepth, int[] ans) {
        if(root == null) return;
        findBottomLeftValueHelper(root.left, depth + 1, maxDepth, ans);
        if(depth > maxDepth[0]) {
            maxDepth[0] = depth;
            ans[0] = root.val;
        }
        findBottomLeftValueHelper(root.right, depth + 1, maxDepth, ans);
    }
}