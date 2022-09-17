import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class lll {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        TreeMap<Integer, Integer> t = new TreeMap<>();
        for(int i = 0; i < capacity.length && i < rocks.length; i++){
            t.put((capacity[i] - rocks[i]), t.getOrDefault((capacity[i] - rocks[i]), 0) + 1);
        }
        System.out.println(t);
        if(t.containsKey(0)) count = t.get(0);
        for(int i : t.keySet()){
            if(i > additionalRocks) break;
            if(i != 0){
                if(additionalRocks >= t.get(i)){
                    count += t.get(i);
                }
                else if(t.get(i) > additionalRocks){
                    count += additionalRocks;
                }
                additionalRocks -= t.get(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        lll l = new lll();
        System.out.println(l.maximumBags(new int[]{54,18,91,49,51,45,58,54,47,91,90,20,85,20,90,49,10,84,59,29,40,9,100,1,64,71,30,46,91},
                new int[]{14,13,16,44,8,20,51,15,46,76,51,20,77,13,14,35,6,34,34,13,3,8,1,1,61,5,2,15,18}, 77));
    }
}
