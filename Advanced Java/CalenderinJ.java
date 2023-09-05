import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalenderinJ {
    public static void main(String[] args) {
        // Calendar is an abstract class -> which means an object cannot be created for it
        // howeve calendar class gives a static method to create an object

        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println(c.get(Calendar.SECOND));
        // System.out.println(c.get(Calendar.HOUR));        
        // System.out.println(c.get(Calendar.HOUR_OF_DAY));        
        // System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[50]);
    }
}
