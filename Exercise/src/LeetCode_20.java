import java.util.Stack;

public class LeetCode_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        char temp = ' ';
        for (char c:chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(temp);
                temp = c;
            } else {
                if (c == ')') {
                    if (temp == '(') {
                        temp = stack.pop();
                    } else return false;
                } else if (c == '}') {
                    if (temp == '{') {
                        temp = stack.pop();
                    } else return false;
                } else if (c == ']') {
                    if (temp == '[') {
                        temp = stack.pop();
                    } else return false;
                }
            }
        }
        return stack.isEmpty() && temp == ' ';
    }
}
