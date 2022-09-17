import java.util.HashMap;
import java.util.Map;

public class Contest302 {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int countOfPairs = 0, count = 0;
        for(int i : nums)m.put(i, m.getOrDefault(i,0)+1);
        for(int i : m.keySet()){
            countOfPairs += m.get(i) / 2;
            count += m.get(i) % 2;
        }
        return new int[]{countOfPairs, count};
    }

    public static void main(String[] args) {
        Contest302 c = new Contest302();
        c.numberOfPairs(new int[]{1,3,2,1,3,2,2});
    }
}
