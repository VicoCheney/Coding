import java.util.HashSet;
import java.util.Scanner;

public class 三60_20230318_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] split = in.nextLine().split(" ");
        HashSet<String> set = new HashSet<>();
        for (String s:split) {
            set.add(s);
        }
        System.out.println(split.length - set.size());
    }
}
