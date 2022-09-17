import java.util.*;

public class Contest2901 {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                m.put(nums[i][j], m.getOrDefault(nums[i][j],0) + 1);
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i : m.keySet()){
            if(m.get(i) == nums.length){
                l.add(i);
            }
        }
        Collections.sort(l);
        return l;
    }

    public static void main(String[] args) {
        Contest2901 c = new Contest2901();
        System.out.println(c.intersection(new int[][]{{3,1,2,4,5},{1,2,3,4},{3,4,5,6}}));
    }
}
