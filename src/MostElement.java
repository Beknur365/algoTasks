import java.util.HashMap;
import java.util.Map;

public class MostElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int n : nums) {
            if (m.containsKey(n))
                m.put(n, m.get(n) + 1);
            else
                m.put(n, 1);
        }
        int maxValue = 0, maxKey = 0;
        for (int i : m.keySet()) {
            if (maxValue < m.get(i)) {
                maxValue = m.get(i);
                maxKey = i;
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        MostElement m = new MostElement();
        m.majorityElement(new int[]{4, 4, 44, 1, 3, 2, 2});
    }
}
