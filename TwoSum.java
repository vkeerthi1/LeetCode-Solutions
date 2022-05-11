package leedtcode.May.CW4;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for (int i = 0; i < len ; i++) {
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left,i};
            }else{
                tracker.put(target-nums[i],i);
            }
        }
        return new int[2];
    }
    public static void main(String[] args) {

        // Given array arr[]
        int[] arr = {2,7,11,15};
        int target = 9;

        // Function call
        System.out.print(twoSum(arr, target));
    }
}
