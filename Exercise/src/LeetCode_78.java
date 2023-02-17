import java.util.*;

public class LeetCode_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        recursion(res, stack, 0, nums);
        return res;
    }

    private static void recursion(List<List<Integer>> res, Stack<Integer> stack, int i, int[] nums) {
        res.add(new ArrayList<>(stack));
        for (int j = i; j < nums.length; j++) {
            stack.push(nums[j]);
            recursion(res, stack, j + 1, nums);
            stack.pop();
        }
    }
}
