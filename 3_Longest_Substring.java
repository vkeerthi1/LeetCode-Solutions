package leedtcode.May.CW2;

/*3. Longest Substring Without Repeating Characters
        Medium
        Given a string s, find the length of the longest substring without repeating characters.
        Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.

        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
*/
import java.io.*;
import java.util.*;

public class LongestSubString{

    //ime Complexity: O(n^2) since we are traversing each window to remove all repetitions.
    public static int longestUniqueSubsttr(String str)
    {
        int n = str.length();
        // Result
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            // Note : Default values in visited are false
            boolean[] visited = new boolean[256];

            for(int j = i; j < n; j++)
            {
                // If current character is visited
                // Break the loop
                if (visited[str.charAt(j)] == true)
                    break;
                    // Else update the result if this window is larger, and mark current character as visited.
                else
                {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }

            // Remove the first character of previous
            // window
            visited[str.charAt(i)] = false;
        }
        return res;
    }

     //Time Complexity: O(n) since we slide the window whenever we see any repetitions.
     //Auxiliary Space: O(1)
    public static int longestUniqueSubs(String str)
    {
        String test = "";

        // Result
        int maxLength = -1;

        // Return zero if string is empty
        if (str.isEmpty()) {
            return 0;
        }
        // Return one if string length is one
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);

            // If string already contains the character
            // Then substring after repeating character
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
            }
            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }
    // Driver code
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubsttr(str);
        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + len);

        int len1 = longestUniqueSubs(str);
        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + len1);
    }
}
