package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0111;

public class Lc_0111_test{

    Lc_0111 lc_0111 = new Lc_0111();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int ans = lc_0111.minDepth(root);
        assertEquals(ans, 2);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        int ans = lc_0111.minDepth(root);
        assertEquals(ans, 5);
    }
}
