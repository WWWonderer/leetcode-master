package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0112_hasPathSum;


public class Lc_0112_test {
    Lc_0112_hasPathSum lc_0112 = new Lc_0112_hasPathSum();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        boolean ans = lc_0112.hasPathSum(root, 22);
        assertEquals(ans, true);
    }

    @Test
    void testcase2(){
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        boolean ans = lc_0112.hasPathSum(root, 0);
        assertEquals(ans, false);
    }
}
