import java.util.*;

public class MaxSumPair {
    int sumOfDigits(int i){
        int digit, sum = 0;
        while(i > 0)
        {
            digit = i % 10;
            sum = sum + digit;
            i = i / 10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int max = -1, sumOfI = 0, sumOfJ = 0;
        Arrays.sort(nums);
        Map<Integer, List<Integer>> m = new HashMap<>();
        List<Integer> l;
        for(int i = 0; i < nums.length; i++){
            sumOfI = sumOfDigits(nums[i]);
            l = m.getOrDefault(sumOfI, new ArrayList<>());
            l.add(i);
            m.put(sumOfI, l);
            if(l.size() > 1){
                max = Math.max(max, nums[l.get(l.size() - 2)] + nums[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSumPair m = new MaxSumPair();
        System.out.println(m.maximumSum(new int[]{18,43,36,81,13,7}));
    }
}
