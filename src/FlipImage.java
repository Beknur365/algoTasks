public class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int c = -1;
        for(int k = 0; k < image.length; k++){
            if(image[k].length%2 != 0){
                image[k][image[k].length/2] = image[k][image[k].length/2] == 0 ? 1 : 0;
            }
            for(int i = 0, j = image[k].length-1; i < j; i++,j--){
                c = image[k][i];
                image[k][i] = image[k][j] == 0 ? 1 : 0;
                image[k][j] = c == 0 ? 1 : 0;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        FlipImage f = new FlipImage();
//        f.flipAndInvertImage(new int[][]{{0,0,1},{0,1,0},{1,1,0}});
        for(int [] i : f.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}}))
            for (int j : i) System.out.println(j);
    }
}
