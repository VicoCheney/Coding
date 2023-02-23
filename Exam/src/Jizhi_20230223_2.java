import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Jizhi_20230223_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                arrayDeque.push(0);
            } else {
                int out_v = arrayDeque.pop();
                int in_v = arrayDeque.pop();
                in_v += Math.max(out_v * 2, 1);
                arrayDeque.push(in_v);
            }
        }
        System.out.println(arrayDeque.pop());
    }
}
