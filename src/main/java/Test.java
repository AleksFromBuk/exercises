import java.time.*;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        //OffsetDateTime odtStart = LocalDate.now( ZoneOffset.UTC  ).atTime( OffsetTime.MIN ) ;;
       // System.out.println(odtStart.toInstant());

        LocalDateTime start = LocalDate.now().atStartOfDay();
        System.out.println(start + ":00Z");

        Date date = new Date();
        System.out.println(atStartOfDay(date).toInstant());


    }
    public static Date atStartOfDay(Date date) {
        LocalDateTime localDateTime = dateToLocalDateTime(date);
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return localDateTimeToDate(startOfDay);
    }
    private static LocalDateTime dateToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }
    static Date localDateTimeToDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

}