package leedtcode.May;
//1822. Sign of the Product of an Array
 /*      There is a function signFunc(x) that returns:

    1 if x is positive.
    -1 if x is negative.
    0 if x is equal to 0.

You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

Example 1:

Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1

Example 2:

Input: nums = [1,5,0,2,-3]
Output: 0
Explanation: The product of all values in the array is 0, and signFunc(0) = 0
*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class SignOfProduct {

    public static void main(String[] args) {
        int [] nums = {1,5,0,2,-3};
        int ans= arraySign(nums);
        System.out.println(ans);
    }

    public static int arraySign(int[] nums) {
        int count = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                count *= -1;
            }else if (nums[i] == 0)
                return 0;
        }
        return count;
    }




}
