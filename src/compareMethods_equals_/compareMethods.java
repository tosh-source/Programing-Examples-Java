package compareMethods_equals_;

public class compareMethods {

    private static String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) {

        //Use .equals() and "==" operator. How to compare correctly..?

        //I. Compare Strings.
        //https://stackoverflow.com/questions/7520432/what-is-the-difference-between-and-equals-in-java

        //Ia. Compare same String objects (same instance)
        String str1 = "abc";
        String str2 = str1;  //make instance of first String

        System.out.println(str1.equals(str2));  //".equals()" method compare "value" inside String instances (on the heap memory)
        System.out.println(str1 == str2);       //"==" operator compare ONLY object references


        //Ib. Compare different String objects (same value, different instance)
        String str3 = new String(str1);  //"abc", but on another position on heap memory (different instances)

        System.out.println(NEW_LINE + str3.equals(str1));
        System.out.println(str3 == str1);  //WRONG result!!! It should be true, but because "==" compare only instances (even WITH same Strings values/literals), the result is printed as false.

        //.equals() <- good practice (but ONLY for non-null reference values) -> https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)
        //"=="      <- BAD practice (only in special cases, like null compares) -> https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html


        //II. Compare Integers.
        //https://www.quora.com/Can-we-compare-integers-by-using-equals-in-Java
        //https://stackoverflow.com/questions/1514910/how-to-properly-compare-two-integers-in-java
        //https://stackoverflow.com/questions/8660691/what-is-the-difference-between-integer-and-int-in-java

        //IIa. Compare different Integer objects (same value, different instance)
        //NOTE: As you can see, even when comparing integers, the "==" operator, print same WRONG result as example above!
        Integer int1 = new Integer(6);
        Integer int2 = new Integer(6);

        System.out.println(NEW_LINE + int1.equals(int2));
        System.out.println(int1 == int2);  //WRONG result!!!
    }
}
