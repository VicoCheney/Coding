import java.util.Stack;

public class LeetCode_85 {
    public int maximalRectangle(char[][] matrix) {
        int[] heights = new int[matrix[0].length];
        int max_square = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            max_square = Math.max(max_square, largestRectangleArea(heights));
        }
        return max_square;
    }


    //LeetCode_84的求最大矩形的题，可以用来求本题的每一行对应的最大矩形
    private static int largestRectangleArea(int[] heights) {
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
