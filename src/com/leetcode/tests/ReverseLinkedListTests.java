package com.leetcode.tests;
/**
 * Created by marek5050 on 10/25/16.
 */

import com.leetcode.LinkedList.ListNode;
import com.leetcode.LinkedList.RemoveLinkedListElements;
import com.leetcode.LinkedList.ReverseLinkedList;
import com.leetcode.TimedTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.leetcode.LinkedList.LinkedList.GenerateLinkedList;
import static com.leetcode.LinkedList.LinkedList.stringify;


@RunWith(Parameterized.class)
public class ReverseLinkedListTests extends TimedTestCase {

    public String testCase;
    public String expectedResult;
    ReverseLinkedList problem = new ReverseLinkedList();

    @Parameterized.Parameters(name = "input: {0} -> expected: {1}")
    public static Collection primeNumbers() {
        return Arrays.asList(ReverseLinkedList.testcases);
    }

    public ReverseLinkedListTests(String testCase, String expectedResult){
        this.testCase = testCase;
        this.expectedResult = expectedResult;
    }

    @Test
    public void test_recurse(){
        ListNode testHead = GenerateLinkedList(testCase);
        ListNode testResult = problem.reverseListRecurse(testHead);
        assertEquals(expectedResult, stringify(testResult));
    }
}
