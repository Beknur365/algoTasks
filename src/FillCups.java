import java.util.Arrays;

public class FillCups {
    public int fillCups(int[] amount) {
        int count = 0;
        Arrays.sort(amount);
        while (amount[2] != 0){
            amount[2] -= 1;
            amount[1] -= 1;
            count++;
            Arrays.sort(amount);
        }
        return count;
    }

    public static void main(String[] args) {
        FillCups f = new FillCups();
        System.out.println(f.fillCups(new int[]{5,4,4}));
    }
}
