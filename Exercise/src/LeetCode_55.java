public class LeetCode_55 {
    public boolean canJump(int[] nums) {
        boolean[] np = new boolean[nums.length];
        int last_true = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= last_true) {
                np[i] = true;
                last_true = i;
            }
        }
        return np[0];
    }
}
