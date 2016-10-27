package  PalindromeLinkedList; /**
 * Created by marek5050 on 10/25/16.
 */

import  LinkedList.ListNode;
import utils.TimedTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static  LinkedList.LinkedList.GenerateLinkedList;


@RunWith(Parameterized.class)
public class Tests extends TimedTestCase {

    public String testCase;
    public boolean expectedResult;
    public Solution problem = new Solution();
    @Parameterized.Parameters(name = "input: {0} -> expected: {1}")
    public static Collection primeNumbers() {
        return Arrays.asList(Solution.testcases);
    }

    public Tests(String testCase, boolean expectedResult){
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
