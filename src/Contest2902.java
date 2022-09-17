import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Contest2902 {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        int [] f1 = new int[flowers.length*2];
        for(int i = 0; i < flowers.length; i++){
            f1[i] = flowers[i][0];
            f1[flowers.length + i] = flowers[i][1];
        }
        Arrays.sort(f1);
        for(int i = 0, j, k; i < persons.length; i++){
            j = 0;
            k = f1.length-1;
            while(j < f1.length && f1[j] < persons[i]){
               j++;
            }
            j--;
            while(k >= 0 && f1[k] > persons[i] && k > j){
                k--;
            }
            k++;
            System.out.println(k);
            persons[i] = k - j;
        }
        System.out.println(Arrays.toString(persons));
        return persons;
    }

    public static void main(String[] args) {
        Contest2902 c = new Contest2902();
        c.fullBloomFlowers(new int[][]{{1,6}, {3,7}, {9,12}, {4,13}}, new int[]{2,3,7,11});
    }
}
