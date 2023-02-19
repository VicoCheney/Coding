import java.util.Stack;

public class LeetCode_84 {
/*    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int min = 0;
        int temp_max = 0;
        for (int i = 0; i < heights.length; i++) {
            min = heights[i];
            for (int j = i; j < heights.length; j++) {
                if (heights[j] < min) {
                    min = heights[j];
                }
                temp_max = min * (j - i + 1);
                if (temp_max > max) {
                    max = temp_max;
                }
            }
        }
        return max;
    }*/

    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return heights[0];
        }
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int j = stack.pop();
                if (stack.isEmpty()) {
                    max = Math.max(heights[j] * i, max);
                } else {
                    max = Math.max(heights[j] * (i - stack.peek() - 1), max);
                }
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int j = stack.pop();
            if (stack.isEmpty()) {
                max = Math.max(heights[j] * len, max);
            } else {
                max = Math.max(heights[j] * (len - stack.peek() - 1), max);
            }

        }
        return max;
    }

}
