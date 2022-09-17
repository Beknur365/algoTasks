import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class July3 {
    public int wiggleMaxLength(int[] nums) {
        Stack<Integer> l = new Stack<>();
        for(int i = 0; i < nums.length - 1; i++) {
            if (!l.empty()){
                if (l.peek() > 0 && nums[i + 1] - nums[i] < 0) {
                    l.add(nums[i + 1] - nums[i]);
                } else if (l.peek() < 0 && nums[i + 1] - nums[i] > 0) {
                    l.add(nums[i + 1] - nums[i]);
                }
            }else {
                l.add(nums[i + 1] - nums[i]);
            }
        }
        return l.size() + 1;
    }

    public static void main(String[] args) {
        July3 j = new July3();
        System.out.println(j.wiggleMaxLength(new int[]{1,7,4,9,2,5}));
    }
}
