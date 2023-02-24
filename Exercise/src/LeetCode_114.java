public class LeetCode_114 {
    public void flatten(TreeNode root) {
        if (root != null) {
            TreeNode node = recursion(root);
        }
    }

    public TreeNode recursion(TreeNode root){
        if (root.left == null && root.right == null) {
            return root;
        }
        if (root.left == null) {
            return recursion(root.right);
        }
        if (root.right == null) {
            root.right = root.left;
            root.left = null;
            return recursion(root.right);
        }
        TreeNode r = root.right;
        root.right = root.left;
        root.left = null;
        recursion(root.right).right = r;
        return recursion(r);
    }
}
