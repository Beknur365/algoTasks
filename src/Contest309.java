import java.util.Arrays;

public class Contest309 {
    public boolean checkDistances(String s, int[] distance) {
        char[] c = s.toCharArray();
        int j;
        for(int i = 0; i < c.length; i++){
            j = distance[s.charAt(i) - 97] + 1;
            if(i + j < c.length && c[i + j] != '-' && c[i] != '-' && c[i] != c[i + j]){
                System.out.println(c[i+j]);
                return false;
            }
            else {
                c[i] = '-';
                if(i + j < c.length) c[i+j] = '-';
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Contest309 c = new Contest309();
        System.out.println(c.checkDistances("aa", new int[]{1,3,0,5}));
//        System.out.println('a' - 0);
    }
}
