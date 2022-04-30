package leedtcode;
//191. Number of 1 Bits
public class HammingWeight {
    public static void main(String[] args) {
        hammingWeight(9);
    }
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i=1; i<33; i++){
            if(getBit(n, i) == true){
                count++;
            }
        }
        return count;
    }
    public static boolean getBit(int n, int i){
        return (n & (1 << i)) != 0;
    }
}
