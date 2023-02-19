import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Xinghuan_20230219_2 {
/*    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int res = 0;
        int[] loads = new int[m];
        int[] salaries = new int[m];
        int min_load = loads[0];
        int max_salary = salaries[0];
        for (int i = 0; i < m; i ++) {
            loads[i] = in.nextInt();
            salaries[i] = in.nextInt();
            min_load = Math.min(loads[i], min_load);
            max_salary = Math.max(salaries[i], max_salary);
        }
        boolean isCondition1True;
        boolean isCondition2True;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < m; j++) {
            isCondition1True = false;
            isCondition2True = false;
            int load = loads[j];
            int salary = salaries[j];
            if (map.containsKey(load) && map.get(load) == salary) {
                continue;
            }
            if (load == min_load && salary == max_salary) {
                res = res + 1;
                map.put(load, salary);
                break;
            }
            for (int k = 0; k < m; k++) {
                int load2 = loads[k];
                int salary2 = salaries[k];
                if (load2 == load) {
                    if (salary > salary2) {
                        isCondition2True = true;
                    } else if (salary < salary2) {
                        break;
                    } else {
                        if (load == min_load && isCondition2True && k == m - 1) {
                            res ++;
                            map.put(load, salary);
                        }
                        if (salary == max_salary && isCondition1True && k == m - 1) {
                            res ++;
                            map.put(load, salary);
                        }
                        continue;
                    }
                }
                if (salary == salary2 && load > load2) {
                    break;
                }
                if (load > load2) {
                    if (salary > salary2) {
                        isCondition1True = true;
                    } else {
                        break;
                    }
                }
                if (salary <= salary2) {
                    if (load < load2) {
                        isCondition2True = true;
                    } else {
                        break;
                    }
                }
                if (load == min_load && isCondition2True && k == m - 1) {
                    res++;
                    map.put(load, salary);
                }
                if (salary == max_salary && isCondition1True && k == m - 1) {
                    res++;
                    map.put(load, salary);
                }
                if (k == m - 1 && isCondition1True && isCondition2True) {
                    res++;
                    map.put(load, salary);
                }
            }
        }
        System.out.println(res);
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int res = 0;
        int[] loads = new int[m];
        int[] salaries = new int[m];
        int min_load = loads[0];
        int max_salary = salaries[0];
        for (int i = 0; i < m; i ++) {
            loads[i] = in.nextInt();
            salaries[i] = in.nextInt();
            min_load = Math.min(loads[i], min_load);
            max_salary = Math.max(salaries[i], max_salary);
        }
        boolean isCondition1True;
        boolean isCondition2True;
        HashSet<String> set = new HashSet<>();
        boolean[] booleans = new boolean[m];
        for (boolean b: booleans) {
            b = true;
        }
        for (int j = 0; j < m; j++) {
            isCondition1True = true;
            isCondition2True = true;
            int load = loads[j];
            int salary = salaries[j];
            String work = load + " " +salary;
            if (set.contains(work)) {
                continue;
            } else {
                set.add(work);
            }
            if (load == min_load && salary == max_salary) {
                res = 1;
                break;
            }
            for (int k = 0; k < m; k++) {
                if (!booleans[k]) {
                    continue;
                }
                int load2 = loads[k];
                int salary2 = salaries[k];
                if (load2 < load) {
                    if (salary2 >= salary) {
                        isCondition1True = false;
                        break;
                    }
                }
                if (salary2 > salary) {
                    if (load <= load2) {
                        isCondition2True = false;
                        break;
                    }
                }
            }
            if (isCondition1True && isCondition2True) {
                res++;
            } else {
                booleans[j] = false;
            }
        }
        System.out.println(res);
    }
}
