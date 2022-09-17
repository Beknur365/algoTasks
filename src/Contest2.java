import java.util.*;

public class Contest2 {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> winners = new HashMap<>(), losers = new HashMap<>();
        for(int i = 0; i < matches.length; i++){
            if(winners.containsKey(matches[i][0]))
                winners.put(matches[i][0], winners.get(matches[i][0])+1);
            else winners.put(matches[i][0], 1);

            if(losers.containsKey(matches[i][1]))
                losers.put(matches[i][1], losers.get(matches[i][1])+1);
            else losers.put(matches[i][1],1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int i : winners.keySet()){
            if(losers.get(i) == null) l.add(i);
        }
        Collections.sort(l);
        ans.add(l);
        l = new ArrayList<>();
        for(int i : losers.keySet()){
            if(losers.get(i) == 1) l.add(i);
        }
        Collections.sort(l);
        ans.add(l);
        return ans;
    }

    public static void main(String[] args) {
        Contest2 c = new Contest2();
        c.findWinners(new int[][]{
                {1,3},
                {2,3},
                {3,6},
                {5,6},
                {5,7},
                {4,5},
                {4,8},
                {4, 9},
                {10,4},
                {10,9}});

    }
}
