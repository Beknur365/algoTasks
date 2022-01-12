import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        Map<String,Integer> m = new HashMap<>();
        String [] s = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0; i < words.length; i++){
            String a = new String();
            for(char c : words[i].toCharArray()){
               a += s[c - 97];
            }
            m.putIfAbsent(a,1);
        }
        return m.size();
    }

    public static void main(String[] args) {
        UniqMorseCode u = new UniqMorseCode();
        System.out.println(u.uniqueMorseRepresentations(new String[]{"zocd","gjkl","hzqk","hzgq","gjkl"}));
    }
}
