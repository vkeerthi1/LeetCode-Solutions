package leedtcode.May.CW4;

public class Best_Time_to_Buy_Sell_Stock {


    public static void main(String[] args) {

        // Given array arr[]
        int[] arr = {7,1,5,3,6,4};

        System.out.print(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
         int min = Integer.MAX_VALUE,max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            max = Math.max(max , prices[i]- min);
        }
       return max;
    }
}
