public class AntGroup_20230129_1 {

   /* 链表中的节点每k个一组翻转 */

    /**
     *
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        ListNode tail = head;
        for (int i = 0;i < k;i++){
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != tail) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = reverseKGroup(tail, k);
        return pre;
    }
}
