public class LeetCode_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else {
            if (list2 == null) {
                return list1;
            }
        }
        ListNode head = null;
        ListNode cur = null;
        if (list2.val > list1.val) {
            head = list1;
            cur = head;
            list1 = list1.next;
        } else {
            head = list2;
            cur = head;
            list2 = list2.next;
        }
        while (list2 != null && list1 != null) {
            if (list2.val > list1.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 == null) {
            cur.next = list2;
        }
        if (list2 == null) {
            cur.next = list1;
        }
        return head;
    }
}
