package unsignedIntegerVariables;

public class UnsignedIntegerVariables {

    public static void main(String[] args) {
        
        //1.Parse and use unsigned Long variables //<- use same technique for 32-bit Integer
        long unsignedLongMax = Long.parseUnsignedLong("18446744073709551615");

        System.out.println(unsignedLongMax);                         //incorect represent of value
        System.out.println(Long.toUnsignedString(unsignedLongMax));  //correct represent of value

        long result = Long.divideUnsigned(unsignedLongMax, 2);  //<- целочислено деление (x / y)
        long result2 = Long.remainderUnsigned(unsignedLongMax, 2); //<- деление с остатък (x % y)
        System.out.println(result + "\n" + result2);
    }
}
