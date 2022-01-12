import java.util.ArrayList;
//https://leetcode.com/problems/sort-array-by-parity-ii/
public class SortArrayByParity {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        for(int i:nums){
            if(i % 2 == 0) a.add(i);
            else b.add(i);
        }
        for(int i = 0; i < nums.length; i++){
            if(i%2==0)nums[i] = a.get(i/2);
            else nums[i] = b.get(i/2);
        }
        return nums;
    }

    public static void main(String[] args) {
        SortArrayByParity s = new SortArrayByParity();
        for(int i : s.sortArrayByParityII(new int[]{4,1,3,2})) System.out.println(i);
    }
}