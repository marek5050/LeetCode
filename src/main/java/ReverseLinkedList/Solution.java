package  ReverseLinkedList;

import LinkedList.ListNode;

/**
 * Created by marek5050 on 10/26/16.
 */

// 206 Reverse Linked List
// Reverse a singly linked list.
public class Solution {
    public static Object[][] testcases = {
        { "[1,2]" , "[2,1]"  },
        { "[1,2,2,1]", "[1,2,2,1]"},
        { "[]" ,"[]" },
        { "[1]"  , "[1]" },
        { "[1,1]" , "[1,1]"  },
        { "[1,2]" ,"[2,1]" },
        { "[-1,2,3]", "[3,2,-1]"},
        { "[1,2,3,4,5]", "[5,4,3,2,1]"}
    };
    ListNode head = null;
    public ListNode recurse(ListNode node){
        if(node == null || node.next == null){
            head = node;
            return node;
        }
        ListNode prev = recurse(node.next);
        prev.next = node;
        node.next = null;
        return node;
    };

    public ListNode reverseListRecurse(ListNode head) {
        recurse(head);
        return this.head;
    }
}
