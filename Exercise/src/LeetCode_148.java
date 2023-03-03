public class LeetCode_148 {
//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        int count = 1;
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur.next != null) {
//            pre = cur;
//            cur = cur.next;
//            count++;
//            if (cur.val < pre.val) {
//                int temp = pre.val;
//                pre.val = cur.val;
//                cur.val = temp;
//            }
//        }
//        int index = 0;
//        for (int i = 0; i < count - 2; i++) {
//            index = 1;
//            pre = null;
//            cur = head;
//            while (index < count - i - 1) {
//                pre = cur;
//                cur = cur.next;
//                index++;
//                if (cur.val < pre.val) {
//                    int temp = pre.val;
//                    pre.val = cur.val;
//                    cur.val = temp;
//                }
//            }
//        }
//        return head;
//    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left_head = sortList(head);
        ListNode right_head = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left_head != null && right_head != null) {
            if (left_head.val > right_head.val) {
                h.next = right_head;
                right_head = right_head.next;
            } else {
                h.next = left_head;
                left_head = left_head.next;
            }
            h = h.next;
        }
        if (left_head == null) {
            h.next = right_head;
        } else {
            h.next = left_head;
        }
        return res.next;
    }
}
