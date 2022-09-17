public class MinIncrements {
    public int minNumberOperations(int[] target) {
        int count = 0, inner = 0;
        int [] arr = new int[target.length];
        for(int i = 0; i < target.length; i++){
            if(arr[i] != target[i]){
                arr[i]++;
            }
        }
        return count;
    }
}
