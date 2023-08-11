package src.main.java;
import java.util.List;
import java.util.ArrayList;

public class Lc_0257_binaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if(root != null) {
            binaryTreePathsHelper(root, sb, ans);
        }
        return ans;
    }

    private void binaryTreePathsHelper(TreeNode root, StringBuilder sb, List<String> ans) {
        if(sb.isEmpty()) {
            sb.append("" + root.val);
        }
        else {
            sb.append("->" + root.val);
        }
        //is leaf
        if(root.left == null && root.right == null) {
            ans.add(sb.toString());
            return;
        }
        if(root.left != null) {
            binaryTreePathsHelper(root.left, sb, ans);
            recurse(sb);
        }
        if(root.right != null) {
            binaryTreePathsHelper(root.right, sb, ans);
            recurse(sb);
        }
    }

    private void recurse(StringBuilder sb) {
        String target = "->";
        int lastIndex = sb.lastIndexOf(target, sb.length());
        sb.delete(lastIndex, sb.length());
    }

}
