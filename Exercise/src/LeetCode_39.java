import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        recursion(deque, target, candidates, 0, res);
        return res;
    }

    public static void recursion(Deque<Integer> deque, int target, int[] candidates, int start, List<List<Integer>> res) {

        if (target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<>(deque));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            deque.add(candidates[i]);
            recursion(deque, target - candidates[i], candidates, i, res);
            deque.removeLast();
        }
    }
}
