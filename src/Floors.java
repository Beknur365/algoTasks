import java.util.*;

public class Floors {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int m[];
        if(special[0] == bottom && special[special.length - 1] == top){
            m = new int[special.length];
            m[0] = bottom + 1;
            m[m.length - 1] = top - 1;
        }
        else if(special[0] == bottom && special[special.length - 1] != top){
            m = new int[special.length + 1];
            m[0] = bottom + 1;
            m[m.length - 1] = top;
        }
        else if(special[0] != bottom && special[special.length - 1] == top){
            m = new int[special.length + 1];
            m[0] = bottom;
            m[m.length - 1] = top - 1;
        }
        else{
            m = new int[special.length + 2];
            m[0] = bottom;
            m[m.length - 1] = top;
        }
        for(int i = 0; i < special.length; i++){
                m[i+1] = special[i];
        }
        int max = 0, val;
        for(int i = 0; i < m.length - 1; i++){
            val = m[i+1] - m[i];
            val = val == 1 ? 0 : val;
            if(val > max){
                max = val;
            }
        }
        System.out.println(Arrays.toString(m));
        return max;
    }

    public static void main(String[] args) {
        Floors f = new Floors();
        System.out.println(f.maxConsecutive(6,8,new int[]{7,6,8}));
    }
}
