import java.util.HashMap;
import java.util.Map;

public class DP {
    int count = 0, end, k;
    Map<Integer, Integer> m = new HashMap<>();
    public int numberOfWays(int startPos, int endPos, int k) {
        end = endPos;
        this.k = k;
        dp(startPos, 0);
        return count;
    }
    int dp(int startPos, int step){
        if(m.containsKey(startPos)){
            if(m.get(startPos) == 1) count++;
            return m.get(startPos);
        }
        if(startPos < 0 || step > k) {
//            m.put(startPos, 0);
            return 0;
        }
        if(step > k) return 0;
        if(startPos == end && step == k){
            m.put(startPos, 1);
            count++;
            return m.get(startPos);
        }
        dp(startPos+1, step + 1);
        dp(startPos-1, step + 1);
//        m.put(startPos, 0);
        return 0;
    }

    public static void main(String[] args) {
        DP d = new DP();
        System.out.println(d.numberOfWays(1,2,3));
    }
}
