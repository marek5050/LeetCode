package OddEvenLinkedList;

import LinkedList.ListNode;

/**
 * Created by marek5050 on 10/25/16.
 */
// 328 Odd Even LinkedList
//Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
//You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
//
//    Example:
//    Given 1->2->3->4->5->NULL,
//    return 1->3->5->2->4->NULL.
//
// Note:
// The relative order inside both the even and odd groups should remain as it was in the input.
//  The first node is considered odd, the second node even and so on ...

public class Solution {
    public static Object[][] testcases = {
            { "[1,2,3,2,1]", "[1,3,1,2,2]"},
            { "[1,1]"    ,"[1,1]"},
            { "[1,2]"    ,"[1,2]"},
            { "[1,2,2,1]","[1,2,2,1]"},
            { "[12,21,3]","[12,3,21]"},
    };

    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead = new ListNode(0);
        ListNode oddHead = new ListNode(0);
        ListNode evenNode = evenHead;
        ListNode oddNode = oddHead;
        ListNode currentNode = head;
        int i=1;

        while(currentNode != null){
            if( i%2 == 0){
                evenNode.next = currentNode;
                evenNode = currentNode;
            }else{
                oddNode.next = currentNode;
                oddNode = currentNode;
            }
            currentNode =currentNode.next;
            ++i;
        }
        oddNode.next = evenHead.next;
        head = oddHead.next;
        evenNode.next = null;

        return head;
    }

    // Official Solution
    public ListNode oddEvenListOfficial(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
