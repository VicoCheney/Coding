import java.util.HashMap;

public class CVTE_20230213_1 {
    public static void main(String[] args) {
        int[][] voteRecordArr = new int[1][5];
        voteRecordArr[0] = new int[]{1, 3, 2 ,1 ,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < voteRecordArr.length; i++) {
            for (int j: voteRecordArr[i]) {
                if (map.containsKey(j)) {
                    int votes = map.get(j);
                    map.put(j, votes + 1);
                } else {
                    map.put(j, 1);
                }
            }
        }
        for (int candidate: map.keySet()) {
            int votes = map.get(candidate);
            String res = candidate + " - " + votes + "票";
            System.out.println(res);
        }
    }
}
