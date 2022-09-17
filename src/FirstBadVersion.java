public class FirstBadVersion {
    public boolean k(int j){
        if(j >= 1702766719){
            return true;
        }
        return false;
    }
    public int firstBadVersion(int n) {
        int left = 0, mid = (left + n)/2;
        while (left <= n){
            if(k(mid)){
                n = mid - 1;
            }
            else{
                left = mid + 1;
            }
            mid = left+(n-left)/2;
        }
        return ++mid;
    }

    public static void main(String[] args) {
        FirstBadVersion f = new FirstBadVersion();
        System.out.println(f.firstBadVersion(2126753390));
    }
}
