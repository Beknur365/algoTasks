import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/two-out-of-three/
public class TwoOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> h = new HashMap();
        for(int i : nums1)
            h.put(i,1);
        for(int i : nums2){
            if(h.containsKey(i) && h.get(i) != -1)
                h.put(i,2);
            else h.put(i,-1);
        }
        for(int i : nums3)
            if(h.containsKey(i)  && h.get(i) != -2)
                h.put(i,2);
            else h.put(i,-2);
        for(int i : h.keySet()){
            if(h.get(i)==2)arr.add(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        TwoOfThree t = new TwoOfThree();
        System.out.println(t.twoOutOfThree(new int[]{1,2,2}, new int[]{4,3,3},new int[]{5}));
    }
}
