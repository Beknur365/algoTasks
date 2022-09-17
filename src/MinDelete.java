import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class MinDelete {
    public int minOperations(int[] nums, int[] numsDivide) {
        TreeMap<Integer, Integer> t = new TreeMap<>();
        Set<Integer> s = new HashSet<>();
        for(int i : numsDivide) s.add(i);
        int minOfDivide = numsDivide[0], min = 0;
        for(int i : nums) t.put(i, t.getOrDefault(i, 0) + 1);
        for(int i : t.keySet()){
            minOfDivide = 0;
            for(int j : s){
                if(j % i != 0){
                    minOfDivide = 1;
                    break;
                }
            }
            if(minOfDivide == 1)min += t.get(i);
            else return min;
        }
        return -1;
    }

    public static void main(String[] args) {
        MinDelete m = new MinDelete();
        System.out.println(m.minOperations(new int[]{3,2,6,2,35,5,35,2,5,8,7,3,4}, new int[]{105,70,70,175,105,105,105}));
    }
}
