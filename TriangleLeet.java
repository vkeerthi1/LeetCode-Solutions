package leedtcode.May.CW4;

import java.util.ArrayList;
import java.util.List;

public class TriangleLeet {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(2);
        arr1.add(2);
        arr1.add(2);
        List<List<Integer>> arr ;//new ArrayList<>( {2});
        //System.out.print(minimumTotal(arr));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
            }
        }
        return A[0];
    }

    public static int minimumTotal1(List<List<Integer>> T) {
        for (int i = T.size() - 2; i >= 0; i--)
            for (int j = T.get(i).size() - 1; j >= 0; j--) {
                int min = Math.min(T.get(i+1).get(j), T.get(i+1).get(j+1));
                T.get(i).set(j, T.get(i).get(j) + min);
            }
        return T.get(0).get(0);
    }
}
