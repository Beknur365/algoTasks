import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumPathSum {
    int[][] tempGrid;
    public int minPathSum(int[][] grid) {
        tempGrid = new int[grid.length][grid[0].length];
        for(int [] i : tempGrid) Arrays.fill(i, Integer.MAX_VALUE);
        dp(grid, 0,0, 0);
        return tempGrid[tempGrid.length - 1][tempGrid[0].length - 1];
    }
    void dp(int [][] gr, int i, int j, int sum){
        if(i >= tempGrid.length || j >= tempGrid[0].length) return;
        sum += gr[i][j];
        tempGrid[i][j] = Math.min(tempGrid[i][j], sum);
        dp(gr, i + 1, j, sum);
        dp(gr, i, j + 1, sum);
    }
public static void main(String[] args) {
    MinimumPathSum m = new MinimumPathSum();
    System.out.println(m.minPathSum(new int[][]{{1,3,1}, {1,5,1}, {4,2,1}}));
}
}

