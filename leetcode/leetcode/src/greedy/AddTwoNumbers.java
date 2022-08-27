package greedy;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p, dummy = new ListNode(0);
        p = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(carry%10);
            carry /= 10;
            p = p.next;
        }
        return dummy.next;
    }

    static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
