import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> a = new ArrayList<>();
        int min = 0, minIndex = 0, max = 0;
        for(int i = 0; i < matrix.length; i++){
            min = matrix[i][0];
            for(int j = 0; j < matrix[i].length; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            max = 0;
            for(int c = 0; c < matrix.length; c++){
                if(max < matrix[c][minIndex]){
                    max = matrix[c][minIndex];
                }
            }
            if(max == min){
                a.add(max);
                return a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        LuckyNumbers l = new LuckyNumbers();
        System.out.println(l.luckyNumbers(new int[][]{{7,8}, {1,2}}));
    }
}
