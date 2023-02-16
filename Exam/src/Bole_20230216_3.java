public class Bole_20230216_3 {
    public int[] mergeSort (int[] nums, int k) {
        // write code here
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int[] ints = new int[nums.length];
        guibingSort(nums, 0, nums.length - 1, ints, k);
        return nums;
    }

    private void guibingSort(int[] nums, int left, int right, int[] ints, int k) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        if (mid - left + 1 <= k) {
            insertSort(nums, left, mid);
        } else {
            guibingSort(nums, left, mid, ints, k);
        }
        if (right - mid <= k) {
            insertSort(nums, mid + 1, right);
        } else {
            guibingSort(nums, mid + 1, right, ints, k);
        }
        merge(nums, left, mid, right, ints);
    }

    private void merge(int[] nums, int left, int mid, int right, int[] ints) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (nums[i] >= nums[j]) {
                ints[k] = nums[i];
                k++;
                i++;
            } else {
                ints[k] = nums[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            ints[k] = nums[i];
            k++;
            i++;
        }
        while (j <= right) {
            ints[k] = nums[j];
            k++;
            j++;
        }
        for (int x = left; x <= right; x++) {
            nums[x] = ints[x];
        }
    }

    private void insertSort(int[] nums, int left, int mid) {
        int len = mid - left + 1;
        if (len <= 1) {
            return;
        }
        for (int i = 1; i < len; i++) {
            int temp = nums[left + i];
            int j = i - 1;
            while (j >= 0 && nums[left + j] < temp) {
                nums[left + j + 1] = nums[left + j];
                j--;
            }
            nums[left + j + 1] = temp;
        }
    }
}
