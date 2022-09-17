import java.util.ArrayList;

public class VisiblePeople {
    public int[] canSeePersonsCount(int[] heights) {
        int count, last;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < heights.length-1; i++){
            count = 1;
            last = heights[i+1];
            if(heights[i] < last){
                count++;
            }
            else{
            for(int j = i + 1; j < heights.length; j++){
                System.out.println(last + "=>" + heights[j]);
                if(last < heights[j]){
                    count++;
                    last = heights[j];
                }
            }}
            arr.add(count);
        }
        arr.add(0);
        System.out.println(arr);
        return heights;
    }

    public static void main(String[] args) {
        VisiblePeople v = new VisiblePeople();
        v.canSeePersonsCount(new int[]{10,6,8,5,11,9});
//      3,1,2,1,1,0
    }
}
