public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int i = 0, j = mat.length-1, count = 0;
        while(i<mat.length){
            if(i!=j) {
                count += mat[i][i];
                count += mat[i][j];
            }
            else{
                count += mat[i][i];
            }
            i++;j--;
        }
        return count;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum m = new MatrixDiagonalSum();
        System.out.println(m.diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}));
    }
}
