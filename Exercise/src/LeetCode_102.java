import java.util.*;

public class LeetCode_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int nodes = 1;
        while (true) {
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < nodes; i++) {
                TreeNode poll = queue.poll();
                if (poll != null) {
                    integers.add(poll.val);
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
            }
            if (integers.size() == 0) {
                break;
            }
            res.add(integers);
            nodes = queue.size();
        }
        return res;
    }
}
