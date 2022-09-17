public class SumOfAllSubset {
    public int subsetXORSum(int[] nums) {
        int count = 0, c = 0;
        for(int i = 0; i < nums.length; i++){
//            count += nums[i];
            for(int j = 0; j < nums.length; j++){
                count += nums[i]^nums[j];
                System.out.println(nums[i] + "=>" + nums[j]);

//                System.out.println(nums[i]^nums[j]);
            }
            if(nums.length > 2){
                c ^=nums[i];
            }
        }
        return count+c;
    }

    public static void main(String[] args) {
        SumOfAllSubset s = new SumOfAllSubset();
        System.out.println(s.subsetXORSum(new int[]{3,4,5,6,7,8}));
    }
}
