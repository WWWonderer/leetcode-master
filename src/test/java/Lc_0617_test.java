package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0617_mergeTrees;

public class Lc_0617_test{

    Lc_0617_mergeTrees lc_0617 = new Lc_0617_mergeTrees();

    @Test
    void testcase1(){
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode gold_ans = new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7)));
        TreeNode ans = lc_0617.mergeTrees(root1, root2);
        assertEquals(ans, gold_ans);
    }
}
