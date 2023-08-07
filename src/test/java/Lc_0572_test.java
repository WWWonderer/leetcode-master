package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.TreeNode;
import src.main.java.Lc_0572_isSubTree;

public class Lc_0572_test{

    Lc_0572_isSubTree lc_0572 = new Lc_0572_isSubTree();

    @Test
    void testcase1(){
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        boolean ans = lc_0572.isSubtree(root, subRoot);
        assertEquals(ans, true);
    }
    
    @Test
    void testcase2(){
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0), null)), new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        boolean ans = lc_0572.isSubtree(root, subRoot);
        assertEquals(ans, false);
    }
}
