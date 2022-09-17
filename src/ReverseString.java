public class ReverseString {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder(), s1 = new StringBuilder();
        String[] sr = s.split(" ");
        for(String s2 : sr){
            s1 = new StringBuilder(s2);
            str.append(s1.reverse());
            str.append(" ");
        }
        str.deleteCharAt(str.length() - 1);
        return str.toString();
    }

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        System.out.println(r.reverseWords("Let's take LeetCode contest"));
    }
}
