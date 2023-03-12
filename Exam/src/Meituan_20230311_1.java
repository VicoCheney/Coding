import java.util.Scanner;

public class Meituan_20230311_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = 0;
        int i = 0;
        int start = 0;
        while (i < s.length()) {
            char temp = s.charAt(i);
            while (i < s.length() && s.charAt(i) == temp) {
                i++;
            }
            if (i == s.length()) {
                res += (i - start) / 2;
                break;
            } else {
                res += (i - start) / 2;
                start = i;
            }
        }
        System.out.println(res);
    }
}
