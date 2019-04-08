package dateTime_Methods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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


        //II. Formatting "java.time".
        //How to convert String to LocalDate -> https://www.mkyong.com/java8/java-8-how-to-convert-string-to-localdate/
        //Class DateTimeFormatter -> https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        String str = "16-03-2019";  //NOTE: need to be in ISO format (see link above!)

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate anotherDate = LocalDate.parse(str, formatter);                  //NOTE: The sequence of pattern "dd-MM-yyyy", actually will be REVERTED as "yyyy-MM-dd"!!
            System.out.println("\nFormat \"java.time\" " + anotherDate);

        } catch (DateTimeParseException timeEX) {
            System.out.printf("%s <- ERROR! Can not be parsed! \n", str);
            //throw timeEX;
        }

        //IIa. Sample way to Format "java.time".
        //NOTE: this method is actually better, because is print string as defined pattern. The example above REVERT the sequence of the defined pattern!!

        LocalDate sampleDate = LocalDate.now();
        String formattedDate = sampleDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        System.out.println("\nFormat \"java.time\" " + formattedDate);

    }
}

//More info -> https://stackoverflow.com/questions/5677470/java-why-is-the-date-constructor-deprecated-and-what-do-i-use-instead
