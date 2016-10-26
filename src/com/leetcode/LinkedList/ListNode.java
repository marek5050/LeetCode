package com.leetcode.LinkedList;

import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by marek5050 on 10/25/16.
 */
public class ListNode {
    public static Object[][] testcases = new Object[][] {
            { "[]"    ,"null"},
            { "[1]"   ,  "1" },
            { "[1,2]" , "1->2" },
            { "[1,2,3,4,5]", "1->2->3->4->5"}
    };

    Integer val;
    ListNode next;

    public ListNode(Integer x) {
        val = x;
    }

    public String toString(){
        return (next==null)? val+"": val +"," + next;
    }

    public boolean equals(Object other){
        return toString().equals(other);
    }
}


