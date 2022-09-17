import java.util.HashSet;
import java.util.Set;

public class FoodWays {
    public int numSplits(String s) {
        int len = s.length();
        int[][] a = new int[len][2];
        Set<Character> l = new HashSet<>();
        Set<Character> r = new HashSet<>();
        for(int i = 0; i < len; i++){
            l.add(s.charAt(i));
            r.add(s.charAt(len-1-i));
            a[i][0]=l.size();
            a[len-1-i][1]=r.size();
        }
        int count = 0;
        for(int i=0;i<len-1;i++){
            if(a[i][0]==a[i+1][1])count++;
        }
        return count;
    }

    public static void main(String[] args) {
        FoodWays f = new FoodWays();
        System.out.println(f.numSplits("aacaba"));
    }
}
