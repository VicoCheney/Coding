public class LeetCode_75 {
    public void sortColors(int[] nums) {
        if (nums.length != 0 && nums.length != 1) {
            int[] ints = new int[3];
            ints[0] = -1;
            ints[1] = -1;
            ints[2] = -1;
            ints[nums[0]] = 0;
            int cur;
            int before;
            for (int i = 1; i < nums.length; i++) {
                cur = i;
                before = nums[cur - 1];
                if (before > nums[cur]) {
                    swap(cur, ints[before], nums);
                    cur = ints[before];
                    ints[before] += 1;
                    if (cur != 0) {
                        before = nums[cur - 1];
                        if (before > nums[cur]) {
                            swap(cur, ints[1], nums);
                            cur = ints[1];
                            ints[1] += 1;
                        }
                    }
                }
                if (ints[nums[cur]] == -1) {
                    ints[nums[cur]] = cur;
                }
            }
        }
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
