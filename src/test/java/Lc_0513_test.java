package src.test.java;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import src.main.java.Lc_0513_findBottomLeftValue;
import src.main.java.TreeNode;

public class Lc_0513_test {
    Lc_0513_findBottomLeftValue lc_0513 = new Lc_0513_findBottomLeftValue();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        int ans = lc_0513.findBottomLeftValue(root);
        assertEquals(ans, 1);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, new TreeNode(5, new TreeNode(7), null), new TreeNode(6)));
        int ans = lc_0513.findBottomLeftValue(root);
        assertEquals(ans, 7);
    }
}
