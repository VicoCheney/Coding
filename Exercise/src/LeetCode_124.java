public class LeetCode_124 {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return max;
    }

    public int maxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(maxPath(root.left), 0);
        int right = Math.max(maxPath(root.right), 0);
        int sum = root.val + left + right;
        max = Math.max(max, sum);
        return Math.max(left, right) + root.val;
    }
}
