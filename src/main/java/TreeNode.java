package src.main.java;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    @Override
    public boolean equals(Object otherTreeNode) {
        if(otherTreeNode == this) return true;
        if(otherTreeNode == null || this == null) return false;
        if(otherTreeNode.getClass() != this.getClass()) return false;
        final TreeNode other = (TreeNode) otherTreeNode;
        boolean leftEq = true;
        boolean rightEq = true;
        if(this.left != null) {
            leftEq = this.left.equals(other.left);
        }
        if(this.right != null) {
            rightEq = this.right.equals(other.right);
        }
        return (this.val == other.val) && leftEq && rightEq;
    } 
}
