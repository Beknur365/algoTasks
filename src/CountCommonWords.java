import java.util.*;

public class CountCommonWords {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        Map<String, Integer> m1 = new HashMap<>(), m2 = new HashMap<>();
        for(String s : words1){
            if(!m1.containsKey(s)) m1.put(s,1);
            else m1.put(s, m1.get(s) + 1);
        }
        for(String s : words2){
            if(!m2.containsKey(s)) m2.put(s,1);
            else m2.put(s, m2.get(s) + 1);
        }
        for(String s : m1.keySet()){
            for(String s1 : m2.keySet()){
                if(s.equals(s1) && m1.get(s)==1 && m2.get(s1)==1)count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountCommonWords s = new CountCommonWords();
        System.out.println(s.countWords(new String[]{"a","ab"},new String[]{"a","a","a","a","ab"}));
    }
}
