import java.util.HashMap;
import java.util.Map;

public class Contest2891 {

    public int minimumRounds(int[] tasks) {
        int count = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i : tasks) m.put(i, m.getOrDefault(i, 0) + 1);
        System.out.println(m);
        return count;
    }

    public static void main(String[] args) {
        Contest2891 m = new Contest2891();
        System.out.println(m.minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4}));
    }
}
