package OOP.GSM_MobilePhone_Homework.GSMCallHistoryTest;

import OOP.GSM_MobilePhone_Homework.homeworkMobilePhone.*;

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
    }
}
