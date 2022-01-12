import java.util.ArrayList;

public class GreatestDivisor {
    public int findGCD(int[] nums) {
        int min = nums[0], max = 0, maxDiv = 0;
        ArrayList<Integer> a1 = new ArrayList<>(), a2 = new ArrayList<>();
        for(int i : nums){
            if(max < i)max = i;
            if(min > i)min = i;
        }
        for(int i = 1; i <= min; i++){
            if(min%i==0)a1.add(i);
        }
        for(int i = 1; i <= max; i++){
            if(max%i==0) a2.add(i);
        }
        for(int i = a2.size()-1; i >= 0; i--){
            for(int j = a1.size()-1; j >= 0; j--){
                if((int)a2.get(i) == (int)a1.get(j)){
                    return a2.get(i);
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        GreatestDivisor g = new GreatestDivisor();
        System.out.println(g.findGCD(new int[]{398,326,415,429,347,294,305,442,390,221,323}));
    }
}
