package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0106_buildTree;

public class Lc_0106_test{

    Lc_0106_buildTree lc_0106 = new Lc_0106_buildTree();

    @Test
    void testcase1(){
        int[] inorder = new int[] {9, 3, 15, 20, 7};
        int[] postorder = new int[] {9, 15, 7, 20, 3};
        TreeNode gold_ans = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode ans = lc_0106.buildTree(inorder, postorder);
        assertEquals(ans, gold_ans);
    }
    
    @Test
    void testcase2(){
        int[] inorder = new int[] {-1};
        int[] postorder = new int[] {-1};
        TreeNode gold_ans = new TreeNode(-1);
        TreeNode ans = lc_0106.buildTree(inorder, postorder);
        assertEquals(ans, gold_ans);
    }
}
