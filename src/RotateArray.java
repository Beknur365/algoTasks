import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k > nums.length ? k%nums.length : k;
        Map<Integer,Integer> arr = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(i + k < nums.length){
                arr.put(i + k, nums[i]);
            }
            else{
                arr.put(i+k - nums.length, nums[i]);
            }
        }
        for(int i = 0; i < arr.size(); i++) nums[i] = arr.get(i);
    }

    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        r.rotate(new int[]{1},4);
    }
}
