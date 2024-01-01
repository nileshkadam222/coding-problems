package com.coding.problems.leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode currentNode = dummyNode;
        int carry = 0;
        while(l1 != null || l2 != null || carry ==1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2= l2.next;
            }

            sum += carry;
            carry = sum/10;
            currentNode.next = new ListNode(sum%10);;
            currentNode = currentNode.next;
        }
        return dummyNode.next;
    }
}

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1= new ListNode(2);
        ListNode currentNode = l1;
        currentNode.next = new ListNode(4);
        currentNode = currentNode.next;
        currentNode.next = new ListNode(3);

        ListNode l2= new ListNode(5);
        ListNode currentNodeL2 = l2;
        currentNodeL2.next = new ListNode(6);
        currentNodeL2 = currentNodeL2.next;
        currentNodeL2.next = new ListNode(4);

        Solution s = new Solution();
        System.out.println(s.addTwoNumbers(l1, l2));
    }
}


