import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(arr[i],'.');
        backtrack(arr);
        return ans;
    }
    void backtrack(char[][] arr){

    }
}
