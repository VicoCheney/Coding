import java.util.Arrays;

public class Boss_20230311_1 {
    public int changeNumber (int n) {
        // write code here
        char[] sn = String.valueOf(n).toCharArray();
        int len = sn.length;
        if (sn[0] == '1') {
            sn[0] = '2';
        } else {
            sn[0] = '1';
        }
        for (int i = 1; i < len; i++) {
            if (i % 2 == 0) {
                if (sn[i] == '0') {
                    sn[i] = '1';
                } else {
                    sn[i] = '0';
                }
            } else {
                if (sn[i] == '9') {
                    sn[i] = '8';
                } else {
                    sn[i] = '9';
                }
            }
        }
        String s = new String(sn);
        return Integer.parseInt(s);
    }
}
