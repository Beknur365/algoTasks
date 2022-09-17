public class MinimumTimeToType {
    public int minTimeToType(String word) {
        int count = word.length();
        char x = ' ';
        for (int i = 0; i < word.length(); i++) {
            if (i == 0) {
                x = 'a';
            } else {
                x = word.charAt(i - 1);
            }
            int k = Math.abs(x - word.charAt(i));
            if (k > 13) {
                count += 26 - k;
            } else {
                count += k;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MinimumTimeToType m = new MinimumTimeToType();
        System.out.println(m.minTimeToType("zjpc"));
    }
}
