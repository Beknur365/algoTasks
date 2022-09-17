public class CountSubIslands {
    int [][] g1, g2;
    boolean checkSub;
    int count = 0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        g1 = grid1;
        g2 = grid2;
        for(int i = 0; i < g2.length; i++){
            for (int j = 0; j < g2[i].length; j++){
                checkSub = true;
                if(g2[i][j] == 1) {
                    dfs(i, j);
                    if(checkSub) count++;
                }
            }
        }
        return count;
    }
    void dfs(int i, int j){
        if(i < 0 || j < 0 || i >= g1.length || j >= g1[0].length || g2[i][j] != 1) return;
        g2[i][j] = 2;
        if(g1[i][j] != 1) checkSub = false;
        dfs(i+1, j);
        dfs(i-1, j);
        dfs(i, j+1);
        dfs(i, j-1);
    }

    public static void main(String[] args) {
        CountSubIslands c = new CountSubIslands();
        System.out.println(c.countSubIslands(new int[][]{{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}}, new int[][]{{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}}));
    }
}
