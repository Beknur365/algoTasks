import java.util.Arrays;

public class MaxSum {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int count = 0, a = arr.length;
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--){

            System.out.println(arr[i]);
            if(a >= k){
                count += arr[i] * k;
                a -= k;
            }
            else{
                count += arr[i] * a;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxSum m = new MaxSum();
        System.out.println(m.maxSumAfterPartitioning(new int[]{1,4,1,5,7,3,6,1,9,9,3}, 4));
    }
}
