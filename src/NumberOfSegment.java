public class NumberOfSegment {
    public int countSegments(String s) {
        int count = 0;
        String [] str = s.split(" ");
        for(String c : str){
            System.out.println(c);
            if(c.indexOf(" ") == -1 && c.length() != 0)count++;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfSegment n = new NumberOfSegment();
        System.out.println(n.countSegments(", , , ,        a, eaefa"));
    }
}
