import java.util.HashSet;
import java.util.Set;

public class CountPrimes {
    public int countPrimes(int n) {
        Set<Integer> st = new HashSet<>();
        for(int i = 2; i < n/2; i++){
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                st.add(i);
            }
        }
        System.out.println(st);
        return n - st.size();
    }

    public static void main(String[] args) {
        CountPrimes c = new CountPrimes();
        c.countPrimes(100);
    }
}
