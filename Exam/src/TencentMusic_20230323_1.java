import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TencentMusic_20230323_1 {
    public TreeNode fun (TreeNode root) {
        // write code here
        Queue<TreeNode> queue = new ArrayDeque<>();
        int count = count(root);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            list.add(i);
        }
        root.val = count;
        count--;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    poll.left.val = count;
                    count--;
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    poll.right.val = count;
                    count--;
                    queue.add(poll.right);
                }
            }
        }
        return root;
    }

    public int count(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int c = 1;
            if (root.left != null) {
                c += count(root.left);
            }
            if (root.right != null) {
                c += count(root.right);
            }
            return c;
        }
    }
}
