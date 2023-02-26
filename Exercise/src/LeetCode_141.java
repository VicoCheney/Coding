public class LeetCode_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && slow != null) {
            if (fast == slow) {
                return true;
            } else {
                if (fast.next == null) {
                    return false;
                }
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return false;
    }
}
