package src.main.java;

public class Lc_0101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) return true;
        else if(node1 == null && node2 != null) return false;
        else if(node1 != null && node2 == null) return false;
        else if(node1.val != node2.val) return false;

        boolean outerequal = compare(node1.left, node2.right);
        boolean innerequal = compare(node1.right, node2.left);
        return outerequal && innerequal;
    }
}
