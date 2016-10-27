package com.leetcode.LinkedList;

/**
 * Created by marek5050 on 10/25/16.
 */
//234. Palindrome Linked List

public class PalindromeLinkedList {
    public static Object[][] testcases = {
            { "[1,2,3,2,1]", true},
            { "[1,1]"   ,true},
            { "[1,2]" , false },
            { "[1,2,2,1]", true},
            { "[12,21,3]"   ,false},
    };
    private ListNode head = null;
    boolean palindrome = true;

    private ListNode recurse(ListNode currentNode){
        if( currentNode == null ){
            return head;
        }
        ListNode previousNode = recurse(currentNode.next);
        if(previousNode.val != currentNode.val) palindrome = false;

        return previousNode.next;
    }

    public boolean isPalindrome(ListNode head) {
        this.head = head;
        recurse(head);
        return palindrome;
    }
}
