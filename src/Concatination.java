public class Concatination {
    public int[] getConcatenation(int[] nums) {
        int [] n = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++)
            n[nums.length+i] = nums[i];
        return n;
    }
}
