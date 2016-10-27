package  PartitionList;

/**
 * Created by marek5050 on 10/25/16.
 */

import LinkedList.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import utils.TimedTestCase;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class Tests extends TimedTestCase {

    public Solution problem = new Solution();

    public String testCase;
    public String expectedResult;
    int k =0;


    @Parameterized.Parameters(name = "input: {0} k:{1} -> expected: {2}")
    public static Collection testcases() {
        return Arrays.asList(Solution.testcases);
    }

    public Tests(String testCase, int k, String expectedResult){
        this.testCase = testCase;
        this.k = k;
        this.expectedResult = expectedResult;
    }

    @Test
    public void test_recurse(){
        ListNode testHead = LinkedList.GenerateLinkedList(testCase);
        ListNode testResult = problem.partition(testHead, k);
        assertEquals(expectedResult, LinkedList.stringify(testResult));
    }

}