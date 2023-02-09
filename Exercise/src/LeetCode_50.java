public class LeetCode_50 {
    public double myPow(double x, int n) {
        if (n == 1) {
            return x;
        } else if (n == 0) {
            return 1;
        } else if (n == -1) {
            return 1/x;
        }
        int mid = n / 2;
        double mid_value = myPow(x, mid);
        if (n % 2 == 0) {
            return mid_value * mid_value;
        } else {
            if (n < 0) {
                return mid_value * mid_value * (1 / x);
            } else {
                return mid_value * mid_value * x;
            }
        }
    }
}
