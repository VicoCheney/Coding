import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ins = new ArrayList<>();
        for (int i:nums) {
            ins.add(i);
        }
        recursion(ins, res, 0);
        return res;
    }

    private static void recursion(List<Integer> ins, List<List<Integer>> res, int start) {
        if (start == ins.size() - 1) {
            res.add(new ArrayList<>(ins));
        }
        for (int i = start; i < ins.size(); i++) {
            swap(start, i, ins);
            recursion(ins, res, start + 1);
            swap(start, i, ins);
        }
    }

    private static void swap(int i, int j, List<Integer> ins) {
        int temp = ins.get(i);
        ins.set(i, ins.get(j));
        ins.set(j, temp);
    }
}
