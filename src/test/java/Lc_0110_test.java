package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0110_isHeightBalanced;

public class Lc_0110_test{

    Lc_0110_isHeightBalanced lc_0110 = new Lc_0110_isHeightBalanced();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        boolean ans = lc_0110.isBalanced(root);
        assertEquals(ans, true);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        boolean ans = lc_0110.isBalanced(root);
        assertEquals(ans, false);
    }

    @Test
    void testcase3(){
        TreeNode root = null;
        boolean ans = lc_0110.isBalanced(root);
        assertEquals(ans, true);
    }
}
