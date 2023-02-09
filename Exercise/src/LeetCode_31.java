public class LeetCode_31 {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = len - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(i,j,nums);
        }
        reverse(i + 1,nums);
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int start, int[] nums) {
        int i = 0;
        while (start + i < nums.length - i - 1) {
            swap(start + i, nums.length - i - 1, nums);
            i++;
        }
    }
}
