import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaLibraries {

    public static void main(String[] args) {
        Date today = new Date();
//        int hours = today.getHours();
//        System.out.println(today);
//        System.out.println(hours);

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(today);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) - 1);
        System.out.println(calendar.getTime());

        GregorianCalendar birthday = new GregorianCalendar(1936, 3, 16);
        Date birthdayDate = birthday.getTime();

        System.out.println(today);
        System.out.println(calendar);
        System.out.println(birthday);
        System.out.println(birthdayDate);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String prettyDate = sdf.format(birthdayDate);
        System.out.println(prettyDate);
    }
}
