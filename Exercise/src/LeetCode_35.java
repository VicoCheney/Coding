public class LeetCode_35 {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int target, int low, int high) {
        if (high == low) {
            if (nums[low] >= target) {
                return low;
            } else {
                return low + 1;
            }
        }
        if (high - low == 1) {
            if (nums[low] >= target) {
                return low;
            } else if (nums[high] >= target){
                return high;
            } else {
                return high + 1;
            }
        }
        int middle = (low + high) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            return binarySearch(nums, target, low, middle);
        } else {
            return binarySearch(nums, target, middle, high);
        }
    }
}
