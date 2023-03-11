import java.util.HashMap;

public class WPS_20230308_2 {
    public static boolean areEqual(int[] arr1, int[] arr2, int N, int M) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int key = arr1[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (int k:arr2) {
            if (map.containsKey(k)) {
                int v = map.get(k);
                if (v == 1) {
                    map.remove(k);
                } else {
                    map.put(k, map.get(k) - 1);
                }
            } else {
                return false;
            }
        }
        if (map.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
