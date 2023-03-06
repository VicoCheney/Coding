import java.util.Scanner;

public class Midea_20230306_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String list_str = in.nextLine();
        String[] list = list_str.split(",");
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int f_n = Integer.MAX_VALUE;
        int s_n = Integer.MAX_VALUE;
        for (String num: list) {
            int n = Integer.parseInt(num);
            if (n > first) {
                second = first;
                first = n;
            } else {
                if (n > second) {
                    second = n;
                }
            }
            if (n < f_n) {
                s_n = f_n;
                f_n = n;
            } else {
                if (n < s_n) {
                    s_n = n;
                }
            }
        }
        System.out.println(Math.max(first*second, f_n*s_n));
    }
}
