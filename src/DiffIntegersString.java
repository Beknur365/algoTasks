import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DiffIntegersString {
    public int numDifferentIntegers(String word) {
        int firstIndex = -1, lastIndex = -1;
        Set<BigInteger> m = new HashSet<>();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) > 57){
                if(lastIndex!=-1){
                    m.add(new BigInteger(word.substring(firstIndex+1, lastIndex+1)));
                    lastIndex = -1;
                }
                firstIndex = i;
            }
            else {
                lastIndex = i;
            }
        }
        if(firstIndex < lastIndex){
            m.add(new BigInteger(word.substring(firstIndex+1, lastIndex+1)));
        }
        return m.size();
    }

    public static void main(String[] args) {
        DiffIntegersString d = new DiffIntegersString();
        System.out.println(d.numDifferentIntegers("aaa1ddd01dfff001vccv00001"));
    }
}
