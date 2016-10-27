package  LinkedList.Example;

import  LinkedList.ListNode;
import  LinkedList.LinkedList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import utils.TimedTestCase;

import java.util.Arrays;
import java.util.Collection;

import static  LinkedList.LinkedList.GenerateLinkedList;

/**
 * Created by marek5050 on 10/25/16.
 */

@RunWith(Parameterized.class)
public class Tests extends TimedTestCase {
    public String testCase;
    public String expectedResult;

    @Parameterized.Parameters(name = "input: {0} -> expected: {1}")
    public static Collection primeNumbers() {
        return  Arrays.asList(ListNode.testcases);
    }

    public Tests(String testCase, String expectedResult) {
        this.testCase = testCase;
        this.expectedResult = expectedResult;
    }
    @Test
    public void run_test_case (){
        ListNode n = LinkedList.GenerateLinkedList(this.testCase);
        assertEquals(expectedResult, LinkedList.stringify(n));
    }
}
