package leedtcode.May;
//167. Two Sum II - Input Array Is Sorted

public class CloseSum
{

    //../Time Complexity: O(n2)
    //Auxiliary Space: O(1)
    static int[] printClosest(int arr[], int n , int target)
    {
        /*for (int i = 0; i < (n - 1); i++) {
            for (int j = (i + 1); j < n; j++) {
                if (arr[i] + arr[j] == x) {
                   // System.out.println("Pair with a given sum " + x +
                     //       " is (" + arr[i] + ", " + arr[j] + ")");

                    return new int[] {i+1, j+1};
                }
            }
        }
        return new int[0];*/
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (arr[l] + arr[r] == target)
                return new int[] {l+1, r+1};
            else if (arr[l] + arr[r] < target)
                l++;
            else // A[i] + A[j] > sum
                r--;
        }
        return new int[0];
    }


    public static void main (String[] args)
    {
        int arr[] =  {2,7,11,15}, x = 9;
        int n = arr.length;
        int []arr1 = new int[3];
        arr1  =  printClosest(arr, n, x);
        for (int i=0; i<arr1.length; i++)
            System.out.print(arr[i]+" ");
    }
}
