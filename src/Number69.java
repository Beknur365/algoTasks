import java.util.ArrayList;

public class Number69 {
    public int maximum69Number (int num) {
        int s = num, indexForChange = -1;
        ArrayList<Integer> a = new ArrayList<>();
        while(num%10 != 0){
            a.add(num%10);
            num = num/10;
        }
        for(int i = a.size()-1; i >= 0; i--){
            if(a.get(i) == 6){
                indexForChange = i;
                break;
            }
        }
        return (int) (s+3*Math.pow(10,indexForChange));
    }

    public static void main(String[] args) {
        Number69 n = new Number69();
        n.maximum69Number(969969696);
    }
}
