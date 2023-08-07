package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0222_countNodes;

public class Lc_0222_test {
    
    Lc_0222_countNodes lc_0222 = new Lc_0222_countNodes();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        int ans = lc_0222.countNodes(root);
        assertEquals(ans, 6);
    }
    
    @Test
    void testcase2(){
        TreeNode root = null;
        int ans = lc_0222.countNodes(root);
        assertEquals(ans, 0);
    }

    @Test
    void testcase3(){
        TreeNode root = new TreeNode(1);
        int ans = lc_0222.countNodes(root);
        assertEquals(ans, 1);
    }
}
