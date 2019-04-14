package OOP.GSM_MobilePhone_Homework.homeworkMobilePhone;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Call {

    //Fields
    private LocalDate date;
    private LocalTime time;
    private String dialedPhoneNumber;
    private BigDecimal duration;  //duration in seconds

    //Property
    public String getDate() {
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        return formattedDate;
    }

    public String getTime() {
        String formattedTime = time.format(DateTimeFormatter.ofPattern("HH.mm:SS"));

        return formattedTime;
    }

    public String getDialedPhoneNumber() {
        return dialedPhoneNumber;
    }

    public void setDialedPhoneNumber(String dialedPhoneNumber) {
        this.dialedPhoneNumber = dialedPhoneNumber;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    //Def. constructor
    public Call() {
        this.date = LocalDate.now(); //When create new instance of Call, date and time is set now.
        this.time = LocalTime.now();
    }

    @Override
    public String toString() {
        String result = "";

        if (getDialedPhoneNumber() != null) {
            result += "Dialed phone number: " + this.getDialedPhoneNumber() + System.lineSeparator();
        }

        if (getDuration().compareTo(BigDecimal.ZERO) != 0) {
            result += "Call duration: " + this.getDuration() + System.lineSeparator();
        }

        result += "Call date: " + this.getDate() + System.lineSeparator();
        result += "Call time: " + this.getTime() + System.lineSeparator();

        return result;
    }
}
