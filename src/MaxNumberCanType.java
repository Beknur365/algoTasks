public class MaxNumberCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        int  ct = s.length;
        for(String st : s){
            for(char c : brokenLetters.toCharArray()){
                if(st.indexOf(c) != -1){
                    ct--;
                    break;
                }
            }
        }
        return ct;
    }

    public static void main(String[] args) {
        MaxNumberCanType m = new MaxNumberCanType();
        System.out.println(m.canBeTypedWords("hello world", "ad"));
    }
}
