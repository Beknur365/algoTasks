import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>(new ArrayList<>());
        List<Integer> li = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j <= i; j++){

            }
        }
        return l;
    }

    public static void main(String[] args) {
        Subsets s = new Subsets();
        System.out.println(s.subsets(new int[]{1,2,3}));
    }
}
