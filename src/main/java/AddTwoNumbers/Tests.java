package AddTwoNumbers; /**
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
    public String number2;

    public Solution problem = new Solution();
    @Parameterized.Parameters(name = "input: {0} {1} -> expected: {2}")
    public static Collection primeNumbers() {
        return Arrays.asList(Solution.testcases);
    }

    public Tests(String testCase, String number2, String expectedResult){
        this.testCase = testCase;
        this.number2 = number2;
        this.expectedResult = expectedResult;
    }

    @Test
    public void add_two_numbers_445(){
        ListNode testHead = GenerateLinkedList(testCase);
        ListNode secondNumber = GenerateLinkedList(number2);
        ListNode testResult = problem.solution(testHead,secondNumber);
        assertEquals(expectedResult, stringify(testResult));
    }
}
