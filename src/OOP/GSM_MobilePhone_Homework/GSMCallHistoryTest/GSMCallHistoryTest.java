package OOP.GSM_MobilePhone_Homework.GSMCallHistoryTest;

import OOP.GSM_MobilePhone_Homework.homeworkMobilePhone.*;

import java.math.BigDecimal;

public class GSMCallHistoryTest {

    public static void main(String[] args) {
        //Problem 12. Call history test

        //12.1 Create an instance of the GSM class.
        GSM s8 = new GSM("Galaxy S8 Plus", "Samsung", "600$", "Ben",
                new Battery("Samsung 3500mAh battery", 96, 27, BatteryType.LiIon),
                new Display());

        //12.2 Add few calls.
        Integer countOfCalls = 7;
        Call[] allCalls = new Call[countOfCalls];
        Integer clientPhoneNumber = 889977550;

        //set calls and their duration time//
        for (Integer index = 0; index < countOfCalls; index++) {
            clientPhoneNumber = clientPhoneNumber + index;                  //simple random number adding
            allCalls[index] = new Call();
            allCalls[index].setDialedPhoneNumber("0" + clientPhoneNumber);

            BigDecimal indexToDeci = new BigDecimal(index.toString());
            allCalls[index].setDuration(BigDecimal.TEN.add(indexToDeci.multiply(new BigDecimal("2"))));  //duration is in seconds (start from 10 seconds for first call and increase for the next one)
        }

        s8.AddCalls(allCalls);

        //12.3 Display the information about the calls.
        System.out.println(s8.CallHistoryToString());
    }
}
