public class Contest2881 {
    int count = 0;
    StringBuilder str(StringBuilder s, int ind1, int ind2){
        char c = s.charAt(ind1);
        s.deleteCharAt(ind1);
        s.insert(ind1, s.charAt(ind2-1));
        s.deleteCharAt(ind2);
        s.insert(ind2,c);
        count++;
        return s;
    }
    public int largestInteger(int num) {
        StringBuilder s = new StringBuilder(num+"");
        for(int i = 0; i < s.length() && i < s.length(); i++){
            for(int j = i+1; j < s.length(); j++){
                if((s.charAt(j) -'0') % 2 == (s.charAt(i) -'0') % 2){
                    if(s.charAt(i) < s.charAt(j)){
                        s = str(s, i, j);
                        if(count == 2) return Integer.parseInt(s+ "");
                    }
                }
            }
        }
        return Integer.parseInt(s+"");
    }

    public static void main(String[] args) {
        Contest2881 c = new Contest2881();
        System.out.println(c.largestInteger(2399));
    }
}
