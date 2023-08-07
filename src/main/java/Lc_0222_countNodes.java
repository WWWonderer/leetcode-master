package src.main.java;

public class Lc_0222_countNodes {
    // this can be applied to any tree, but is not the optimal solution for complete trees
    // public int countNodes(TreeNode root) {
    //     if(root == null) return 0;

    //     int numNodesLeft = countNodes(root.left);
    //     int numNodesRight = countNodes(root.right);

    //     return numNodesLeft + numNodesRight + 1;
    // }

    // for a perfect binary tree, number of nodes is 2^{depth} - 1, where root depth is 1
    // complete binary trees contain perfect binary subtrees
    // a leaf is a perfect binary tree
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        // optimization happens here: if we found a perfect binary tree, apply formula instead of doing recursion
        int leftDepth = -1, rightDepth = -1;
        TreeNode left = root, right = root;
        while(left != null) {
            leftDepth++;
            left = left.left;
        }  
        while(right != null) {
            rightDepth++;
            right = right.right;
        }
        if(leftDepth == rightDepth) {
            return (2 << leftDepth) - 1;
        } 
        
        int numNodesLeft = countNodes(root.left);
        int numNodesRight = countNodes(root.right);
        return numNodesLeft + numNodesRight + 1;
    }
}