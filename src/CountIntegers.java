import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountIntegers {
    Set<Integer> s = new HashSet<>();

    public void add(int left, int right) {
        for(int i = left; i <= right; i++){
            s.add(i);
        }
        System.out.println(s);
    }

    public int count() {
        return s.size();
    }

    public static void main(String[] args) {
        CountIntegers c = new CountIntegers();
        c.add(2,3);
        c.add(7,10);
        System.out.println(c.count());
        c.add(5,8);
        System.out.println(c.count());
    }
}
