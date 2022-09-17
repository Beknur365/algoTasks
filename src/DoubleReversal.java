public class DoubleReversal {
    public boolean isSameAfterReversals(int num) {
        StringBuilder s = new StringBuilder(num+"");
        s.reverse();
        s = new StringBuilder(Integer.parseInt(s.toString())+"");
        s.reverse();
        int i = Integer.parseInt(s.toString());
        return num==i;
    }

    public static void main(String[] args) {
        DoubleReversal d = new DoubleReversal();
        d.isSameAfterReversals(1800);
    }
}
