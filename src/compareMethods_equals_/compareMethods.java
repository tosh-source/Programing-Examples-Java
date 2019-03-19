package compareMethods_equals_;

public class compareMethods {

    public static void main(String[] args) {

        //I. Use .equals() and "==" operator. How to compare correctly..?
        //https://stackoverflow.com/questions/7520432/what-is-the-difference-between-and-equals-in-java

        //Ia. Compare same String objects (same instance)
        String firstStr = "abc";
        String secondStr = firstStr;  //make instance of first String

        System.out.println(firstStr.equals(secondStr));  //".equals()" method compare "value" inside String instances (on the heap memory)
        System.out.println(firstStr == secondStr);       //"==" operator compare ONLY object references

        //Ib. Compare different String objects (same value, different instance)
        String thirdStr = new String(firstStr);  //"abc", but on another position on heap memory (different instances)

        System.out.println(thirdStr.equals(firstStr));
        System.out.println(thirdStr == firstStr);  //WRONG result!!! It should be true, but because "==" compare only instances (even WITH same Strings values/literals), the result is printed as false.

        //.equals() <- good practice (but ONLY for non-null reference values) -> https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)
        //"=="      <- BAD practice (only in special cases, like null compares) -> https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
    }
}
