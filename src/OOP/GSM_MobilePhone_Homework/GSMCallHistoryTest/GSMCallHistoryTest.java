package OOP.GSM_MobilePhone_Homework.GSMCallHistoryTest;

import OOP.GSM_MobilePhone_Homework.homeworkMobilePhone.*;

import java.math.BigDecimal;
import java.util.Arrays;

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

        //12.4 Calculate and print the total price of the calls in the history. (the price per minute is 0.37$)
        System.out.println("Total price of calls: " +
                s8.CalculateTotalPrice(new BigDecimal("0.37")) +
                "$");

        //12.5 Remove the longest call from the history and calculate the total price again.

        //manually set duration time for testing purpose//
        allCalls[0].setDuration(new BigDecimal("480")); //set first call(889977550) to 8 min (this call duration, should be the longest one)

        //order by duration time (with lambda expression)
        var orderedCall = Arrays.stream(allCalls).sorted((x, y) -> x.getDuration().compareTo(y.getDuration())).toArray();
        var orderedCallClone = orderedCall.clone();
        var longestCall = Arrays.stream(orderedCall).reduce((call, call2) -> call2).get();              //Get Last element with lambda expressions. Equivalent to ".Last()" in C#.
                                                                                                        //"get()" method here is optional, if we want to convert returned "Optional" object to normal Java "Object". See link below**.
        allCalls = Arrays.stream(orderedCallClone).toArray(Call[]::new);

        //add new ordered call history and delete the longest one
        s8.ClearCallHistory();
        s8.AddCalls(allCalls);
        s8.DeleteCalls(((Call) longestCall).getDialedPhoneNumber());

        //calculate the total price
        System.out.println("Total price of calls: " +
                            s8.CalculateTotalPrice() +
                            "$ (new calculation)");

    }
}

//** -> .get() method, more info: https://stackoverflow.com/questions/42977137/creating-an-object-from-optionalobject
