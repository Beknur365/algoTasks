public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        StringBuilder s = new StringBuilder(word);
        char c;
        if(s.indexOf(ch+"") != -1){
            for(int i = 0, j = s.indexOf(ch+""); i <= j; i++, j--){
                c = s.charAt(i);
                s.setCharAt(i, s.charAt(j));
                s.setCharAt(j, c);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        ReversePrefix r = new ReversePrefix();
        r.reversePrefix("xyxzxe",'z');
    }
}
