import java.math.BigInteger;
import java.util.Stack;

public class Backspace {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>(), s2 = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#' && !s1.empty()) s1.pop();
            else if(c != '$') s1.add(c);
        }
        for(char c : t.toCharArray()){
            if(c == '#' && !s2.empty()) s2.pop();
            else if(c != '$') s2.add(c);
        }
        return s1.equals(s2);
    }
}
