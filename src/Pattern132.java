import java.util.Stack;

public class Pattern132 {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int middle = -1, first = Integer.MAX_VALUE, middleIdx = -1, firstInx = -2;
        for(int i = 0; i < nums.length; i++){
            if(first > nums[i]){
                first = nums[i];
                firstInx = i;
                System.out.println(firstInx + "=>" + first);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Pattern132 p = new Pattern132();
        System.out.println(p.find132pattern(new int[]{3,1,4,2}));
    }
}
