import java.util.Arrays;
import java.util.Stack;

public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i : nums){
            if(!st.empty() && st.peek() > nums[i]){
                st.pop();

            }
        }
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1] && nums[i+1] != Integer.MIN_VALUE && nums[i] != Integer.MIN_VALUE){
                return false;
            }
        }
        return true;
    }
}
