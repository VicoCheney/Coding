import java.util.HashMap;

public class LeetCode_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, len - 1, 0, len - 1, map);
    }

    public TreeNode build(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right, HashMap<Integer, Integer> map) {
        if (inorder_left > inorder_right) {
            return null;
        }
        int root_val = preorder[preorder_left];
        TreeNode root = new TreeNode(root_val);
        int inorder_root_index = map.get(root_val);
        root.left = build(preorder, inorder, preorder_left + 1, preorder_left + inorder_root_index - inorder_left, inorder_left, inorder_root_index - 1, map);
        root.right = build(preorder, inorder, preorder_left + inorder_root_index - inorder_left + 1, preorder_right, inorder_root_index + 1, inorder_right, map);
        return root;
    }
}
