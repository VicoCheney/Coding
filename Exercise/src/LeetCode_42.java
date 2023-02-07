import java.util.Stack;

public class LeetCode_42 {
    public int trap(int[] height) {
        int res = 0;
        int max = 0;
        int len = height.length;
        if (len == 0 || len == 1 || len == 2) {
            return res;
        }
        for (int h:height) {
            if (h > max) {
                max = h;
            }
        }
        for (int i = 0; i < max; i++) {
            int temp = 0;
            boolean flag = false;
            for (int j = 0; j < len; j++) {
                if (flag && height[j] <= i) {
                    temp++;
                }
                if (height[j] > i) {
                    res += temp;
                    temp = 0;
                    flag = true;
                }
            }
        }
        return res;
    }

    public int trap2(int[] height) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        while (cur < height.length) {
            while (!stack.isEmpty() && height[cur] > height[stack.peek()]) {
                int h = height[stack.peek()];
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = cur - stack.peek() - 1;
                int min = Math.min(height[cur], height[stack.peek()]);
                res += distance * (min - h);
            }
            stack.push(cur);
            cur++;
        }
        return res;
    }
}
