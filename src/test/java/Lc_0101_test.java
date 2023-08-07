package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0101_isSymmetric;

public class Lc_0101_test{

    Lc_0101_isSymmetric lc_0101 = new Lc_0101_isSymmetric();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        boolean ans = lc_0101.isSymmetric(root);
        assertEquals(ans, true);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));
        boolean ans = lc_0101.isSymmetric(root);
        assertEquals(ans, false);
    }
}
