public class PeakIndexMountain {
    public int peakIndexInMountainArray(int[] arr) {
        int max = 0, maxIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            else break;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        PeakIndexMountain p = new PeakIndexMountain();
        System.out.println(p.peakIndexInMountainArray(new int[]{0,1,2,0}));
    }
}
