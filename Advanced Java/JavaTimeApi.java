import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeApi {
    public static void main(String[] args) {
        // prints the current date
        // LocalDate d = LocalDate.now();
        // System.out.println(d);

        // LocalTime t = LocalTime.now();
        // System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        // System.out.println(df);
        String myDate = dt.format(df);
        String myDate1 = dt.format(df2);
        System.out.println(myDate);
        System.out.println(myDate1);
    }
}
