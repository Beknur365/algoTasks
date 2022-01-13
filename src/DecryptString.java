public class DecryptString {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder("");
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '#'){
                str.append((char)(Integer.parseInt(s.charAt(i-2)+""+s.charAt(i-1))+96));
                i-=2;
            }
            else{
                str.append((char)(Integer.parseInt(s.charAt(i)+"")+96));
            }
        }
        return str.reverse().toString();
    }
    public static void main(String[] args) {
        DecryptString d = new DecryptString();
        System.out.println(d.freqAlphabets("123#"));
    }
}
