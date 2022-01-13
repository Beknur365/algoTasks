public class OperationIncrease {
    public int minOperations(int[] nums) {
        if(nums.length == 1) return nums[0];
        int min = nums[0], count = 0;
        for(int i = 1; i < nums.length; i++){
            if(min >= nums[i]){
                do{
                  nums[i]++;
                  count++;
                }
                while (min+1 != nums[i]);
            }
            min = nums[i];
        }
        return count;
    }

    public static void main(String[] args) {
        OperationIncrease o = new OperationIncrease();
        System.out.println(o.minOperations(new int[]{1,5,2,4,1}));
    }
}
