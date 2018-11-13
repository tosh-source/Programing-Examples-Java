package bigNumbers;

import java.math.BigInteger;

public class BigInteger_Examples {

    public static void main(String[] args) {
        
        //I.BigInteger.pow() method
        //NOTE: There (in Java) BigINteger have ONLY reference method ".pow()", unlike C# which have only static type method.
        //////////////////////////////////
        BigInteger bigNum, bigResult;
        bigNum = new BigInteger("6");
        int exponent = 2;
        
        bigResult = bigNum.pow(exponent);
        //////////////////////////////////
        System.out.println("Result is: " + bigNum + "^" + exponent + " = " + bigResult);

    }

}
