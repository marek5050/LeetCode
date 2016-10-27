package com.leetcode.LinkedList;

/**
 * Created by marek5050 on 10/25/16.
 */
public class LinkedList {
    public static ListNode GenerateLinkedList(String arr){
        String[] sarr = arr.replace("[","").replace("]","").split(",");
        Integer[] rarr = new Integer[sarr.length];
        if(sarr[0].equals("")){
            return null;
        }
        for(int i=0; i < sarr.length; ++i){
            rarr[i] = Integer.parseInt(sarr[i]);
        }
        return GenerateLinkedList(rarr);
    }

    public static ListNode GenerateLinkedList(Integer[] arr){
        ListNode head = null;
        ListNode node = null;

        for(int a: arr) {
            if(node == null){
                node = new ListNode(a);
                head = node;
            }else{
                node.next = new ListNode(a);
                node = node.next;
            }
        }
        return head;
    };

    public static String stringify(ListNode n){
        return (n==null)? "[]": "["+n.toString()+"]";
    }
}

