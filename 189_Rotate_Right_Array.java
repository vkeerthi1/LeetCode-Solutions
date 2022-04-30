package leedtcode;

/*189. Rotate Array
Given an array, rotate the array to the right by k steps, where k is non-negative.
        Example 1:

        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]
        */

public class RotateArrayRight {

    public static void main(String[] args) {
        RotateArrayRight rotate = new RotateArrayRight();
        int arr[] = {1, 2, 3, 4, 5};
        rotate.rotateRight(arr, 2);
        System.out.print("\n");
        rotate.printArray(arr, arr.length);

        int arr1[] = {1, 2, 3, 4, 5};
        rotate.rotateRight1(arr1, 2);
        System.out.print("\n");
        rotate.printArray(arr, arr.length);
    }

    public void rotateRight1(int[] arr, int k) {
//Time complexity: O(N * D) , Auxiliary Space: O(1)
        for (int i = arr.length; i > k; i--)
            rightRotatebyOne(arr, arr.length);
    }

    private void rightRotatebyOne(int[] arr, int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    public void rotateRight(int[] arr, int k) {
        //Time complexity: O(N) , Auxiliary Space: O(D)
        int n = arr.length;
        while (k > n) {
            k = k - n;
        }
        int temp[] = new int[n - k];
        for (int i = 0; i < n - k; i++) {
            temp[i] = arr[i];
        }
        for (int i = n - k; i < n; i++) {
            arr[i - n + k] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i + k] = temp[i];
        }

    }


    private void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


}
