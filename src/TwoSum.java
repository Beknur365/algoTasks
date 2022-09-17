public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[]a = new int[2];
        for(int i = 0; i < numbers.length-1; i++){
            if(i + 1 != numbers.length && numbers[i] != numbers[i+1]){
                for(int j = i + 1; j < numbers.length; j++){
                    if(numbers[i] + numbers[j] == target){
                        a[0] = i+1;
                        a[1] = j+1;
                        return a;
                    }
                }
            }
            else if(i + 1 != numbers.length && numbers[i] + numbers[i+1] == target){
                a[0] = i+1;
                a[1] = i+2;
                return a;
            }
            else i++;
        }
        return a;
    }

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        for(int i : t.twoSum(new int[]{-1,0}, -1))System.out.println(i);
    }
}
