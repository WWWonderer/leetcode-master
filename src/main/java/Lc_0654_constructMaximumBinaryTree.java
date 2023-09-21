package src.main.java;

public class Lc_0654_constructMaximumBinaryTree {
    private int findMaxIndex(int[] array, int startIdx, int endIdx) {
        int maxIndex = startIdx;
        while(startIdx <= endIdx) {
            if(array[startIdx] > array[maxIndex]) {
                maxIndex = startIdx;
            }
            startIdx++;
        }
        return maxIndex;
    }

    private TreeNode constructMaximumBinaryTreeHelper(int[] nums, int startIdx, int endIdx) {
        // stop condition for recursion 
        if(startIdx > endIdx) return null;

        int maxIdx = findMaxIndex(nums, startIdx, endIdx);
        TreeNode root = new TreeNode(nums[maxIdx]);

        root.left = constructMaximumBinaryTreeHelper(nums, startIdx, maxIdx - 1);
        root.right = constructMaximumBinaryTreeHelper(nums, maxIdx + 1, endIdx);

        return root;
    }


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTreeHelper(nums, 0, nums.length - 1);
    }
}
