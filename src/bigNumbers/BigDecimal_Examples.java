package bigNumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_Examples {

    public static void main(String[] args) {
        
        //1.Divide two values with BigDecimal
        //Correct way
        ////////////////////////////////////////////////////////////////////////
        BigDecimal val1 = new BigDecimal("4654");
        BigDecimal val2 = new BigDecimal("814");
        BigDecimal correctResult = val1.divide(val2, 100, RoundingMode.CEILING);
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Correct result: " + correctResult);

        //Wrong way
        BigDecimal wrongResult = new BigDecimal(4654.0 / 814.0);  //NOTE: In this syntax BigDecimal will calculate WRONG result !! 
        System.out.println("Wrong result:   " + wrongResult);

    }

}
