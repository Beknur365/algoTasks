import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L1 {
    public int garbageCollection(String[] garbage, int[] travel) {
        HashMap<Integer, HashMap<Character, Integer>> m = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        Map<Character, Integer> s = new HashMap<>();
        for(int i = 0; i < garbage.length; i++){
            m2 = new HashMap<>();
            for(char c : garbage[i].toCharArray()){
                m2.put(c, m2.getOrDefault(c, 0) + 1);
                s.put(c, i);
            }
            m.put(i, m2);
        }
        int count = 0;
        for (char c : s.keySet()){
            for(int i = 0; i < garbage.length; i++){
                m2 = m.get(i);
                System.out.println(c + "=>" + m2);
                if(m2.containsKey(c)){
                    count += m2.get(c);
                }
                if(i != garbage.length - 1 && i < s.get(c)) count += travel[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        L1 l = new L1();
        l.garbageCollection(new String[]{"G","P","GP","GG"}, new int[]{1,2,3});
    }
}
