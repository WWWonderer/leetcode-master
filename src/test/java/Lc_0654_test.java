package src.test.java;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import src.main.java.Lc_0654_constructMaximumBinaryTree;
import src.main.java.TreeNode;

public class Lc_0654_test {
    Lc_0654_constructMaximumBinaryTree lc_0654 = new Lc_0654_constructMaximumBinaryTree();

    @Test
    void testcase1(){
        int[] input = new int[] {3, 2, 1, 6, 0, 5};
        TreeNode gold_ans = new TreeNode(6, new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1))), new TreeNode(5, new TreeNode(0), null));
        TreeNode ans = lc_0654.constructMaximumBinaryTree(input);
        assertEquals(ans, gold_ans);
    }
    
    @Test
    void testcase2(){
        int[] input = new int[] {3, 2, 1};
        TreeNode gold_ans = new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1)));
        TreeNode ans = lc_0654.constructMaximumBinaryTree(input);
        assertEquals(ans, gold_ans);
    }
}
