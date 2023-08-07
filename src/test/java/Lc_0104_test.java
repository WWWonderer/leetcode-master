package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0104_maxDepth;

public class Lc_0104_test{

    Lc_0104_maxDepth lc_0104 = new Lc_0104_maxDepth();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int ans = lc_0104.maxDepth(root);
        assertEquals(ans, 3);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        int ans = lc_0104.maxDepth(root);
        assertEquals(ans, 2);
    }
}
