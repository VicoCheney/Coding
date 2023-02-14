public class CVTE_20230213_2 {
    public static String noticeTime(String deadline, String time, String[] starts) {
        int deadline_m = Integer.parseInt(deadline.split(":")[0]);
        int deadline_s = Integer.parseInt(deadline.split(":")[1]);
        int time_m = Integer.parseInt(time.split(":")[0]);
        int time_s = Integer.parseInt(time.split(":")[1]);
        int final_time_m;
        int final_time_s;
        if (deadline_s < time_s) {
            final_time_s = deadline_s - time_s + 60;
            deadline_m -= 1;
        } else {
            final_time_s = deadline_s - time_s;
        }
        final_time_m = deadline_m - time_m;
        String res = "";
        int res_m = 0;
        int res_s = 0;

        for (String t:starts) {
            int t_m = Integer.parseInt(t.split(":")[0]);
            int t_s = Integer.parseInt(t.split(":")[1]);
            if (t_m < final_time_m || (t_m == final_time_m && t_s <= final_time_s)) {
                if (t_m > res_m || (t_m == res_m && t_s > res_s)) {
                    res_m = t_m;
                    res_s = t_s;
                    res = t;
                }
            }
        }
        return res;
    }
}
