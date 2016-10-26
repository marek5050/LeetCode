package com.leetcode.tests;

import com.leetcode.LinkedList.LinkedList;
import com.leetcode.LinkedList.ListNode;
import com.leetcode.TimedTestCase;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.leetcode.LinkedList.LinkedList.GenerateLinkedList;
import static com.leetcode.LinkedList.LinkedList.stringify;
import static org.junit.Assert.assertEquals;

/**
 * Created by marek5050 on 10/25/16.
 */

@RunWith(Parameterized.class)
public class ListNodeTests extends TimedTestCase {
    public String testCase;
    public String expectedResult;

    @Parameterized.Parameters(name = "input: {0} -> expected: {1}")
    public static Collection primeNumbers() {
        return  Arrays.asList(ListNode.testcases);
    }

    public ListNodeTests(String testCase, String expectedResult) {
        this.testCase = testCase;
        this.expectedResult = expectedResult;
    }
    @Test
    public void run_test_case (){
        ListNode n = GenerateLinkedList(this.testCase);
        assertEquals(expectedResult, stringify(n));
    }
}
