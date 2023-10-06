package src.main.java;

public class Lc_0617_mergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode mergedTree;
        // stop condition 
        if(root1 == null && root2 == null) {
            return null;
        }
        else if(root1 == null) {
            return root2;
        }
        else if(root2 == null) {
            return root1;
        }
        else {
            mergedTree = new TreeNode(root1.val + root2.val);
        }
        //traversal
        mergedTree.left = mergeTrees(root1.left, root2.left);
        mergedTree.right = mergeTrees(root1.right, root2.right);
        return mergedTree;
    }
}
