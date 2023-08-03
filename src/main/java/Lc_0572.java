package src.main.java;
import java.util.List;
import java.util.ArrayList;

public class Lc_0572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        List<List<TreeNode>> levels = levelOrderTraverse(root);
        for(int i = levels.size() - 1; i >= 0; i--) {
            for(TreeNode node : levels.get(i)) {
                if(compare(node, subRoot)) return true;
            }
        }
        return false;
    }

    private List<List<TreeNode>> levelOrderTraverse(TreeNode root) {
        List<List<TreeNode>> levels = new ArrayList<>();
        levelOrderTraverseHelper(root, 0, levels);
        return levels;
    }

    private void levelOrderTraverseHelper(TreeNode node, int level, List<List<TreeNode>> levels) {
        if(node == null) return;
        level++;
        int maxLevel = levels.size();
        if(maxLevel < level) {
            levels.add(new ArrayList<TreeNode>());
        }
        levels.get(level - 1).add(node);
        levelOrderTraverseHelper(node.left, level, levels);
        levelOrderTraverseHelper(node.right, level, levels);
    }

    private boolean compare(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) return true;
        else if(node1 == null && node2 != null) return false;
        else if(node1 != null && node2 == null) return false;
        else if(node1.val != node2.val) return false;

        boolean leftEqual = compare(node1.left, node2.left);
        boolean rightEqual = compare(node1.right, node2.right);
        return leftEqual && rightEqual;
    }
}
