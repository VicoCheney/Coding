import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.*;

public class Xinghuan_20230315_1 {
    public static void main(String[] args) {
        int n = 3;
        String[] task_streams = new String[]{"C->B", "B->C"};
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        HashSet<String> finished_tasks = new HashSet<>();

        for (String task: task_streams) {
            String[] split = task.split("->");
            String main_task = split[0];
            String b_task = split[1];
            finished_tasks.add(b_task);
            finished_tasks.add(main_task);
            if (map.containsKey(main_task)) {
                map.get(main_task).add(b_task);
            } else {
                ArrayList<String> strings = new ArrayList<>();
                strings.add(b_task);
                map.put(main_task, strings);
            }
        }
        for (String t:map.keySet()) {
            if (finished_tasks.contains(t)) {
                finished_tasks.remove(t);
            }
        }

        System.out.println(isOK(map, finished_tasks));

    }

    public static boolean isOK(HashMap<String, ArrayList<String>> map, HashSet<String> finished_tasks) {
        while (true) {
            if (map.isEmpty()) {
                return true;
            }
            boolean map_changed = false;
            ArrayList<String> list = new ArrayList<>();
            list.addAll(map.keySet());
            for (String task: list) {
                ArrayList<String> b_tasks = map.get(task);
                boolean flag = true;
                for (String b_t:b_tasks) {
                    if (!finished_tasks.contains(b_t)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    map.remove(task);
                    finished_tasks.add(task);
                    map_changed = true;
                }
            }
            if (!map_changed) {
                return false;
            }
        }
    }
}
