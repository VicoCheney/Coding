import java.util.ArrayList;
import java.util.List;

public class LeetCode_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        find(root, res);
        return res;
    }

    private static void find(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        find(root.left, res);
        res.add(root.val);
        find(root.right, res);
    }
}
