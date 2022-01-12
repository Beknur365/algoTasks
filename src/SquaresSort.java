import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresSort {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) Math.pow(Math.abs(nums[i]),2);
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        SquaresSort s = new SquaresSort();
        for(int i : s.sortedSquares(new int[]{-4,-1,0,3,10}))
            System.out.println(i);
    }
}
