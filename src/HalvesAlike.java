public class HalvesAlike {
    public boolean halvesAreAlike(String s) {
        int i = 0, j = s.length()/2,countOfF = 0, countOfB = 0;
        String a = "'aeiouAEIOU";
        while(i < s.length()/2){
            if(a.indexOf(s.charAt(i))!=-1)countOfF++;
            if(a.indexOf(s.charAt(j))!=-1)countOfB++;
        }
        if(countOfB == countOfF)return true;
        return false;
    }
}
