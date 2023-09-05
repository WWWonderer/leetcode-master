package src.test.java;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import src.main.java.Lc_0404_sumOfLeftLeaves;
import src.main.java.TreeNode;

public class Lc_0404_test {
    Lc_0404_sumOfLeftLeaves lc_0404 = new Lc_0404_sumOfLeftLeaves();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int ans = lc_0404.sumOfLeftLeaves(root);
        assertEquals(ans, 24);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(1);
        int ans = lc_0404.sumOfLeftLeaves(root);
        assertEquals(ans, 0);
    }
}
