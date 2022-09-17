public class Fibonacci {
    public int countHousePlacements(int n) {
        n += 2;
        long [] arr = new long[n + 1];
        long MOD = 1000000007;
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++){
            arr[i] = (arr[i - 1] + arr[i - 2])%MOD;
        }
        return (int) (arr[n]%MOD * arr[n]%MOD);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.countHousePlacements(1000));
    }
}
