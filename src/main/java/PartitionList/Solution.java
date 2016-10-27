package  PartitionList;

import  LinkedList.ListNode;

/**
 * Created by marek5050 on 10/25/16.
 */
//86. Partition List

public class Solution {
    public static Object[][] testcases = {
            { "[1,2,3,2,1]",3, "[1,2,2,1,3]"},
            {"[1]",2,"[1]"},
            { "[1,1]",1   , "[1,1]"},
            { "[1,2]",2 , "[1,2]" },
            { "[1,2,2,1]",2, "[1,1,2,2]"},
            { "[12,21,3]",21,"[12,3,21]"},
    };

    public ListNode partition(ListNode head, int x) {
        ListNode node = head;
        ListNode bigHead = new ListNode(0);
        ListNode smallHead = new ListNode(0);
        ListNode smallNode = smallHead;
        ListNode bigNode = bigHead;

        while(node != null ){
            if(node.val < x){
                smallNode.next = node;
                smallNode = node;
            }else{
                bigNode.next = node;
                bigNode = node;
            }
            node = node.next;
        }

        smallNode.next = bigHead.next;
        head = smallHead.next;

        // Kill recursion when last node links to a previous
        bigNode.next = null;

        return head;
    }
}
