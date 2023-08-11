package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0257_binaryTreePaths;
import java.util.List;
import java.util.ArrayList;


public class Lc_0257_test{

    Lc_0257_binaryTreePaths lc_0257 = new Lc_0257_binaryTreePaths();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        List<String> ans = lc_0257.binaryTreePaths(root);
        List<String> gold_ans = new ArrayList<>();
        gold_ans.add("1->2->5");
        gold_ans.add("1->3");
        assertEquals(ans, gold_ans);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(1);
        List<String> ans = lc_0257.binaryTreePaths(root);
        List<String> gold_ans = new ArrayList<>();
        gold_ans.add("1");
        assertEquals(ans, gold_ans);
    }
}
