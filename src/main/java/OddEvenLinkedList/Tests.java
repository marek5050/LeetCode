package OddEvenLinkedList; /**
 * Created by marek5050 on 10/25/16.
 */

import LinkedList.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import utils.TimedTestCase;

import java.util.Arrays;
import java.util.Collection;

import static LinkedList.LinkedList.GenerateLinkedList;
import static LinkedList.LinkedList.stringify;


@RunWith(Parameterized.class)
public class Tests extends TimedTestCase {

    public String testCase;
    public String expectedResult;
    public Solution problem = new Solution();
    @Parameterized.Parameters(name = "input: {0} -> expected: {1}")
    public static Collection primeNumbers() {
        return Arrays.asList(Solution.testcases);
    }

    public Tests(String testCase, String expectedResult){
        this.testCase = testCase;
        this.expectedResult = expectedResult;
    }

    @Test
    public void test_recurse(){
        ListNode testHead = GenerateLinkedList(testCase);
        ListNode testResult = problem.oddEvenList(testHead);
        assertEquals(expectedResult, stringify(testResult));
    }
}
