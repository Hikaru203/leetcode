package Java;


import java.util.ArrayList;

public class _21_Merge_Two_Sorted_Lists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList list = new ArrayList();
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list.add(list1.val);
                System.out.println("list1: " + list1.val);
                list1 = list1.next;
            } else {
                list.add(list2.val);
                System.out.println("list2: " + list2.val);
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            list.add(list1.val);
        }
        if (list2 != null) {
            list.add(list2.val);
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = mergeTwoLists(l1, l2);

    }
}
