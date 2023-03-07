import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Baidu_20230307_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            int len = Integer.parseInt(in.nextLine());
            String[] s = in.nextLine().split(" ");
            int[] ints = new int[len];
            for (int j = 0; j < len; j++) {
                ints[j] = Integer.parseInt(s[j]);
            }
            System.out.println(count(ints));
        }
    }

    public static int count(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 0 ; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            boolean[] booleans = new boolean[n - i];
            for (int j = i ; j < n; j++) {
                int num = nums[j];
                set.add(num);
                if (j == i || !booleans[j - i - 1]) {
                    booleans[j - i] = isOk(set);
                } else {
                    booleans[j - i] = num == set.size();
                }
                if (booleans[j - i]) {
                    c++;
                }
            }
        }
        return c;
    }

    public static boolean isOk(HashSet<Integer> set) {
        int len = set.size();
        for (int i = 1; i <= len; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }

}
