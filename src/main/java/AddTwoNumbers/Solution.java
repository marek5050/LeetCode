package AddTwoNumbers;

import LinkedList.ListNode;

/**
 * Created by marek5050 on 10/25/16.
 */
// 445. Add Two Numbers II
//You are given two linked lists representing two non-negative numbers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Follow up:
//        What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
//
//        Example:
//
//        Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 8 -> 0 -> 7

public class Solution {
    public static Object[][] testcases = {
            {"[5]", "[7]","[1,2]"},
            {"[3]", "[0]","[3]"},
            {"[1,2,3]", "[1,3]","[1,3,6]"},
            {"[1,2]", "[1,3]","[2,5]"},
            {"[2,3,5]", "[1,1,1,3]","[1,3,4,8]"},
            {"[3,1,0]", "[2,2,0]","[5,3,0]"},
            {"[5,5]", "[1,6]","[7,1]"},
            {"[5,5]", "[5,6]","[1,1,1]"},
            {"[9,8,7,6,5,4,3,2,1]", "[1,2,3,4,5,6,7,9]","[1,0,0,0,0,0,0,0,0,0]"},
    };

    int carryOver=0;

    public ListNode addTwoNumbers(ListNode val, ListNode  num1, ListNode num2) {

        if(num1.next == null && num2.next == null){
            int add = num1.val + num2.val;
            carryOver = add / 10;
            val.val = add % 10;
            return val;
        }

        ListNode nextPos = new ListNode(0);
        val.next = nextPos;

        addTwoNumbers(nextPos,num1.next,num2.next);

        int add = num1.val + num2.val + carryOver;
        carryOver = add / 10;
        val.val = add % 10;
        return val;
    };

    public ListNode padZeroes(ListNode head,int num){
        for(int i=0; i < num;++i){
            head.next = new ListNode(0);
            head = head.next;
        }
        return head;
    }

    public ListNode solution(ListNode num1, ListNode num2){
        ListNode headCarry = new ListNode(0);
        ListNode head = new ListNode(0);

        ListNode headcount = num1;
        int i=0;
        while(headcount.next != null){
            headcount = headcount.next;
            ++i;
        }
        int j=0;
        headcount = num2;
        while(headcount.next != null){
            headcount = headcount.next;
            ++j;
        }
        ListNode head1=new ListNode(0);

        if(i - j > 0 ){
            ListNode tailPadded = padZeroes(head1,i-j);
            tailPadded.next=num2;
            addTwoNumbers(head,num1,head1.next);
        }else if (i-j < 0){
            ListNode tailPadded = padZeroes(head1,j-i);
            tailPadded.next= num1;
            addTwoNumbers(head,head1.next,num2);
        }else{
            addTwoNumbers(head,num1,num2);
        }

        if(carryOver != 0){
            headCarry.val = carryOver;
            headCarry.next= head;
            return headCarry;
        }
        return head;
    }
}
