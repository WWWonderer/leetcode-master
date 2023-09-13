package src.main.java;

public class Lc_0106_buildTree {
       // inorder: left, middle, right 
    // postorder: left, right, middle
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return builderTreeHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode builderTreeHelper(int[] inorder, int startIdxInorder, int endIdxInorder, int[] postorder, int startIdxPostorder, int endIdxPostorder) {

        if(endIdxInorder < startIdxInorder) return null;
        if(endIdxInorder == startIdxInorder) return new TreeNode(inorder[endIdxInorder]);

        int middle = postorder[endIdxPostorder];

        TreeNode construct = new TreeNode(middle);

        int middleIdx = startIdxInorder;
        while(middleIdx <= endIdxInorder) {
            if(middle == inorder[middleIdx]) break;
            middleIdx++;
        }

        int startIdxInorderL = startIdxInorder;
        int endIdxInorderL = middleIdx - 1;
        int startIdxInorderR = middleIdx + 1;
        int endIdxInorderR = endIdxInorder;

        int startIdxPostorderL = startIdxPostorder;
        int endIdxPostorderL = middleIdx - startIdxInorder + startIdxPostorder - 1;
        int startIdxPostorderR = middleIdx - startIdxInorder + startIdxPostorder;
        int endIdxPostorderR = endIdxPostorder - 1;

        construct.left = builderTreeHelper(inorder, startIdxInorderL, endIdxInorderL, postorder, startIdxPostorderL, endIdxPostorderL);
        construct.right = builderTreeHelper(inorder, startIdxInorderR, endIdxInorderR, postorder, startIdxPostorderR, endIdxPostorderR);

        return construct;
    }
}
