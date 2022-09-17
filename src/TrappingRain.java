import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TrappingRain {
    public int trap(int[] height) {
        int area = 0, h = -1;
        Stack<Integer> st = new Stack<>();
        for(int i : height){
            if(!st.empty()){
                h = st.peek();
            }
            if(area != -1 && h > i) area += h - i;
//            else if(area != -1 && h > i) area += h - i;
            st.push(i);
        }
        return area;
    }

    public static void main(String[] args) {
        TrappingRain tr = new TrappingRain();
        System.out.println(tr.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
