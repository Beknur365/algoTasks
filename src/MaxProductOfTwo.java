public class MaxProductOfTwo {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(max < (nums[i]-1)*(nums[j]-1)){
                    max = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxProductOfTwo m = new MaxProductOfTwo();
        System.out.println(m.maxProduct(new int[]{3,4,5,2}));
    }
}
