package RemoveDuplicatesFromSortedList;

import LinkedList.ListNode;

/**
 * Created by marek5050 on 10/25/16.
 */

/*
83. Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/

public class Solution {
    public static Object[][] testcases = {
            { "[0,0,0,0]", "[0]"},
            { "[1,2,3]", "[1,2,3]"},
            { "[1]",       "[1]"},
            { "[1,1]",     "[1]"},
            { "[1,2]",     "[1,2]" },
            { "[1,1,2,3]", "[1,2,3]"},
            { "[3,12,12,12,21]", "[3,12,21]"},
    };

    public ListNode solution(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode currentNode = head;
        ListNode goodList = new ListNode(null);
        ListNode lastNode = goodList;

        while(currentNode != null){
            if(currentNode.val != lastNode.val){
                lastNode.next = currentNode;
                lastNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        lastNode.next = null;
        return goodList.next;
    }
}
