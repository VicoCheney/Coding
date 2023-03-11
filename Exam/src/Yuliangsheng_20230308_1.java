public class Yuliangsheng_20230308_1 {
    // 寻找两个正序数组的中位数： 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 输入：nums1 = [1,3], nums2 = [2] 输出：2.00000 输入：nums1 = [1,3], nums2 = [2,4] 输出：2.50000

    public static double findMid(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int first_index;
        int second_index;
        if ((m + n) % 2 == 0) {
            second_index = (m + n) / 2;
            first_index = second_index - 1;

        } else {
            first_index = (m + n) / 2;
        }
        int i = 0;
        int nums1_i = 0;
        int nums2_i = 0;
        while (i < first_index) {
            if (nums1[nums1_i] < nums2[nums2_i]) {
                nums1_i++;
                i++;
            } else {
                nums2_i++;
                i++;
            }
        }
        if ((m + n) % 2 == 0) {
            if (nums1[nums1_i] < nums2[nums2_i]) {
                double temp = nums1[nums1_i];
                nums1_i++;
                if (nums1[nums1_i] < nums2[nums2_i]) {
                    return (temp + nums1[nums1_i]) / 2;
                } else {
                    return (temp + nums2[nums2_i]) / 2;
                }
            } else {
                double temp = nums2[nums2_i];
                nums2_i++;
                if (nums1[nums1_i] < nums2[nums2_i]) {
                    return (temp + nums1[nums1_i]) / 2;
                } else {
                    return (temp + nums2[nums2_i]) / 2;
                }
            }

        } else {
            if (nums1[nums1_i] < nums2[nums2_i]) {
                return nums1[nums1_i];
            } else {
                return nums2[nums2_i];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1= new int[]{1, 3};
        int[] nums2= new int[]{2, 4};
        System.out.println(findMid(nums1, nums2));
    }
}
