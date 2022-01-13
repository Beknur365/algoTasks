public class ValidParentheses {
    public boolean isValid(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        int lastIndex = 0;
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                str.append(s.charAt(i));
            }
            else{
                lastIndex = str.length() - 1;
                if((c == ')' && str.charAt(lastIndex) == '(') || (c == ']' && str.charAt(lastIndex) == '[') || (c == '}' && str.charAt(lastIndex) == '{')){
                    str.deleteCharAt(lastIndex);
                }
                else{
                    return false;
                }
            }
        }
        return str.toString().isEmpty();
    }
}
