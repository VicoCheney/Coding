import java.util.Scanner;

public class Baidu_20230307_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = Integer.parseInt(s.split(" ")[1]);
        String nums_str = in.nextLine();
        String[] nums = nums_str.split(" ");
        double res;
        int n = nums.length;
        double[][] dp = new double[n][k];
        int[] temp = new int[n];
        temp[0] = Integer.parseInt(nums[0]);
        for (int i = 1; i < n; i++) {
            temp[i] = temp[i - 1] + Integer.parseInt(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            dp[i][0] = (double) temp[i] / (i + 1);
        }
        for (int j = 1; j < k; j++) {
            for (int i = j; i < n; i++) {
                dp[i][j] = Double.MAX_VALUE;
                for (int m = j - 1; m < i; m++) {
                    double avg = (double) (temp[i] - temp[m]) / (i - m);
                    dp[i][j] = Math.min(dp[i][j], dp[m][j-1] + avg);
                }
            }
        }
        res = dp[n - 1][k - 1];
        System.out.println(res);
    }
}
