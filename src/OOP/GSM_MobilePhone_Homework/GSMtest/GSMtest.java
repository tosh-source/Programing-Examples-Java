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

        //Third GSM
        System.out.println("\n" + GSM.getiPhone4S());

    }
}
