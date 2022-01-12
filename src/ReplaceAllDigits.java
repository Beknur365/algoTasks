public class ReplaceAllDigits {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 1; i < s.length(); i+=2){
            str.append(s.charAt(i-1));
            str.append((char) (s.charAt(i-1) + Integer.parseInt(s.charAt(i)+"")));
            System.out.println(str);
        }
        if(s.length()%2==1)str.append(s.charAt(s.length()-1));
        return str.toString();
    }

    public static void main(String[] args) {
        ReplaceAllDigits r = new ReplaceAllDigits();
        r.replaceDigits("a1b1c1");
    }
}
