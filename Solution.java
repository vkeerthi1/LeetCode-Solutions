package leedtcode;

//1523. Count Odd Numbers in an Interval Range
//278. First Bad Version
//35. Search Insert Position
//1491. Average Salary Excluding the Minimum and Maximum Salary

public class Solution {

    public static void main(String[] args)
    {

        /*If N is even then the count of both odd and even numbers will be N/2.
        If N is odd,
        If L or R is odd, then the count of odd number will be N/2 + 1 and even numbers = N – countofOdd.
            Else, count of odd numbers will be N/2 and even numbers = N – countofOdd.*/

        System.out.println(countOdd(3,7));

        int[] arr = { 1, 3, 5, 6 };
        int K = 5;
        /*[1,3,5,6]- 5
         [1,3,5,6] - 2
         [1,3,5,6] - 7*/
        /*  2, 1, 4  */
        System.out.println(searchInsert(arr, K));
        int[] arr1 = { 1, 3, 5, 6 };
        int K1 = 2;
        System.out.println(searchInsert(arr1, K1));
        int[] arr2 = { 1, 3, 5, 6 };
        int K2 = 7;
        System.out.println(searchInsert(arr2, K2));
    }
    
    static int average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int sal : salary) {
            sum += sal;
            min = Math.min(min, sal);
            max = Math.max(max, sal);
        }
        return (double)(sum - max - min)/(double)(salary.length - 2);
    }
    
    static int binarySearch(int[] nums,int low,int high,int target){
        while(low <= high){
            int mid =  (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return high+1;
    }
    public static int searchInsert(int[] nums, int target) {
        int high = nums.length -1;
        int low =0;
        return binarySearch(nums,low,high,target);

    }
    static int countOdd(int L, int R)
    {
        int N = (R - L) / 2;

        if (R % 2 != 0 || L % 2 != 0)
            N++;

        return N;
    }
}
