package src.main.java;
import java.util.List;
import java.util.ArrayList;

public class Lc_0102_levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrderHelper(root, ans, 0);
        return ans;
    }

    private void levelOrderHelper(TreeNode node, List<List<Integer>> ans, int level) {
        if(node == null){
            return;
        }
        level++;
        int maxLevel = ans.size();
        if(maxLevel < level) {
            ans.add(new ArrayList<Integer>());
        }
        ans.get(level - 1).add(node.val);
        levelOrderHelper(node.left, ans, level);
        levelOrderHelper(node.right, ans, level);
    }
}