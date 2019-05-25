package OOP.GSM_MobilePhone_Homework.GSMtest;

import OOP.GSM_MobilePhone_Homework.homeworkMobilePhone.*;

public class GSMtest {

    public static void main(String[] args) {

        //Define array of devices (GSMs)
        var gsm = new GSM[2];

        //First GSM
        gsm[0] = new GSM("S 7 Edge", "Samsung", "500$", "Frank",
                new Battery(),
                new Display());
        System.out.println("First GSM\n" + gsm[0]);

        //Second GSM
        gsm[1] = new GSM("S 7 Edge", "Samsung", "500$", "Frank",
                new Battery("Samsung 3600mAh battery", 96, 27, BatteryType.LiIon),
                new Display());
        System.out.println("\nSecond GSM\n" + gsm[1]);

        //Third GSM
        System.out.println("\n" + GSM.getiPhone4S());

        //Manipulate Call (history) class
        Call call = new Call();
        call.setDialedPhoneNumber("0888997766");
        System.out.println(call.getDate());
        System.out.println(call.getDialedPhoneNumber());

        gsm[1].AddCalls(call);            //add call
        System.out.println(gsm[1].CallHistoryToString());
        gsm[1].DeleteCalls("0888997766"); //delete call by given number
        System.out.println(gsm[1].CallHistoryToString());
        gsm[1].ClearCallHistory();        //delete all calls from history

        //Check ENCAPSULATION in CallHistory property (in GSM class)
        //==========================================
        //gsm[1].getCallHistory().add(new Call());
        //for (var item : gsm[1].getCallHistory()) {
        //    System.out.println(item);
        //}
        //==========================================
        //Note: replace "return new ArrayList<>(this.callHistory);" with -> "return this.callHistory;" in getCallHistory() property/method and run above commented code again.
    }
}
