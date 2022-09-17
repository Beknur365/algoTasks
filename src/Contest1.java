public class Contest1 {
    int convertTime(String current, String correct) {
        int count = 0;
        int h1 = Integer.parseInt(current.split(":")[0]);
        int h2 = Integer.parseInt(correct.split(":")[0]);
        int m1 = h1*60 + Integer.parseInt(current.split(":")[1]);
        int m2 = h2*60 + Integer.parseInt(correct.split(":")[1]);
        System.out.println(m1 + "=>" + m2);
        while(m2 - m1 > 0){
            System.out.println( m2 - m1);
            if(m2 - m1 >= 60){
                m2-=60;
            }
            else if(m2 - m1 < 60 && m2 - m1 >= 15){
                m2 -= 15;
            }
            else if(m2 - m1 < 15 && m2 - m1 >= 5){
                m2-=5;
            }
            else if(m2 - m1 < 5 && m2 - m1 >= 1){
                m2-=1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Contest1 c = new Contest1();
        System.out.println(c.convertTime("11:00", "11:01"));

    }
}
