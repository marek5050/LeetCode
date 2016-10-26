package com.leetcode.tests;
/**
 * Created by marek5050 on 10/25/16.
 */
import com.leetcode.LinkedList.ListNode;
import com.leetcode.LinkedList.RemoveLinkedListElements;

import com.leetcode.TimedTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.leetcode.LinkedList.LinkedList.GenerateLinkedList;
import static com.leetcode.LinkedList.LinkedList.stringify;


@RunWith(Parameterized.class)
public class RemoveLinkedListElementsTests extends TimedTestCase {

    public String testCase;
    public String expectedResult;
    private int remove;
    RemoveLinkedListElements problem = new RemoveLinkedListElements();

    @Parameterized.Parameters(name = "input: {0} remove:{1} -> expected: {2}")
    public static Collection primeNumbers() {
        return Arrays.asList(RemoveLinkedListElements.testcases);
    }

    public RemoveLinkedListElementsTests(String testCase, int remove, String expectedResult) {
        this.testCase = testCase;
        this.remove = remove;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testAll(){
        ListNode testHead = GenerateLinkedList(testCase);
        ListNode testResult = problem.removeElements(testHead,remove);
        assertEquals(expectedResult, stringify(testResult));
    }

}
