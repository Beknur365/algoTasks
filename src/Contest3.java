public class Contest3 {
    public int maximumCandies(int[] candies, long k) {
        int count = 0;
        for(int i : candies){
            count += i / k;
        }
        return count;
    }
}
