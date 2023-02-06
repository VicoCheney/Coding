public class LeetCode_33 {
    public int search(int[] nums, int target) {
        if (target == nums[0]) {
            return 0;
        } else if (target > nums[0]) {
            int i = 0;
            while (i < nums.length && nums[i] < target) {
                i++;
            }
            if (i < nums.length && nums[i] == target) {
                return i;
            }
        } else {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] > target) {
                j--;
            }
            if (j >= 0 && nums[j] == target) {
                return j;
            }
        }
        return -1;
    }
}
