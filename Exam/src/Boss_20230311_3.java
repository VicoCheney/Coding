import java.util.Scanner;

public class Boss_20230311_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] nums = in.nextLine().split(" ");
        int[] ns = new int[n];
        for (int i = 0; i < n; i++) {
            ns[i] = Integer.parseInt(nums[i]);
        }
        String colors = in.nextLine();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int j = 2; j < n + 1; j++) {
            if (colors.charAt(j - 1) != colors.charAt(j - 2)) {
                dp[j] = Math.max(dp[j - 2] + ns[j - 1] + ns[j - 2], dp[j - 1]);
            } else {
                dp[j] = dp[j - 1];
            }
        }
        System.out.println(dp[n]);
    }
}
