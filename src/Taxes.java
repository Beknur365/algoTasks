import java.util.*;

public class Taxes {
    public int maximumUniqueSubarray(int[] nums) {
        int max = 0, count = 0;
        List<Integer> s = new ArrayList<>();
        for(int i = 0, j = 0; i < nums.length; i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
                count += nums[i];
            }
            else{
                i = j - i + s.indexOf(nums[i]);
                s.clear();
                count = 0;
            }
            j++;
            if(max < count) max = count;
        }
        return max;
    }
    public static void main(String[] args) {
        Taxes t = new Taxes();
        System.out.println(t.maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));
    }
}
