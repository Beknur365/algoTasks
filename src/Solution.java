public class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int count = 0, index = 0;
        StringBuilder str = new StringBuilder(s);
        while(str.indexOf("01") != -1){
            index = str.indexOf("01");
            str.delete(index, index + 1);
            str.insert(index, "10");
            System.out.println(str);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.secondsToRemoveOccurrences("0110101"));
    }
}
