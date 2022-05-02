package leedtcode.May;

 /* 1502. Can Make Arithmetic Progression From Sequence
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

Example 1:

Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArithmeticProgressions {

    public static void main(String[] args) {
        int arr[] = { 20, 15, 5, 0, 10 };
        //Time Complexity: O(n Log n).
        boolean ans1 = canMakeArithmeticProgression(arr);
        System.out.println(ans1);
        boolean ans2 = canMakeArithmeticProgressionHashing(arr);
        System.out.println(ans2);
    }
    public static boolean canMakeArithmeticProgressionHashing(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<Integer>();
        int max  = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(i, max);
            min = Math.min(i, min);
                set.add(arr[i]);
        }
        int diff = (max - min) / (n - 1);
        int count = 0;
        while (set.contains(max)) {
            count++;
            max = max - diff;
        }
        if (count == arr.length)
            return true;
      return true;
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return true;
        // Sort array
        Arrays.sort(arr);
        // After sorting, difference between
        // consecutive elements must be same.
        int d = arr[1] - arr[0];
        for (int i = 2; i < n; i++)
            if (arr[i] - arr[i - 1] != d)
                return false;

        return true;
    }
}
