import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class LeetCode_146 {

    HashMap<Integer, Integer> cache = new HashMap<>();

    int capacity;

    int caches = 0;

    Queue<Integer> lru_queue = new ArrayDeque<>();

    public LeetCode_146(int capacity) {

        this.capacity = capacity;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            lru_queue.remove(key);
            lru_queue.add(key);
            return cache.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.put(key, value);
            lru_queue.remove(key);
            lru_queue.add(key);
        } else {
            if (caches < capacity) {
                cache.put(key, value);
                lru_queue.add(key);
                caches++;
            } else {
                int drop_key = lru_queue.poll();
                cache.remove(drop_key);
                cache.put(key, value);
                lru_queue.add(key);
            }

        }
    }
}
