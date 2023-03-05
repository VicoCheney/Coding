public class LeetCode_152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tmp_max = 1;
        int tmp_min = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = tmp_max;
                tmp_max = tmp_min;
                tmp_min = tmp;
            }
            tmp_max = Math.max(tmp_max * nums[i], nums[i]);
            tmp_min = Math.min(tmp_min * nums[i], nums[i]);

            max = Math.max(tmp_max, max);
        }
        return max;
    }
}
