public class TrappingRainWater {
    public int trap(int[] height) {
        int count = 0, i = 0, j = i + 1;
        while (i < height.length && j < height.length){
            if(height[i] >= height[j]){
                count += height[i] - height[j];
                j++;
            }
            else{
                i = j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TrappingRainWater r = new TrappingRainWater();
//        System.out.println(r.trap(new int[]{0,2,0}));
        System.out.println(r.trap(new int[]{0,2,0,1,1,0,1/*,2,1,2,1*/}));
    }
}
