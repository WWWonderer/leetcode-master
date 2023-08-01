package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0102;
import java.util.List;
import java.util.ArrayList;


public class Lc_0102_test{

    Lc_0102 lc_0102 = new Lc_0102();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> ans = lc_0102.levelOrder(root);
        List<List<Integer>> gold_ans = new ArrayList<>();
        gold_ans.add(new ArrayList<Integer>(){{add(3);}});
        gold_ans.add(new ArrayList<Integer>(){{add(9); add(20);}});
        gold_ans.add(new ArrayList<Integer>(){{add(15); add(7);}});
        assertEquals(ans, gold_ans);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(1);
        List<List<Integer>> ans = lc_0102.levelOrder(root);
        List<List<Integer>> gold_ans = new ArrayList<>();
        gold_ans.add(new ArrayList<Integer>(){{add(1);}});
        assertEquals(ans, gold_ans);
    }

    @Test
    void testcase3(){
        TreeNode root = null;
        List<List<Integer>> ans = lc_0102.levelOrder(root);
        List<List<Integer>> gold_ans = new ArrayList<>();
        assertEquals(ans, gold_ans);
    }
}
