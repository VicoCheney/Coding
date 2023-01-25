public class deadlock {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);

        get_resource(listNode1,listNode2);
        get_resource(listNode2,listNode1);
    }

    private static void get_resource(ListNode listNode1, ListNode listNode2) {
        Thread thread = new Thread(() -> {
            synchronized (listNode1){
                System.out.println("get the resource1");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (listNode2){
                    System.out.println("get the resource2");
                }
            }
        });
        thread.start();
    }
}
