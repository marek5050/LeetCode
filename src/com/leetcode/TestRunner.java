package com.leetcode;

/**
 * Created by marek5050 on 10/26/16.
 */
import com.leetcode.LinkedList.RemoveLinkedListElements;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import com.leetcode.tests.*;

import java.util.Enumeration;

public class TestRunner {
    public static void main(String[] args) {
        TestSuite suite = new TestSuite(ListNodeTests.class, RemoveLinkedListElementsTests.class);
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("Number of test cases = " + result.runCount());
        Enumeration<TestFailure> a = result.failures();

        while(a.hasMoreElements()) {
            TestFailure t = a.nextElement();
            System.out.println(t.toString());
        }
    }
}