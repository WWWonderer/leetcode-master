package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0144;
import java.util.List;
import java.util.ArrayList;


public class Lc_0144_test{

    Lc_0144 lc_0144 = new Lc_0144();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> ans = lc_0144.preorderTraversal(root);
        assertEquals(ans, new ArrayList<Integer>(){{add(1); add(2); add(3);}});
    }
    
    @Test
    void testcase2(){
        TreeNode root = null;
        List<Integer> ans = lc_0144.preorderTraversal(root);
        assertEquals(ans, new ArrayList<Integer>());
    }

    @Test
    void testcase3(){
        TreeNode root = new TreeNode(1);
        List<Integer> ans = lc_0144.preorderTraversal(root);
        assertEquals(ans, new ArrayList<Integer>(){{add(1);}});
    }
}
