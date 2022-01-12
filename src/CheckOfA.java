//https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
public class CheckOfA {
    public boolean checkString(String s) {
        int [] a = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a')a[i] = 1;
            else a[i] = 2;
        }
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j])return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckOfA a = new CheckOfA();
        System.out.println(a.checkString("bbb"));
    }
}
