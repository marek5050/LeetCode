package LinkedList.Example;

/**
 * Created by marek5050 on 10/25/16.
 */
public class Solution {
    public static Object[][] testcases = new Object[][] {
            { "[]"    ,"[]"},
            { "[1]"   ,  "[1]" },
            { "[1,2]" , "[1,2]" },
            { "[1,2,3,4,5]", "[1,2,3,4,5]"}
    };

    public Integer val;
    public Solution next;

    public Solution(Integer x) {
        val = x;
    }

    public String toString(){
        return (next==null)? val+"": val +"," + next;
    }

    public boolean equals(Object other){
        return toString().equals(other);
    }
}


