import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> s = new HashSet<>();
        if (isSame(p1,p2) || isSame(p1,p3) || isSame(p1,p4) || isSame(p2,p3) || isSame(p3,p4) || isSame(p2,p4)) {
            return false;
        }
        s.add(dis(p1,p2));
        s.add(dis(p1,p3));
        s.add(dis(p1,p4));
        s.add(dis(p2,p3));
        s.add(dis(p2,p4));
        s.add(dis(p3,p4));

        return s.size() == 2;
    }

    private int dis(int[] p1, int[] p2) {
        System.out.println((p1[0]-p2[0]) * (p1[0]-p2[0]) + (p1[1]-p2[1]) * (p1[1]-p2[1]));
        return (p1[0]-p2[0]) * (p1[0]-p2[0]) + (p1[1]-p2[1]) * (p1[1]-p2[1]);
    }
    private boolean isSame(int[] p1, int[] p2) {
        return p1[0] == p2[0] && p1[1] == p2[1];
    }

    public static void main(String[] args) {
        ValidSquare v = new ValidSquare();
//        System.out.println(v.validSquare(new int[]{1,1},new int[]{5,3},new int[]{3,5},new int[]{7,7}));
        System.out.println(v.validSquare(new int[]{1134,-2539},new int[]{492,-1255},new int[]{-792,-1897},new int[]{-150,-3181}));
    }
}
