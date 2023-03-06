import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bole_20230216_2 {
    public int[] printResult (int[] arr) {
        // write code here
        if (arr == null || arr.length == 0) {
            return null;
        }
        TreeNode root = rebuildTree(arr, 0, arr.length - 1);
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return null;
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()) {
            TreeNode newNode = treeNodes.poll();
            res.add(newNode.val);
            if (newNode.left != null) {
                treeNodes.offer(newNode.left);
            }
            if (newNode.right != null) {
                treeNodes.offer(newNode.right);
            }
        }
        int[] ints = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ints[i] = res.get(i);
        }
        return ints;
    }

    private TreeNode rebuildTree(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int root_v = arr[end];
        TreeNode root = new TreeNode(root_v);
        int i = start;
        while (i < end && arr[i] < root_v) {
            i += 1;
        }
        root.left = rebuildTree(arr, start, i - 1);
        root.right = rebuildTree(arr, i, end - 1);
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value) {
            val = value;
        }
    }
}
