import java.util.ArrayList;

public class TencentMusic_20230323_2 {
    public int getMaxValue (String str, int k) {
        // write code here
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        char temp = '1';
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == temp) {
                count++;
            } else {
                sb.append(count);
                list.add(count);
                count = 1;
                temp = str.charAt(i);
            }
        }
        sb.append(count);
        list.add(count);
        int max = 0;
        int t = 0;
        for (int i:list) {
            if (i == 1) {
                t++;
            } else {
                max = Math.max(max, t);
            }
        }
        return (max - 1) * (max - 1);
    }
}
