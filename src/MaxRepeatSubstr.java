public class MaxRepeatSubstr {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder str = new StringBuilder("");
        while (sequence.indexOf(str.append(word)+"") != -1){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        MaxRepeatSubstr m = new MaxRepeatSubstr();
        System.out.println(m.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }
}
