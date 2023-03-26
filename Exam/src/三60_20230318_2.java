import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class 三60_20230318_2 {

    private static Stack<Integer> nums = new Stack<>();
    private static Stack<Character> operations = new Stack<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String e = in.nextLine();

            if (isOk(e)) {
                System.out.println("Yes");
            } else {
                boolean flag = false;
                for (int j = 0; j < e.length() + 1; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (isOk(e.substring(0, j) + String.valueOf(k) + e.substring(j))) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    private static boolean isOk(String e) {
        String[] split = e.split("=");
        if (calculate(split[0]) == calculate(split[1])) {
            return true;
        } else {
            return false;
        }
    }

    private static int calculate(String ee) {

        int num = 0;
        for (int i = 0; i < ee.length(); i++) {
            char c = ee.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + c;
            } else {
                nums.push(num);
                if (c == '*') {
                    operations.push(c);
                    count();
                }
            }
        }
        while (!operations.isEmpty()) {
            count();
        }
        return nums.pop();
    }

    private static void count() {
        char operation = operations.pop();
        int num1 = nums.pop();
        int num2 = nums.pop();
        if (operation == '*') {
            nums.push(num1 * num2);
        } else {
            nums.push(num1 + num2);
        }
    }
}
