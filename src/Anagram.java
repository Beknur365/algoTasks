import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static String sortString(String inputString){
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public List<String> removeAnagrams(String[] words) {
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(!words[j].equals("-1") && !words[j].equals("-1") && sortString(words[i]).equals(sortString(words[j]))) words[j] = "-1";
                else break;
            }
        }
        List<String> l = new ArrayList<>();
        for(String s : words){
            if(!s.equals("-1")) l.add(s);
        }
        return l;
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        System.out.println(a.removeAnagrams(new String[]{"a", "a", "a"}));
    }
}
