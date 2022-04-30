package leedtcode;
//977. Squares of a Sorted Array
/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of
each number sorted in non-decreasing order.
        Example 1:

        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].*/

public class sortedSquare {
    static int[] sortedSquares(int[] arr) {
        int n= arr.length,left =0,right=n-1;
        int result[] = new int[n];

        for(int index=n-1;index>=0;index--){
            if(Math.abs(arr[left]) > arr[right]){
                result[index] = arr[left] * arr[left];
                left++;
            }else{
                result[index] = arr[right] * arr[right];
                right--;
            }

        }
        return result;
    }
    public static void main(String[] args)
    {
        int arr[] = { -4,-1,0,3,10};
        int n = arr.length;
        int[] sq = sortedSquares(arr);
        for(int i = 0; i < n; i++)
            System.out.print(sq[i] + " ");
    }
}
