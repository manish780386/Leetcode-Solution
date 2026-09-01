class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            // Duplicate found
            if (curr.next != null && curr.val == curr.next.val) {

                int value = curr.val;

                // Remove all nodes having this value
                while (curr != null && curr.val == value) {
                    curr = curr.next;
                }

                prev.next = curr;

            } else {

                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}