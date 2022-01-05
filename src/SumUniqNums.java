import java.util.Arrays;

public class SumUniqNums {
    public int sumOfUnique(int[] nums) {
        int count=0;
        for(int i = 0; i < nums.length; i++){
            int check = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    check++;
                    break;
                }
            }
            if(check==0) count+=nums[i];
        }
        return count;
    }

    public static void main(String[] args) {
        SumUniqNums s = new SumUniqNums();
        System.out.println(s.sumOfUnique(new int[]{10,6,9,6,9,6,8,7}));
    }
}
