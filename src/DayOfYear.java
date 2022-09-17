import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DayOfYear {
    public int dayOfYear(String date) {
        LocalDate ld = LocalDate.parse(date);
        int month = ld.getMonthValue(), year = ld.getYear(), count = ld.getDayOfMonth();
        for(int i = 0; i < month-1; i++){
            count+=new GregorianCalendar(year,i,1).getActualMaximum(Calendar.DAY_OF_MONTH);
        }
        return count;
    }

    public static void main(String[] args) {
        DayOfYear d = new DayOfYear();
        System.out.println(d.dayOfYear("2003-03-01"));
    }
}
