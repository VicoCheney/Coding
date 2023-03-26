public class TencentMusic_20230323_3 {
    public int getCnt (String str) {
        // write code here
        int len = str.length();
        int count = 0;
        for (int i = 0; i < len - 1; i++) {

            if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(str.charAt(i + 1))){
                count++;
            }
        }
        return count;
    }
}
