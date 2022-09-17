public class ValidPolindrom {
    public boolean validPalindrome(String s) {
        StringBuilder str = new StringBuilder(s.substring(0,s.length()/2)), str2 = new StringBuilder(s.substring(s.length()/2));
        str.reverse();
        if(str.toString().equals(str2.toString()))return true;
        for(int i = 0; i < s.length()/2; i++){
            if(str.charAt(i) != str2.charAt(i)){
                str.deleteCharAt(i);
                if(str.toString().equals(str2.toString())){
                    return true;
                }
                else{
                    str = new StringBuilder(s.substring(0,s.length()/2));
                    str.reverse();
                    str2.deleteCharAt(i);
                    if(str.toString().equals(str2.toString())){
                        return true;
                    }
                    else{
                        str.deleteCharAt(i);
                        if(str.toString().equals(str2.toString())){
                            return true;
                        }
                        else return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPolindrom v = new ValidPolindrom();
        System.out.println(v.validPalindrome("abca"));
    }
}
