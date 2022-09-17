public class CountTeams {
    public int numTeams(int[] rating) {
        int count = 0;
        for(int i = 0; i < rating.length - 2; i++){
            for (int j = i + 1; j < rating.length - 1; j++){
                for(int k = j + 1; k < rating.length; k++){
                    if((rating[i] < rating[j] && rating[j] < rating[k]) || (rating[i] > rating[j] && rating[j] > rating[k])){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountTeams c = new CountTeams();
        System.out.println(c.numTeams(new int[]{4,7,9,5,10,8,2,1,6}));
    }
}
