import java.util.Stack;

public class WPS_20230308_3 {
    public static boolean isBracketMatched(String s) {
        Stack<Character> stack = new Stack<>();
        char[] cs = s.toCharArray();
        for (char c: cs) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }  else if (c == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }  else if (c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
