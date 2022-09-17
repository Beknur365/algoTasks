import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Matrix {
    public boolean checkXMatrix(int[][] grid) {
        Set<String> st = new HashSet<>();
        for(int i = 0, j = 0, i1 = grid.length - 1; i < grid.length && j < grid[0].length && i1 >=0; i++, j++, i1--){
            if(grid[i][j] == 0 || grid[i1][j] == 0) return false;
            st.add(i + "" + j);
            st.add(i1 + "" +j);
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(!st.contains(i+""+j) && grid[i][j] !=0 ) return false;
            }
        }
        return true;
    }
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int max1 = 0, max2 = 0;
        for(int i = 0, j = 0; i < nums1.length; i++, j++){
            if(nums2[j] < nums1[i] && max1 > max2){

            }
            max1+=nums1[i];
            max2+=nums2[j];
        }
        return Math.max(max1, max2);
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        System.out.println(m.maximumsSplicedArray(new int[]{20,40,20,70,30}, new int[]{50,20,50,40,20}));
    }
}
