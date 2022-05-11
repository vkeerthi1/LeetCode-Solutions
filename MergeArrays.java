package leedtcode.May.CW4;
//88. Merge Sorted Array
public class MergeArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
          int i1=m-1;
          int i2 = n-1;
          int lastindex = m+n-1;
          while(i1 >= 0 && i2 >=0){
              if(nums1[i1] > nums2[i2]){
                  nums1[lastindex] = nums1[i1];
                  i1--;
              }
              else{
                  nums1[lastindex] = nums2[i2];
                  i2--;
              }
              lastindex --;
          }
        // if i1 is greater than 0 but i2 is not, we don't need to do anything becuase it's a sorted array.
        // However, if i2 is greater than 0, this means the rest of spot is only n2.
        while(i2 >= 0){
            nums1[lastindex] = nums2[i2];
            lastindex --;
            i2 --;
        }
    }
    public static void main(String[] args) {

        // Given array arr[]
        int[] arr = {1,2,3,0,0,0}, nums2 = {2,5,6} ;
        int m = 3, n = 3 ;
        merge(arr , m,nums2,n);
    }
}
