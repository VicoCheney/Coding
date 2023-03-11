import java.util.Scanner;

public class Boss_20230311_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(count(n));
    }

    public static int count(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return n + 1;
        } else {
            int a = 2;
            int b = 3;
            int count = 0;
            for (int i = 3; i <= n; i++) {
                count = a + b;
                a = b;
                b = count;
            }
            return count;
        }
    }
}
