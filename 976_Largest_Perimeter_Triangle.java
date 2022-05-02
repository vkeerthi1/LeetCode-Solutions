package leedtcode.May;
//976. Largest Perimeter Triangle
import java.util.Arrays;

//The time complexity of the above code is O(nlogn) because we are sorting the array. Here n is the size of the array.
//The space complexity of the above code is O(1) because we are using only a variable to store the answer.
public class largestPerimeterC {
    public static int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        int n= arr.length;
        for (int i =n - 1; i > 1; --i)
            if (arr[i] < arr[i - 1] + arr[i - 2])
                return arr[i] + arr[i - 1] + arr[i - 2];
        return 0;
    }
    public static void main(String[] args) {
        int [] arr = {3,2,3,4};
        int ans= largestPerimeter(arr);
        System.out.println(ans);
    }
}
