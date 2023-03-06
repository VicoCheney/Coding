import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Xinghuan_20230228_1 {
    public static void main(String[] args) {
        String pre = "123";
        String mid = "213";

        System.out.println(postResult(pre, mid));
    }
    public static String postResult(String preResult, String midResult) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i =0; i < midResult.length(); i++) {
            map.put(midResult.charAt(i), i);
        }
        Bole_20230216_2.TreeNode root = build(preResult, midResult, map, 0, preResult.length() - 1, 0, midResult.length() - 1);
        ArrayList<Character> characters = new ArrayList<>();
        String res = "";
        for (Character c : characters) {
            res += c;
        }
        return res;
    }

    public static Bole_20230216_2.TreeNode build(String preResult, String midResult, HashMap<Character, Integer> map, int pre_start, int pre_end, int mid_start, int mid_end) {
        if (mid_start > mid_end) {
            return null;
        }
        Character root_val = preResult.charAt(pre_start);
        Bole_20230216_2.TreeNode root = new Bole_20230216_2.TreeNode(Integer.valueOf(root_val));
        int root_index = map.get(root_val);
        root.left = build(preResult, midResult, map, pre_start + 1, pre_start + root_index, mid_start, root_index - 1);
        root.right = build(preResult, midResult, map, pre_start + root_index + 1, pre_end, root_index + 1, mid_end);
        return root;
    }

    public static void readTree(Bole_20230216_2.TreeNode root, ArrayList<Character> characters) {
        readTree(root.left, characters);
        readTree(root.right, characters);
        characters.add((char) root.val);
    }

}
