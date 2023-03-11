import java.util.Stack;

public class Boss_20230311_4 {
    public int calculate (String expression) {
        // write code here
        Stack<Integer> nums = new Stack<>();
        Stack<Character> operations = new Stack<>();

        int num = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                nums.push(num);
                num = 0;
                while (!operations.empty() && !isHigher(operations.peek(), c)) {
                    calculate(nums, operations);
                }
                operations.push(c);
            } else if (c == '(') {
                operations.push(c);
            } else if (c == ')') {
                nums.push(num);
                num = 0;
                while (operations.peek() != '(') {
                    calculate(nums, operations);
                }
                operations.pop();
            }
        }

        nums.push(num);
        while (!operations.empty()) {
            calculate(nums, operations);
        }
        return nums.pop();
    }

    public void calculate(Stack<Integer> nums, Stack<Character> operations) {
        char operation = operations.pop();
        int num1 = nums.pop();
        int num2 = nums.pop();
        if (operation == '+') {
            nums.push(num1 + num2);
        } else if (operation == '-') {
            nums.push(num2 - num1);
        } else if (operation == '*') {
            nums.push(num2 * num1);
        } else if (operation == '/') {
            nums.push(num2 / num1);
        }
    }

    public boolean isHigher(char operation1, char operation2) {
        if (operation1 == '*' || operation1 == '/') {
            return true;
        } else if (operation1 == '+' || operation1 == '-') {
            return operation2 == '*' || operation2 == '/';
        } else {
            return false;
        }
    }
}
