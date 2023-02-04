public class LeetCode_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) {
            return null;
        } else if (len == 1) {
            return lists[0];
        } else if (len == 2) {
            return mergeTwoLists(lists[0], lists[1]);
        }
        int merges = len / 2;
        ListNode[] newLists = new ListNode[merges + 1];
        for (int i =0;i<merges;i++) {
            newLists[i] = mergeTwoLists(lists[2*i], lists[2*i+1]);
        }
        if (len % 2 != 0) {
            newLists[merges] = lists[len - 1];
        }
        return mergeKLists(newLists);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else {
            if (list2 == null) {
                return list1;
            } else {
                if (list1.val > list2.val) {
                    list2.next = mergeTwoLists(list1, list2.next);
                    return list2;
                } else {
                    list1.next = mergeTwoLists(list1.next, list2);
                    return list1;
                }
            }
        }
    }
}
