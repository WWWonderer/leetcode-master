package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0226_invertTree;


public class Lc_0226_test{

    Lc_0226_invertTree lc_0226 = new Lc_0226_invertTree();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode ans = lc_0226.invertTree(root);
        TreeNode gold_ans = new TreeNode(4, new TreeNode(7, new TreeNode(9), new TreeNode(6)), new TreeNode(2, new TreeNode(3), new TreeNode(1)));
        assertEquals(ans, gold_ans);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode ans = lc_0226.invertTree(root);
        TreeNode gold_ans = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        assertEquals(ans, gold_ans);
    }

    @Test
    void testcase3(){
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode ans = lc_0226.invertTree(root);
        TreeNode gold_ans = new TreeNode(4, new TreeNode(7, new TreeNode(9), new TreeNode(6)), new TreeNode(2, new TreeNode(3), new TreeNode(1)));
        assertEquals(ans, gold_ans);
    }
}
