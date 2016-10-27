package com.leetcode.tests;
/**
 * Created by marek5050 on 10/25/16.
 */

import com.leetcode.LinkedList.ListNode;
import com.leetcode.LinkedList.PalindromeLinkedList;
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
public class PalindromeLinkedListTests extends TimedTestCase {

    public String testCase;
    public boolean expectedResult;
    public PalindromeLinkedList problem = new PalindromeLinkedList();
    @Parameterized.Parameters(name = "input: {0} -> expected: {1}")
    public static Collection primeNumbers() {
        return Arrays.asList(PalindromeLinkedList.testcases);
    }

    public PalindromeLinkedListTests(String testCase, boolean expectedResult){
        this.testCase = testCase;
        this.expectedResult = expectedResult;
    }

    @Test
    public void test_recurse(){
        ListNode testHead = GenerateLinkedList(testCase);
        boolean testResult = problem.isPalindrome(testHead);
        assertEquals(expectedResult, testResult);
    }
}
