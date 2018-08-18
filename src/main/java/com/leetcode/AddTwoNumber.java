package com.leetcode;
/*

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.
*/


public class AddTwoNumber {
    public static void main(String args[]) {
        //Populate l1
      /*
       //Use Case : 1
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Populate l2
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);*/

        //Use Case : 2
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        AddTwoNumber instance = new AddTwoNumber();
        ListNode result = instance.addTwoNumbers(l1,l2);
        while(result !=null){
            System.out.println(result.val);
            result = result.next;
        }


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = null;
        ListNode sumt = null;
        int num = 0;
        int lsum;
        ListNode l1t = l1;
        ListNode l2t = l2;
        while (l1t != null || l2t != null) {
            if (l1t != null && l2t != null) {
                lsum = l1t.val + l2t.val + num;
                num = 0;
                num = lsum / 10;
                lsum = lsum % 10;
                if (sum == null) {
                    sum = new ListNode(lsum);
                    sumt = sum;
                } else {
                    sumt.next = new ListNode(lsum);
                    sumt = sumt.next;
                }
                l1t = l1t.next;
                l2t = l2t.next;
            } else if (l1t != null) {
                lsum = l1t.val + num;
                num = 0;
                num = lsum / 10;
                lsum = lsum % 10;
                if (sum == null) {
                    sum = new ListNode(lsum);
                    sumt = sum;
                } else {
                    sumt.next = new ListNode(lsum);
                    sumt = sumt.next;
                }
                l1t = l1t.next;
            } else if (l2t != null) {
                lsum = l2t.val + num;
                num = 0;
                num = lsum / 10;
                lsum = lsum % 10;
                if (sum == null) {
                    sum = new ListNode(lsum);
                    sumt = sum;
                } else {
                    sumt.next = new ListNode(lsum);
                    sumt = sumt.next;
                }
                l2t = l2t.next;
            }
        }
        if(l1t ==null && l2t==null && num !=0){
            sumt.next = new ListNode(num);
        }
        return sum;
    }

    public ListNode addTwoNumbersOptimum(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
