public class LeetCode_34 {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        boolean ii = false;
        boolean jj = false;
        while (i <= j && !(ii && jj)) {
            if (!ii) {
                if (nums[i] == target) {
                    ii = true;
                } else {
                    i++;
                }
            }
            if (!jj) {
                if (nums[j] == target) {
                    jj = true;
                } else {
                    j--;
                }
            }
        }
        if (ii && jj) {
            return new int[]{i, j};
        } else {
            return new int[]{-1, -1};
        }
    }
}
