import java.util.*;

public class Contest303 {
    public char repeatedCharacter(String s) {
        Set<Character> st = new HashSet<>();
        for(char c : s.toCharArray()){
            if(st.contains(c)) return c;
            st.add(c);
        }
        return 'a';
    }

    public int equalPairs(int[][] grid) {
        Map<String, Integer> st = new HashMap<>();
        int count = 0;
        int [] temp = new int[grid[0].length];
        for(int [] i : grid){
            st.put(Arrays.toString(i), st.getOrDefault(Arrays.toString(i) ,0) + 1);
        }
        for(int j = 0; j < grid[0].length; j++){
            for(int i = 0; i < grid.length; i++){
                temp[i] = grid[i][j];
            }
            if(st.containsKey(Arrays.toString(temp))) count += st.get(Arrays.toString(temp));
        }
        return count;
    }

    public static void main(String[] args) {
        Contest303 c = new Contest303();
        System.out.println(c.equalPairs(new int[][]{
                {13,13},
                {13,13}}));
    }
}
