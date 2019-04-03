package dateTime_Methods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dateTime_Methods {

    public static void main(String[] args) {
        //NOTE: The Package "java.time" is built into Java 8 and later. These package replace old/legacy date-time packages/classes such as java.util.Date, Calendar and SimpleDateFormat.

        //I. Using Package "java.time".
        //https://docs.oracle.com/javase/10/docs/api/java/time/package-summary.html
        //Java™ DateTime Tutorials -> https://docs.oracle.com/javase/tutorial/datetime/TOC.html

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("LocalTime: " + time);
        System.out.println("LocalDate: " + date);
        System.out.println("LocalDateTime: " + dateTime);

        //

    }
}
