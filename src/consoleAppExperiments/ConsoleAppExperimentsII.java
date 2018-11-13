package consoleAppExperiments;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class ConsoleAppExperimentsII {

    public static void main(String[] args) {
//        грешката в Java
//==============================================
//        String myNullString = null;
//        myNullString += "_Yet Another String";
//        System.out.println(myNullString);

        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        int[] myArr = new int[3];
        myArr[0] = 255;
        myArr[1] = 522;
        myArr[2] = 1024;

        ChangeReferenceDataType(inputStr, myArr);
        System.out.println(inputStr + "\n" + Arrays.toString(myArr));

        AtomicReference<Object> inputStrByRef = new AtomicReference<Object>(inputStr);
        ChangeReferenceDataType_2(inputStrByRef);
        System.out.println(inputStrByRef);

    }

    public static void ChangeReferenceDataType(String userString, int[] myArr) {
        userString = "Chaenged string";  //will NO change
        myArr[0] = 111;                  //will change
        myArr[2] = 2048;                 //will change
    }

    public static void ChangeReferenceDataType_2(AtomicReference<Object> inputStrByRef) {
        inputStrByRef.set("Another try to chaenge string"); //this will change string
    }
}
