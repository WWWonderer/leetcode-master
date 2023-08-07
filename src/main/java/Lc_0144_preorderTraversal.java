package src.main.java;
import java.util.List;
import java.util.ArrayList;

public class Lc_0144_preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderTraversalHelper(root, ans);
        return ans;
    }

    private void preorderTraversalHelper(TreeNode node, List<Integer> ans) {
        if(node == null){
            return;
        }
        ans.add(node.val);
        preorderTraversalHelper(node.left, ans);
        preorderTraversalHelper(node.right, ans);
    }
}