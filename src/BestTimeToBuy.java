import java.util.ArrayList;
import java.util.Arrays;

public class BestTimeToBuy {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0, minIndex = 0, mx = 0;
        for(int i = 0; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
                minIndex = i;
                max = min;
                System.out.println(minIndex);
            }
            if(minIndex < i && max < prices[i]){
                max = prices[i];
            }
            if(max - min > mx){
                mx = max - min;
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        BestTimeToBuy b = new BestTimeToBuy();
        System.out.println(b.maxProfit(new int[]{1,2}));
    }
}
