package leedtcode.May.CW4;

import java.util.ArrayList;
import java.util.HashMap;

///350. Intersection of Two Arrays II
//This solution is O(N + M) time complexity, O(N) for iterate one of the array to create a hashmap and O(M) to iterate the other array. O(N) space to store such hashmap.
public class Intersection {

    public static void main(String[] args) {

        // Given array arr[]
        int[] arr = {1,2,2,1}, nums2 = {2,2} ;
        intersect(arr ,nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i:nums2) {
            if(map.get(i) !=null && map.get(i) > 0){
                list.add(i);
                map.put(i,map.get(i) -1);
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
}
