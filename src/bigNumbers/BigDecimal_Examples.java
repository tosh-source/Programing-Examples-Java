package bigNumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_Examples {

    public static void main(String[] args) {

        //1 Divide two values with BigDecimal
        //1.1a Correct way
        ////////////////////////////////////////////////////////////////////////
        BigDecimal val1 = new BigDecimal("4654");
        BigDecimal val2 = new BigDecimal("814");
        BigDecimal correctResult = val1.divide(val2, 100, RoundingMode.CEILING);
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nCorrect result: \n" + correctResult);

        //1.1b Correct way (another variant with ".valueOf()" method)
        //https://www.quora.com/Which-is-good-in-Java-the-new-BigDecimal-or-BigDecimal-valueof-Why
        ////////////////////////////////////////////////////////////////////////
        System.out.println(BigDecimal.valueOf(4654).divide(BigDecimal.valueOf(814),
                100, RoundingMode.CEILING));
        ////////////////////////////////////////////////////////////////////////

        //1.2 Wrong way
        BigDecimal wrongResult = new BigDecimal(4654.0 / 814.0);  //NOTE: In this syntax BigDecimal will calculate WRONG result !! 
        System.out.println("Wrong result: \n" + wrongResult + "\n");


        //2.How to compare BigDecimal
        //https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.html#compareTo-java.math.BigDecimal-
        //https://stackoverflow.com/questions/10950914/how-to-check-if-bigdecimal-variable-0-in-java/10950967
        ////////////////////////////////////////////////////////////
        BigDecimal bigDeci = new BigDecimal("10");
        System.out.println(bigDeci.compareTo(BigDecimal.ZERO) == 0);
        System.out.println(bigDeci.compareTo(BigDecimal.TEN) == 0);
        ////////////////////////////////////////////////////////////

    }
}
