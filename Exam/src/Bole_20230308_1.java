public class Bole_20230308_1 {
    //对于一个给定的长度为N的正整数数列A1到An，要将其分成连续的K段，使得每段的数字之和不超过M，问K的最小值为多少。
    public static int Section(int N, int M, int[] A) {
        // write code here
        int count = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum != 0) {
                if (sum + A[i] <= M) {
                    sum += A[i];
                } else {
                    sum = A[i];
                    count++;
                }
            } else {
                sum += A[i];
            }
        }
        if (sum != 0) {
            count++;
        }
        return count;
    }

    // [4 2] [4] [5 1]

    public static void main(String[] args) {
        int[] A = new int[]{4, 2, 4, 5, 1, 6};
        System.out.println(Section(5, 6, A));
    }
}
