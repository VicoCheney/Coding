public class LeetCode_104 {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 1);
    }

    public int maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth - 1;
        }
        return Math.max(maxDepth(root.left, depth + 1), maxDepth(root.right, depth + 1));
    }
}
