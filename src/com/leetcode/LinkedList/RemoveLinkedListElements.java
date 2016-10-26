package com.leetcode.LinkedList;

import java.util.ArrayList;

/**
 * Created by marek5050 on 10/25/16.
 */

//Remove all elements from a linked list of integers that have value val.
//
//        Example
//        Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
//        Return: 1 --> 2 --> 3 --> 4 --> 5
//
//        Credits:
//        Special thanks to @mithmatt for adding this problem and creating all test cases.

public class RemoveLinkedListElements {
    public static Object[][] testcases = new Object[][] {
            { "[1,2]" , 2 , "[1]"  },
            { "[1,2,2,1]", 2, "[1,1]"},
            { "[]"    , 0 ,"null"},
            { "[1]"   , 1 ,  "null"  },
            { "[1,1]"   , 1 ,  "null"  },
            { "[1,2]" , 1, "[2]"  },
            { "[1,2,3,4,5]", 2, "[1,3,4,5]"},
            { "[1,2,3,4,5]", 5, "[1,2,3,4]"}
    };

    private ListNode findNext(ListNode n, int val){
        ListNode node = n;
        while(node.next!=null){
            if(node.val!=val) return node;
            node = node.next;
        }
        return ( node!= null && node.val != val)? node: null;
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val) head = findNext(head,val);
        ListNode node = head;

        while( node !=null ){
           if(node.next != null && node.next.val == val){
               node.next = findNext(node.next,val);
           }
           node = node.next;
        }

        return head;
    }
}
